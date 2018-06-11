package com.xiaoxing.salesclient.di.module;

import com.jess.arms.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

import com.xiaoxing.salesclient.mvp.contract.ZhanTingDetailContract;
import com.xiaoxing.salesclient.mvp.model.ZhanTingDetailModel;


@Module
public class ZhanTingDetailModule {
    private ZhanTingDetailContract.View view;

    /**
     * 构建ZhanTingDetailModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public ZhanTingDetailModule(ZhanTingDetailContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    ZhanTingDetailContract.View provideZhanTingDetailView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    ZhanTingDetailContract.Model provideZhanTingDetailModel(ZhanTingDetailModel model) {
        return model;
    }
}