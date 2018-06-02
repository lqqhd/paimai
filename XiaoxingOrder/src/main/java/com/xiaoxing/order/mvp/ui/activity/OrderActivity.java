package com.xiaoxing.order.mvp.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.jess.arms.base.BaseActivity;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.utils.ArmsUtils;
import com.xiaoxing.order.R;
import com.xiaoxing.order.di.component.DaggerOrderComponent;
import com.xiaoxing.order.di.module.OrderModule;
import com.xiaoxing.order.mvp.contract.OrderContract;
import com.xiaoxing.order.mvp.presenter.OrderPresenter;
import com.xiaoxing.order.mvp.ui.fragment.FragmentOrderList;

import java.util.ArrayList;

import me.jessyan.armscomponent.commonres.utils.SlidingTabLayoutUtil;
import me.jessyan.armscomponent.commonres.utils.ToolbarUtils;
import me.jessyan.armscomponent.commonsdk.core.RouterHub;

import static com.jess.arms.utils.Preconditions.checkNotNull;


@Route(path = RouterHub.XIAO_XING_ORDER_ORDERACTIVITY)
public class OrderActivity extends BaseActivity<OrderPresenter> implements OrderContract.View {

    private final String[] mTitles = {"全部", "待付款", "待发货", "已发货", "已收货", "售后"};

    @Override
    public void setupActivityComponent(@NonNull AppComponent appComponent) {
        DaggerOrderComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .orderModule(new OrderModule(this))
                .build()
                .inject(this);
    }

    @Override
    public int initView(@Nullable Bundle savedInstanceState) {
        return R.layout.public_activity_top_tab; //如果你不需要框架帮你设置 setContentView(id) 需要自行设置,请返回 0
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {
        ToolbarUtils.initToolbarTitleBack(this, getString(R.string.order_order));

        ArrayList<Fragment> mFragments = new ArrayList<>();
        mFragments.add(new FragmentOrderList());
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
