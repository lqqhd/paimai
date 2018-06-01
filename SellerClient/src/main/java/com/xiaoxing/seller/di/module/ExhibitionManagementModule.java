package com.xiaoxing.seller.di.module;

import com.jess.arms.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

import com.xiaoxing.seller.mvp.contract.ExhibitionManagementContract;
import com.xiaoxing.seller.mvp.model.ExhibitionManagementModel;


@Module
public class ExhibitionManagementModule {
    private ExhibitionManagementContract.View view;

    /**
     * 构建ExhibitionManagementModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public ExhibitionManagementModule(ExhibitionManagementContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    ExhibitionManagementContract.View provideExhibitionManagementView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    ExhibitionManagementContract.Model provideExhibitionManagementModel(ExhibitionManagementModel model) {
        return model;
    }
}