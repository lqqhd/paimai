package com.xiaoxing.seller.di.component;

import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import com.xiaoxing.seller.di.module.BalanceModule;

import com.jess.arms.di.scope.ActivityScope;
import com.xiaoxing.seller.mvp.ui.activity.BalanceActivity;

@ActivityScope
@Component(modules = BalanceModule.class, dependencies = AppComponent.class)
public interface BalanceComponent {
    void inject(BalanceActivity activity);
}