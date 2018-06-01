package com.xiaoxing.seller.di.component;

import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import com.xiaoxing.seller.di.module.CommodityManagementModule;

import com.jess.arms.di.scope.ActivityScope;
import com.xiaoxing.seller.mvp.ui.activity.CommodityManagementActivity;

@ActivityScope
@Component(modules = CommodityManagementModule.class, dependencies = AppComponent.class)
public interface CommodityManagementComponent {
    void inject(CommodityManagementActivity activity);
}