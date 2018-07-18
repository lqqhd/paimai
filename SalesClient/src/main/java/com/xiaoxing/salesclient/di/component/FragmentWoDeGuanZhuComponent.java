package com.xiaoxing.salesclient.di.component;

import com.jess.arms.di.component.AppComponent;
import com.jess.arms.di.scope.FragmentScope;
import com.xiaoxing.salesclient.di.module.FragmentHomeModule;
import com.xiaoxing.salesclient.di.module.FragmentWoDeGuanZhuModule;
import com.xiaoxing.salesclient.mvp.ui.fragment.FragmentHome;
import com.xiaoxing.salesclient.mvp.ui.fragment.FragmentWoDeGuanZhu;

import dagger.Component;

@FragmentScope
@Component(modules = FragmentWoDeGuanZhuModule.class, dependencies = AppComponent.class)
public interface FragmentWoDeGuanZhuComponent {
    void inject(FragmentWoDeGuanZhu fragmentWoDeGuanZhu);
}