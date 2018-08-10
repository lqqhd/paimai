package com.xiaoxing.salesclient.mvp.model;

import android.app.Application;

import com.google.gson.Gson;
import com.jess.arms.integration.IRepositoryManager;
import com.jess.arms.mvp.BaseModel;

import com.jess.arms.di.scope.ActivityScope;

import javax.inject.Inject;

import com.xiaoxing.salesclient.mvp.contract.ZhanTingGoodsListContract;
import com.xiaoxing.salesclient.mvp.model.entity.SpecialcatList;
import com.xiaoxing.salesclient.mvp.model.service.SalesService;

import io.reactivex.Observable;


@ActivityScope
public class ZhanTingGoodsListModel extends BaseModel implements ZhanTingGoodsListContract.Model {
    @Inject
    Gson mGson;
    @Inject
    Application mApplication;

    @Inject
    public ZhanTingGoodsListModel(IRepositoryManager repositoryManager) {
        super(repositoryManager);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        this.mGson = null;
        this.mApplication = null;
    }

    @Override
    public Observable<SpecialcatList> getSpecialcatList(String specialcat_id, String user_id) {
        return mRepositoryManager.obtainRetrofitService(SalesService.class).getSpecialcatList(specialcat_id, user_id);
    }
}