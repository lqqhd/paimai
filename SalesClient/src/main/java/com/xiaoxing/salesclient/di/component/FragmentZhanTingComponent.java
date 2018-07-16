package com.xiaoxing.salesclient.di.component;

import com.jess.arms.di.component.AppComponent;
import com.jess.arms.di.scope.FragmentScope;
import com.xiaoxing.salesclient.di.module.FragmentHomeModule;
import com.xiaoxing.salesclient.di.module.FragmentZhanTingModule;
import com.xiaoxing.salesclient.mvp.ui.fragment.FragmentHome;
import com.xiaoxing.salesclient.mvp.ui.fragment.FragmentZhanTing;

import dagger.Component;

@FragmentScope
@Component(modules = FragmentZhanTingModule.class, dependencies = AppComponent.class)
public interface FragmentZhanTingComponent {
    void inject(FragmentZhanTing fragmentZhanTing);
}