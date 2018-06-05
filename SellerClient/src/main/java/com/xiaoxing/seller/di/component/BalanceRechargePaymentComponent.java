package com.xiaoxing.seller.di.component;

import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import com.xiaoxing.seller.di.module.BalanceRechargePaymentModule;

import com.jess.arms.di.scope.ActivityScope;
import com.xiaoxing.seller.mvp.ui.activity.BalanceRechargePaymentActivity;

@ActivityScope
@Component(modules = BalanceRechargePaymentModule.class, dependencies = AppComponent.class)
public interface BalanceRechargePaymentComponent {
    void inject(BalanceRechargePaymentActivity activity);
}