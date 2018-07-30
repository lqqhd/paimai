package com.xiaoxing.salesclient.di.module;

import com.jess.arms.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

import com.xiaoxing.salesclient.mvp.contract.GuanYuWoMenContract;
import com.xiaoxing.salesclient.mvp.model.GuanYuWoMenModel;


@Module
public class GuanYuWoMenModule {
    private GuanYuWoMenContract.View view;

    /**
     * 构建GuanYuWoMenModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public GuanYuWoMenModule(GuanYuWoMenContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    GuanYuWoMenContract.View provideGuanYuWoMenView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    GuanYuWoMenContract.Model provideGuanYuWoMenModel(GuanYuWoMenModel model) {
        return model;
    }
}