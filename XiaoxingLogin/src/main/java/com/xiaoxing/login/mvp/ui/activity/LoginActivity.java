package com.xiaoxing.login.mvp.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.jess.arms.base.BaseActivity;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.utils.ArmsUtils;
import com.xiaoxing.login.R;
import com.xiaoxing.login.R2;
import com.xiaoxing.login.di.component.DaggerLoginComponent;
import com.xiaoxing.login.di.module.LoginModule;
import com.xiaoxing.login.mvp.contract.LoginContract;
import com.xiaoxing.login.mvp.presenter.LoginPresenter;

import butterknife.OnClick;
import me.jessyan.armscomponent.commonres.utils.ToolbarUtils;
import me.jessyan.armscomponent.commonsdk.core.RouterHub;
import me.jessyan.armscomponent.commonsdk.utils.Utils;

import static com.jess.arms.utils.Preconditions.checkNotNull;

@Route(path = RouterHub.XIAO_XING_LOGIN_LOGIN_ACTIVITY)
public class LoginActivity extends BaseActivity<LoginPresenter> implements LoginContract.View {

    @Override
    public void setupActivityComponent(@NonNull AppComponent appComponent) {
        DaggerLoginComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .loginModule(new LoginModule(this))
                .build()
                .inject(this);
    }

    @Override
    public int initView(@Nullable Bundle savedInstanceState) {
        return R.layout.xiaoxing_login_activity_login; //如果你不需要框架帮你设置 setContentView(id) 需要自行设置,请返回 0
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {
        ToolbarUtils.initToolbarTitleBack(this, getString(R.string.xiaoxing_login_login));
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


    @OnClick({R2.id.tv_forgot_pwd, R2.id.tv_reg, R2.id.btn_login})
    public void onViewClicked(View view) {
        if (view.getId() == R.id.tv_reg) {
            Utils.navigation(LoginActivity.this, RouterHub.XIAO_XING_LOGIN_REGISTER_SEND_PHONE_ACTIVITY);
        } else if (view.getId() == R.id.tv_forgot_pwd) {
            Utils.navigation(LoginActivity.this, RouterHub.XIAO_XING_LOGIN_FORGOT_PWD_SEND_PHONE_ACTIVITY);
        } else if (view.getId() == R.id.btn_login) {
            Utils.navigation(LoginActivity.this, RouterHub.SELLER_CLIENT_MINE_ACTIVITY);
        }

    }
}
