package com.xiaoxing.salesclient.di.module;

import com.jess.arms.di.scope.FragmentScope;
import com.xiaoxing.salesclient.mvp.contract.FragmentNavigationContract;
import com.xiaoxing.salesclient.mvp.contract.FragmentNavigationListContract;
import com.xiaoxing.salesclient.mvp.model.FragmentNavigationListModel;
import com.xiaoxing.salesclient.mvp.model.FragmentNavigationModel;

import dagger.Module;
import dagger.Provides;


@Module
public class FragmentNavigationModule {
    private FragmentNavigationContract.View view;

    /**
     * 构建FragmentHomeModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public FragmentNavigationModule(FragmentNavigationContract.View view) {
        this.view = view;
    }

    @FragmentScope
    @Provides
    FragmentNavigationContract.View provideHuoDongView() {
        return this.view;
    }

    @FragmentScope
    @Provides
    FragmentNavigationContract.Model provideHuoDongModel(FragmentNavigationModel model) {
        return model;
    }
}