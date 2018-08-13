package com.xiaoxing.salesclient.mvp.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.jess.arms.base.BaseActivity;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.utils.ArmsUtils;
import com.xiaoxing.salesclient.di.component.DaggerZhanTingDetailComponent;
import com.xiaoxing.salesclient.di.module.ZhanTingDetailModule;
import com.xiaoxing.salesclient.mvp.contract.ZhanTingDetailContract;
import com.xiaoxing.salesclient.mvp.model.entity.StoreInfo;
import com.xiaoxing.salesclient.mvp.presenter.ZhanTingDetailPresenter;
import com.xiaoxing.salesclient.mvp.ui.adapter.ZhanTingTuiGuangDetailAdapter;
import com.xiaoxing.salesclient.mvp.ui.fragment.FragmentAllZhuanChang;
import com.xiaoxing.salesclient.mvp.ui.fragment.FragmentCangPin;
import com.xiaoxing.salesclient.mvp.ui.fragment.FragmentHome;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import me.jessyan.armscomponent.commonres.utils.GlideUtil;
import me.jessyan.armscomponent.commonres.utils.SlidingTabLayoutUtil;
import me.jessyan.armscomponent.commonres.utils.ToolbarUtils;
import me.jessyan.armscomponent.commonsdk.core.RouterHub;
import me.jessyan.armscomponent.commonsdk.utils.Utils;
import xiaoxing.com.salesclient.R;
import xiaoxing.com.salesclient.R2;

import static com.jess.arms.utils.Preconditions.checkNotNull;
import static com.xiaoxing.salesclient.mvp.ui.fragment.FragmentHome.JSON_MOVIES;

@Route(path = RouterHub.SALES_CLIENT_ZHAN_TING_DETAIL_ACTIVITY)
public class ZhanTingDetailActivity extends BaseActivity<ZhanTingDetailPresenter> implements ZhanTingDetailContract.View {

    @BindView(R2.id.tv_guan_zhu)
    TextView mTvGuanZhu;
    @BindView(R2.id.shop_logo)
    ImageView shopLogo;
    @BindView(R2.id.tv_name)
    TextView tvName;
    @BindView(R2.id.tv_shop_name)
    TextView tvShopName;
    @BindView(R2.id.tv_fen_si)
    TextView tvFenSi;
    @BindView(R2.id.tv_chu_jia)
    TextView tvChuJia;
    @BindView(R2.id.tv_bao_zheng_jin)
    TextView tvBaoZhengJin;
    @BindView(R2.id.tv_xiao_shou_e)
    TextView tvXiaoShouE;

    private ZhanTingTuiGuangDetailAdapter mAdapter;

    @Autowired
    String store_id;
    @Autowired
    String ru_id;

    @BindView(R2.id.title)
    TextView tvTitle;

    private final String[] mTitles = {"展厅商品", "微拍商品", "专场"};
    private List<StoreInfo.DataBean.GoodsListBean> mGoodsListBeans = new ArrayList<>();

    @Override
    public void setupActivityComponent(@NonNull AppComponent appComponent) {
        DaggerZhanTingDetailComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .zhanTingDetailModule(new ZhanTingDetailModule(this))
                .build()
                .inject(this);

        ARouter.getInstance().inject(this);
    }

    @Override
    public int initView(@Nullable Bundle savedInstanceState) {
        return R.layout.sales_client_activity_zhan_ting_detail; //如果你不需要框架帮你设置 setContentView(id) 需要自行设置,请返回 0
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {
        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        ToolbarUtils.initToolbarTitleBack(this, "展厅推广详情");

        mAdapter = new ZhanTingTuiGuangDetailAdapter(this, mGoodsListBeans);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(mAdapter);
        final List<FragmentHome.Movie> movies = new Gson().fromJson(JSON_MOVIES, new TypeToken<ArrayList<FragmentHome.Movie>>() {
        }.getType());
//        mAdapter.replaceData(movies);
        mAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                Utils.navigation(ZhanTingDetailActivity.this, RouterHub.SALES_CLIENT_WEI_PAI_DETAIL_ACTIVITY);

            }
        });

        ArrayList<Fragment> mFragments = new ArrayList<>();
        mFragments.add(FragmentCangPin.getInstance(null));
        mFragments.add(FragmentCangPin.getInstance(null));
        mFragments.add(new FragmentAllZhuanChang());

        SlidingTabLayoutUtil.init(this, mTitles, mFragments);


        mPresenter.getStoreInfo(store_id, ru_id);
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


    @OnClick(R2.id.tv_guan_zhu)
    void guanZhu() {
        Utils.navigation(ZhanTingDetailActivity.this, RouterHub.XIAO_XING_LOGIN_LOGIN_ACTIVITY);

    }

    @Override
    public void getStoreInfoSuccess(StoreInfo storeInfo) {

        StoreInfo.DataBean dataBean = storeInfo.getData();

        if (dataBean == null)
            return;


//        Glide.with(this).load(dataBean.getStreet_thumb()).into(shopLogo);

        GlideUtil.displayImg(this, dataBean.getStreet_thumb(), shopLogo);

        tvTitle.setText(dataBean.getRz_shopName());
        tvShopName.setText(dataBean.getRz_shopName());
        tvName.setText(dataBean.getShopNameSuffix());
        tvFenSi.setText("粉丝: " + dataBean.getCollect_store());
        tvChuJia.setText("排行: " + dataBean.getAllReview());
        tvBaoZhengJin.setText("保证金 ¥: " + dataBean.getAllReview());
        tvXiaoShouE.setText("销售额 ¥: " + dataBean.getAllReview());


        List<StoreInfo.DataBean.GoodsListBean> goodsListBeanList = storeInfo.getData().getGoods_list();

        if (goodsListBeanList != null) {

            mGoodsListBeans.clear();
            mGoodsListBeans.addAll(goodsListBeanList);
            mAdapter.notifyDataSetChanged();
        }

    }


}
