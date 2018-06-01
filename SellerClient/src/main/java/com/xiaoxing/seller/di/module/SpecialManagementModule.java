package com.xiaoxing.seller.di.module;

import com.jess.arms.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

import com.xiaoxing.seller.mvp.contract.SpecialManagementContract;
import com.xiaoxing.seller.mvp.model.SpecialManagementModel;


@Module
public class SpecialManagementModule {
    private SpecialManagementContract.View view;

    /**
     * 构建SpecialManagementModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public SpecialManagementModule(SpecialManagementContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    SpecialManagementContract.View provideSpecialManagementView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    SpecialManagementContract.Model provideSpecialManagementModel(SpecialManagementModel model) {
        return model;
    }
}