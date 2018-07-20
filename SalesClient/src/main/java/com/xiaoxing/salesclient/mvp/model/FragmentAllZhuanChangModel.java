package com.xiaoxing.salesclient.mvp.model;

import android.app.Application;

import com.google.gson.Gson;
import com.jess.arms.integration.IRepositoryManager;
import com.jess.arms.mvp.BaseModel;

import javax.inject.Inject;

import com.xiaoxing.salesclient.mvp.contract.FragmentAllZhuanChangContract;
import com.xiaoxing.salesclient.mvp.model.entity.Specialcat;
import com.xiaoxing.salesclient.mvp.model.service.SalesService;

import io.reactivex.Observable;


public class FragmentAllZhuanChangModel extends BaseModel implements FragmentAllZhuanChangContract.Model {
    @Inject
    Gson mGson;
    @Inject
    Application mApplication;

    @Inject
    public FragmentAllZhuanChangModel(IRepositoryManager repositoryManager) {
        super(repositoryManager);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        this.mGson = null;
        this.mApplication = null;
    }

    @Override
    public Observable<Specialcat> getSpecialcat() {
        return mRepositoryManager.obtainRetrofitService(SalesService.class).specialcat();
    }
}