package com.xiaoxing.salesclient.di.component;

import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import com.xiaoxing.salesclient.di.module.MineQuotationModule;

import com.jess.arms.di.scope.ActivityScope;
import com.xiaoxing.salesclient.mvp.ui.activity.MineQuotationActivity;

@ActivityScope
@Component(modules = MineQuotationModule.class, dependencies = AppComponent.class)
public interface MineQuotationComponent {
    void inject(MineQuotationActivity activity);
}