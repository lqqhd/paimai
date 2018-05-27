package com.xiaoxing.login.di.component;

import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import com.xiaoxing.login.di.module.ForgotPwdSendPhoneModule;

import com.jess.arms.di.scope.ActivityScope;
import com.xiaoxing.login.mvp.ui.activity.ForgotPwdSendPhoneActivity;

@ActivityScope
@Component(modules = ForgotPwdSendPhoneModule.class, dependencies = AppComponent.class)
public interface ForgotPwdSendPhoneComponent {
    void inject(ForgotPwdSendPhoneActivity activity);
}