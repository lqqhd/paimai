package com.xiaoxing.login.di.module;

import com.jess.arms.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

import com.xiaoxing.login.mvp.contract.SetNewPasswordContract;
import com.xiaoxing.login.mvp.model.SetNewPasswordModel;


@Module
public class SetNewPasswordModule {
    private SetNewPasswordContract.View view;

    /**
     * 构建SetNewPasswordModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public SetNewPasswordModule(SetNewPasswordContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    SetNewPasswordContract.View provideSetNewPasswordView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    SetNewPasswordContract.Model provideSetNewPasswordModel(SetNewPasswordModel model) {
        return model;
    }
}