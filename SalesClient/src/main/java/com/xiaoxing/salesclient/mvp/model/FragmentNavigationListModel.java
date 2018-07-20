package com.xiaoxing.salesclient.mvp.model;

import android.app.Application;

import com.google.gson.Gson;
import com.jess.arms.integration.IRepositoryManager;
import com.jess.arms.mvp.BaseModel;

import javax.inject.Inject;

import com.xiaoxing.salesclient.mvp.contract.FragmentNavigationListContract;
import com.xiaoxing.salesclient.mvp.model.entity.Category;
import com.xiaoxing.salesclient.mvp.model.service.SalesService;

import io.reactivex.Observable;


public class FragmentNavigationListModel extends BaseModel implements FragmentNavigationListContract.Model {
    @Inject
    Gson mGson;
    @Inject
    Application mApplication;

    @Inject
    public FragmentNavigationListModel(IRepositoryManager repositoryManager) {
        super(repositoryManager);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        this.mGson = null;
        this.mApplication = null;
    }

    @Override
    public Observable<Category> getCategory(String cat_id) {
        return mRepositoryManager.obtainRetrofitService(SalesService.class).category(cat_id);
    }
}