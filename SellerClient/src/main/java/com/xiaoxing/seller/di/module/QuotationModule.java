package com.xiaoxing.seller.di.module;

import com.jess.arms.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

import com.xiaoxing.seller.mvp.contract.QuotationContract;
import com.xiaoxing.seller.mvp.model.QuotationModel;


@Module
public class QuotationModule {
    private QuotationContract.View view;

    /**
     * 构建QuotationModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public QuotationModule(QuotationContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    QuotationContract.View provideQuotationView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    QuotationContract.Model provideQuotationModel(QuotationModel model) {
        return model;
    }
}