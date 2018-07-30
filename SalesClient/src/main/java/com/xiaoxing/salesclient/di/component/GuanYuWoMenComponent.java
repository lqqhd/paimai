package com.xiaoxing.salesclient.di.component;

import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import com.xiaoxing.salesclient.di.module.GuanYuWoMenModule;

import com.jess.arms.di.scope.ActivityScope;
import com.xiaoxing.salesclient.mvp.ui.activity.GuanYuWoMenActivity;

@ActivityScope
@Component(modules = GuanYuWoMenModule.class, dependencies = AppComponent.class)
public interface GuanYuWoMenComponent {
    void inject(GuanYuWoMenActivity activity);
}