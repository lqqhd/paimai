package com.xiaoxing.salesclient.di.component;

import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import com.xiaoxing.salesclient.di.module.WeiPaiModule;

import com.jess.arms.di.scope.ActivityScope;
import com.xiaoxing.salesclient.mvp.ui.activity.WeiPaiActivity;

@ActivityScope
@Component(modules = WeiPaiModule.class, dependencies = AppComponent.class)
public interface WeiPaiComponent {
    void inject(WeiPaiActivity activity);
}