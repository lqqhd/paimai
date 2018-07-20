package com.xiaoxing.login.mvp.model.api.service;

import com.xiaoxing.login.mvp.model.entity.Login;
import com.xiaoxing.login.mvp.model.entity.SmsSend;
import com.xiaoxing.login.mvp.model.entity.UserCheckphone;
import com.xiaoxing.login.mvp.model.entity.UserRegister;

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
     * 登录
     */
//    @GET("http://47.100.103.123/api.php?app_key=woaixuxiaoxing&method=dsc.user.login.get&user_name=fan&password=123456")
    @GET("/api/userLogin.php")
    Observable<Login> doLogin(@Query("user_name") String user_name, @Query("password") String password);

    /**
     * 验证手机号是否存在
     *
     * @param phone
     * @return
     */
    @GET("/api/userCheckphone.php")
    Observable<UserCheckphone> userCheckphone(@Query("phone") String phone);

    /**
     * 发送短信接口
     *
     * @param phone
     * @param code
     * @return
     */
    @GET("/api/aliyun/sms/sms_send.php")
    Observable<SmsSend> smsSend(@Query("phone") String phone, @Query("code") String code);

    /**
     * 注册接口
     *
     * @param mobile_phone
     * @param password1
     * @return
     */
    @GET("/api/userRegister.php")
    Observable<UserRegister> userRegister(@Query("mobile_phone") String mobile_phone, @Query("password1") String password1);


}
