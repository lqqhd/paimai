package com.xiaoxing.salesclient.di.module;

import com.jess.arms.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

import com.xiaoxing.salesclient.mvp.contract.ChuangJianWeiPaiContract;
import com.xiaoxing.salesclient.mvp.model.ChuangJianWeiPaiModel;


@Module
public class ChuangJianWeiPaiModule {
    private ChuangJianWeiPaiContract.View view;

    /**
     * 构建ChuangJianWeiPaiModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public ChuangJianWeiPaiModule(ChuangJianWeiPaiContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    ChuangJianWeiPaiContract.View provideChuangJianWeiPaiView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    ChuangJianWeiPaiContract.Model provideChuangJianWeiPaiModel(ChuangJianWeiPaiModel model) {
        return model;
    }
}