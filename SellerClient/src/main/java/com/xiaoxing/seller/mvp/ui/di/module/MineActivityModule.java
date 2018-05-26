package com.xiaoxing.seller.mvp.ui.di.module;

import com.jess.arms.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

import com.xiaoxing.seller.mvp.ui.mvp.contract.MineActivityContract;
import com.xiaoxing.seller.mvp.ui.mvp.model.MineActivityModel;


@Module
public class MineActivityModule {
    private MineActivityContract.View view;

    /**
     * 构建MineActivityModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public MineActivityModule(MineActivityContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    MineActivityContract.View provideMineActivityView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    MineActivityContract.Model provideMineActivityModel(MineActivityModel model) {
        return model;
    }
}