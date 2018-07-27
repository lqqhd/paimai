package com.xiaoxing.salesclient.mvp.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.jess.arms.base.BaseFragment;
import com.jess.arms.di.component.AppComponent;
import com.scwang.smartrefresh.layout.api.RefreshHeader;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.SimpleMultiPurposeListener;
import com.xiaoxing.salesclient.mvp.ui.activity.ScreenshotShowActivity;

import butterknife.BindView;
import butterknife.OnClick;
import me.jessyan.armscomponent.commonsdk.core.RouterHub;
import me.jessyan.armscomponent.commonsdk.utils.ScreenShotUtil;
import me.jessyan.armscomponent.commonsdk.utils.StatusBarUtil;
import me.jessyan.armscomponent.commonsdk.utils.Utils;
import xiaoxing.com.salesclient.R;
import xiaoxing.com.salesclient.R2;

import static me.jessyan.armscomponent.commonsdk.utils.ScreenShotUtil.boolean_save;
import static me.jessyan.armscomponent.commonsdk.utils.ScreenShotUtil.fn_permission;

public class FragmentMine extends BaseFragment {

    private int mOffset = 0;
    private int mScrollY = 0;
    private NestedScrollView scrollView;
    @BindView(R2.id.right_button)
    TextView mBtnRight;


    public static FragmentMine newInstance(String content) {
        Bundle args = new Bundle();
        args.putString("", content);
        FragmentMine fragment = new FragmentMine();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void setupFragmentComponent(@NonNull AppComponent appComponent) {

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        ScreenShotUtil.onRequestPermissionsResult(requestCode, grantResults);
    }

    @Override
    public View initView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.sales_client_fragment_mine, null);


        final View parallax = view.findViewById(R.id.parallax);
        final View buttonBar = view.findViewById(R.id.buttonBarLayout);
        scrollView = (NestedScrollView) view.findViewById(R.id.scrollView);
        final RefreshLayout refreshLayout = (RefreshLayout) view.findViewById(R.id.refreshLayout);

        fn_permission(getActivity());

        final Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        //状态栏透明和间距处理
        StatusBarUtil.immersive(getActivity());
        StatusBarUtil.setPaddingSmart(getActivity(), toolbar);


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
//        scrollView.setOnScrollChangeListener(new NestedScrollView.OnScrollChangeListener() {
//            private int lastScrollY = 0;
//            private int h = DensityUtil.dp2px(170);
//            private int color = ContextCompat.getColor(getActivity(), R.color.colorPrimary) & 0x00ffffff;
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

        return view;
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {

    }

    @Override
    public void setData(@Nullable Object data) {

    }

    @OnClick({
            R2.id.panel_lyt, R2.id.rl_all_orders, R2.id.ll_dai_fu_kuan,
            R2.id.ll_dai_fa_huo, R2.id.ll_dai_ping_jia, R2.id.ll_dai_shou_huo,
            R2.id.ll_shou_hou, R2.id.rl_tou_tiao, R2.id.rl_balance,
            R2.id.tv_chong_zhi, R2.id.rl_mine_quotation, R2.id.rl_wo_de_jing_pai,
            R2.id.rl_shou_cang, R2.id.rl_tian_jiang_hong_bao, R2.id.rl_wo_de_jian_ding
            , R2.id.right_button, R2.id.rl_qian_dao_ji_lu})
    public void onViewClicked(View view) {

        if (view.getId() == R.id.panel_lyt) {

            Utils.navigation(getActivity(), RouterHub.XIAO_XING_LOGIN_LOGIN_ACTIVITY);
//            Utils.navigation(getActivity(), RouterHub.XIAO_XING_SETTING_SETTING);
        } else if (view.getId() == R.id.rl_all_orders) {
            Utils.navigation(getActivity(), RouterHub.XIAO_XING_ORDER_ORDER_ACTIVITY);
        } else if (view.getId() == R.id.ll_dai_fu_kuan) {
            Utils.navigation(getActivity(), RouterHub.XIAO_XING_ORDER_ORDER_ACTIVITY);
        } else if (view.getId() == R.id.ll_dai_fa_huo) {
            Utils.navigation(getActivity(), RouterHub.XIAO_XING_ORDER_ORDER_ACTIVITY);
        } else if (view.getId() == R.id.ll_dai_ping_jia) {
            Utils.navigation(getActivity(), RouterHub.XIAO_XING_ORDER_ORDER_ACTIVITY);
        } else if (view.getId() == R.id.ll_dai_shou_huo) {
            Utils.navigation(getActivity(), RouterHub.XIAO_XING_ORDER_ORDER_ACTIVITY);
        } else if (view.getId() == R.id.ll_shou_hou) {
            Utils.navigation(getActivity(), RouterHub.XIAO_XING_ORDER_ORDER_ACTIVITY);
        } else if (view.getId() == R.id.rl_tou_tiao) {
            Utils.navigation(getActivity(), RouterHub.SALES_CLIENT_HEAD_LINES_ACTIVITY);
        } else if (view.getId() == R.id.rl_balance) {
            Utils.navigation(getActivity(), RouterHub.SELLER_CLIENT_BALANCE_ACTIVITY);
        } else if (view.getId() == R.id.tv_chong_zhi) {
            Utils.navigation(getActivity(), RouterHub.SELLER_CLIENT_BALANCE_RECHARGE_ACTIVITY);
        } else if (view.getId() == R.id.rl_mine_quotation) {
            Utils.navigation(getActivity(), RouterHub.SALES_CLIENT_MINE_QUOTATION_ACTIVITY);
        } else if (view.getId() == R.id.rl_wo_de_jing_pai) {
            Utils.navigation(getActivity(), RouterHub.SALES_CLIENT_WO_DE_JING_PAI_ACTIVITY);
        } else if (view.getId() == R.id.rl_shou_cang) {
            Utils.navigation(getActivity(), RouterHub.SALES_CLIENT_SHOU_CANG_ACTIVITY);
        } else if (view.getId() == R.id.rl_tian_jiang_hong_bao) {
            Utils.navigation(getActivity(), RouterHub.SALES_CLIENT_TIAN_JIANG_HONG_BAO_ACTIVITY);
        } else if (view.getId() == R.id.rl_wo_de_jian_ding) {
            Utils.navigation(getActivity(), RouterHub.XIAO_XING_SEARCH_SearchActivity);
        } else if (view.getId() == R.id.right_button) {

            if (boolean_save) {
                Intent intent = new Intent(getActivity(), ScreenshotShowActivity.class);
                startActivity(intent);

            } else {
                ScreenShotUtil.screenShotCreate(scrollView);
                mBtnRight.setText("查看名片");
            }
        }else if (view.getId() == R.id.rl_qian_dao_ji_lu) {
            Utils.navigation(getActivity(), RouterHub.SALES_CLIENT_SIGN_HISTORY_ACTIVITY);
        }
    }

}
