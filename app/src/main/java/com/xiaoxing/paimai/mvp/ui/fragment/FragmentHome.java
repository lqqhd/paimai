package com.xiaoxing.paimai.mvp.ui.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.jess.arms.base.BaseFragment;
import com.jess.arms.di.component.AppComponent;
import com.scwang.smartrefresh.layout.api.OnTwoLevelListener;
import com.scwang.smartrefresh.layout.api.RefreshHeader;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.header.TwoLevelHeader;
import com.scwang.smartrefresh.layout.listener.SimpleMultiPurposeListener;
import com.xiaoxing.paimai.R;
import com.xiaoxing.paimai.utils.StatusBarUtil;

public class FragmentHome extends BaseFragment {

    private int mOffset = 0;
    private int mScrollY = 0;

    public static FragmentHome newInstance(String content) {
        Bundle args = new Bundle();
        args.putString("", content);
        FragmentHome fragment = new FragmentHome();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void setupFragmentComponent(@NonNull AppComponent appComponent) {

    }

    @Override
    public View initView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, null);

        final View floor = view.findViewById(R.id.secondfloor);
        final Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        final TwoLevelHeader header = (TwoLevelHeader) view.findViewById(R.id.header);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().finish();
            }
        });

        final RefreshLayout refreshLayout = (RefreshLayout) view.findViewById(R.id.refreshLayout);
        refreshLayout.setOnMultiPurposeListener(new SimpleMultiPurposeListener() {
            @Override
            public void onHeaderMoving(RefreshHeader header, boolean isDragging, float percent, int offset, int headerHeight, int maxDragHeight) {
                toolbar.setAlpha(1 - Math.min(percent, 1));
                floor.setTranslationY(Math.min(offset - floor.getHeight() + toolbar.getHeight(), refreshLayout.getLayout().getHeight() - floor.getHeight()));
            }

            @Override
            public void onRefresh(@NonNull RefreshLayout refreshLayout) {
                Toast.makeText(getContext(), "触发刷新事件", Toast.LENGTH_SHORT).show();
                refreshLayout.finishRefresh(2000);
            }

            @Override
            public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
                refreshLayout.finishLoadMore(2000);
            }
//            @Override
//            public void onHeaderPulling(@NonNull RefreshHeader header, float percent, int offset, int bottomHeight, int maxDragHeight) {
//                toolbar.setAlpha(1 - Math.min(percent, 1));
//                floor.setTranslationY(Math.min(offset - floor.getHeight() + toolbar.getHeight(), refreshLayout.getLayout().getHeight() - floor.getHeight()));
//            }
//            @Override
//            public void onHeaderReleasing(@NonNull RefreshHeader header, float percent, int offset, int bottomHeight, int maxDragHeight) {
//                toolbar.setAlpha(1 - Math.min(percent, 1));
//                floor.setTranslationY(Math.min(offset - floor.getHeight() + toolbar.getHeight(), refreshLayout.getLayout().getHeight() - floor.getHeight()));
//            }
        });

        header.setOnTwoLevelListener(new OnTwoLevelListener() {
            @Override
            public boolean onTwoLevel(@NonNull RefreshLayout refreshLayout) {
                Toast.makeText(getContext(), "触发二楼事件", Toast.LENGTH_SHORT).show();
                view.findViewById(R.id.secondfloor_content).animate().alpha(1).setDuration(2000);
                refreshLayout.getLayout().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        header.finishTwoLevel();
                        view.findViewById(R.id.secondfloor_content).animate().alpha(0).setDuration(1000);
                    }
                }, 5000);
                return true;//true 将会展开二楼状态 false 关闭刷新
            }
        });

//        refreshLayout.setOnRefreshListener(new OnRefreshListener() {
//            @Override
//            public void onRefresh(@NonNull RefreshLayout refreshLayout) {
//                Toast.makeText(getContext(),"触发刷新事件",Toast.LENGTH_SHORT).show();
//                refreshLayout.finishRefresh(2000);
//            }
//        });

        //状态栏透明和间距处理
        StatusBarUtil.immersive(getActivity());
        StatusBarUtil.setMargin(getActivity(), view.findViewById(R.id.classics));
        StatusBarUtil.setPaddingSmart(getActivity(), view.findViewById(R.id.toolbar));
        StatusBarUtil.setPaddingSmart(getActivity(), view.findViewById(R.id.contentPanel));

        return view;
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {

    }

    @Override
    public void setData(@Nullable Object data) {

    }
}
