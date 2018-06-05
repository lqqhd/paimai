package com.xiaoxing.seller.di.component;

import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import com.xiaoxing.seller.di.module.BalancePaymentSecurityModule;

import com.jess.arms.di.scope.ActivityScope;
import com.xiaoxing.seller.mvp.ui.activity.BalancePaymentSecurityActivity;

@ActivityScope
@Component(modules = BalancePaymentSecurityModule.class, dependencies = AppComponent.class)
public interface BalancePaymentSecurityComponent {
    void inject(BalancePaymentSecurityActivity activity);
}