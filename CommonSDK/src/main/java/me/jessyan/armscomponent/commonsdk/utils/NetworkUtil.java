package me.jessyan.armscomponent.commonsdk.utils;

import android.content.Context;

import com.jess.arms.utils.ArmsUtils;

/**
 * @author 小星 QQ:753940262
 * @class describe
 * @time 2018/8/6 0006 13:15
 */
public class NetworkUtil {

    public static boolean checkNetworkAvailable(Context context) {

        if (ArmsUtils.isNetworkAvailable(context))
            return true;

        ArmsUtils.snackbarText("当前网络不可用,请检查网络稍后再试！");
        return false;
    }
}
