package com.xiaoxing.salesclient.mvp.ui.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.innodroid.expandablerecycler.ExpandableRecyclerAdapter;
import com.jess.arms.base.BaseFragment;
import com.jess.arms.di.component.AppComponent;
import com.xiaoxing.salesclient.mvp.ui.adapter.NavigationAdapter;
import com.xiaoxing.salesclient.mvp.ui.adapter.NavigationListAdapter;
import com.xiaoxing.salesclient.mvp.ui.entity.FeedArticleData;
import com.xiaoxing.salesclient.mvp.ui.entity.NavigationListData;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import q.rorbin.verticaltablayout.VerticalTabLayout;
import q.rorbin.verticaltablayout.adapter.TabAdapter;
import q.rorbin.verticaltablayout.widget.ITabView;
import q.rorbin.verticaltablayout.widget.TabView;
import xiaoxing.com.salesclient.R;
import xiaoxing.com.salesclient.R2;

public class FragmentNavigationList extends BaseFragment {

    public static String[] cates = {"陶瓷陶器", "玉器玉雕", "古币纸钱", "收藏杂项", "铜器铜雕", "中国书画", "古典家具", "邮票邮品", "齐化奇石", "金银珠宝", "专题收藏", "雕品工艺", "图书报刊", "西画雕塑"};

    @BindView(R2.id.navigation_tab_layout)
    VerticalTabLayout mTabLayout;
    @BindView(R2.id.normal_view)
    LinearLayout mNavigationGroup;
    @BindView(R2.id.navigation_divider)
    View mDivider;
    @BindView(R2.id.navigation_RecyclerView)
    RecyclerView mRecyclerView;

    private LinearLayoutManager mManager;
    private boolean needScroll;
    private int index;
    private boolean isClickTab;

    public static FragmentNavigationList getInstance(String param1, String param2) {
        FragmentNavigationList fragment = new FragmentNavigationList();
        Bundle args = new Bundle();
        args.putString("param1", param1);
        args.putString("param2", param2);
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public void setupFragmentComponent(@NonNull AppComponent appComponent) {

    }

    @Override
    public View initView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.sales_client_fragment_navigation_list, null);

        return view;
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {

        List<NavigationListData> navigationListData = new ArrayList<>();

        List<FeedArticleData> articles = new ArrayList<>();

        FeedArticleData feedArticleData = new FeedArticleData();
        feedArticleData.setChapterName("分类11");

        articles.add(feedArticleData);
        articles.add(feedArticleData);
        articles.add(feedArticleData);

        for (int i = 0; i < cates.length; i++) {

            NavigationListData navigationListData1 = new NavigationListData();

            navigationListData1.setName(cates[i]);
            navigationListData1.setArticles(articles);

            navigationListData.add(navigationListData1);

        }

        mTabLayout.setTabAdapter(new TabAdapter() {
            @Override
            public int getCount() {
                return navigationListData == null ? 0 : navigationListData.size();
            }

            @Override
            public ITabView.TabBadge getBadge(int i) {
                return null;
            }

            @Override
            public ITabView.TabIcon getIcon(int i) {
                return null;
            }

            @Override
            public ITabView.TabTitle getTitle(int i) {
                return new TabView.TabTitle.Builder()
                        .setContent(navigationListData.get(i).getName())
                        .setTextSize(14)
                        .setTextColor(getResources().getColor(R.color.sales_client_navigation_tv_selected), getResources().getColor(R.color.sales_client_navigation_tv_normal))
                        .build();
            }

            @Override
            public int getBackground(int i) {
                return -1;
            }
        });

//        if (mDataManager.getCurrentPage() == Constants.TYPE_NAVIGATION) {
        mNavigationGroup.setVisibility(View.VISIBLE);
        mTabLayout.setVisibility(View.VISIBLE);
        mDivider.setVisibility(View.VISIBLE);
//        } else {
//            mNavigationGroup.setVisibility(View.INVISIBLE);
//            mTabLayout.setVisibility(View.INVISIBLE);
//            mDivider.setVisibility(View.INVISIBLE);
//        }
//        NavigationAdapter adapter = new NavigationAdapter(R.layout.sales_client_item_navigation, navigationListData);
        NavigationListAdapter navigationListAdapter = new NavigationListAdapter(getActivity());
        navigationListAdapter.setMode(ExpandableRecyclerAdapter.MODE_ACCORDION);
        mRecyclerView.setAdapter(navigationListAdapter);
        navigationListAdapter.expandAll();
//        mManager = new GridLayoutManager(getActivity(), 3);
        mManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(mManager);
        leftRightLinkage();
    }

    /**
     * Left tabLayout and right recyclerView linkage
     */
    private void leftRightLinkage() {
        mRecyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
                if (needScroll && (newState == RecyclerView.SCROLL_STATE_IDLE)) {
                    needScroll = false;
                    int indexDistance = index - mManager.findFirstVisibleItemPosition();
                    if (indexDistance >= 0 && indexDistance < mRecyclerView.getChildCount()) {
                        int top = mRecyclerView.getChildAt(indexDistance).getTop();
                        mRecyclerView.smoothScrollBy(0, top);
                    }
                }
                rightLinkageLeft(newState);
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                if (needScroll) {
                    needScroll = false;
                    int indexDistance = index - mManager.findFirstVisibleItemPosition();
                    if (indexDistance >= 0 && indexDistance < mRecyclerView.getChildCount()) {
                        int top = mRecyclerView.getChildAt(indexDistance).getTop();
                        mRecyclerView.smoothScrollBy(0, top);
                    }
                }
            }
        });

        mTabLayout.addOnTabSelectedListener(new VerticalTabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabView tabView, int i) {
                isClickTab = true;
                selectTag(i);
            }

            @Override
            public void onTabReselected(TabView tabView, int i) {
            }
        });
    }

    /**
     * Right recyclerView linkage left tabLayout
     * SCROLL_STATE_IDLE just call once
     *
     * @param newState RecyclerView new scroll state
     */
    private void rightLinkageLeft(int newState) {
        if (newState == RecyclerView.SCROLL_STATE_IDLE) {
            if (isClickTab) {
                isClickTab = false;
                return;
            }
            int firstPosition = mManager.findFirstVisibleItemPosition();
            if (index != firstPosition) {
                index = firstPosition;
                setChecked(index);
            }
        }
    }

    private void selectTag(int i) {
        index = i;
        mRecyclerView.stopScroll();
        smoothScrollToPosition(i);
    }

    /**
     * Smooth right to select the position of the left tab
     *
     * @param position checked position
     */
    private void setChecked(int position) {
        if (isClickTab) {
            isClickTab = false;
        } else {
            mTabLayout.setTabSelected(index);
        }
        index = position;
    }

    private void smoothScrollToPosition(int currentPosition) {
        int firstPosition = mManager.findFirstVisibleItemPosition();
        int lastPosition = mManager.findLastVisibleItemPosition();
        if (currentPosition <= firstPosition) {
            mRecyclerView.smoothScrollToPosition(currentPosition);
        } else if (currentPosition <= lastPosition) {
            int top = mRecyclerView.getChildAt(currentPosition - firstPosition).getTop();
            mRecyclerView.smoothScrollBy(0, top);
        } else {
            mRecyclerView.smoothScrollToPosition(currentPosition);
            needScroll = true;
        }
    }

    @Override
    public void setData(@Nullable Object data) {

    }
}
