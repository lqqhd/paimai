package com.xiaoxing.login.mvp.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.jess.arms.base.BaseActivity;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.utils.ArmsUtils;
import com.xiaoxing.login.R;
import com.xiaoxing.login.di.component.DaggerForgotPwdVerificationCodeComponent;
import com.xiaoxing.login.di.module.ForgotPwdVerificationCodeModule;
import com.xiaoxing.login.mvp.contract.ForgotPwdVerificationCodeContract;
import com.xiaoxing.login.mvp.presenter.ForgotPwdVerificationCodePresenter;

import me.jessyan.armscomponent.commonsdk.core.RouterHub;

import static com.jess.arms.utils.Preconditions.checkNotNull;

@Route(path = RouterHub.XIAO_XING_LOGIN_FORGOTPWDVERIFICATIONCODEACTIVITY)
public class ForgotPwdVerificationCodeActivity extends BaseActivity<ForgotPwdVerificationCodePresenter> implements ForgotPwdVerificationCodeContract.View {

    @Override
    public void setupActivityComponent(@NonNull AppComponent appComponent) {
        DaggerForgotPwdVerificationCodeComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .forgotPwdVerificationCodeModule(new ForgotPwdVerificationCodeModule(this))
                .build()
                .inject(this);
    }

    @Override
    public int initView(@Nullable Bundle savedInstanceState) {
        return R.layout.xiaoxing_login_activity_forgot_pwd_verification_code; //如果你不需要框架帮你设置 setContentView(id) 需要自行设置,请返回 0
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
