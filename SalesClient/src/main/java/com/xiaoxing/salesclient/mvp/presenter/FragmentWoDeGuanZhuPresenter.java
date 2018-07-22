package com.xiaoxing.salesclient.mvp.presenter;

import android.app.Application;

import com.jess.arms.di.scope.FragmentScope;
import com.jess.arms.http.imageloader.ImageLoader;
import com.jess.arms.integration.AppManager;
import com.jess.arms.mvp.BasePresenter;
import com.jess.arms.utils.RxLifecycleUtils;
import com.xiaoxing.salesclient.mvp.contract.FragmentHomeContract;
import com.xiaoxing.salesclient.mvp.contract.FragmentWoDeGuanZhuContract;
import com.xiaoxing.salesclient.mvp.model.entity.Index;
import com.xiaoxing.salesclient.mvp.model.entity.WoDeGuanZhu;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import me.jessyan.rxerrorhandler.core.RxErrorHandler;
import me.jessyan.rxerrorhandler.handler.ErrorHandleSubscriber;


@FragmentScope
public class FragmentWoDeGuanZhuPresenter extends BasePresenter<FragmentWoDeGuanZhuContract.Model, FragmentWoDeGuanZhuContract.View> {
    @Inject
    RxErrorHandler mErrorHandler;
    @Inject
    Application mApplication;
    @Inject
    ImageLoader mImageLoader;
    @Inject
    AppManager mAppManager;

    @Inject
    public FragmentWoDeGuanZhuPresenter(FragmentWoDeGuanZhuContract.Model model, FragmentWoDeGuanZhuContract.View rootView) {
        super(model, rootView);


    }

    public void getMyCollectionStoreList(String access_token) {

        mModel.getMyCollectionStoreList(access_token).subscribeOn(Schedulers.io())
                //                .retryWhen(new RetryWithDelay(3, 2))//遇到错误时重试,第一个参数为重试几次,第二个参数为重试的间隔
                .doOnSubscribe(disposable -> {
                    mRootView.showLoading();
                }).subscribeOn(AndroidSchedulers.mainThread())
                .observeOn(AndroidSchedulers.mainThread())
                .doFinally(() -> {
                    mRootView.hideLoading();
                })
                .compose(RxLifecycleUtils.bindToLifecycle(mRootView))//使用 Rxlifecycle,使 Disposable 和 Activity 一起销毁
                .subscribe(new ErrorHandleSubscriber<WoDeGuanZhu>(mErrorHandler) {
                    @Override
                    public void onNext(WoDeGuanZhu woDeGuanZhu) {
//                        ArmsUtils.snackbarText("首页Api请求测试成功");
                        mRootView.getMyCollectionStoreListSuccess(woDeGuanZhu);
                    }
                });
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        this.mErrorHandler = null;
        this.mAppManager = null;
        this.mImageLoader = null;
        this.mApplication = null;
    }
}
