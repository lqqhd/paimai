package com.xiaoxing.search.di.component;

import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import com.xiaoxing.search.di.module.SearchModule;

import com.jess.arms.di.scope.ActivityScope;
import com.xiaoxing.search.mvp.ui.activity.SearchActivity;

@ActivityScope
@Component(modules = SearchModule.class, dependencies = AppComponent.class)
public interface SearchComponent {
    void inject(SearchActivity activity);
}