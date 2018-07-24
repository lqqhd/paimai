package com.xiaoxing.salesclient.mvp.model;

import android.app.Application;

import com.google.gson.Gson;
import com.jess.arms.di.scope.FragmentScope;
import com.jess.arms.integration.IRepositoryManager;
import com.jess.arms.mvp.BaseModel;
import com.xiaoxing.salesclient.mvp.contract.PaiMaiMainContract;
import com.xiaoxing.salesclient.mvp.model.service.SalesService;
import com.xiaoxing.salesclient.mvp.ui.entity.AppUpdate;

import javax.inject.Inject;

import io.reactivex.Observable;


@FragmentScope
public class PaiMaiMainModel extends BaseModel implements PaiMaiMainContract.Model {
    @Inject
    Gson mGson;
    @Inject
    Application mApplication;

    @Inject
    public PaiMaiMainModel(IRepositoryManager repositoryManager) {
        super(repositoryManager);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        this.mGson = null;
        this.mApplication = null;
    }


    @Override
    public Observable<AppUpdate> checkAppUpdate() {
        return mRepositoryManager.obtainRetrofitService(SalesService.class).checkAppUpdate();
    }
}