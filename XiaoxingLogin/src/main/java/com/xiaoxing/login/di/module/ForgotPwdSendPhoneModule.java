package com.xiaoxing.login.di.module;

import com.jess.arms.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

import com.xiaoxing.login.mvp.contract.ForgotPwdSendPhoneContract;
import com.xiaoxing.login.mvp.model.ForgotPwdSendPhoneModel;


@Module
public class ForgotPwdSendPhoneModule {
    private ForgotPwdSendPhoneContract.View view;

    /**
     * 构建ForgotPwdSendPhoneModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public ForgotPwdSendPhoneModule(ForgotPwdSendPhoneContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    ForgotPwdSendPhoneContract.View provideForgotPwdSendPhoneView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    ForgotPwdSendPhoneContract.Model provideForgotPwdSendPhoneModel(ForgotPwdSendPhoneModel model) {
        return model;
    }
}