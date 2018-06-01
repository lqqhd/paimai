package com.xiaoxing.seller.di.module;

import com.jess.arms.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

import com.xiaoxing.seller.mvp.contract.BalanceContract;
import com.xiaoxing.seller.mvp.model.BalanceModel;


@Module
public class BalanceModule {
    private BalanceContract.View view;

    /**
     * 构建BalanceModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public BalanceModule(BalanceContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    BalanceContract.View provideBalanceView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    BalanceContract.Model provideBalanceModel(BalanceModel model) {
        return model;
    }
}