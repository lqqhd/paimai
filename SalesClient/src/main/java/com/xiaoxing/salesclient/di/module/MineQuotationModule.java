package com.xiaoxing.salesclient.di.module;

import com.jess.arms.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

import com.xiaoxing.salesclient.mvp.contract.MineQuotationContract;
import com.xiaoxing.salesclient.mvp.model.MineQuotationModel;


@Module
public class MineQuotationModule {
    private MineQuotationContract.View view;

    /**
     * 构建MineQuotationModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public MineQuotationModule(MineQuotationContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    MineQuotationContract.View provideMineQuotationView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    MineQuotationContract.Model provideMineQuotationModel(MineQuotationModel model) {
        return model;
    }
}