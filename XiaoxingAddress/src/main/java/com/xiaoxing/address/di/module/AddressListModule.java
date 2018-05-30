package com.xiaoxing.address.di.module;

import com.jess.arms.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

import com.xiaoxing.address.mvp.contract.AddressListContract;
import com.xiaoxing.address.mvp.model.AddressListModel;


@Module
public class AddressListModule {
    private AddressListContract.View view;

    /**
     * 构建AddressListModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public AddressListModule(AddressListContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    AddressListContract.View provideAddressListView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    AddressListContract.Model provideAddressListModel(AddressListModel model) {
        return model;
    }
}