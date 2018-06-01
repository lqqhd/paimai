package com.xiaoxing.seller.di.component;

import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import com.xiaoxing.seller.di.module.RedEnvelopesModule;

import com.jess.arms.di.scope.ActivityScope;
import com.xiaoxing.seller.mvp.ui.activity.RedEnvelopesActivity;

@ActivityScope
@Component(modules = RedEnvelopesModule.class, dependencies = AppComponent.class)
public interface RedEnvelopesComponent {
    void inject(RedEnvelopesActivity activity);
}