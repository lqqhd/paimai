package com.xiaoxing.salesclient.di.module;

import com.jess.arms.di.scope.FragmentScope;
import com.xiaoxing.salesclient.mvp.contract.FragmentWeiPaiContract;
import com.xiaoxing.salesclient.mvp.model.FragmentWeiPaiModel;

import dagger.Module;
import dagger.Provides;


@Module
public class FragmentWeiPaiModule {
    private FragmentWeiPaiContract.View view;

    /**
     * 构建FragmentWeiPaiModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public FragmentWeiPaiModule(FragmentWeiPaiContract.View view) {
        this.view = view;
    }

    @FragmentScope
    @Provides
    FragmentWeiPaiContract.View provideHuoDongView() {
        return this.view;
    }

    @FragmentScope
    @Provides
    FragmentWeiPaiContract.Model provideHuoDongModel(FragmentWeiPaiModel model) {
        return model;
    }
}