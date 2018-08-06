package com.xiaoxing.paimai.app;

import android.content.Context;

import com.jess.arms.base.BaseApplication;
import com.mob.MobSDK;

/**
 * @author 小星 QQ:753940262
 * @class describe
 * @time 2018/7/19 0019 8:46
 */
public class PaiMaiApplication extends BaseApplication {

    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();
        MobSDK.init(this);
    }

    public static Context getContext() {

        return mContext;
    }
}
