package com.xiaoxing.seller.di.module;

import com.jess.arms.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

import com.xiaoxing.seller.mvp.contract.ApplicationHallContract;
import com.xiaoxing.seller.mvp.model.ApplicationHallModel;


@Module
public class ApplicationHallModule {
    private ApplicationHallContract.View view;

    /**
     * 构建ApplicationHallModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public ApplicationHallModule(ApplicationHallContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    ApplicationHallContract.View provideApplicationHallView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    ApplicationHallContract.Model provideApplicationHallModel(ApplicationHallModel model) {
        return model;
    }
}