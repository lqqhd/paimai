package com.xiaoxing.order.di.component;

import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import com.xiaoxing.order.di.module.OrderModule;

import com.jess.arms.di.scope.ActivityScope;
import com.xiaoxing.order.mvp.ui.activity.OrderActivity;

@ActivityScope
@Component(modules = OrderModule.class, dependencies = AppComponent.class)
public interface OrderComponent {
    void inject(OrderActivity activity);
}