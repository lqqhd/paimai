package com.xiaoxing.salesclient.mvp.ui.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jess.arms.base.BaseFragment;
import com.jess.arms.di.component.AppComponent;
import com.scwang.smartrefresh.layout.api.RefreshHeader;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.SimpleMultiPurposeListener;

import butterknife.OnClick;
import me.jessyan.armscomponent.commonsdk.core.RouterHub;
import me.jessyan.armscomponent.commonsdk.utils.StatusBarUtil;
import me.jessyan.armscomponent.commonsdk.utils.Utils;
import xiaoxing.com.salesclient.R;
import xiaoxing.com.salesclient.R2;

public class FragmentMine extends BaseFragment {

    private int mOffset = 0;
    private int mScrollY = 0;

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
    public View initView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.sales_client_fragment_mine, null);

        final Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        //状态栏透明和间距处理
        StatusBarUtil.immersive(getActivity());
        StatusBarUtil.setPaddingSmart(getActivity(), toolbar);

        final View parallax = view.findViewById(R.id.parallax);
        final View buttonBar = view.findViewById(R.id.buttonBarLayout);
        final NestedScrollView scrollView = (NestedScrollView) view.findViewById(R.id.scrollView);
        final RefreshLayout refreshLayout = (RefreshLayout) view.findViewById(R.id.refreshLayout);


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
            R2.id.tv_chong_zhi, R2.id.rl_mine_quotation})
    public void onViewClicked(View view) {

        if (view.getId() == R.id.panel_lyt) {
            Utils.navigation(getActivity(), RouterHub.XIAO_XING_SETTING_SETTING);
        } else if (view.getId() == R.id.rl_all_orders) {
            Utils.navigation(getActivity(), RouterHub.XIAO_XING_ORDER_ORDERACTIVITY);
        } else if (view.getId() == R.id.ll_dai_fu_kuan) {
            Utils.navigation(getActivity(), RouterHub.XIAO_XING_ORDER_ORDERACTIVITY);
        } else if (view.getId() == R.id.ll_dai_fa_huo) {
            Utils.navigation(getActivity(), RouterHub.XIAO_XING_ORDER_ORDERACTIVITY);
        } else if (view.getId() == R.id.ll_dai_ping_jia) {
            Utils.navigation(getActivity(), RouterHub.XIAO_XING_ORDER_ORDERACTIVITY);
        } else if (view.getId() == R.id.ll_dai_shou_huo) {
            Utils.navigation(getActivity(), RouterHub.XIAO_XING_ORDER_ORDERACTIVITY);
        } else if (view.getId() == R.id.ll_shou_hou) {
            Utils.navigation(getActivity(), RouterHub.XIAO_XING_ORDER_ORDERACTIVITY);
        } else if (view.getId() == R.id.rl_tou_tiao) {
            Utils.navigation(getActivity(), RouterHub.SALES_CLIENT_HEADLINESACTIVITY);
        } else if (view.getId() == R.id.rl_balance) {
            Utils.navigation(getActivity(), RouterHub.SELLER_CLIENT_BALANCEACTIVITY);
        } else if (view.getId() == R.id.tv_chong_zhi) {
            Utils.navigation(getActivity(), RouterHub.SELLER_CLIENT_BALANCERECHARGEACTIVITY);
        } else if (view.getId() == R.id.rl_mine_quotation) {
//            Utils.navigation(getActivity(), RouterHub.SALES_CLIENT_MINEQUOTATIONACTIVITY);
        }
    }

}
