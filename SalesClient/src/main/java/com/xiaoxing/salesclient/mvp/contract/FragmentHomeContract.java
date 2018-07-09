package com.xiaoxing.salesclient.mvp.contract;

import com.jess.arms.base.BaseResponse;
import com.jess.arms.mvp.IModel;
import com.jess.arms.mvp.IView;
import com.xiaoxing.salesclient.mvp.model.entity.Index;

import io.reactivex.Observable;


public interface FragmentHomeContract {
    //对于经常使用的关于UI的方法可以定义到IView中,如显示隐藏进度条,和显示文字消息
    interface View extends IView {
        void getIndexDataSuccess(Index index);
    }

    //Model层定义接口,外部只需关心Model返回的数据,无需关心内部细节,即是否使用缓存
    interface Model extends IModel {
        Observable<BaseResponse<Index>> getIndex();
    }
}
