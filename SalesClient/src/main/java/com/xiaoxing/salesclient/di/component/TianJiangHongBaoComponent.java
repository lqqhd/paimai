package com.xiaoxing.salesclient.di.component;

import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import com.xiaoxing.salesclient.di.module.TianJiangHongBaoModule;

import com.jess.arms.di.scope.ActivityScope;
import com.xiaoxing.salesclient.mvp.ui.activity.TianJiangHongBaoActivity;

@ActivityScope
@Component(modules = TianJiangHongBaoModule.class, dependencies = AppComponent.class)
public interface TianJiangHongBaoComponent {
    void inject(TianJiangHongBaoActivity activity);
}