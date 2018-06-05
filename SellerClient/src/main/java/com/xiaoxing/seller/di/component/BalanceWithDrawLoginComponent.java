package com.xiaoxing.seller.di.component;

import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import com.xiaoxing.seller.di.module.BalanceWithDrawLoginModule;

import com.jess.arms.di.scope.ActivityScope;
import com.xiaoxing.seller.mvp.ui.activity.BalanceWithDrawLoginActivity;

@ActivityScope
@Component(modules = BalanceWithDrawLoginModule.class, dependencies = AppComponent.class)
public interface BalanceWithDrawLoginComponent {
    void inject(BalanceWithDrawLoginActivity activity);
}