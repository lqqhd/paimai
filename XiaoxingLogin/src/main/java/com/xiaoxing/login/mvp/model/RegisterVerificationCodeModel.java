package com.xiaoxing.login.mvp.model;

import android.app.Application;

import com.google.gson.Gson;
import com.jess.arms.integration.IRepositoryManager;
import com.jess.arms.mvp.BaseModel;

import com.jess.arms.di.scope.ActivityScope;

import javax.inject.Inject;

import com.xiaoxing.login.mvp.contract.RegisterVerificationCodeContract;
import com.xiaoxing.login.mvp.model.api.service.LoginService;
import com.xiaoxing.login.mvp.model.entity.SmsSend;

import io.reactivex.Observable;


@ActivityScope
public class RegisterVerificationCodeModel extends BaseModel implements RegisterVerificationCodeContract.Model {
    @Inject
    Gson mGson;
    @Inject
    Application mApplication;

    @Inject
    public RegisterVerificationCodeModel(IRepositoryManager repositoryManager) {
        super(repositoryManager);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        this.mGson = null;
        this.mApplication = null;
    }

    @Override
    public Observable<SmsSend> smsSend(String phone, String code) {
        return mRepositoryManager.obtainRetrofitService(LoginService.class).smsSend(phone, code);
    }
}