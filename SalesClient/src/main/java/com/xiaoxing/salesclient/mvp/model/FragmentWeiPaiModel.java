package com.xiaoxing.salesclient.mvp.model;

import android.app.Application;

import com.google.gson.Gson;
import com.jess.arms.integration.IRepositoryManager;
import com.jess.arms.mvp.BaseModel;

import javax.inject.Inject;

import com.xiaoxing.salesclient.mvp.contract.FragmentWeiPaiContract;
import com.xiaoxing.salesclient.mvp.model.entity.AuctionList;
import com.xiaoxing.salesclient.mvp.model.service.SalesService;

import io.reactivex.Observable;


public class FragmentWeiPaiModel extends BaseModel implements FragmentWeiPaiContract.Model {
    @Inject
    Gson mGson;
    @Inject
    Application mApplication;

    @Inject
    public FragmentWeiPaiModel(IRepositoryManager repositoryManager) {
        super(repositoryManager);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        this.mGson = null;
        this.mApplication = null;
    }

    @Override
    public Observable<AuctionList> getAuctionList(String access_token, String sort, String order, String cat_left_id) {
        return mRepositoryManager.obtainRetrofitService(SalesService.class).getAuctionList(access_token, sort, order, cat_left_id);
    }
}