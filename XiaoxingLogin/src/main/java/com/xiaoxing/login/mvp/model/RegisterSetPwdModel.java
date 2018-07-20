package com.xiaoxing.login.mvp.model;

import android.app.Application;

import com.google.gson.Gson;
import com.jess.arms.integration.IRepositoryManager;
import com.jess.arms.mvp.BaseModel;

import com.jess.arms.di.scope.ActivityScope;

import javax.inject.Inject;

import com.xiaoxing.login.mvp.contract.RegisterSetPwdContract;
import com.xiaoxing.login.mvp.model.api.service.LoginService;
import com.xiaoxing.login.mvp.model.entity.UserRegister;

import io.reactivex.Observable;


@ActivityScope
public class RegisterSetPwdModel extends BaseModel implements RegisterSetPwdContract.Model {
    @Inject
    Gson mGson;
    @Inject
    Application mApplication;

    @Inject
    public RegisterSetPwdModel(IRepositoryManager repositoryManager) {
        super(repositoryManager);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        this.mGson = null;
        this.mApplication = null;
    }

    @Override
    public Observable<UserRegister> userRegister(String mobile_phone, String password1) {
        return mRepositoryManager.obtainRetrofitService(LoginService.class).userRegister(mobile_phone, password1);
    }
}