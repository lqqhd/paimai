package com.xiaoxing.login.mvp.model.api.service;

import com.xiaoxing.login.mvp.model.entity.Login;
import com.xiaoxing.login.mvp.model.entity.UserCheckphone;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * @author 小星 QQ:753940262
 * @class describe
 * @time 2018/7/7 0007 16:50
 */
public interface LoginService {

    /**
     * 妹纸列表
     */
//    @GET("http://47.100.103.123/api.php?app_key=woaixuxiaoxing&method=dsc.user.login.get&user_name=fan&password=123456")
    @GET("/api/userLogin.php")
    Observable<Login> doLogin(@Query("user_name") String user_name, @Query("password") String password);

    @GET("/api/userCheckphone.php")
    Observable<UserCheckphone> userCheckphone(@Query("phone") String phone);
  @GET("/api/aliyun/sms/sms_send.php")
    Observable<UserCheckphone> smsSend(@Query("phone") String phone);


}
