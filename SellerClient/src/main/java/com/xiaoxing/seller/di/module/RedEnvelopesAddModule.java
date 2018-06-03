package com.xiaoxing.seller.di.module;

import com.jess.arms.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

import com.xiaoxing.seller.mvp.contract.RedEnvelopesAddContract;
import com.xiaoxing.seller.mvp.model.RedEnvelopesAddModel;


@Module
public class RedEnvelopesAddModule {
    private RedEnvelopesAddContract.View view;

    /**
     * 构建RedEnvelopesAddModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public RedEnvelopesAddModule(RedEnvelopesAddContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    RedEnvelopesAddContract.View provideRedEnvelopesAddView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    RedEnvelopesAddContract.Model provideRedEnvelopesAddModel(RedEnvelopesAddModel model) {
        return model;
    }
}