package com.xiaoxing.salesclient.di.module;

import com.jess.arms.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

import com.xiaoxing.salesclient.mvp.contract.SignHistoryContract;
import com.xiaoxing.salesclient.mvp.model.SignHistoryModel;


@Module
public class SignHistoryModule {
    private SignHistoryContract.View view;

    /**
     * 构建SignHistoryModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public SignHistoryModule(SignHistoryContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    SignHistoryContract.View provideSignHistoryView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    SignHistoryContract.Model provideSignHistoryModel(SignHistoryModel model) {
        return model;
    }
}