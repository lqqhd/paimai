package com.xiaoxing.salesclient.mvp.model;

import android.app.Application;

import com.google.gson.Gson;
import com.jess.arms.integration.IRepositoryManager;
import com.jess.arms.mvp.BaseModel;

import com.jess.arms.di.scope.ActivityScope;

import javax.inject.Inject;

import com.xiaoxing.salesclient.mvp.contract.ZhanTingGoodsListContract;
import com.xiaoxing.salesclient.mvp.model.entity.Specialcat;
import com.xiaoxing.salesclient.mvp.model.entity.SpecialcatDetail;
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
    public Observable<SpecialcatDetail> getSpecialcatDetail(String specialcat_id) {
        return mRepositoryManager.obtainRetrofitService(SalesService.class).getSpecialcatDetail(specialcat_id);
    }
}