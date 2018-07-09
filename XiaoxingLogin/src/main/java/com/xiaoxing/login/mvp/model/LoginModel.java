package com.xiaoxing.login.mvp.model;

import android.app.Application;

import com.google.gson.Gson;
import com.jess.arms.integration.IRepositoryManager;
import com.jess.arms.mvp.BaseModel;

import com.jess.arms.di.scope.ActivityScope;

import javax.inject.Inject;

import com.xiaoxing.login.mvp.contract.LoginContract;
import com.xiaoxing.login.mvp.model.api.service.LoginService;
import com.xiaoxing.login.mvp.model.entity.Login;
import com.jess.arms.base.BaseResponse;

import io.reactivex.Observable;


@ActivityScope
public class LoginModel extends BaseModel implements LoginContract.Model {
    @Inject
    Gson mGson;
    @Inject
    Application mApplication;

    @Inject
    public LoginModel(IRepositoryManager repositoryManager) {
        super(repositoryManager);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        this.mGson = null;
        this.mApplication = null;
    }


    @Override
    public Observable<Login> doLogin(String app_key, String method, String user_name, String password) {
        return mRepositoryManager
                .obtainRetrofitService(LoginService.class)
                .doLogin(app_key, method, user_name, password);
    }
}