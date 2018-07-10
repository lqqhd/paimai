package com.xiaoxing.salesclient.di.module;

import com.jess.arms.di.scope.FragmentScope;
import com.xiaoxing.salesclient.mvp.contract.FragmentHomeContract;
import com.xiaoxing.salesclient.mvp.model.FragmentHomeModel;

import dagger.Module;
import dagger.Provides;


@Module
public class FragmentHomeModule {
    private FragmentHomeContract.View view;

    /**
     * 构建FragmentHomeModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public FragmentHomeModule(FragmentHomeContract.View view) {
        this.view = view;
    }

    @FragmentScope
    @Provides
    FragmentHomeContract.View provideHuoDongView() {
        return this.view;
    }

    @FragmentScope
    @Provides
    FragmentHomeContract.Model provideHuoDongModel(FragmentHomeModel model) {
        return model;
    }
}