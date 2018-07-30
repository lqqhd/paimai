package com.xiaoxing.salesclient.mvp.model;

import android.app.Application;

import com.google.gson.Gson;
import com.jess.arms.integration.IRepositoryManager;
import com.jess.arms.mvp.BaseModel;
import com.xiaoxing.salesclient.mvp.contract.FragmentNavigationContract;
import com.xiaoxing.salesclient.mvp.model.entity.Category;
import com.xiaoxing.salesclient.mvp.model.service.SalesService;

import javax.inject.Inject;

import io.reactivex.Observable;


public class FragmentNavigationModel extends BaseModel implements FragmentNavigationContract.Model {
    @Inject
    Gson mGson;
    @Inject
    Application mApplication;

    @Inject
    public FragmentNavigationModel(IRepositoryManager repositoryManager) {
        super(repositoryManager);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        this.mGson = null;
        this.mApplication = null;
    }

    @Override
    public Observable<Category> getCategory() {
        return mRepositoryManager.obtainRetrofitService(SalesService.class).category();
    }
}