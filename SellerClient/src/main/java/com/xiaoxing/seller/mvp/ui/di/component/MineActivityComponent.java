package com.xiaoxing.seller.mvp.ui.di.component;

import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import com.xiaoxing.seller.mvp.ui.di.module.MineActivityModule;

import com.jess.arms.di.scope.ActivityScope;
import com.xiaoxing.seller.mvp.ui.mvp.ui.activity.MineActivityActivity;

@ActivityScope
@Component(modules = MineActivityModule.class, dependencies = AppComponent.class)
public interface MineActivityComponent {
    void inject(MineActivityActivity activity);
}