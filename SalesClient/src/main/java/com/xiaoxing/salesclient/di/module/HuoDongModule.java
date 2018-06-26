package com.xiaoxing.salesclient.di.module;

import com.jess.arms.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

import com.xiaoxing.salesclient.mvp.contract.HuoDongContract;
import com.xiaoxing.salesclient.mvp.model.HuoDongModel;


@Module
public class HuoDongModule {
    private HuoDongContract.View view;

    /**
     * 构建HuoDongModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public HuoDongModule(HuoDongContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    HuoDongContract.View provideHuoDongView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    HuoDongContract.Model provideHuoDongModel(HuoDongModel model) {
        return model;
    }
}