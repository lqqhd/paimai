package com.xiaoxing.salesclient.mvp.model;

import android.app.Application;

import com.google.gson.Gson;
import com.jess.arms.integration.IRepositoryManager;
import com.jess.arms.mvp.BaseModel;

import com.jess.arms.di.scope.ActivityScope;

import javax.inject.Inject;

import com.xiaoxing.salesclient.mvp.contract.ZhanTingDetailContract;
import com.xiaoxing.salesclient.mvp.model.entity.StoreInfo;
import com.xiaoxing.salesclient.mvp.model.service.SalesService;

import io.reactivex.Observable;


@ActivityScope
public class ZhanTingDetailModel extends BaseModel implements ZhanTingDetailContract.Model {
    @Inject
    Gson mGson;
    @Inject
    Application mApplication;

    @Inject
    public ZhanTingDetailModel(IRepositoryManager repositoryManager) {
        super(repositoryManager);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        this.mGson = null;
        this.mApplication = null;
    }

    @Override
    public Observable<StoreInfo> getStoreInfo(String store_id, String ru_id) {
        return mRepositoryManager.obtainRetrofitService(SalesService.class).storeInfo(store_id, ru_id);
    }
}