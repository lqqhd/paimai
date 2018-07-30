package com.xiaoxing.salesclient.mvp.model;

import android.app.Application;

import com.google.gson.Gson;
import com.jess.arms.integration.IRepositoryManager;
import com.jess.arms.mvp.BaseModel;

import com.jess.arms.di.scope.ActivityScope;

import javax.inject.Inject;

import com.xiaoxing.salesclient.mvp.contract.SignHistoryContract;
import com.xiaoxing.salesclient.mvp.model.service.SalesService;

import io.reactivex.Observable;
import me.jessyan.armscomponent.commonres.utils.MyCouponsList;
import me.jessyan.armscomponent.commonres.utils.MySgninCouponsList;


@ActivityScope
public class SignHistoryModel extends BaseModel implements SignHistoryContract.Model {
    @Inject
    Gson mGson;
    @Inject
    Application mApplication;

    @Inject
    public SignHistoryModel(IRepositoryManager repositoryManager) {
        super(repositoryManager);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        this.mGson = null;
        this.mApplication = null;
    }

    @Override
    public Observable<MySgninCouponsList> mySgninCouponsList(String access_token, String year_month) {
        return mRepositoryManager.obtainRetrofitService(SalesService.class).mySgninCouponsList(access_token, year_month);
    }

    @Override
    public Observable<MyCouponsList> myCouponsList(String access_token) {
        return mRepositoryManager.obtainRetrofitService(SalesService.class).myCouponsList(access_token);
    }
}