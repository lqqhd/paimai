package com.xiaoxing.salesclient.di.module;

import com.jess.arms.di.scope.FragmentScope;
import com.xiaoxing.salesclient.mvp.contract.FragmentHomeContract;
import com.xiaoxing.salesclient.mvp.contract.FragmentZhanTingContract;
import com.xiaoxing.salesclient.mvp.model.FragmentHomeModel;
import com.xiaoxing.salesclient.mvp.model.FragmentZhanTingModel;

import dagger.Module;
import dagger.Provides;


@Module
public class FragmentZhanTingModule {
    private FragmentZhanTingContract.View view;

    /**
     * 构建FragmentHomeModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public FragmentZhanTingModule(FragmentZhanTingContract.View view) {
        this.view = view;
    }

    @FragmentScope
    @Provides
    FragmentZhanTingContract.View provideHuoDongView() {
        return this.view;
    }

    @FragmentScope
    @Provides
    FragmentZhanTingContract.Model provideHuoDongModel(FragmentZhanTingModel model) {
        return model;
    }
}