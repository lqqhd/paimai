package com.xiaoxing.order.mvp.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.flyco.tablayout.SlidingTabLayout;
import com.flyco.tablayout.listener.OnTabSelectListener;
import com.jess.arms.base.BaseActivity;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.utils.ArmsUtils;
import com.xiaoxing.order.R;
import com.xiaoxing.order.di.component.DaggerOrderComponent;
import com.xiaoxing.order.di.module.OrderModule;
import com.xiaoxing.order.mvp.contract.OrderContract;
import com.xiaoxing.order.mvp.presenter.OrderPresenter;
import com.xiaoxing.order.mvp.ui.fragment.SimpleCardFragment;

import java.util.ArrayList;

import me.jessyan.armscomponent.commonres.utils.ToolbarUtils;
import me.jessyan.armscomponent.commonsdk.core.RouterHub;

import static com.jess.arms.utils.Preconditions.checkNotNull;


@Route(path = RouterHub.XIAO_XING_ORDER_ORDERACTIVITY)
public class OrderActivity extends BaseActivity<OrderPresenter> implements OrderContract.View, OnTabSelectListener {
    private MyPagerAdapter mAdapter;
    private ArrayList<Fragment> mFragments = new ArrayList<>();
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
        return R.layout.activity_order; //如果你不需要框架帮你设置 setContentView(id) 需要自行设置,请返回 0
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {
        ToolbarUtils.initToolbarTitleBack(this, getString(R.string.order_order));

        for (String title : mTitles) {
            mFragments.add(SimpleCardFragment.getInstance(title));
        }
        ViewPager vp = findViewById(R.id.vp);
        mAdapter = new MyPagerAdapter(getSupportFragmentManager());
        vp.setAdapter(mAdapter);
        SlidingTabLayout tabLayout_2 = findViewById(R.id.tl_2);
        tabLayout_2.setViewPager(vp);
        tabLayout_2.setOnTabSelectListener(this);
//        tabLayout_2.showDot(4);
//
//        tabLayout_2.showMsg(3, 5);
//        tabLayout_2.setMsgMargin(3, 0, 10);
//
//        tabLayout_2.showMsg(5, 5);
//        tabLayout_2.setMsgMargin(5, 0, 10);
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

    @Override
    public void onTabSelect(int position) {
        Toast.makeText(this, "onTabSelect&position--->" + position, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onTabReselect(int position) {
        Toast.makeText(this, "onTabReselect&position--->" + position, Toast.LENGTH_SHORT).show();
    }

    private class MyPagerAdapter extends FragmentPagerAdapter {
        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public int getCount() {
            return mFragments.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mTitles[position];
        }

        @Override
        public Fragment getItem(int position) {
            return mFragments.get(position);
        }
    }
}
