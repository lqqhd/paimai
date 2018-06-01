package com.xiaoxing.seller.di.component;

import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import com.xiaoxing.seller.di.module.HeadlinesModule;

import com.jess.arms.di.scope.ActivityScope;
import com.xiaoxing.seller.mvp.ui.activity.HeadlinesActivity;

@ActivityScope
@Component(modules = HeadlinesModule.class, dependencies = AppComponent.class)
public interface HeadlinesComponent {
    void inject(HeadlinesActivity activity);
}