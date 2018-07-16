package com.xiaoxing.salesclient.mvp.model;

import android.app.Application;

import com.google.gson.Gson;
import com.jess.arms.di.scope.FragmentScope;
import com.jess.arms.integration.IRepositoryManager;
import com.jess.arms.mvp.BaseModel;
import com.xiaoxing.salesclient.mvp.contract.FragmentHomeContract;
import com.xiaoxing.salesclient.mvp.contract.FragmentZhanTingContract;
import com.xiaoxing.salesclient.mvp.model.entity.Index;
import com.xiaoxing.salesclient.mvp.model.entity.StoreShop;
import com.xiaoxing.salesclient.mvp.model.service.SalesService;

import javax.inject.Inject;

import io.reactivex.Observable;


@FragmentScope
public class FragmentZhanTingModel extends BaseModel implements FragmentZhanTingContract.Model {
    @Inject
    Gson mGson;
    @Inject
    Application mApplication;

    @Inject
    public FragmentZhanTingModel(IRepositoryManager repositoryManager) {
        super(repositoryManager);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        this.mGson = null;
        this.mApplication = null;
    }


    @Override
    public Observable<StoreShop> getStoreShop(String access_token, String sort, String order, String cat_left_id) {
        return mRepositoryManager.obtainRetrofitService(SalesService.class).getStoreShop(access_token, sort, order, cat_left_id);
    }
}