package com.xiaoxing.paimai.app;

import com.jess.arms.base.BaseApplication;
import com.mob.MobSDK;

/**
 * @author 小星 QQ:753940262
 * @class describe
 * @time 2018/7/19 0019 8:46
 */
public class PaiMaiApplication extends BaseApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        MobSDK.init(this);
    }


}
