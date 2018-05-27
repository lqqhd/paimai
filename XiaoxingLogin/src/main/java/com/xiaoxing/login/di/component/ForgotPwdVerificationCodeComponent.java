package com.xiaoxing.login.di.component;

import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import com.xiaoxing.login.di.module.ForgotPwdVerificationCodeModule;

import com.jess.arms.di.scope.ActivityScope;
import com.xiaoxing.login.mvp.ui.activity.ForgotPwdVerificationCodeActivity;

@ActivityScope
@Component(modules = ForgotPwdVerificationCodeModule.class, dependencies = AppComponent.class)
public interface ForgotPwdVerificationCodeComponent {
    void inject(ForgotPwdVerificationCodeActivity activity);
}