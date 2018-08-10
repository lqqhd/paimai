package com.xiaoxing.salesclient.di.module;

import com.jess.arms.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

import com.xiaoxing.salesclient.mvp.contract.WeiPaiDetailZhengChangContract;
import com.xiaoxing.salesclient.mvp.model.WeiPaiDetailZhengChangModel;


@Module
public class WeiPaiDetailZhengChangModule {
    private WeiPaiDetailZhengChangContract.View view;

    /**
     * 构建WeiPaiDetailZhengChangModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public WeiPaiDetailZhengChangModule(WeiPaiDetailZhengChangContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    WeiPaiDetailZhengChangContract.View provideWeiPaiDetailZhengChangView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    WeiPaiDetailZhengChangContract.Model provideWeiPaiDetailZhengChangModel(WeiPaiDetailZhengChangModel model) {
        return model;
    }
}