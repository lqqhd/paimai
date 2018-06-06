package com.xiaoxing.salesclient.di.module;

import com.jess.arms.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

import com.xiaoxing.salesclient.mvp.contract.WeiPaiContract;
import com.xiaoxing.salesclient.mvp.model.WeiPaiModel;


@Module
public class WeiPaiModule {
    private WeiPaiContract.View view;

    /**
     * 构建WeiPaiModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public WeiPaiModule(WeiPaiContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    WeiPaiContract.View provideWeiPaiView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    WeiPaiContract.Model provideWeiPaiModel(WeiPaiModel model) {
        return model;
    }
}