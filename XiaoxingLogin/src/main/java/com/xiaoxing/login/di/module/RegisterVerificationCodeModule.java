package com.xiaoxing.login.di.module;

import com.jess.arms.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

import com.xiaoxing.login.mvp.contract.RegisterVerificationCodeContract;
import com.xiaoxing.login.mvp.model.RegisterVerificationCodeModel;


@Module
public class RegisterVerificationCodeModule {
    private RegisterVerificationCodeContract.View view;

    /**
     * 构建RegisterVerificationCodeModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public RegisterVerificationCodeModule(RegisterVerificationCodeContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    RegisterVerificationCodeContract.View provideRegisterVerificationCodeView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    RegisterVerificationCodeContract.Model provideRegisterVerificationCodeModel(RegisterVerificationCodeModel model) {
        return model;
    }
}