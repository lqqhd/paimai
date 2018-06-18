package com.xiaoxing.salesclient.di.component;

import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import com.xiaoxing.salesclient.di.module.ChuangJianZhuanChangModule;

import com.jess.arms.di.scope.ActivityScope;
import com.xiaoxing.salesclient.mvp.ui.activity.ChuangJianZhuanChangActivity;

@ActivityScope
@Component(modules = ChuangJianZhuanChangModule.class, dependencies = AppComponent.class)
public interface ChuangJianZhuanChangComponent {
    void inject(ChuangJianZhuanChangActivity activity);
}