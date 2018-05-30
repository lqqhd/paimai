package com.xiaoxing.address.di.component;

import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import com.xiaoxing.address.di.module.AddressListModule;

import com.jess.arms.di.scope.ActivityScope;
import com.xiaoxing.address.mvp.ui.activity.AddressListActivity;

@ActivityScope
@Component(modules = AddressListModule.class, dependencies = AppComponent.class)
public interface AddressListComponent {
    void inject(AddressListActivity activity);
}