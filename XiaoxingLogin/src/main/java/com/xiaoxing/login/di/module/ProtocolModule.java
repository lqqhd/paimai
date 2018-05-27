package com.xiaoxing.login.di.module;

import com.jess.arms.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

import com.xiaoxing.login.mvp.contract.ProtocolContract;
import com.xiaoxing.login.mvp.model.ProtocolModel;


@Module
public class ProtocolModule {
    private ProtocolContract.View view;

    /**
     * 构建ProtocolModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public ProtocolModule(ProtocolContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    ProtocolContract.View provideProtocolView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    ProtocolContract.Model provideProtocolModel(ProtocolModel model) {
        return model;
    }
}