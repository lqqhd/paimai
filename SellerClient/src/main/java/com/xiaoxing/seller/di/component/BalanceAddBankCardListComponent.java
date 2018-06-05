package com.xiaoxing.seller.di.component;

import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import com.xiaoxing.seller.di.module.BalanceAddBankCardListModule;

import com.jess.arms.di.scope.ActivityScope;
import com.xiaoxing.seller.mvp.ui.activity.BalanceAddBankCardListActivity;

@ActivityScope
@Component(modules = BalanceAddBankCardListModule.class, dependencies = AppComponent.class)
public interface BalanceAddBankCardListComponent {
    void inject(BalanceAddBankCardListActivity activity);
}