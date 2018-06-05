package com.xiaoxing.seller.di.component;

import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import com.xiaoxing.seller.di.module.BalanceRechargeModule;

import com.jess.arms.di.scope.ActivityScope;
import com.xiaoxing.seller.mvp.ui.activity.BalanceRechargeActivity;

@ActivityScope
@Component(modules = BalanceRechargeModule.class, dependencies = AppComponent.class)
public interface BalanceRechargeComponent {
    void inject(BalanceRechargeActivity activity);
}