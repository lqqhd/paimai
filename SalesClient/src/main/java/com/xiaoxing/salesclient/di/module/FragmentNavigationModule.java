package com.xiaoxing.salesclient.di.module;

import com.jess.arms.di.scope.FragmentScope;
import com.xiaoxing.salesclient.mvp.contract.FragmentNavigationListContract;
import com.xiaoxing.salesclient.mvp.model.FragmentNavigationListModel;

import dagger.Module;
import dagger.Provides;


@Module
public class FragmentNavigationModule {
    private FragmentNavigationListContract.View view;

    /**
     * 构建FragmentHomeModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public FragmentNavigationModule(FragmentNavigationListContract.View view) {
        this.view = view;
    }

    @FragmentScope
    @Provides
    FragmentNavigationListContract.View provideHuoDongView() {
        return this.view;
    }

    @FragmentScope
    @Provides
    FragmentNavigationListContract.Model provideHuoDongModel(FragmentNavigationListModel model) {
        return model;
    }
}