package com.xiaoxing.salesclient.di.module;

import com.jess.arms.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

import com.xiaoxing.salesclient.mvp.contract.ChuangJianZhanPinContract;
import com.xiaoxing.salesclient.mvp.model.ChuangJianZhanPinModel;


@Module
public class ChuangJianZhanPinModule {
    private ChuangJianZhanPinContract.View view;

    /**
     * 构建ChuangJianZhanPinModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public ChuangJianZhanPinModule(ChuangJianZhanPinContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    ChuangJianZhanPinContract.View provideChuangJianZhanPinView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    ChuangJianZhanPinContract.Model provideChuangJianZhanPinModel(ChuangJianZhanPinModel model) {
        return model;
    }
}