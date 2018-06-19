package com.xiaoxing.seller.mvp.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.jess.arms.base.BaseActivity;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.utils.ArmsUtils;
import com.xiaoxing.order.mvp.ui.fragment.FragmentOrderList;
import com.xiaoxing.seller.R;
import com.xiaoxing.seller.di.component.DaggerCommodityManagementComponent;
import com.xiaoxing.seller.di.module.CommodityManagementModule;
import com.xiaoxing.seller.mvp.contract.CommodityManagementContract;
import com.xiaoxing.seller.mvp.presenter.CommodityManagementPresenter;

import java.util.ArrayList;

import me.jessyan.armscomponent.commonres.utils.SlidingTabLayoutUtil;
import me.jessyan.armscomponent.commonres.utils.ToolbarUtils;
import me.jessyan.armscomponent.commonsdk.core.RouterHub;

import static com.jess.arms.utils.Preconditions.checkNotNull;

@Route(path = RouterHub.SELLER_CLIENT_COMMODITY_MANAGEMENT_ACTIVITY)
public class CommodityManagementActivity extends BaseActivity<CommodityManagementPresenter> implements CommodityManagementContract.View {

    private final String[] mTitles = {"全部", "微拍", "议价", "展厅", "仓库"};

    @Override
    public void setupActivityComponent(@NonNull AppComponent appComponent) {
        DaggerCommodityManagementComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .commodityManagementModule(new CommodityManagementModule(this))
                .build()
                .inject(this);
    }

    @Override
    public int initView(@Nullable Bundle savedInstanceState) {
        return R.layout.public_activity_top_tab; //如果你不需要框架帮你设置 setContentView(id) 需要自行设置,请返回 0
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {

        ToolbarUtils.initToolbarTitleBack(this, getString(R.string.seller_client_commodity_management));

        ArrayList<Fragment> mFragments = new ArrayList<>();
        mFragments.add(new FragmentOrderList());
        mFragments.add(new FragmentOrderList());
        mFragments.add(new FragmentOrderList());
        mFragments.add(new FragmentOrderList());
        mFragments.add(new FragmentOrderList());

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
