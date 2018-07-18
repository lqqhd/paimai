package com.xiaoxing.salesclient.mvp.model;

import android.app.Application;

import com.google.gson.Gson;
import com.jess.arms.di.scope.FragmentScope;
import com.jess.arms.integration.IRepositoryManager;
import com.jess.arms.mvp.BaseModel;
import com.xiaoxing.salesclient.mvp.contract.FragmentHomeContract;
import com.xiaoxing.salesclient.mvp.contract.FragmentWoDeGuanZhuContract;
import com.xiaoxing.salesclient.mvp.model.entity.Index;
import com.xiaoxing.salesclient.mvp.model.entity.WoDeGuanZhu;
import com.xiaoxing.salesclient.mvp.model.service.SalesService;

import javax.inject.Inject;

import io.reactivex.Observable;


@FragmentScope
public class FragmentWoDeGuanZhuModel extends BaseModel implements FragmentWoDeGuanZhuContract.Model {
    @Inject
    Gson mGson;
    @Inject
    Application mApplication;

    @Inject
    public FragmentWoDeGuanZhuModel(IRepositoryManager repositoryManager) {
        super(repositoryManager);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        this.mGson = null;
        this.mApplication = null;
    }


    @Override
    public Observable<WoDeGuanZhu> getMyCollectionStoreList(String access_token) {
        return mRepositoryManager.obtainRetrofitService(SalesService.class).getMyCollectionStoreList(access_token);
    }
}