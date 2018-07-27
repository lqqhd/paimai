package com.xiaoxing.salesclient.di.component;

import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import com.xiaoxing.salesclient.di.module.SignHistoryModule;

import com.jess.arms.di.scope.ActivityScope;
import com.xiaoxing.salesclient.mvp.ui.activity.SignHistoryActivity;

@ActivityScope
@Component(modules = SignHistoryModule.class, dependencies = AppComponent.class)
public interface SignHistoryComponent {
    void inject(SignHistoryActivity activity);
}