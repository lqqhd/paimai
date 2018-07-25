package com.xiaoxing.salesclient.mvp.model;

import android.app.Application;

import com.google.gson.Gson;
import com.jess.arms.di.scope.ActivityScope;
import com.jess.arms.integration.IRepositoryManager;
import com.jess.arms.mvp.BaseModel;
import com.xiaoxing.salesclient.mvp.contract.PaiMaiMainContract;
import com.xiaoxing.salesclient.mvp.model.service.SalesService;
import me.jessyan.armscomponent.commonres.utils.AppUpdate;

import javax.inject.Inject;

import io.reactivex.Observable;


@ActivityScope
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