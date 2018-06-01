package com.xiaoxing.seller.di.module;

import com.jess.arms.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

import com.xiaoxing.seller.mvp.contract.RedEnvelopesContract;
import com.xiaoxing.seller.mvp.model.RedEnvelopesModel;


@Module
public class RedEnvelopesModule {
    private RedEnvelopesContract.View view;

    /**
     * 构建RedEnvelopesModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public RedEnvelopesModule(RedEnvelopesContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    RedEnvelopesContract.View provideRedEnvelopesView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    RedEnvelopesContract.Model provideRedEnvelopesModel(RedEnvelopesModel model) {
        return model;
    }
}