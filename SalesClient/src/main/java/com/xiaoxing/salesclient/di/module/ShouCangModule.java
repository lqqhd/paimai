package com.xiaoxing.salesclient.di.module;

import com.jess.arms.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

import com.xiaoxing.salesclient.mvp.contract.ShouCangContract;
import com.xiaoxing.salesclient.mvp.model.ShouCangModel;


@Module
public class ShouCangModule {
    private ShouCangContract.View view;

    /**
     * 构建ShouCangModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public ShouCangModule(ShouCangContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    ShouCangContract.View provideShouCangView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    ShouCangContract.Model provideShouCangModel(ShouCangModel model) {
        return model;
    }
}