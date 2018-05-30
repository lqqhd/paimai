package com.xiaoxing.address.di.component;

import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import com.xiaoxing.address.di.module.AddressAddModule;

import com.jess.arms.di.scope.ActivityScope;
import com.xiaoxing.address.mvp.ui.activity.AddressAddActivity;

@ActivityScope
@Component(modules = AddressAddModule.class, dependencies = AppComponent.class)
public interface AddressAddComponent {
    void inject(AddressAddActivity activity);
}