package com.xiaoxing.salesclient.mvp.model;

import android.app.Application;

import com.google.gson.Gson;
import com.jess.arms.integration.IRepositoryManager;
import com.jess.arms.mvp.BaseModel;

import com.jess.arms.di.scope.ActivityScope;

import javax.inject.Inject;

import com.xiaoxing.salesclient.mvp.contract.WeiPaiDetailContract;
import com.xiaoxing.salesclient.mvp.model.entity.AuctionDetail;
import com.xiaoxing.salesclient.mvp.model.service.SalesService;

import io.reactivex.Observable;


@ActivityScope
public class WeiPaiDetailModel extends BaseModel implements WeiPaiDetailContract.Model {
    @Inject
    Gson mGson;
    @Inject
    Application mApplication;

    @Inject
    public WeiPaiDetailModel(IRepositoryManager repositoryManager) {
        super(repositoryManager);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        this.mGson = null;
        this.mApplication = null;
    }

    @Override
    public Observable<AuctionDetail> getAuctionDetail(String act_id) {
        return mRepositoryManager.obtainRetrofitService(SalesService.class).auctionDetail(act_id);
    }
}