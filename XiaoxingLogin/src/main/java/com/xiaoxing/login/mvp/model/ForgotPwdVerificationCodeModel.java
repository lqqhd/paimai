package com.xiaoxing.login.mvp.model;

import android.app.Application;

import com.google.gson.Gson;
import com.jess.arms.integration.IRepositoryManager;
import com.jess.arms.mvp.BaseModel;

import com.jess.arms.di.scope.ActivityScope;

import javax.inject.Inject;

import com.xiaoxing.login.mvp.contract.ForgotPwdVerificationCodeContract;


@ActivityScope
public class ForgotPwdVerificationCodeModel extends BaseModel implements ForgotPwdVerificationCodeContract.Model {
    @Inject
    Gson mGson;
    @Inject
    Application mApplication;

    @Inject
    public ForgotPwdVerificationCodeModel(IRepositoryManager repositoryManager) {
        super(repositoryManager);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        this.mGson = null;
        this.mApplication = null;
    }
}