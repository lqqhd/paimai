package com.xiaoxing.seller.di.module;

import com.jess.arms.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

import com.xiaoxing.seller.mvp.contract.SecurityCenterContract;
import com.xiaoxing.seller.mvp.model.SecurityCenterModel;


@Module
public class SecurityCenterModule {
    private SecurityCenterContract.View view;

    /**
     * 构建SecurityCenterModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public SecurityCenterModule(SecurityCenterContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    SecurityCenterContract.View provideSecurityCenterView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    SecurityCenterContract.Model provideSecurityCenterModel(SecurityCenterModel model) {
        return model;
    }
}