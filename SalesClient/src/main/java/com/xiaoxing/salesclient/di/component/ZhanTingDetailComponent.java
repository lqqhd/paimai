package com.xiaoxing.salesclient.di.component;

import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import com.xiaoxing.salesclient.di.module.ZhanTingDetailModule;

import com.jess.arms.di.scope.ActivityScope;
import com.xiaoxing.salesclient.mvp.ui.activity.ZhanTingDetailActivity;

@ActivityScope
@Component(modules = ZhanTingDetailModule.class, dependencies = AppComponent.class)
public interface ZhanTingDetailComponent {
    void inject(ZhanTingDetailActivity activity);
}