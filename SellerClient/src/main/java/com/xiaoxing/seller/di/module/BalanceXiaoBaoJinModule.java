package com.xiaoxing.seller.di.module;

import com.jess.arms.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

import com.xiaoxing.seller.mvp.contract.BalanceXiaoBaoJinContract;
import com.xiaoxing.seller.mvp.model.BalanceXiaoBaoJinModel;


@Module
public class BalanceXiaoBaoJinModule {
    private BalanceXiaoBaoJinContract.View view;

    /**
     * 构建BalanceXiaoBaoJinModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public BalanceXiaoBaoJinModule(BalanceXiaoBaoJinContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    BalanceXiaoBaoJinContract.View provideBalanceXiaoBaoJinView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    BalanceXiaoBaoJinContract.Model provideBalanceXiaoBaoJinModel(BalanceXiaoBaoJinModel model) {
        return model;
    }
}