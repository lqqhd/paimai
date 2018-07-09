package com.xiaoxing.salesclient.mvp.model.service;

import com.jess.arms.base.BaseResponse;
import com.xiaoxing.salesclient.mvp.model.entity.Index;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * @author 小星 QQ:753940262
 * @class describe
 * @time 2018/7/9 0009 14:11
 */
public interface SalesService {

    /**
     * 妹纸列表
     */
//    @GET("http://47.100.103.123/api.php?app_key=woaixuxiaoxing&method=dsc.user.login.get&user_name=fan&password=123456")
    @GET("/api.php/index.php")
    Observable<BaseResponse<Index>> getIndex();

}
