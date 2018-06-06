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
import com.xiaoxing.salesclient.di.component.DaggerWeiPaiComponent;
import com.xiaoxing.salesclient.di.module.WeiPaiModule;
import com.xiaoxing.salesclient.mvp.contract.WeiPaiContract;
import com.xiaoxing.salesclient.mvp.presenter.WeiPaiPresenter;
import com.xiaoxing.salesclient.mvp.ui.fragment.FragmentWeiPai;

import java.util.ArrayList;

import me.jessyan.armscomponent.commonres.utils.SlidingTabLayoutUtil;
import me.jessyan.armscomponent.commonres.utils.ToolbarUtils;
import me.jessyan.armscomponent.commonsdk.core.RouterHub;
import xiaoxing.com.salesclient.R;

import static com.jess.arms.utils.Preconditions.checkNotNull;

@Route(path = RouterHub.SALES_CLIENT_WEIPAIACTIVITY)
public class WeiPaiActivity extends BaseActivity<WeiPaiPresenter> implements WeiPaiContract.View {
    private final String[] mTitles = {"综合", "价格", "最新"};

    @Override
    public void setupActivityComponent(@NonNull AppComponent appComponent) {
        DaggerWeiPaiComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .weiPaiModule(new WeiPaiModule(this))
                .build()
                .inject(this);
    }

    @Override
    public int initView(@Nullable Bundle savedInstanceState) {
        return R.layout.sales_client_activity_zhuan_chang; //如果你不需要框架帮你设置 setContentView(id) 需要自行设置,请返回 0
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {
        ToolbarUtils.initToolbarTitleBackWithSearch(this);

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
