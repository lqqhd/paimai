package com.xiaoxing.salesclient.di.module;

import com.jess.arms.di.scope.ActivityScope;
import com.xiaoxing.salesclient.mvp.contract.FragmentHomeContract;
import com.xiaoxing.salesclient.mvp.contract.HuoDongContract;
import com.xiaoxing.salesclient.mvp.model.FragmentHomeModel;
import com.xiaoxing.salesclient.mvp.model.HuoDongModel;

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

    @ActivityScope
    @Provides
    FragmentHomeContract.View provideHuoDongView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    FragmentHomeContract.Model provideHuoDongModel(FragmentHomeModel model) {
        return model;
    }
}