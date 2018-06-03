package com.xiaoxing.seller.di.module;

import com.jess.arms.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

import com.xiaoxing.seller.mvp.contract.SpecialManagementAddContract;
import com.xiaoxing.seller.mvp.model.SpecialManagementAddModel;


@Module
public class SpecialManagementAddModule {
    private SpecialManagementAddContract.View view;

    /**
     * 构建SpecialManagementAddModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public SpecialManagementAddModule(SpecialManagementAddContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    SpecialManagementAddContract.View provideSpecialManagementAddView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    SpecialManagementAddContract.Model provideSpecialManagementAddModel(SpecialManagementAddModel model) {
        return model;
    }
}