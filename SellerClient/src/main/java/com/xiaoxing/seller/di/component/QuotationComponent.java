package com.xiaoxing.seller.di.component;

import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import com.xiaoxing.seller.di.module.QuotationModule;

import com.jess.arms.di.scope.ActivityScope;
import com.xiaoxing.seller.mvp.ui.activity.QuotationActivity;

@ActivityScope
@Component(modules = QuotationModule.class, dependencies = AppComponent.class)
public interface QuotationComponent {
    void inject(QuotationActivity activity);
}