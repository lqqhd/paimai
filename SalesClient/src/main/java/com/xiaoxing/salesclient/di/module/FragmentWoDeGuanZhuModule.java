package com.xiaoxing.salesclient.di.module;

import com.jess.arms.di.scope.FragmentScope;
import com.xiaoxing.salesclient.mvp.contract.FragmentHomeContract;
import com.xiaoxing.salesclient.mvp.contract.FragmentWoDeGuanZhuContract;
import com.xiaoxing.salesclient.mvp.model.FragmentHomeModel;
import com.xiaoxing.salesclient.mvp.model.FragmentWoDeGuanZhuModel;

import dagger.Module;
import dagger.Provides;


@Module
public class FragmentWoDeGuanZhuModule {
    private FragmentWoDeGuanZhuContract.View view;

    /**
     * 构建FragmentHomeModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public FragmentWoDeGuanZhuModule(FragmentWoDeGuanZhuContract.View view) {
        this.view = view;
    }

    @FragmentScope
    @Provides
    FragmentWoDeGuanZhuContract.View provideHuoDongView() {
        return this.view;
    }

    @FragmentScope
    @Provides
    FragmentWoDeGuanZhuContract.Model provideHuoDongModel(FragmentWoDeGuanZhuModel model) {
        return model;
    }
}