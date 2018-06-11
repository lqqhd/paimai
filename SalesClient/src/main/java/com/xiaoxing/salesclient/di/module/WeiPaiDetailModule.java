package com.xiaoxing.salesclient.di.module;

import com.jess.arms.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

import com.xiaoxing.salesclient.mvp.contract.WeiPaiDetailContract;
import com.xiaoxing.salesclient.mvp.model.WeiPaiDetailModel;


@Module
public class WeiPaiDetailModule {
    private WeiPaiDetailContract.View view;

    /**
     * 构建WeiPaiDetailModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public WeiPaiDetailModule(WeiPaiDetailContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    WeiPaiDetailContract.View provideWeiPaiDetailView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    WeiPaiDetailContract.Model provideWeiPaiDetailModel(WeiPaiDetailModel model) {
        return model;
    }
}