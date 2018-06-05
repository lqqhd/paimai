package com.xiaoxing.seller.di.module;

import com.jess.arms.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

import com.xiaoxing.seller.mvp.contract.BalanceXiaoBaoJinJiaoNaContract;
import com.xiaoxing.seller.mvp.model.BalanceXiaoBaoJinJiaoNaModel;


@Module
public class BalanceXiaoBaoJinJiaoNaModule {
    private BalanceXiaoBaoJinJiaoNaContract.View view;

    /**
     * 构建BalanceXiaoBaoJinJiaoNaModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public BalanceXiaoBaoJinJiaoNaModule(BalanceXiaoBaoJinJiaoNaContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    BalanceXiaoBaoJinJiaoNaContract.View provideBalanceXiaoBaoJinJiaoNaView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    BalanceXiaoBaoJinJiaoNaContract.Model provideBalanceXiaoBaoJinJiaoNaModel(BalanceXiaoBaoJinJiaoNaModel model) {
        return model;
    }
}