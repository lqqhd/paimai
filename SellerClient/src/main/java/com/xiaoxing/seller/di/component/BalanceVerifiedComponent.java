package com.xiaoxing.seller.di.component;

import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import com.xiaoxing.seller.di.module.BalanceVerifiedModule;

import com.jess.arms.di.scope.ActivityScope;
import com.xiaoxing.seller.mvp.ui.activity.BalanceVerifiedActivity;

@ActivityScope
@Component(modules = BalanceVerifiedModule.class, dependencies = AppComponent.class)
public interface BalanceVerifiedComponent {
    void inject(BalanceVerifiedActivity activity);
}