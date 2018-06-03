package com.xiaoxing.seller.di.component;

import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import com.xiaoxing.seller.di.module.BalanceDetailsModule;

import com.jess.arms.di.scope.ActivityScope;
import com.xiaoxing.seller.mvp.ui.activity.BalanceDetailsActivity;

@ActivityScope
@Component(modules = BalanceDetailsModule.class, dependencies = AppComponent.class)
public interface BalanceDetailsComponent {
    void inject(BalanceDetailsActivity activity);
}