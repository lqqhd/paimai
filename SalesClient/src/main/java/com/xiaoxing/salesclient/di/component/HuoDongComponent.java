package com.xiaoxing.salesclient.di.component;

import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import com.xiaoxing.salesclient.di.module.HuoDongModule;

import com.jess.arms.di.scope.ActivityScope;
import com.xiaoxing.salesclient.mvp.ui.activity.HuoDongActivity;

@ActivityScope
@Component(modules = HuoDongModule.class, dependencies = AppComponent.class)
public interface HuoDongComponent {
    void inject(HuoDongActivity activity);
}