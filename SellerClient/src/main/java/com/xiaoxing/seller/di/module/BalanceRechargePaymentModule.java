package com.xiaoxing.seller.di.module;

import com.jess.arms.di.scope.ActivityScope;
import com.xiaoxing.seller.mvp.contract.BalanceRechargePaymentContract;
import com.xiaoxing.seller.mvp.model.BalanceRechargePaymentModel;

import dagger.Module;
import dagger.Provides;


@Module
public class BalanceRechargePaymentModule {
    private BalanceRechargePaymentContract.View view;

    /**
     * 构建BalanceRechargePaymentModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public BalanceRechargePaymentModule(BalanceRechargePaymentContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    BalanceRechargePaymentContract.View provideBalanceRechargePaymentView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    BalanceRechargePaymentContract.Model provideBalanceRechargePaymentModel(BalanceRechargePaymentModel model) {
        return model;
    }
}