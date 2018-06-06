package com.xiaoxing.salesclient.di.component;

import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import com.xiaoxing.salesclient.di.module.ZhuanChangModule;

import com.jess.arms.di.scope.ActivityScope;
import com.xiaoxing.salesclient.mvp.ui.activity.ZhuanChangActivity;

@ActivityScope
@Component(modules = ZhuanChangModule.class, dependencies = AppComponent.class)
public interface ZhuanChangComponent {
    void inject(ZhuanChangActivity activity);
}