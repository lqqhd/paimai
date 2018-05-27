package com.xiaoxing.login.di.component;

import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import com.xiaoxing.login.di.module.ProtocolModule;

import com.jess.arms.di.scope.ActivityScope;
import com.xiaoxing.login.mvp.ui.activity.ProtocolActivity;

@ActivityScope
@Component(modules = ProtocolModule.class, dependencies = AppComponent.class)
public interface ProtocolComponent {
    void inject(ProtocolActivity activity);
}