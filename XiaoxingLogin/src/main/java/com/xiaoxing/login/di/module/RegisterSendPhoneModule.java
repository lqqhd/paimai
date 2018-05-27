package com.xiaoxing.login.di.module;

import com.jess.arms.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

import com.xiaoxing.login.mvp.contract.RegisterSendPhoneContract;
import com.xiaoxing.login.mvp.model.RegisterSendPhoneModel;


@Module
public class RegisterSendPhoneModule {
    private RegisterSendPhoneContract.View view;

    /**
     * 构建RegisterSendPhoneModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public RegisterSendPhoneModule(RegisterSendPhoneContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    RegisterSendPhoneContract.View provideRegisterSendPhoneView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    RegisterSendPhoneContract.Model provideRegisterSendPhoneModel(RegisterSendPhoneModel model) {
        return model;
    }
}