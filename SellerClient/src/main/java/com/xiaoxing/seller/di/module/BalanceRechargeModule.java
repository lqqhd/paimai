package com.xiaoxing.seller.di.module;

import com.jess.arms.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

import com.xiaoxing.seller.mvp.contract.BalanceRechargeContract;
import com.xiaoxing.seller.mvp.model.BalanceRechargeModel;


@Module
public class BalanceRechargeModule {
    private BalanceRechargeContract.View view;

    /**
     * 构建BalanceRechargeModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public BalanceRechargeModule(BalanceRechargeContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    BalanceRechargeContract.View provideBalanceRechargeView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    BalanceRechargeContract.Model provideBalanceRechargeModel(BalanceRechargeModel model) {
        return model;
    }
}