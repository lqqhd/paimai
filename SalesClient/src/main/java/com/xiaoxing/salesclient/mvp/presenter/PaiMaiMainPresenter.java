package com.xiaoxing.salesclient.mvp.presenter;

import android.app.Application;

import com.jess.arms.di.scope.ActivityScope;
import com.jess.arms.http.imageloader.ImageLoader;
import com.jess.arms.integration.AppManager;
import com.jess.arms.mvp.BasePresenter;
import com.jess.arms.utils.RxLifecycleUtils;
import com.xiaoxing.salesclient.mvp.contract.PaiMaiMainContract;

import me.jessyan.armscomponent.commonres.utils.AppUpdate;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import me.jessyan.armscomponent.commonres.utils.CouponsReceive;
import me.jessyan.armscomponent.commonres.utils.MySgninCouponsList;
import me.jessyan.armscomponent.commonres.utils.TodayIsSign;
import me.jessyan.rxerrorhandler.core.RxErrorHandler;
import me.jessyan.rxerrorhandler.handler.ErrorHandleSubscriber;


@ActivityScope
public class PaiMaiMainPresenter extends BasePresenter<PaiMaiMainContract.Model, PaiMaiMainContract.View> {
    @Inject
    RxErrorHandler mErrorHandler;
    @Inject
    Application mApplication;
    @Inject
    ImageLoader mImageLoader;
    @Inject
    AppManager mAppManager;

    @Inject
    public PaiMaiMainPresenter(PaiMaiMainContract.Model model, PaiMaiMainContract.View rootView) {
        super(model, rootView);
    }

    public void checkAppUpdate() {

        mModel.checkAppUpdate().subscribeOn(Schedulers.io())
                //                .retryWhen(new RetryWithDelay(3, 2))//遇到错误时重试,第一个参数为重试几次,第二个参数为重试的间隔
                .doOnSubscribe(disposable -> {
                    mRootView.showLoading();
                }).subscribeOn(AndroidSchedulers.mainThread())
                .observeOn(AndroidSchedulers.mainThread())
                .doFinally(() -> {
                    mRootView.hideLoading();
                })
                .compose(RxLifecycleUtils.bindToLifecycle(mRootView))//使用 Rxlifecycle,使 Disposable 和 Activity 一起销毁
                .subscribe(new ErrorHandleSubscriber<AppUpdate>(mErrorHandler) {
                    @Override
                    public void onNext(AppUpdate appUpdate) {
                        mRootView.checkAppUpdate(appUpdate);
                    }
                });
    }

    public void todayIsSign(String access_token) {

        mModel.todayIsSign(access_token).subscribeOn(Schedulers.io())
                //                .retryWhen(new RetryWithDelay(3, 2))//遇到错误时重试,第一个参数为重试几次,第二个参数为重试的间隔
                .doOnSubscribe(disposable -> {
                    mRootView.showLoading();
                }).subscribeOn(AndroidSchedulers.mainThread())
                .observeOn(AndroidSchedulers.mainThread())
                .doFinally(() -> {
                    mRootView.hideLoading();
                })
                .compose(RxLifecycleUtils.bindToLifecycle(mRootView))//使用 Rxlifecycle,使 Disposable 和 Activity 一起销毁
                .subscribe(new ErrorHandleSubscriber<TodayIsSign>(mErrorHandler) {
                    @Override
                    public void onNext(TodayIsSign todayIsSign) {
                        mRootView.todayIsSignSuccess(todayIsSign);
                    }
                });
    }

    public void mySgninCouponsList(String access_token, String year_month) {

        mModel.mySgninCouponsList(access_token, year_month).subscribeOn(Schedulers.io())
                //                .retryWhen(new RetryWithDelay(3, 2))//遇到错误时重试,第一个参数为重试几次,第二个参数为重试的间隔
                .doOnSubscribe(disposable -> {
                    mRootView.showLoading();
                }).subscribeOn(AndroidSchedulers.mainThread())
                .observeOn(AndroidSchedulers.mainThread())
                .doFinally(() -> {
                    mRootView.hideLoading();
                })
                .compose(RxLifecycleUtils.bindToLifecycle(mRootView))//使用 Rxlifecycle,使 Disposable 和 Activity 一起销毁
                .subscribe(new ErrorHandleSubscriber<MySgninCouponsList>(mErrorHandler) {
                    @Override
                    public void onNext(MySgninCouponsList mySgninCouponsList) {
                        mRootView.mySgninCouponsListSuccess(mySgninCouponsList);
                    }
                });
    }

    public void couponsReceive(String access_token, String cou_id) {

        mModel.couponsReceive(access_token, cou_id).subscribeOn(Schedulers.io())
                //                .retryWhen(new RetryWithDelay(3, 2))//遇到错误时重试,第一个参数为重试几次,第二个参数为重试的间隔
                .doOnSubscribe(disposable -> {
                    mRootView.showLoading();
                }).subscribeOn(AndroidSchedulers.mainThread())
                .observeOn(AndroidSchedulers.mainThread())
                .doFinally(() -> {
                    mRootView.hideLoading();
                })
                .compose(RxLifecycleUtils.bindToLifecycle(mRootView))//使用 Rxlifecycle,使 Disposable 和 Activity 一起销毁
                .subscribe(new ErrorHandleSubscriber<CouponsReceive>(mErrorHandler) {
                    @Override
                    public void onNext(CouponsReceive couponsReceive) {
                        mRootView.couponsReceiveSuccess(couponsReceive);
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
