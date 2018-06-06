package com.xiaoxing.salesclient.di.module;

import com.jess.arms.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

import com.xiaoxing.salesclient.mvp.contract.ZhanTingContract;
import com.xiaoxing.salesclient.mvp.model.ZhanTingModel;


@Module
public class ZhanTingModule {
    private ZhanTingContract.View view;

    /**
     * 构建ZhanTingModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public ZhanTingModule(ZhanTingContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    ZhanTingContract.View provideZhanTingView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    ZhanTingContract.Model provideZhanTingModel(ZhanTingModel model) {
        return model;
    }
}