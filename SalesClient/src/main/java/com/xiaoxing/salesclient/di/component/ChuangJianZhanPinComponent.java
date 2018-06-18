package com.xiaoxing.salesclient.di.component;

import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import com.xiaoxing.salesclient.di.module.ChuangJianZhanPinModule;

import com.jess.arms.di.scope.ActivityScope;
import com.xiaoxing.salesclient.mvp.ui.activity.ChuangJianZhanPinActivity;

@ActivityScope
@Component(modules = ChuangJianZhanPinModule.class, dependencies = AppComponent.class)
public interface ChuangJianZhanPinComponent {
    void inject(ChuangJianZhanPinActivity activity);
}