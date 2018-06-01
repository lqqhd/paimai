package com.xiaoxing.seller.di.module;

import com.jess.arms.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

import com.xiaoxing.seller.mvp.contract.NoviceMustLearnContract;
import com.xiaoxing.seller.mvp.model.NoviceMustLearnModel;


@Module
public class NoviceMustLearnModule {
    private NoviceMustLearnContract.View view;

    /**
     * 构建NoviceMustLearnModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public NoviceMustLearnModule(NoviceMustLearnContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    NoviceMustLearnContract.View provideNoviceMustLearnView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    NoviceMustLearnContract.Model provideNoviceMustLearnModel(NoviceMustLearnModel model) {
        return model;
    }
}