package com.xiaoxing.seller.mvp.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.jess.arms.base.BaseActivity;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.utils.ArmsUtils;
import com.xiaoxing.seller.R;
import com.xiaoxing.seller.di.component.DaggerSpecialManagementComponent;
import com.xiaoxing.seller.di.module.SpecialManagementModule;
import com.xiaoxing.seller.mvp.contract.SpecialManagementContract;
import com.xiaoxing.seller.mvp.presenter.SpecialManagementPresenter;

import me.jessyan.armscomponent.commonsdk.core.RouterHub;

import static com.jess.arms.utils.Preconditions.checkNotNull;

@Route(path = RouterHub.SELLER_CLIENT_SPECIALMANAGEMENTACTIVITY)
public class SpecialManagementActivity extends BaseActivity<SpecialManagementPresenter> implements SpecialManagementContract.View {

    @Override
    public void setupActivityComponent(@NonNull AppComponent appComponent) {
        DaggerSpecialManagementComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .specialManagementModule(new SpecialManagementModule(this))
                .build()
                .inject(this);
    }

    @Override
    public int initView(@Nullable Bundle savedInstanceState) {
        return R.layout.activity_special_management; //如果你不需要框架帮你设置 setContentView(id) 需要自行设置,请返回 0
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {

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
