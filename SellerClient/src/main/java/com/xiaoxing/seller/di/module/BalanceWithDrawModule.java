package com.xiaoxing.seller.di.module;

import com.jess.arms.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

import com.xiaoxing.seller.mvp.contract.BalanceWithDrawContract;
import com.xiaoxing.seller.mvp.model.BalanceWithDrawModel;


@Module
public class BalanceWithDrawModule {
    private BalanceWithDrawContract.View view;

    /**
     * 构建BalanceWithDrawModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public BalanceWithDrawModule(BalanceWithDrawContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    BalanceWithDrawContract.View provideBalanceWithDrawView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    BalanceWithDrawContract.Model provideBalanceWithDrawModel(BalanceWithDrawModel model) {
        return model;
    }
}