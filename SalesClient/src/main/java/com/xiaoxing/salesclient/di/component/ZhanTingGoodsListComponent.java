package com.xiaoxing.salesclient.di.component;

import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import com.xiaoxing.salesclient.di.module.ZhanTingGoodsListModule;

import com.jess.arms.di.scope.ActivityScope;
import com.xiaoxing.salesclient.mvp.ui.activity.ZhanTingGoodsListActivity;

@ActivityScope
@Component(modules = ZhanTingGoodsListModule.class, dependencies = AppComponent.class)
public interface ZhanTingGoodsListComponent {
    void inject(ZhanTingGoodsListActivity activity);
}