package com.xiaoxing.salesclient.di.component;

import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import com.xiaoxing.salesclient.di.module.ZhanTingModule;

import com.jess.arms.di.scope.ActivityScope;
import com.xiaoxing.salesclient.mvp.ui.activity.ZhanTingActivity;

@ActivityScope
@Component(modules = ZhanTingModule.class, dependencies = AppComponent.class)
public interface ZhanTingComponent {
    void inject(ZhanTingActivity activity);
}