package com.xiaoxing.salesclient.di.component;

import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import com.xiaoxing.salesclient.di.module.ChuangJianWeiPaiModule;

import com.jess.arms.di.scope.ActivityScope;
import com.xiaoxing.salesclient.mvp.ui.activity.ChuangJianWeiPaiActivity;

@ActivityScope
@Component(modules = ChuangJianWeiPaiModule.class, dependencies = AppComponent.class)
public interface ChuangJianWeiPaiComponent {
    void inject(ChuangJianWeiPaiActivity activity);
}