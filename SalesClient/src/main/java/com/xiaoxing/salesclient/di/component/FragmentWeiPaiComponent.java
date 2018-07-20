package com.xiaoxing.salesclient.di.component;

import com.jess.arms.di.component.AppComponent;
import com.jess.arms.di.scope.FragmentScope;
import com.xiaoxing.salesclient.di.module.FragmentHomeModule;
import com.xiaoxing.salesclient.di.module.FragmentWeiPaiModule;
import com.xiaoxing.salesclient.mvp.ui.fragment.FragmentHome;
import com.xiaoxing.salesclient.mvp.ui.fragment.FragmentWeiPai;

import dagger.Component;

@FragmentScope
@Component(modules = FragmentWeiPaiModule.class, dependencies = AppComponent.class)
public interface FragmentWeiPaiComponent {
    void inject(FragmentWeiPai fragmentWeiPai);
}