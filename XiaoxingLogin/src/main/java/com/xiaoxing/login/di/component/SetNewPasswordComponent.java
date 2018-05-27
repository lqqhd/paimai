package com.xiaoxing.login.di.component;

import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import com.xiaoxing.login.di.module.SetNewPasswordModule;

import com.jess.arms.di.scope.ActivityScope;
import com.xiaoxing.login.mvp.ui.activity.SetNewPasswordActivity;

@ActivityScope
@Component(modules = SetNewPasswordModule.class, dependencies = AppComponent.class)
public interface SetNewPasswordComponent {
    void inject(SetNewPasswordActivity activity);
}