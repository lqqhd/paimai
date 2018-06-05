package com.xiaoxing.seller.di.module;

import com.jess.arms.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

import com.xiaoxing.seller.mvp.contract.BalanceAddBankCardContract;
import com.xiaoxing.seller.mvp.model.BalanceAddBankCardModel;


@Module
public class BalanceAddBankCardModule {
    private BalanceAddBankCardContract.View view;

    /**
     * 构建BalanceAddBankCardModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public BalanceAddBankCardModule(BalanceAddBankCardContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    BalanceAddBankCardContract.View provideBalanceAddBankCardView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    BalanceAddBankCardContract.Model provideBalanceAddBankCardModel(BalanceAddBankCardModel model) {
        return model;
    }
}