package com.xiaoxing.salesclient.mvp.contract;

import com.jess.arms.mvp.IModel;
import com.jess.arms.mvp.IView;
import me.jessyan.armscomponent.commonres.utils.AppUpdate;

import io.reactivex.Observable;
import me.jessyan.armscomponent.commonres.utils.TodayIsSign;

public interface PaiMaiMainContract {
    //对于经常使用的关于UI的方法可以定义到IView中,如显示隐藏进度条,和显示文字消息
    interface View extends IView {
        void checkAppUpdate(AppUpdate appUpdate);
        void todayIsSignSuccess(TodayIsSign todayIsSign);
    }

    //Model层定义接口,外部只需关心Model返回的数据,无需关心内部细节,即是否使用缓存
    interface Model extends IModel {

        Observable<AppUpdate> checkAppUpdate();
        Observable<TodayIsSign> todayIsSign(String access_token);
    }
}
