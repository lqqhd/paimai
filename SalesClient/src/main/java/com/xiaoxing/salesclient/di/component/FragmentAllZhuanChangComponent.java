package com.xiaoxing.salesclient.di.component;

import com.jess.arms.di.component.AppComponent;
import com.jess.arms.di.scope.FragmentScope;
import com.xiaoxing.salesclient.di.module.FragmentAllZhuanChangModule;
import com.xiaoxing.salesclient.di.module.FragmentHomeModule;
import com.xiaoxing.salesclient.mvp.ui.fragment.FragmentAllZhuanChang;
import com.xiaoxing.salesclient.mvp.ui.fragment.FragmentHome;

import dagger.Component;

@FragmentScope
@Component(modules = FragmentAllZhuanChangModule.class, dependencies = AppComponent.class)
public interface FragmentAllZhuanChangComponent {
    void inject(FragmentAllZhuanChang fragmentAllZhuanChang);
}