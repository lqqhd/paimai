package com.xiaoxing.seller.di.module;

import com.jess.arms.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

import com.xiaoxing.seller.mvp.contract.HeadlinesContract;
import com.xiaoxing.seller.mvp.model.HeadlinesModel;


@Module
public class HeadlinesModule {
    private HeadlinesContract.View view;

    /**
     * 构建HeadlinesModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public HeadlinesModule(HeadlinesContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    HeadlinesContract.View provideHeadlinesView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    HeadlinesContract.Model provideHeadlinesModel(HeadlinesModel model) {
        return model;
    }
}