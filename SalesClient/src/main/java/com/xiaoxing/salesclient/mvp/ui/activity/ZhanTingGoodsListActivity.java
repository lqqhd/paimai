package com.xiaoxing.salesclient.mvp.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.jess.arms.base.BaseActivity;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.utils.ArmsUtils;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.scwang.smartrefresh.layout.constant.SpinnerStyle;
import com.scwang.smartrefresh.layout.header.ClassicsHeader;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;
import com.scwang.smartrefresh.layout.listener.SimpleMultiPurposeListener;
import com.xiaoxing.salesclient.di.component.DaggerZhanTingGoodsListComponent;
import com.xiaoxing.salesclient.di.module.ZhanTingGoodsListModule;
import com.xiaoxing.salesclient.mvp.contract.ZhanTingGoodsListContract;
import com.xiaoxing.salesclient.mvp.presenter.ZhanTingGoodsListPresenter;
import com.xiaoxing.salesclient.mvp.ui.adapter.ZhanTingGoodsListAdapter;
import com.xiaoxing.salesclient.mvp.ui.entity.AddressList;

import java.util.ArrayList;
import java.util.List;

import butterknife.OnClick;
import me.jessyan.armscomponent.commonres.utils.ToolbarUtils;
import me.jessyan.armscomponent.commonsdk.core.RouterHub;
import me.jessyan.armscomponent.commonsdk.utils.Utils;
import xiaoxing.com.salesclient.R;
import xiaoxing.com.salesclient.R2;

import static android.support.v7.widget.DividerItemDecoration.VERTICAL;
import static com.jess.arms.utils.Preconditions.checkNotNull;

@Route(path = RouterHub.SALES_CLIENT_ZHAN_TING_GOODS_LIST_ACTIVITY)
public class ZhanTingGoodsListActivity extends BaseActivity<ZhanTingGoodsListPresenter> implements ZhanTingGoodsListContract.View, OnRefreshListener {
    private ZhanTingGoodsListAdapter mAdapter;


    private View mEmptyLayout;
    private RecyclerView mRecyclerView;
    private RefreshLayout mRefreshLayout;
    private static boolean mIsNeedDemo = true;
    private List<AddressList> mAddressLists = new ArrayList<>();

    @Override
    public void setupActivityComponent(@NonNull AppComponent appComponent) {
        DaggerZhanTingGoodsListComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .zhanTingGoodsListModule(new ZhanTingGoodsListModule(this))
                .build()
                .inject(this);
    }

    @Override
    public int initView(@Nullable Bundle savedInstanceState) {
        return R.layout.sales_client_activity_zhan_ting_goods_list; //如果你不需要框架帮你设置 setContentView(id) 需要自行设置,请返回 0
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {

        ToolbarUtils.initToolbarTitleBack(this, "专场");

        mRefreshLayout = findViewById(R.id.refreshLayout);
        mRefreshLayout.setRefreshHeader(new ClassicsHeader(ZhanTingGoodsListActivity.this).setSpinnerStyle(SpinnerStyle.FixedBehind).setPrimaryColorId(R.color.public_colorPrimary).setAccentColorId(android.R.color.white));
        mRefreshLayout.setOnRefreshListener(this);

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.setLayoutManager(new LinearLayoutManager(ZhanTingGoodsListActivity.this));
        mRecyclerView.addItemDecoration(new DividerItemDecoration(ZhanTingGoodsListActivity.this, VERTICAL));
        mAdapter = new ZhanTingGoodsListAdapter(mAddressLists);
        LayoutInflater inflater = LayoutInflater.from(ZhanTingGoodsListActivity.this);
        View headView = inflater.inflate(R.layout.sales_client_activity_zhan_ting_goods_list_head, null, false);

        RelativeLayout rl_dian_pu = headView.findViewById(R.id.rl_dian_pu);
        rl_dian_pu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.navigation(ZhanTingGoodsListActivity.this, RouterHub.SALES_CLIENT_ZHAN_TING_DETAIL_ACTIVITY);
            }
        });
        mAdapter.addHeaderView(headView);
        mAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                Utils.navigation(ZhanTingGoodsListActivity.this, RouterHub.SALES_CLIENT_WEI_PAI_DETAIL_ACTIVITY);

            }
        });
        mRecyclerView.setAdapter(mAdapter);

        mEmptyLayout = findViewById(R.id.empty);
        mEmptyLayout.setVisibility(View.GONE);
        ImageView image = (ImageView) findViewById(R.id.empty_image);
        image.setImageResource(R.drawable.ic_empty);

        TextView empty = (TextView) findViewById(R.id.empty_text);
        empty.setText("暂无数据下拉刷新");

        /*主动演示刷新*/
        if (mIsNeedDemo) {
            mRefreshLayout.getLayout().postDelayed(new Runnable() {
                @Override
                public void run() {
                    if (mIsNeedDemo) {
                        mRefreshLayout.autoRefresh();
                    }
                }
            }, 3000);
            mRefreshLayout.setOnMultiPurposeListener(new SimpleMultiPurposeListener() {
                @Override
                public void onStateChanged(@NonNull RefreshLayout refreshLayout, @NonNull RefreshState oldState, @NonNull RefreshState newState) {
                    mIsNeedDemo = false;
                }
            });
        }
        mRefreshLayout.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
                mRefreshLayout.finishLoadMore();
            }
        });

    }

    @Override
    public void onRefresh(@NonNull RefreshLayout refreshLayout) {
        mRefreshLayout.getLayout().postDelayed(new Runnable() {
            @Override
            public void run() {
                mAddressLists.addAll(loadModels());
                mAdapter.notifyDataSetChanged();
                mRefreshLayout.finishRefresh();
                mEmptyLayout.setVisibility(View.GONE);
            }
        }, 2000);
    }

    /**
     * 模拟数据
     */
    private List<AddressList> loadModels() {
        List<AddressList> addressLists = new ArrayList<>();

        for (int i = 0; i < 25; i++) {

            AddressList addressList = new AddressList();
            addressList.setName("name" + i);
            addressList.setAddress("address" + i);
            addressList.setPhone("1580000000" + i);
            addressLists.add(addressList);
        }


        return addressLists;
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

    @OnClick(R2.id.rl_dian_pu)
    void toDianPu() {
        Utils.navigation(ZhanTingGoodsListActivity.this, RouterHub.SALES_CLIENT_ZHAN_TING_DETAIL_ACTIVITY);

    }
}