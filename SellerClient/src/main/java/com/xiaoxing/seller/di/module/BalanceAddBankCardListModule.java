package com.xiaoxing.seller.di.module;

import com.jess.arms.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

import com.xiaoxing.seller.mvp.contract.BalanceAddBankCardListContract;
import com.xiaoxing.seller.mvp.model.BalanceAddBankCardListModel;


@Module
public class BalanceAddBankCardListModule {
    private BalanceAddBankCardListContract.View view;

    /**
     * 构建BalanceAddBankCardListModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public BalanceAddBankCardListModule(BalanceAddBankCardListContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    BalanceAddBankCardListContract.View provideBalanceAddBankCardListView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    BalanceAddBankCardListContract.Model provideBalanceAddBankCardListModel(BalanceAddBankCardListModel model) {
        return model;
    }
}