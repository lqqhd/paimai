package com.xiaoxing.salesclient.di.module;

import com.jess.arms.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

import com.xiaoxing.salesclient.mvp.contract.TianJiangHongBaoContract;
import com.xiaoxing.salesclient.mvp.model.TianJiangHongBaoModel;


@Module
public class TianJiangHongBaoModule {
    private TianJiangHongBaoContract.View view;

    /**
     * 构建TianJiangHongBaoModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public TianJiangHongBaoModule(TianJiangHongBaoContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    TianJiangHongBaoContract.View provideTianJiangHongBaoView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    TianJiangHongBaoContract.Model provideTianJiangHongBaoModel(TianJiangHongBaoModel model) {
        return model;
    }
}