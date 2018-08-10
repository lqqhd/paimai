package com.xiaoxing.salesclient.di.component;

import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import com.xiaoxing.salesclient.di.module.WeiPaiDetailZhengChangModule;

import com.jess.arms.di.scope.ActivityScope;
import com.xiaoxing.salesclient.mvp.ui.activity.WeiPaiDetailZhengChangActivity;

@ActivityScope
@Component(modules = WeiPaiDetailZhengChangModule.class, dependencies = AppComponent.class)
public interface WeiPaiDetailZhengChangComponent {
    void inject(WeiPaiDetailZhengChangActivity activity);
}