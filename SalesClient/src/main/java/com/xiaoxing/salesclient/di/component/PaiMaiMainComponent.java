package com.xiaoxing.salesclient.di.component;

import com.jess.arms.di.component.AppComponent;
import com.jess.arms.di.scope.ActivityScope;
import com.xiaoxing.salesclient.di.module.PaiMaiMainModule;
import com.xiaoxing.salesclient.mvp.ui.PaiMaiMainActivity;

import dagger.Component;

@ActivityScope
@Component(modules = PaiMaiMainModule.class, dependencies = AppComponent.class)
public interface PaiMaiMainComponent {
    void inject(PaiMaiMainActivity activity);
}