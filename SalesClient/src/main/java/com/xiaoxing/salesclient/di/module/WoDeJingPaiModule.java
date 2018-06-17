package com.xiaoxing.salesclient.di.module;

import com.jess.arms.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

import com.xiaoxing.salesclient.mvp.contract.WoDeJingPaiContract;
import com.xiaoxing.salesclient.mvp.model.WoDeJingPaiModel;


@Module
public class WoDeJingPaiModule {
    private WoDeJingPaiContract.View view;

    /**
     * 构建WoDeJingPaiModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public WoDeJingPaiModule(WoDeJingPaiContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    WoDeJingPaiContract.View provideWoDeJingPaiView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    WoDeJingPaiContract.Model provideWoDeJingPaiModel(WoDeJingPaiModel model) {
        return model;
    }
}