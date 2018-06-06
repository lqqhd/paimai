package com.xiaoxing.salesclient.di.component;

import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import com.xiaoxing.salesclient.di.module.CangPinModule;

import com.jess.arms.di.scope.ActivityScope;
import com.xiaoxing.salesclient.mvp.ui.activity.CangPinActivity;

@ActivityScope
@Component(modules = CangPinModule.class, dependencies = AppComponent.class)
public interface CangPinComponent {
    void inject(CangPinActivity activity);
}