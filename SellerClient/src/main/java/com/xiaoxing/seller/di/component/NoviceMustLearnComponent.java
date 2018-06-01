package com.xiaoxing.seller.di.component;

import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import com.xiaoxing.seller.di.module.NoviceMustLearnModule;

import com.jess.arms.di.scope.ActivityScope;
import com.xiaoxing.seller.mvp.ui.activity.NoviceMustLearnActivity;

@ActivityScope
@Component(modules = NoviceMustLearnModule.class, dependencies = AppComponent.class)
public interface NoviceMustLearnComponent {
    void inject(NoviceMustLearnActivity activity);
}