package com.xiaoxing.setting.di.component;

import com.jess.arms.di.component.AppComponent;
import com.jess.arms.di.scope.ActivityScope;
import com.xiaoxing.setting.di.module.SettingModule;
import com.xiaoxing.setting.mvp.ui.activity.SettingActivity;

import dagger.Component;

@ActivityScope
@Component(modules = SettingModule.class, dependencies = AppComponent.class)
public interface SettingComponent {
    void inject(SettingActivity activity);
}