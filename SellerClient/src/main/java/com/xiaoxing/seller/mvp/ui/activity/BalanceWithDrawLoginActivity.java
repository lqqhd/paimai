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
import com.xiaoxing.seller.R2;
import com.xiaoxing.seller.di.component.DaggerBalanceWithDrawLoginComponent;
import com.xiaoxing.seller.di.module.BalanceWithDrawLoginModule;
import com.xiaoxing.seller.mvp.contract.BalanceWithDrawLoginContract;
import com.xiaoxing.seller.mvp.presenter.BalanceWithDrawLoginPresenter;

import butterknife.OnClick;
import me.jessyan.armscomponent.commonres.utils.ToolbarUtils;
import me.jessyan.armscomponent.commonsdk.core.RouterHub;
import me.jessyan.armscomponent.commonsdk.utils.Utils;

import static com.jess.arms.utils.Preconditions.checkNotNull;


@Route(path = RouterHub.SELLER_CLIENT_BALANCEWITHDRAWLOGINACTIVITY)
public class BalanceWithDrawLoginActivity extends BaseActivity<BalanceWithDrawLoginPresenter> implements BalanceWithDrawLoginContract.View {

    @Override
    public void setupActivityComponent(@NonNull AppComponent appComponent) {
        DaggerBalanceWithDrawLoginComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .balanceWithDrawLoginModule(new BalanceWithDrawLoginModule(this))
                .build()
                .inject(this);
    }

    @Override
    public int initView(@Nullable Bundle savedInstanceState) {
        return R.layout.seller_client_activity_balance_with_draw_login; //如果你不需要框架帮你设置 setContentView(id) 需要自行设置,请返回 0
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {

        ToolbarUtils.initToolbarTitleBack(this, getString(R.string.seller_client_balance_withdraw));
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


    @OnClick(R2.id.btn_next)
    public void onViewClicked() {

        Utils.navigation(BalanceWithDrawLoginActivity.this, RouterHub.SELLER_CLIENT_BALANCEWITHDRAWACTIVITY);
    }
}
