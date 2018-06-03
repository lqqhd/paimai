package com.xiaoxing.seller.di.module;

import com.jess.arms.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

import com.xiaoxing.seller.mvp.contract.BalanceDetailsContract;
import com.xiaoxing.seller.mvp.model.BalanceDetailsModel;


@Module
public class BalanceDetailsModule {
    private BalanceDetailsContract.View view;

    /**
     * 构建BalanceDetailsModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public BalanceDetailsModule(BalanceDetailsContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    BalanceDetailsContract.View provideBalanceDetailsView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    BalanceDetailsContract.Model provideBalanceDetailsModel(BalanceDetailsModel model) {
        return model;
    }
}