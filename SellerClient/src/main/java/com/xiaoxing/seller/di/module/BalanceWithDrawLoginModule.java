package com.xiaoxing.seller.di.module;

import com.jess.arms.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

import com.xiaoxing.seller.mvp.contract.BalanceWithDrawLoginContract;
import com.xiaoxing.seller.mvp.model.BalanceWithDrawLoginModel;


@Module
public class BalanceWithDrawLoginModule {
    private BalanceWithDrawLoginContract.View view;

    /**
     * 构建BalanceWithDrawLoginModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public BalanceWithDrawLoginModule(BalanceWithDrawLoginContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    BalanceWithDrawLoginContract.View provideBalanceWithDrawLoginView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    BalanceWithDrawLoginContract.Model provideBalanceWithDrawLoginModel(BalanceWithDrawLoginModel model) {
        return model;
    }
}