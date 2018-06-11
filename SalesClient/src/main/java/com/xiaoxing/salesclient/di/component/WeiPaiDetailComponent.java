package com.xiaoxing.salesclient.di.component;

import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import com.xiaoxing.salesclient.di.module.WeiPaiDetailModule;

import com.jess.arms.di.scope.ActivityScope;
import com.xiaoxing.salesclient.mvp.ui.activity.WeiPaiDetailActivity;

@ActivityScope
@Component(modules = WeiPaiDetailModule.class, dependencies = AppComponent.class)
public interface WeiPaiDetailComponent {
    void inject(WeiPaiDetailActivity activity);
}