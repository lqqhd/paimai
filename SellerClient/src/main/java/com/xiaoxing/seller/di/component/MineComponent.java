package com.xiaoxing.seller.di.component;

import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import com.xiaoxing.seller.di.module.MineModule;

import com.jess.arms.di.scope.ActivityScope;
import com.xiaoxing.seller.mvp.ui.activity.MineActivity;

@ActivityScope
@Component(modules = MineModule.class, dependencies = AppComponent.class)
public interface MineComponent {
    void inject(MineActivity activity);
}