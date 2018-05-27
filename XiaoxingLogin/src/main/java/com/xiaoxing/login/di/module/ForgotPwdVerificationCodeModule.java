package com.xiaoxing.login.di.module;

import com.jess.arms.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

import com.xiaoxing.login.mvp.contract.ForgotPwdVerificationCodeContract;
import com.xiaoxing.login.mvp.model.ForgotPwdVerificationCodeModel;


@Module
public class ForgotPwdVerificationCodeModule {
    private ForgotPwdVerificationCodeContract.View view;

    /**
     * 构建ForgotPwdVerificationCodeModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public ForgotPwdVerificationCodeModule(ForgotPwdVerificationCodeContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    ForgotPwdVerificationCodeContract.View provideForgotPwdVerificationCodeView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    ForgotPwdVerificationCodeContract.Model provideForgotPwdVerificationCodeModel(ForgotPwdVerificationCodeModel model) {
        return model;
    }
}