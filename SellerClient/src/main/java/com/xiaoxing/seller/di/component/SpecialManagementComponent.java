package com.xiaoxing.seller.di.component;

import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import com.xiaoxing.seller.di.module.SpecialManagementModule;

import com.jess.arms.di.scope.ActivityScope;
import com.xiaoxing.seller.mvp.ui.activity.SpecialManagementActivity;

@ActivityScope
@Component(modules = SpecialManagementModule.class, dependencies = AppComponent.class)
public interface SpecialManagementComponent {
    void inject(SpecialManagementActivity activity);
}