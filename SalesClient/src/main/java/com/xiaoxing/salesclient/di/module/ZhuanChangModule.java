package com.xiaoxing.salesclient.di.module;

import com.jess.arms.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

import com.xiaoxing.salesclient.mvp.contract.ZhuanChangContract;
import com.xiaoxing.salesclient.mvp.model.ZhuanChangModel;


@Module
public class ZhuanChangModule {
    private ZhuanChangContract.View view;

    /**
     * 构建ZhuanChangModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public ZhuanChangModule(ZhuanChangContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    ZhuanChangContract.View provideZhuanChangView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    ZhuanChangContract.Model provideZhuanChangModel(ZhuanChangModel model) {
        return model;
    }
}