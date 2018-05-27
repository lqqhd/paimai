package com.xiaoxing.login.di.component;

import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import com.xiaoxing.login.di.module.RegisterSendPhoneModule;

import com.jess.arms.di.scope.ActivityScope;
import com.xiaoxing.login.mvp.ui.activity.RegisterSendPhoneActivity;

@ActivityScope
@Component(modules = RegisterSendPhoneModule.class, dependencies = AppComponent.class)
public interface RegisterSendPhoneComponent {
    void inject(RegisterSendPhoneActivity activity);
}