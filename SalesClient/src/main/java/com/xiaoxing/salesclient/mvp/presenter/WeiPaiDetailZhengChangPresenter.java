package com.xiaoxing.salesclient.mvp.presenter;

import android.app.Application;

import com.jess.arms.integration.AppManager;
import com.jess.arms.di.scope.ActivityScope;
import com.jess.arms.mvp.BasePresenter;
import com.jess.arms.http.imageloader.ImageLoader;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import me.jessyan.rxerrorhandler.core.RxErrorHandler;
import me.jessyan.rxerrorhandler.handler.ErrorHandleSubscriber;

import javax.inject.Inject;

import com.jess.arms.utils.RxLifecycleUtils;
import com.xiaoxing.salesclient.mvp.contract.WeiPaiDetailZhengChangContract;
import com.xiaoxing.salesclient.mvp.model.entity.AuctionDetail;
import com.xiaoxing.salesclient.mvp.model.entity.AuctionDetailZhengChang;


@ActivityScope
public class WeiPaiDetailZhengChangPresenter extends BasePresenter<WeiPaiDetailZhengChangContract.Model, WeiPaiDetailZhengChangContract.View> {
    @Inject
    RxErrorHandler mErrorHandler;
    @Inject
    Application mApplication;
    @Inject
    ImageLoader mImageLoader;
    @Inject
    AppManager mAppManager;

    @Inject
    public WeiPaiDetailZhengChangPresenter(WeiPaiDetailZhengChangContract.Model model, WeiPaiDetailZhengChangContract.View rootView) {
        super(model, rootView);
    }

    public void getAuctionDetail(String act_id, String goods_id) {

        mModel.getAuctionDetail(act_id, goods_id).subscribeOn(Schedulers.io())
                //                .retryWhen(new RetryWithDelay(3, 2))//遇到错误时重试,第一个参数为重试几次,第二个参数为重试的间隔
                .doOnSubscribe(disposable -> {
                    mRootView.showLoading();
                }).subscribeOn(AndroidSchedulers.mainThread())
                .observeOn(AndroidSchedulers.mainThread())
                .doFinally(() -> {
                    mRootView.hideLoading();
                })
                .compose(RxLifecycleUtils.bindToLifecycle(mRootView))//使用 Rxlifecycle,使 Disposable 和 Activity 一起销毁
                .subscribe(new ErrorHandleSubscriber<AuctionDetailZhengChang>(mErrorHandler) {
                    @Override
                    public void onNext(AuctionDetailZhengChang auctionDetailZhengChang) {
                        mRootView.auctionDetailSuccess(auctionDetailZhengChang);
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