package com.xiaoxing.seller.di.component;

import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import com.xiaoxing.seller.di.module.BalanceAddBankCardModule;

import com.jess.arms.di.scope.ActivityScope;
import com.xiaoxing.seller.mvp.ui.activity.BalanceAddBankCardActivity;

@ActivityScope
@Component(modules = BalanceAddBankCardModule.class, dependencies = AppComponent.class)
public interface BalanceAddBankCardComponent {
    void inject(BalanceAddBankCardActivity activity);
}