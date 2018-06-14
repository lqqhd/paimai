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
import com.xiaoxing.salesclient.di.component.DaggerCangPinComponent;
import com.xiaoxing.salesclient.di.module.CangPinModule;
import com.xiaoxing.salesclient.mvp.contract.CangPinContract;
import com.xiaoxing.salesclient.mvp.presenter.CangPinPresenter;
import com.xiaoxing.salesclient.mvp.ui.fragment.FragmentCangPin;

import java.util.ArrayList;

import me.jessyan.armscomponent.commonres.utils.SlidingTabLayoutUtil;
import me.jessyan.armscomponent.commonres.utils.ToolbarUtils;
import me.jessyan.armscomponent.commonsdk.core.RouterHub;
import xiaoxing.com.salesclient.R;

import static com.jess.arms.utils.Preconditions.checkNotNull;

@Route(path = RouterHub.SALES_CLIENT_CANGPINACTIVITY)
public class CangPinActivity extends BaseActivity<CangPinPresenter> implements CangPinContract.View {
    private final String[] mTitles = {"最新", "我的关注"};

    @Override
    public void setupActivityComponent(@NonNull AppComponent appComponent) {
        DaggerCangPinComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .cangPinModule(new CangPinModule(this))
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
        mFragments.add(new FragmentCangPin());
        mFragments.add(new FragmentCangPin());

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