package com.xiaoxing.salesclient.di.component;

import com.jess.arms.di.component.AppComponent;
import com.jess.arms.di.scope.FragmentScope;
import com.xiaoxing.salesclient.di.module.FragmentHomeModule;
import com.xiaoxing.salesclient.di.module.FragmentNavigationListModule;
import com.xiaoxing.salesclient.mvp.ui.fragment.FragmentHome;
import com.xiaoxing.salesclient.mvp.ui.fragment.FragmentNavigationList;

import dagger.Component;

@FragmentScope
@Component(modules = FragmentNavigationListModule.class, dependencies = AppComponent.class)
public interface FragmentNavigationListComponent {
    void inject(FragmentNavigationList fragmentNavigationList);
}