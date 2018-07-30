package com.xiaoxing.salesclient.di.component;

import com.jess.arms.di.component.AppComponent;
import com.jess.arms.di.scope.FragmentScope;
import com.xiaoxing.salesclient.di.module.FragmentNavigationListModule;
import com.xiaoxing.salesclient.di.module.FragmentNavigationModule;
import com.xiaoxing.salesclient.mvp.ui.fragment.FragmentNavigation;
import com.xiaoxing.salesclient.mvp.ui.fragment.FragmentNavigationList;

import dagger.Component;

@FragmentScope
@Component(modules = FragmentNavigationModule.class, dependencies = AppComponent.class)
public interface FragmentNavigationComponent {
    void inject(FragmentNavigation fragmentNavigation);
}