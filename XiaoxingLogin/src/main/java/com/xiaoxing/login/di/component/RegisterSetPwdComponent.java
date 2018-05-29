package com.xiaoxing.login.di.component;

import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import com.xiaoxing.login.di.module.RegisterSetPwdModule;

import com.jess.arms.di.scope.ActivityScope;
import com.xiaoxing.login.mvp.ui.activity.RegisterSetPwdActivity;

@ActivityScope
@Component(modules = RegisterSetPwdModule.class, dependencies = AppComponent.class)
public interface RegisterSetPwdComponent {
    void inject(RegisterSetPwdActivity activity);
}