package com.xiaoxing.seller.di.module;

import com.jess.arms.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

import com.xiaoxing.seller.mvp.contract.BalancePaymentSecurityContract;
import com.xiaoxing.seller.mvp.model.BalancePaymentSecurityModel;


@Module
public class BalancePaymentSecurityModule {
    private BalancePaymentSecurityContract.View view;

    /**
     * 构建BalancePaymentSecurityModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public BalancePaymentSecurityModule(BalancePaymentSecurityContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    BalancePaymentSecurityContract.View provideBalancePaymentSecurityView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    BalancePaymentSecurityContract.Model provideBalancePaymentSecurityModel(BalancePaymentSecurityModel model) {
        return model;
    }
}