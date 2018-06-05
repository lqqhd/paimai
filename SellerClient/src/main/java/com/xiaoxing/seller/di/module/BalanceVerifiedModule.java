package com.xiaoxing.seller.di.module;

import com.jess.arms.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

import com.xiaoxing.seller.mvp.contract.BalanceVerifiedContract;
import com.xiaoxing.seller.mvp.model.BalanceVerifiedModel;


@Module
public class BalanceVerifiedModule {
    private BalanceVerifiedContract.View view;

    /**
     * 构建BalanceVerifiedModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public BalanceVerifiedModule(BalanceVerifiedContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    BalanceVerifiedContract.View provideBalanceVerifiedView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    BalanceVerifiedContract.Model provideBalanceVerifiedModel(BalanceVerifiedModel model) {
        return model;
    }
}