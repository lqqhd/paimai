package me.jessyan.armscomponent.commonsdk.core;

import android.content.Context;
import android.widget.Toast;

import com.alibaba.wxlib.util.NetworkUtil;
import com.jess.arms.base.BaseActivity;
import com.jess.arms.utils.ArmsUtils;

import io.reactivex.disposables.Disposable;
import me.jessyan.armscomponent.commonsdk.R;
import me.jessyan.rxerrorhandler.core.RxErrorHandler;
import me.jessyan.rxerrorhandler.handler.ErrorHandleSubscriber;

/**
 * @author 小星 QQ:753940262
 * @class describe
 * @time 2018/8/6 0006 16:50
 */
public abstract class BaseSubscriber<T> extends ErrorHandleSubscriber<T> {

    private Context mContext;


    public BaseSubscriber(Context context, RxErrorHandler rxErrorHandler) {
        super(rxErrorHandler);
        this.mContext = context;
    }

    @Override
    public void onSubscribe(Disposable d) {
        super.onSubscribe(d);

        if (!NetworkUtil.isNetworkAvailable(mContext)) {

//            Toast.makeText(context, "当前网络不可用，请检查网络情况", Toast.LENGTH_SHORT).show();

            ArmsUtils.snackbarText("当前网络不可用，请检查网络情况");
            // 一定好主动调用下面这一句
            onComplete();

            return;
        }
        // 显示进度条
//        showLoadingProgress();
//        LoadingDialogUtil.showGifdialog1(getSupportFragmentManager(), R.drawable.loading);
    }

    @Override
    public void onComplete() {
        super.onComplete();
//        closeLoadingProgress();

    }

    @Override
    public void onError(Throwable t) {
        super.onError(t);
    }


}