package com.xiaoxing.seller.di.component;

import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import com.xiaoxing.seller.di.module.ApplicationHallModule;

import com.jess.arms.di.scope.ActivityScope;
import com.xiaoxing.seller.mvp.ui.activity.ApplicationHallActivity;

@ActivityScope
@Component(modules = ApplicationHallModule.class, dependencies = AppComponent.class)
public interface ApplicationHallComponent {
    void inject(ApplicationHallActivity activity);
}