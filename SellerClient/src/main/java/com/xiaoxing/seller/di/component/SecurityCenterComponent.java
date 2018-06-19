package com.xiaoxing.seller.di.component;

import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import com.xiaoxing.seller.di.module.SecurityCenterModule;

import com.jess.arms.di.scope.ActivityScope;
import com.xiaoxing.seller.mvp.ui.activity.SecurityCenterActivity;

@ActivityScope
@Component(modules = SecurityCenterModule.class, dependencies = AppComponent.class)
public interface SecurityCenterComponent {
    void inject(SecurityCenterActivity activity);
}