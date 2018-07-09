package com.xiaoxing.salesclient.di.component;

import com.jess.arms.di.component.AppComponent;
import com.jess.arms.di.scope.ActivityScope;
import com.xiaoxing.salesclient.di.module.FragmentHomeModule;
import com.xiaoxing.salesclient.di.module.HuoDongModule;
import com.xiaoxing.salesclient.mvp.ui.activity.HuoDongActivity;
import com.xiaoxing.salesclient.mvp.ui.fragment.FragmentHome;

import dagger.Component;

@ActivityScope
@Component(modules = FragmentHomeModule.class, dependencies = AppComponent.class)
public interface FragmentHomeComponent {
    void inject(FragmentHome fragmentHome);
}