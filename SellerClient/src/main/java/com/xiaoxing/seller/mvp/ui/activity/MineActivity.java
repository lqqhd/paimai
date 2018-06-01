package com.xiaoxing.seller.mvp.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.jess.arms.base.BaseActivity;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.utils.ArmsUtils;
import com.scwang.smartrefresh.layout.api.RefreshHeader;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.SimpleMultiPurposeListener;
import com.xiaoxing.seller.R;
import com.xiaoxing.seller.R2;
import com.xiaoxing.seller.di.component.DaggerMineComponent;
import com.xiaoxing.seller.di.module.MineModule;
import com.xiaoxing.seller.mvp.contract.MineContract;
import com.xiaoxing.seller.mvp.presenter.MinePresenter;

import butterknife.OnClick;
import me.jessyan.armscomponent.commonres.utils.ToolbarUtils;
import me.jessyan.armscomponent.commonsdk.core.RouterHub;
import me.jessyan.armscomponent.commonsdk.utils.StatusBarUtil;
import me.jessyan.armscomponent.commonsdk.utils.Utils;

import static com.jess.arms.utils.Preconditions.checkNotNull;

@Route(path = RouterHub.SELLER_CLIENT_MINEACTIVITY)
public class MineActivity extends BaseActivity<MinePresenter> implements MineContract.View {

    private int mOffset = 0;
    private int mScrollY = 0;

    @Override
    public void setupActivityComponent(@NonNull AppComponent appComponent) {
        DaggerMineComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .mineModule(new MineModule(this))
                .build()
                .inject(this);
    }

    @Override
    public int initView(@Nullable Bundle savedInstanceState) {
        return R.layout.seller_client_activity_mine; //如果你不需要框架帮你设置 setContentView(id) 需要自行设置,请返回 0
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {
        Toolbar toolbar = ToolbarUtils.initToolbarTitleNoBack(this, getString(R.string.seller_client_head_title_mine));

        //状态栏透明和间距处理
        StatusBarUtil.immersive(this);
        StatusBarUtil.setPaddingSmart(this, toolbar);

        final View parallax = findViewById(R.id.parallax);
        final View buttonBar = findViewById(R.id.buttonBarLayout);
        final NestedScrollView scrollView = (NestedScrollView) findViewById(R.id.scrollView);
        final RefreshLayout refreshLayout = (RefreshLayout) findViewById(R.id.refreshLayout);


        refreshLayout.setOnMultiPurposeListener(new SimpleMultiPurposeListener() {
            @Override
            public void onHeaderMoving(RefreshHeader header, boolean isDragging, float percent, int offset, int headerHeight, int maxDragHeight) {
                mOffset = offset / 2;
                parallax.setTranslationY(mOffset - mScrollY);
                toolbar.setAlpha(1 - Math.min(percent, 1));
            }

            @Override
            public void onRefresh(@NonNull RefreshLayout refreshLayout) {
                refreshLayout.finishRefresh(3000);
            }

            @Override
            public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
                refreshLayout.finishLoadMore(0);
            }
//            @Override
//            public void onHeaderPulling(@NonNull RefreshHeader header, float percent, int offset, int bottomHeight, int maxDragHeight) {
//                mOffset = offset / 2;
//                parallax.setTranslationY(mOffset - mScrollY);
//                toolbar.setAlpha(1 - Math.min(percent, 1));
//            }
//            @Override
//            public void onHeaderReleasing(@NonNull RefreshHeader header, float percent, int offset, int bottomHeight, int maxDragHeight) {
//                mOffset = offset / 2;
//                parallax.setTranslationY(mOffset - mScrollY);
//                toolbar.setAlpha(1 - Math.min(percent, 1));
//            }
        });
//        scrollsetOnScrollChangeListener(new NestedScrollOnScrollChangeListener() {
//            private int lastScrollY = 0;
//            private int h = DensityUtil.dp2px(170);
//            private int color = ContextCompat.getColor(this, R.color.colorPrimary) & 0x00ffffff;
//
//            @Override
//            public void onScrollChange(NestedScrollView v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {
//                if (lastScrollY < h) {
//                    scrollY = Math.min(h, scrollY);
//                    mScrollY = scrollY > h ? h : scrollY;
//                    buttonBar.setAlpha(1f * mScrollY / h);
//                    toolbar.setBackgroundColor(((255 * mScrollY / h) << 24) | color);
//                    parallax.setTranslationY(mOffset - mScrollY);
//                }
//                lastScrollY = scrollY;
//            }
//        });
//        buttonBar.setAlpha(0);
//        toolbar.setBackgroundColor(0);

    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void showMessage(@NonNull String message) {
        checkNotNull(message);
        ArmsUtils.snackbarText(message);
    }

    @Override
    public void launchActivity(@NonNull Intent intent) {
        checkNotNull(intent);
        ArmsUtils.startActivity(intent);
    }

    @Override
    public void killMyself() {
        finish();
    }


    @OnClick({R2.id.ll_setting, R2.id.rl_all_orders, R2.id.ll_dai_fa_huo, R2.id.ll_dai_shou_huo, R2.id.ll_dai_ping_jia, R2.id.ll_shou_hou, R2.id.ll_dai_fu_kuan, R2.id.rl_headlines})
    public void onViewClicked(View view) {
        if (view.getId() == R.id.ll_setting) {
            Utils.navigation(MineActivity.this, RouterHub.XIAO_XING_SETTING_SETTING);
        } else if (view.getId() == R.id.rl_all_orders) {
            Utils.navigation(MineActivity.this, RouterHub.XIAO_XING_ORDER_ORDERACTIVITY);
        } else if (view.getId() == R.id.ll_dai_fa_huo) {
            Utils.navigation(MineActivity.this, RouterHub.XIAO_XING_ORDER_ORDERACTIVITY);
        } else if (view.getId() == R.id.ll_dai_shou_huo) {
            Utils.navigation(MineActivity.this, RouterHub.XIAO_XING_ORDER_ORDERACTIVITY);
        } else if (view.getId() == R.id.ll_dai_ping_jia) {
            Utils.navigation(MineActivity.this, RouterHub.XIAO_XING_ORDER_ORDERACTIVITY);
        } else if (view.getId() == R.id.ll_shou_hou) {
            Utils.navigation(MineActivity.this, RouterHub.XIAO_XING_ORDER_ORDERACTIVITY);
        } else if (view.getId() == R.id.ll_dai_fu_kuan) {
            Utils.navigation(MineActivity.this, RouterHub.XIAO_XING_ORDER_ORDERACTIVITY);
        } else if (view.getId() == R.id.rl_headlines) {
            Utils.navigation(MineActivity.this, RouterHub.SELLER_CLIENT_HEADLINESACTIVITY);
        }
    }


}
