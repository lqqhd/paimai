package com.xiaoxing.salesclient.mvp.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.jess.arms.base.BaseActivity;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.utils.ArmsUtils;
import com.xiaoxing.salesclient.di.component.DaggerZhanTingDetailComponent;
import com.xiaoxing.salesclient.di.module.ZhanTingDetailModule;
import com.xiaoxing.salesclient.mvp.contract.ZhanTingDetailContract;
import com.xiaoxing.salesclient.mvp.presenter.ZhanTingDetailPresenter;
import com.xiaoxing.salesclient.mvp.ui.adapter.ZhanTingTuiGuangDetailAdapter;
import com.xiaoxing.salesclient.mvp.ui.fragment.FragmentAllZhuanChang;
import com.xiaoxing.salesclient.mvp.ui.fragment.FragmentCangPin;
import com.xiaoxing.salesclient.mvp.ui.fragment.FragmentHome;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;
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
    private ZhanTingTuiGuangDetailAdapter mAdapter;

    private final String[] mTitles = {"展厅商品", "微拍商品", "专场"};

    @Override
    public void setupActivityComponent(@NonNull AppComponent appComponent) {
        DaggerZhanTingDetailComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .zhanTingDetailModule(new ZhanTingDetailModule(this))
                .build()
                .inject(this);
    }

    @Override
    public int initView(@Nullable Bundle savedInstanceState) {
        return R.layout.sales_client_activity_zhan_ting_detail; //如果你不需要框架帮你设置 setContentView(id) 需要自行设置,请返回 0
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {
        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        ToolbarUtils.initToolbarTitleBack(this, "展厅推广详情");

        mAdapter = new ZhanTingTuiGuangDetailAdapter(this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(mAdapter);
        final List<FragmentHome.Movie> movies = new Gson().fromJson(JSON_MOVIES, new TypeToken<ArrayList<FragmentHome.Movie>>() {
        }.getType());
        mAdapter.replaceData(movies);
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
}
