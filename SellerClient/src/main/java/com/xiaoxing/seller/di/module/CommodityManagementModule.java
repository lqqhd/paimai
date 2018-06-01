package com.xiaoxing.seller.di.module;

import com.jess.arms.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

import com.xiaoxing.seller.mvp.contract.CommodityManagementContract;
import com.xiaoxing.seller.mvp.model.CommodityManagementModel;


@Module
public class CommodityManagementModule {
    private CommodityManagementContract.View view;

    /**
     * 构建CommodityManagementModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public CommodityManagementModule(CommodityManagementContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    CommodityManagementContract.View provideCommodityManagementView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    CommodityManagementContract.Model provideCommodityManagementModel(CommodityManagementModel model) {
        return model;
    }
}