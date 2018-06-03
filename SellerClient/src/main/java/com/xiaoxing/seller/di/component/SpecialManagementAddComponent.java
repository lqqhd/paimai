package com.xiaoxing.seller.di.component;

import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import com.xiaoxing.seller.di.module.SpecialManagementAddModule;

import com.jess.arms.di.scope.ActivityScope;
import com.xiaoxing.seller.mvp.ui.activity.SpecialManagementAddActivity;

@ActivityScope
@Component(modules = SpecialManagementAddModule.class, dependencies = AppComponent.class)
public interface SpecialManagementAddComponent {
    void inject(SpecialManagementAddActivity activity);
}