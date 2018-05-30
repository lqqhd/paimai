package com.xiaoxing.address.di.module;

import com.jess.arms.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

import com.xiaoxing.address.mvp.contract.AddressAddContract;
import com.xiaoxing.address.mvp.model.AddressAddModel;


@Module
public class AddressAddModule {
    private AddressAddContract.View view;

    /**
     * 构建AddressAddModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public AddressAddModule(AddressAddContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    AddressAddContract.View provideAddressAddView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    AddressAddContract.Model provideAddressAddModel(AddressAddModel model) {
        return model;
    }
}