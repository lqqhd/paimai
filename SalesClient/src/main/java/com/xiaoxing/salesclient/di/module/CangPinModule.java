package com.xiaoxing.salesclient.di.module;

import com.jess.arms.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

import com.xiaoxing.salesclient.mvp.contract.CangPinContract;
import com.xiaoxing.salesclient.mvp.model.CangPinModel;


@Module
public class CangPinModule {
    private CangPinContract.View view;

    /**
     * 构建CangPinModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public CangPinModule(CangPinContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    CangPinContract.View provideCangPinView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    CangPinContract.Model provideCangPinModel(CangPinModel model) {
        return model;
    }
}