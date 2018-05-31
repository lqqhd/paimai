package com.xiaoxing.order.di.module;

import com.jess.arms.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

import com.xiaoxing.order.mvp.contract.OrderContract;
import com.xiaoxing.order.mvp.model.OrderModel;


@Module
public class OrderModule {
    private OrderContract.View view;

    /**
     * 构建OrderModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public OrderModule(OrderContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    OrderContract.View provideOrderView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    OrderContract.Model provideOrderModel(OrderModel model) {
        return model;
    }
}