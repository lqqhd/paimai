package com.xiaoxing.salesclient.di.component;

import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import com.xiaoxing.salesclient.di.module.WoDeJingPaiModule;

import com.jess.arms.di.scope.ActivityScope;
import com.xiaoxing.salesclient.mvp.ui.activity.WoDeJingPaiActivity;

@ActivityScope
@Component(modules = WoDeJingPaiModule.class, dependencies = AppComponent.class)
public interface WoDeJingPaiComponent {
    void inject(WoDeJingPaiActivity activity);
}