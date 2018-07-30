package com.xiaoxing.salesclient.mvp.contract;

import com.jess.arms.mvp.IView;
import com.jess.arms.mvp.IModel;

import io.reactivex.Observable;
import me.jessyan.armscomponent.commonres.utils.MyCouponsList;
import me.jessyan.armscomponent.commonres.utils.MySgninCouponsList;


public interface SignHistoryContract {
    //对于经常使用的关于UI的方法可以定义到IView中,如显示隐藏进度条,和显示文字消息
    interface View extends IView {
        void mySgninCouponsListSuccess(MySgninCouponsList mySgninCouponsList);

        void myCouponsListSuccess(MyCouponsList myCouponsList);
    }

    //Model层定义接口,外部只需关心Model返回的数据,无需关心内部细节,即是否使用缓存
    interface Model extends IModel {
        Observable<MySgninCouponsList> mySgninCouponsList(String access_token, String year_month);

        Observable<MyCouponsList> myCouponsList(String access_token);

    }
}
