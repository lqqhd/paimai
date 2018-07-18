package com.xiaoxing.salesclient.mvp.presenter;

import android.app.Application;

import com.jess.arms.base.BaseResponse;
import com.jess.arms.di.scope.ActivityScope;
import com.jess.arms.di.scope.FragmentScope;
import com.jess.arms.http.imageloader.ImageLoader;
import com.jess.arms.integration.AppManager;
import com.jess.arms.mvp.BasePresenter;
import com.jess.arms.utils.ArmsUtils;
import com.jess.arms.utils.RxLifecycleUtils;
import com.xiaoxing.salesclient.mvp.contract.FragmentHomeContract;
import com.xiaoxing.salesclient.mvp.model.entity.Index;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import me.jessyan.rxerrorhandler.core.RxErrorHandler;
import me.jessyan.rxerrorhandler.handler.ErrorHandleSubscriber;


@FragmentScope
public class FragmentHomePresenter extends BasePresenter<FragmentHomeContract.Model, FragmentHomeContract.View> {
    @Inject
    RxErrorHandler mErrorHandler;
    @Inject
    Application mApplication;
    @Inject
    ImageLoader mImageLoader;
    @Inject
    AppManager mAppManager;

    @Inject
    public FragmentHomePresenter(FragmentHomeContract.Model model, FragmentHomeContract.View rootView) {
        super(model, rootView);


    }

    public void getIndex() {

        mModel.getIndex().subscribeOn(Schedulers.io())
                //                .retryWhen(new RetryWithDelay(3, 2))//遇到错误时重试,第一个参数为重试几次,第二个参数为重试的间隔
                .doOnSubscribe(disposable -> {
                }).subscribeOn(AndroidSchedulers.mainThread())
                .observeOn(AndroidSchedulers.mainThread())
                .doFinally(() -> {
                })
                .compose(RxLifecycleUtils.bindToLifecycle(mRootView))//使用 Rxlifecycle,使 Disposable 和 Activity 一起销毁
                .subscribe(new ErrorHandleSubscriber<Index>(mErrorHandler) {
                    @Override
                    public void onNext(Index index) {
//                        ArmsUtils.snackbarText("首页Api请求测试成功");

                        mRootView.getIndexDataSuccess(index);
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
