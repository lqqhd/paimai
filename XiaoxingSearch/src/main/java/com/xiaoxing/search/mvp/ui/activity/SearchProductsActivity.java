package com.xiaoxing.search.mvp.ui.activity;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.jess.arms.base.BaseActivity;
import com.jess.arms.di.component.AppComponent;
import com.xiaoxing.search.R;
import com.xiaoxing.search.mvp.model.entity.AuctionSearch;
import com.xiaoxing.search.mvp.ui.adapter.SearchProductsAdapter;

import java.util.List;

import me.jessyan.armscomponent.commonres.utils.ToolbarUtils;
import me.jessyan.armscomponent.commonsdk.core.RouterHub;
import me.jessyan.armscomponent.commonsdk.utils.Utils;

import static android.support.v7.widget.DividerItemDecoration.VERTICAL;
import static com.xiaoxing.search.mvp.ui.activity.SearchActivity.SEARCH_PRODUCTS;

/**
 * 使用示例-空布页面
 * A simple {@link Fragment} subclass.
 */
@Route(path = RouterHub.XIAO_XING_SEARCH_SearchProductsActivity)
public class SearchProductsActivity extends BaseActivity {

    private SearchProductsAdapter mAdapter;
    private RecyclerView mRecyclerView;

    List<AuctionSearch.DataBean> mSearchProductsList;


    @Override
    public void setupActivityComponent(@NonNull AppComponent appComponent) {

        ARouter.getInstance().inject(this);
    }

    @Override
    public int initView(@Nullable Bundle savedInstanceState) {
        return R.layout.activity_search_products;
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {

        ToolbarUtils.initToolbarTitleBack(this, "商品列表");
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.addItemDecoration(new DividerItemDecoration(this, VERTICAL));


        mRecyclerView.setLayoutManager(new LinearLayoutManager(SearchProductsActivity.this));
        mRecyclerView.addItemDecoration(new DividerItemDecoration(SearchProductsActivity.this, VERTICAL));
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());

        mSearchProductsList = (List<AuctionSearch.DataBean>) getIntent().getSerializableExtra(SEARCH_PRODUCTS);
        mRecyclerView.setAdapter(mAdapter = new SearchProductsAdapter(SearchProductsActivity.this, mSearchProductsList));

        mAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                Utils.navigation(SearchProductsActivity.this, RouterHub.SALES_CLIENT_WEI_PAI_DETAIL_ACTIVITY);

            }
        });
    }
}
