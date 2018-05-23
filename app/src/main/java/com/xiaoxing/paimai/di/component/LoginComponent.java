package com.xiaoxing.paimai.di.component;

import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import com.xiaoxing.paimai.di.module.LoginModule;

import com.jess.arms.di.scope.ActivityScope;
import com.xiaoxing.paimai.mvp.ui.activity.LoginActivity;

@ActivityScope
@Component(modules = LoginModule.class, dependencies = AppComponent.class)
public interface LoginComponent {
    void inject(LoginActivity activity);
}