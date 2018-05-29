package com.xiaoxing.login.di.module;

import com.jess.arms.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

import com.xiaoxing.login.mvp.contract.RegisterSetPwdContract;
import com.xiaoxing.login.mvp.model.RegisterSetPwdModel;


@Module
public class RegisterSetPwdModule {
    private RegisterSetPwdContract.View view;

    /**
     * 构建RegisterSetPwdModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public RegisterSetPwdModule(RegisterSetPwdContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    RegisterSetPwdContract.View provideRegisterSetPwdView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    RegisterSetPwdContract.Model provideRegisterSetPwdModel(RegisterSetPwdModel model) {
        return model;
    }
}