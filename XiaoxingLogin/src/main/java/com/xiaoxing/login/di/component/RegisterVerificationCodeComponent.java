package com.xiaoxing.login.di.component;

import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import com.xiaoxing.login.di.module.RegisterVerificationCodeModule;

import com.jess.arms.di.scope.ActivityScope;
import com.xiaoxing.login.mvp.ui.activity.RegisterVerificationCodeActivity;

@ActivityScope
@Component(modules = RegisterVerificationCodeModule.class, dependencies = AppComponent.class)
public interface RegisterVerificationCodeComponent {
    void inject(RegisterVerificationCodeActivity activity);
}