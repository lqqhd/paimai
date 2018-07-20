package com.xiaoxing.salesclient.mvp.presenter;

import android.app.Application;

import com.jess.arms.integration.AppManager;
import com.jess.arms.mvp.BasePresenter;
import com.jess.arms.http.imageloader.ImageLoader;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import me.jessyan.rxerrorhandler.core.RxErrorHandler;
import me.jessyan.rxerrorhandler.handler.ErrorHandleSubscriber;

import javax.inject.Inject;

import com.jess.arms.utils.RxLifecycleUtils;
import com.xiaoxing.salesclient.mvp.contract.FragmentWeiPaiContract;
import com.xiaoxing.salesclient.mvp.model.entity.AuctionList;
import com.xiaoxing.salesclient.mvp.model.entity.Index;


public class FragmentWeiPaiPresenter extends BasePresenter<FragmentWeiPaiContract.Model, FragmentWeiPaiContract.View> {
    @Inject
    RxErrorHandler mErrorHandler;
    @Inject
    Application mApplication;
    @Inject
    ImageLoader mImageLoader;
    @Inject
    AppManager mAppManager;

    @Inject
    public FragmentWeiPaiPresenter(FragmentWeiPaiContract.Model model, FragmentWeiPaiContract.View rootView) {
        super(model, rootView);
    }

    public void getAuctionList(String access_token, String sort, String order, String cat_left_id) {

        mModel.getAuctionList(access_token, sort, order, cat_left_id).subscribeOn(Schedulers.io())
                //                .retryWhen(new RetryWithDelay(3, 2))//遇到错误时重试,第一个参数为重试几次,第二个参数为重试的间隔
                .doOnSubscribe(disposable -> {
                }).subscribeOn(AndroidSchedulers.mainThread())
                .observeOn(AndroidSchedulers.mainThread())
                .doFinally(() -> {
                })
                .compose(RxLifecycleUtils.bindToLifecycle(mRootView))//使用 Rxlifecycle,使 Disposable 和 Activity 一起销毁
                .subscribe(new ErrorHandleSubscriber<AuctionList>(mErrorHandler) {
                    @Override
                    public void onNext(AuctionList auctionList) {
                        mRootView.auctionListSuccess(auctionList);
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
