package com.xiaoxing.salesclient.di.module;

import com.jess.arms.di.scope.ActivityScope;
import com.xiaoxing.salesclient.mvp.contract.PaiMaiMainContract;
import com.xiaoxing.salesclient.mvp.model.PaiMaiMainModel;

import dagger.Module;
import dagger.Provides;


@Module
public class PaiMaiMainModule {
    private PaiMaiMainContract.View view;

    /**
     * 构建PaiMaiMainModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public PaiMaiMainModule(PaiMaiMainContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    PaiMaiMainContract.View providePaiMaiMainView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    PaiMaiMainContract.Model providePaiMaiMainModel(PaiMaiMainModel model) {
        return model;
    }
}