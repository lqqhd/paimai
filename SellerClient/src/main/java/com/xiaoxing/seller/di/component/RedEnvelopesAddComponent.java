package com.xiaoxing.seller.di.component;

import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import com.xiaoxing.seller.di.module.RedEnvelopesAddModule;

import com.jess.arms.di.scope.ActivityScope;
import com.xiaoxing.seller.mvp.ui.activity.RedEnvelopesAddActivity;

@ActivityScope
@Component(modules = RedEnvelopesAddModule.class, dependencies = AppComponent.class)
public interface RedEnvelopesAddComponent {
    void inject(RedEnvelopesAddActivity activity);
}