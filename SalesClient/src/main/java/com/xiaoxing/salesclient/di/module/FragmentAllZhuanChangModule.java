package com.xiaoxing.salesclient.di.module;

import com.jess.arms.di.scope.FragmentScope;
import com.xiaoxing.salesclient.mvp.contract.FragmentAllZhuanChangContract;
import com.xiaoxing.salesclient.mvp.model.FragmentAllZhuanChangModel;

import dagger.Module;
import dagger.Provides;


@Module
public class FragmentAllZhuanChangModule {
    private FragmentAllZhuanChangContract.View view;

    /**
     * 构建FragmentAllZhuanChangModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public FragmentAllZhuanChangModule(FragmentAllZhuanChangContract.View view) {
        this.view = view;
    }

    @FragmentScope
    @Provides
    FragmentAllZhuanChangContract.View provideHuoDongView() {
        return this.view;
    }

    @FragmentScope
    @Provides
    FragmentAllZhuanChangContract.Model provideHuoDongModel(FragmentAllZhuanChangModel model) {
        return model;
    }
}