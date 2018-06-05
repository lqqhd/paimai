package com.xiaoxing.seller.di.component;

import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import com.xiaoxing.seller.di.module.BalanceXiaoBaoJinModule;

import com.jess.arms.di.scope.ActivityScope;
import com.xiaoxing.seller.mvp.ui.activity.BalanceXiaoBaoJinActivity;

@ActivityScope
@Component(modules = BalanceXiaoBaoJinModule.class, dependencies = AppComponent.class)
public interface BalanceXiaoBaoJinComponent {
    void inject(BalanceXiaoBaoJinActivity activity);
}