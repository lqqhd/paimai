package com.xiaoxing.salesclient.di.module;

import com.jess.arms.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

import com.xiaoxing.salesclient.mvp.contract.ZhanTingGoodsListContract;
import com.xiaoxing.salesclient.mvp.model.ZhanTingGoodsListModel;


@Module
public class ZhanTingGoodsListModule {
    private ZhanTingGoodsListContract.View view;

    /**
     * 构建ZhanTingGoodsListModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public ZhanTingGoodsListModule(ZhanTingGoodsListContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    ZhanTingGoodsListContract.View provideZhanTingGoodsListView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    ZhanTingGoodsListContract.Model provideZhanTingGoodsListModel(ZhanTingGoodsListModel model) {
        return model;
    }
}