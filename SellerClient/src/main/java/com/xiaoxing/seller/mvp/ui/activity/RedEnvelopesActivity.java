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
import com.xiaoxing.seller.di.component.DaggerRedEnvelopesComponent;
import com.xiaoxing.seller.di.module.RedEnvelopesModule;
import com.xiaoxing.seller.mvp.contract.RedEnvelopesContract;
import com.xiaoxing.seller.mvp.presenter.RedEnvelopesPresenter;

import me.jessyan.armscomponent.commonsdk.core.RouterHub;

import static com.jess.arms.utils.Preconditions.checkNotNull;

@Route(path = RouterHub.SELLER_CLIENT_REDENVELOPESACTIVITY)
public class RedEnvelopesActivity extends BaseActivity<RedEnvelopesPresenter> implements RedEnvelopesContract.View {

    @Override
    public void setupActivityComponent(@NonNull AppComponent appComponent) {
        DaggerRedEnvelopesComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .redEnvelopesModule(new RedEnvelopesModule(this))
                .build()
                .inject(this);
    }

    @Override
    public int initView(@Nullable Bundle savedInstanceState) {
        return R.layout.activity_red_envelopes; //如果你不需要框架帮你设置 setContentView(id) 需要自行设置,请返回 0
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
