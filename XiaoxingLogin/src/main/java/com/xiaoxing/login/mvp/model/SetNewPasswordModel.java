package com.xiaoxing.login.mvp.model;

import android.app.Application;

import com.google.gson.Gson;
import com.jess.arms.integration.IRepositoryManager;
import com.jess.arms.mvp.BaseModel;

import com.jess.arms.di.scope.ActivityScope;

import javax.inject.Inject;

import com.xiaoxing.login.mvp.contract.SetNewPasswordContract;
import com.xiaoxing.login.mvp.model.api.service.LoginService;
import com.xiaoxing.login.mvp.model.entity.UserSetpassword;

import io.reactivex.Observable;


@ActivityScope
public class SetNewPasswordModel extends BaseModel implements SetNewPasswordContract.Model {
    @Inject
    Gson mGson;
    @Inject
    Application mApplication;

    @Inject
    public SetNewPasswordModel(IRepositoryManager repositoryManager) {
        super(repositoryManager);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        this.mGson = null;
        this.mApplication = null;
    }

    @Override
    public Observable<UserSetpassword> userSetpassword(String phone, String new_password) {
        return mRepositoryManager.obtainRetrofitService(LoginService.class).userSetpassword(phone, new_password);
    }
}