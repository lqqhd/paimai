package com.xiaoxing.salesclient.di.module;

import com.jess.arms.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

import com.xiaoxing.salesclient.mvp.contract.ChuangJianZhuanChangContract;
import com.xiaoxing.salesclient.mvp.model.ChuangJianZhuanChangModel;


@Module
public class ChuangJianZhuanChangModule {
    private ChuangJianZhuanChangContract.View view;

    /**
     * 构建ChuangJianZhuanChangModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public ChuangJianZhuanChangModule(ChuangJianZhuanChangContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    ChuangJianZhuanChangContract.View provideChuangJianZhuanChangView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    ChuangJianZhuanChangContract.Model provideChuangJianZhuanChangModel(ChuangJianZhuanChangModel model) {
        return model;
    }
}