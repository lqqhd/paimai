package com.xiaoxing.seller.di.component;

import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import com.xiaoxing.seller.di.module.BalanceXiaoBaoJinJiaoNaModule;

import com.jess.arms.di.scope.ActivityScope;
import com.xiaoxing.seller.mvp.ui.activity.BalanceXiaoBaoJinJiaoNaActivity;

@ActivityScope
@Component(modules = BalanceXiaoBaoJinJiaoNaModule.class, dependencies = AppComponent.class)
public interface BalanceXiaoBaoJinJiaoNaComponent {
    void inject(BalanceXiaoBaoJinJiaoNaActivity activity);
}