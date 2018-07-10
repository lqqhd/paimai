package com.xiaoxing.salesclient.mvp.model;

import android.app.Application;

import com.google.gson.Gson;
import com.jess.arms.integration.IRepositoryManager;
import com.jess.arms.mvp.BaseModel;

import com.jess.arms.di.scope.ActivityScope;

import javax.inject.Inject;

import com.xiaoxing.salesclient.mvp.contract.HeadlinesContract;
import com.xiaoxing.salesclient.mvp.model.entity.Article;
import com.xiaoxing.salesclient.mvp.model.service.SalesService;

import io.reactivex.Observable;


@ActivityScope
public class HeadlinesModel extends BaseModel implements HeadlinesContract.Model {
    @Inject
    Gson mGson;
    @Inject
    Application mApplication;

    @Inject
    public HeadlinesModel(IRepositoryManager repositoryManager) {
        super(repositoryManager);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        this.mGson = null;
        this.mApplication = null;
    }

    @Override
    public Observable<Article> getArticle(String article_id) {
        return mRepositoryManager.obtainRetrofitService(SalesService.class).getArticle(article_id);
    }
}