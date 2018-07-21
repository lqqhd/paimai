package com.xiaoxing.search.mvp.model;

import android.app.Application;

import com.google.gson.Gson;
import com.jess.arms.integration.IRepositoryManager;
import com.jess.arms.mvp.BaseModel;

import com.jess.arms.di.scope.ActivityScope;

import javax.inject.Inject;

import com.xiaoxing.search.mvp.contract.SearchContract;
import com.xiaoxing.search.mvp.model.entity.AuctionSearch;
import com.xiaoxing.search.mvp.model.service.SearchService;

import io.reactivex.Observable;


@ActivityScope
public class SearchModel extends BaseModel implements SearchContract.Model {
    @Inject
    Gson mGson;
    @Inject
    Application mApplication;

    @Inject
    public SearchModel(IRepositoryManager repositoryManager) {
        super(repositoryManager);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        this.mGson = null;
        this.mApplication = null;
    }

    @Override
    public Observable<AuctionSearch> getSearch(String keywords) {
        return mRepositoryManager.obtainRetrofitService(SearchService.class).getAuctionSearch(keywords);
    }
}