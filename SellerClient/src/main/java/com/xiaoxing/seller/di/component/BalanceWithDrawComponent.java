package com.xiaoxing.seller.di.component;

import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import com.xiaoxing.seller.di.module.BalanceWithDrawModule;

import com.jess.arms.di.scope.ActivityScope;
import com.xiaoxing.seller.mvp.ui.activity.BalanceWithDrawActivity;

@ActivityScope
@Component(modules = BalanceWithDrawModule.class, dependencies = AppComponent.class)
public interface BalanceWithDrawComponent {
    void inject(BalanceWithDrawActivity activity);
}