package com.xiaoxing.salesclient.mvp.model;

import android.app.Application;

import com.google.gson.Gson;
import com.jess.arms.integration.IRepositoryManager;
import com.jess.arms.mvp.BaseModel;

import com.jess.arms.di.scope.ActivityScope;

import javax.inject.Inject;

import com.xiaoxing.salesclient.mvp.contract.WeiPaiDetailZhengChangContract;
import com.xiaoxing.salesclient.mvp.model.entity.AuctionDetailZhengChang;
import com.xiaoxing.salesclient.mvp.model.service.SalesService;

import io.reactivex.Observable;


@ActivityScope
public class WeiPaiDetailZhengChangModel extends BaseModel implements WeiPaiDetailZhengChangContract.Model {
    @Inject
    Gson mGson;
    @Inject
    Application mApplication;

    @Inject
    public WeiPaiDetailZhengChangModel(IRepositoryManager repositoryManager) {
        super(repositoryManager);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        this.mGson = null;
        this.mApplication = null;
    }

    @Override
    public Observable<AuctionDetailZhengChang> getAuctionDetail(String act_id, String goods_id) {
        return mRepositoryManager.obtainRetrofitService(SalesService.class).auctionDetailZhengChang(act_id, goods_id);
    }
}