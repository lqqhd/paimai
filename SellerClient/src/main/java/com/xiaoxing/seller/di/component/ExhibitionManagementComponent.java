package com.xiaoxing.seller.di.component;

import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import com.xiaoxing.seller.di.module.ExhibitionManagementModule;

import com.jess.arms.di.scope.ActivityScope;
import com.xiaoxing.seller.mvp.ui.activity.ExhibitionManagementActivity;

@ActivityScope
@Component(modules = ExhibitionManagementModule.class, dependencies = AppComponent.class)
public interface ExhibitionManagementComponent {
    void inject(ExhibitionManagementActivity activity);
}