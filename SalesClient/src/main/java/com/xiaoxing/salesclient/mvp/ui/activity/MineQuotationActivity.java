package com.xiaoxing.salesclient.mvp.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.jess.arms.base.BaseActivity;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.utils.ArmsUtils;

import com.xiaoxing.salesclient.di.component.DaggerMineQuotationComponent;
import com.xiaoxing.salesclient.di.module.MineQuotationModule;
import com.xiaoxing.salesclient.mvp.contract.MineQuotationContract;
import com.xiaoxing.salesclient.mvp.presenter.MineQuotationPresenter;

import com.xiaoxing.salesclient.mvp.ui.fragment.FragmentWeiPai;


import java.util.ArrayList;

import me.jessyan.armscomponent.commonres.utils.SlidingTabLayoutUtil;
import me.jessyan.armscomponent.commonres.utils.ToolbarUtils;
import me.jessyan.armscomponent.commonsdk.core.RouterHub;
import xiaoxing.com.salesclient.R;

import static com.jess.arms.utils.Preconditions.checkNotNull;

@Route(path = RouterHub.SALES_CLIENT_MINEQUOTATIONACTIVITY)
public class MineQuotationActivity extends BaseActivity<MineQuotationPresenter> implements MineQuotationContract.View {
    private final String[] mTitles = {"全部", "已接受", "已拒绝"};

    @Override
    public void setupActivityComponent(@NonNull AppComponent appComponent) {
        DaggerMineQuotationComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .mineQuotationModule(new MineQuotationModule(this))
                .build()
                .inject(this);
    }

    @Override
    public int initView(@Nullable Bundle savedInstanceState) {
        return R.layout.public_activity_top_tab; //如果你不需要框架帮你设置 setContentView(id) 需要自行设置,请返回 0
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {
        ToolbarUtils.initToolbarTitleBack(this, getString(R.string.sales_client_mine_quotation));

        ArrayList<Fragment> mFragments = new ArrayList<>();
        mFragments.add(new FragmentWeiPai());
        mFragments.add(new FragmentWeiPai());
        mFragments.add(new FragmentWeiPai());

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
}
