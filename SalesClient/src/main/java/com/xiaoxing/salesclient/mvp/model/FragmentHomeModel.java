package com.xiaoxing.salesclient.mvp.model;

import android.app.Application;

import com.google.gson.Gson;
import com.jess.arms.base.BaseResponse;
import com.jess.arms.di.scope.ActivityScope;
import com.jess.arms.di.scope.FragmentScope;
import com.jess.arms.integration.IRepositoryManager;
import com.jess.arms.mvp.BaseModel;
import com.xiaoxing.salesclient.mvp.contract.FragmentHomeContract;
import com.xiaoxing.salesclient.mvp.model.entity.Index;
import com.xiaoxing.salesclient.mvp.model.service.SalesService;

import javax.inject.Inject;

import io.reactivex.Observable;


@FragmentScope
public class FragmentHomeModel extends BaseModel implements FragmentHomeContract.Model {
    @Inject
    Gson mGson;
    @Inject
    Application mApplication;

    @Inject
    public FragmentHomeModel(IRepositoryManager repositoryManager) {
        super(repositoryManager);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        this.mGson = null;
        this.mApplication = null;
    }

    @Override
    public Observable<BaseResponse<Index>> getIndex() {
        return mRepositoryManager.obtainRetrofitService(SalesService.class).getIndex();
    }
}