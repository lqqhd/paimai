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

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.jess.arms.base.BaseActivity;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.utils.ArmsUtils;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.constant.SpinnerStyle;
import com.scwang.smartrefresh.layout.header.ClassicsHeader;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;
import com.xiaoxing.salesclient.di.component.DaggerZhanTingGoodsListComponent;
import com.xiaoxing.salesclient.di.module.ZhanTingGoodsListModule;
import com.xiaoxing.salesclient.mvp.contract.ZhanTingGoodsListContract;
import com.xiaoxing.salesclient.mvp.model.entity.SpecialcatList;
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
import static me.jessyan.armscomponent.commonsdk.core.Constants.PRODUCT_ID;

@Route(path = RouterHub.SALES_CLIENT_ZHAN_TING_GOODS_LIST_ACTIVITY)
public class ZhanTingGoodsListActivity extends BaseActivity<ZhanTingGoodsListPresenter> implements ZhanTingGoodsListContract.View, OnRefreshListener {
    private ZhanTingGoodsListAdapter mAdapter;


    private View mEmptyLayout;
    private RecyclerView mRecyclerView;
    private RefreshLayout mRefreshLayout;
    private static boolean mIsNeedDemo = true;
    private List<SpecialcatList.DataBean.GoodsBean> mDataBeans = new ArrayList<>();
    @Autowired
    String specialcat_id;
    SpecialcatList mSpecialcatList;
    @Override
    public void setupActivityComponent(@NonNull AppComponent appComponent) {
        DaggerZhanTingGoodsListComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .zhanTingGoodsListModule(new ZhanTingGoodsListModule(this))
                .build()
                .inject(this);
        ARouter.getInstance().inject(this);
    }

    @Override
    public int initView(@Nullable Bundle savedInstanceState) {
        return R.layout.sales_client_activity_zhan_ting_goods_list; //如果你不需要框架帮你设置 setContentView(id) 需要自行设置,请返回 0
    }

    TextView tv_title, tv_desc, tv_shop_name, tv_chu_jia;
    ImageView shop_logo;

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {

        ToolbarUtils.initToolbarTitleBack(this, "专场");

        mRefreshLayout = findViewById(R.id.refreshLayout);
        mRefreshLayout.setRefreshHeader(new ClassicsHeader(ZhanTingGoodsListActivity.this).setSpinnerStyle(SpinnerStyle.FixedBehind).setPrimaryColorId(R.color.public_colorPrimary).setAccentColorId(android.R.color.white));
        mRefreshLayout.setOnRefreshListener(this);

        mRefreshLayout.autoRefresh();

        mRefreshLayout.setEnableLoadMore(false);

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.setLayoutManager(new LinearLayoutManager(ZhanTingGoodsListActivity.this));
        mRecyclerView.addItemDecoration(new DividerItemDecoration(ZhanTingGoodsListActivity.this, VERTICAL));
        mAdapter = new ZhanTingGoodsListAdapter(this, mDataBeans);
        LayoutInflater inflater = LayoutInflater.from(ZhanTingGoodsListActivity.this);
        View headView = inflater.inflate(R.layout.sales_client_activity_zhan_ting_goods_list_head, null, false);

        tv_title = headView.findViewById(R.id.tv_title);
        tv_desc = headView.findViewById(R.id.tv_desc);
        tv_shop_name = headView.findViewById(R.id.tv_shop_name);
        tv_chu_jia = headView.findViewById(R.id.tv_chu_jia);
        shop_logo = headView.findViewById(R.id.shop_logo);


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
//                Utils.navigation(ZhanTingGoodsListActivity.this, RouterHub.SALES_CLIENT_WEI_PAI_DETAIL_ACTIVITY);
                if (mSpecialcatList ==null)
                    return;

                ARouter.getInstance().build(RouterHub.SALES_CLIENT_WEI_PAI_DETAIL_ACTIVITY).withString(PRODUCT_ID, mSpecialcatList.getData().getGoods().get(position).getGoods_id()).navigation();

            }
        });
        mRecyclerView.setAdapter(mAdapter);

        mEmptyLayout = findViewById(R.id.empty);
        mEmptyLayout.setVisibility(View.GONE);
        ImageView image = (ImageView) findViewById(R.id.empty_image);
        image.setImageResource(R.drawable.ic_empty);

        TextView empty = (TextView) findViewById(R.id.empty_text);
        empty.setText("暂无数据下拉刷新");


    }

    @Override
    public void onRefresh(@NonNull RefreshLayout refreshLayout) {
        mPresenter.getSpecialcatDetail(specialcat_id, "0");
        mRefreshLayout.finishRefresh();
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

    @Override
    public void specialcatListSuccess(SpecialcatList specialcatList) {

        if (specialcatList == null)
            return;
        mSpecialcatList = specialcatList;
        tv_title.setText(specialcatList.getData().getCat_name());
        tv_desc.setText(specialcatList.getData().getCat_desc());
        tv_shop_name.setText(specialcatList.getData().getShop_info().getRz_shopName());

        Glide.with(this).load(specialcatList.getData().getShop_info().getShopinfo().getShop_logo()).into(shop_logo);


        mDataBeans.addAll(specialcatList.getData().getGoods());
        mAdapter.notifyDataSetChanged();
        mEmptyLayout.setVisibility(View.GONE);
    }
}
