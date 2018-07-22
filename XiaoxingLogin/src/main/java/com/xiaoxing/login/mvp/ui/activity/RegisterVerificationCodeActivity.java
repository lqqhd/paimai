package com.xiaoxing.login.mvp.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.jess.arms.base.BaseActivity;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.utils.ArmsUtils;
import com.xiaoxing.gifloadingview.LoadingDialogUtil;
import com.xiaoxing.login.R;
import com.xiaoxing.login.R2;
import com.xiaoxing.login.di.component.DaggerRegisterVerificationCodeComponent;
import com.xiaoxing.login.di.module.RegisterVerificationCodeModule;
import com.xiaoxing.login.mvp.contract.RegisterVerificationCodeContract;
import com.xiaoxing.login.mvp.model.entity.SmsSend;
import com.xiaoxing.login.mvp.presenter.RegisterVerificationCodePresenter;
import com.xiaoxing.login.mvp.ui.view.CountDownButton;
import com.xw.repo.XEditText;

import java.util.HashMap;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.smssdk.EventHandler;
import cn.smssdk.OnSendMessageHandler;
import cn.smssdk.SMSSDK;
import cn.smssdk.gui.RegisterPage;
import me.jessyan.armscomponent.commonres.utils.ToolbarUtils;
import me.jessyan.armscomponent.commonsdk.core.RouterHub;
import me.jessyan.armscomponent.commonsdk.utils.SnackbarUtils;
import me.jessyan.armscomponent.commonsdk.utils.Utils;

import static com.jess.arms.utils.Preconditions.checkNotNull;
import static com.xiaoxing.login.mvp.ui.activity.RegisterSendPhoneActivity.PHONE;

@Route(path = RouterHub.XIAO_XING_LOGIN_REGISTER_VERIFICATION_CODEA_CTIVITY)
public class RegisterVerificationCodeActivity extends BaseActivity<RegisterVerificationCodePresenter> implements RegisterVerificationCodeContract.View {

    @BindView(R2.id.tv_phone)
    TextView tvPhone;
    @BindView(R2.id.xet_code)
    XEditText xetCode;
    @BindView(R2.id.cd_btn)
    CountDownButton cdBtn;
    @BindView(R2.id.btn_next)
    Button btnNext;


    private EventHandler eh;
    @Autowired
    String mPhone;
    private String mCode = "";

    @Override
    public void setupActivityComponent(@NonNull AppComponent appComponent) {
        DaggerRegisterVerificationCodeComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .registerVerificationCodeModule(new RegisterVerificationCodeModule(this))
                .build()
                .inject(this);
        ARouter.getInstance().inject(this);
    }

    @Override
    public int initView(@Nullable Bundle savedInstanceState) {
        return R.layout.xiaoxing_login_activity_register_verification_code; //如果你不需要框架帮你设置 setContentView(id) 需要自行设置,请返回 0
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {
        ToolbarUtils.initToolbarTitleBack(this, getString(R.string.xiaoxing_login_verification));


        tvPhone.setText(mPhone);
        startCountdown();

        get4Code();

        smsSend();
//        initMobSms();
    }

    private void smsSend() {
        if (!TextUtils.isEmpty(mCode)) {
            mPresenter.smsSend(mPhone, mCode);
        }
    }

    private void initMobSms() {
        initRegisterEventHandler();
        getVerificationCode(mPhone);
    }

    private String get4Code() {
        mCode = ArmsUtils.get4Random();
        return mCode;
    }

    private void startCountdown() {

        get4Code();
        cdBtn.startCountdown();
        smsSend();
//        getVerificationCode(mPhone);
    }

    @Override
    public void showLoading() {
//        LoadingDialogUtil.showGifdialog1(getSupportFragmentManager(), R.drawable.loading);
    }

    @Override
    public void hideLoading() {
//        LoadingDialogUtil.dismissDialog();
    }

    @Override
    public void showMessage(@NonNull String message) {
        checkNotNull(message);
        ArmsUtils.snackbarText(message);
    }

    @Override
    public void launchActivity(@NonNull Intent intent) {
        checkNotNull(intent);
        ArmsUtils.startActivity(intent);
    }

    @Override
    public void killMyself() {
        finish();
    }

    @OnClick({R2.id.btn_next})
    public void onViewClicked(View view) {
        if (view.getId() == R.id.btn_next) {
            next();
        }
    }

    private void next() {

        if (TextUtils.isEmpty(getCode())) {
            SnackbarUtils.Short(btnNext, "验证码不能为空").info().show();
            return;
        }
        if (getCode().equals(mCode)) {

            ARouter.getInstance().build(RouterHub.XIAO_XING_LOGIN_REGISTER_SET_PWD_ACTIVITY).withString("mPhone", mPhone).navigation(this);

            killMyself();
        } else {
            SnackbarUtils.Short(btnNext, "验证码错误，请重新输入").info().show();
        }

//        submitVerificationCode(mPhone, getCode());

    }

    @NonNull
    private String getCode() {
        return xetCode.getText().toString();
    }


    @OnClick(R2.id.cd_btn)
    public void onClick() {
        startCountdown();
    }


    private void submitVerificationCode(String phone, String code) {
        // 提交验证码，其中的code表示验证码，如“1357”
        SMSSDK.submitVerificationCode("86", phone, code);

    }

    private void getVerificationCode(String phone) {
        //请求验证码，其中country表示国家代码，如“86”；phone表示手机号码，如“13800138000”
        SMSSDK.getVerificationCode("86", phone);
    }

    private void initRegisterEventHandler() {
        //注册回调监听，放到发送和验证前注册，注意这里是子线程需要传到主线程中去操作后续提示
        eh = new EventHandler() {

            @Override
            public void afterEvent(int event, int result, Object data) {
                Message msg = new Message();
                msg.arg1 = event;
                msg.arg2 = result;
                msg.obj = data;
                mHandler.sendMessage(msg);
            }

        };
        SMSSDK.registerEventHandler(eh);
    }

    private Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);

            if (msg.arg2 == SMSSDK.RESULT_COMPLETE) {
                //回调完成
                Log.e("mHandler=", "回调完成");
                if (msg.arg1 == SMSSDK.EVENT_SUBMIT_VERIFICATION_CODE) {
                    //提交验证码成功
                    Log.e("mHandler=", "提交验证码成功");
                    Utils.navigation(RegisterVerificationCodeActivity.this, RouterHub.XIAO_XING_LOGIN_REGISTER_SET_PWD_ACTIVITY);
                    killMyself();
                } else if (msg.arg1 == SMSSDK.EVENT_GET_VERIFICATION_CODE) {
                    //获取验证码成功
                    Log.e("mHandler=", "获取验证码成功");
                } else if (msg.arg1 == SMSSDK.EVENT_GET_SUPPORTED_COUNTRIES) {
                    //返回支持发送验证码的国家列表
                    Log.e("mHandler=", "返回支持发送验证码的国家列表");
                }
            }
        }
    };

    private void sendCode(Context context) {
        RegisterPage page = new RegisterPage();
        //如果使用我们的ui，没有申请模板编号的情况下需传null
        page.setTempCode(null);
        page.setRegisterCallback(new EventHandler() {
            public void afterEvent(int event, int result, Object data) {
                if (result == SMSSDK.RESULT_COMPLETE) {
                    // 处理成功的结果
                    HashMap<String, Object> phoneMap = (HashMap<String, Object>) data;
                    String country = (String) phoneMap.get("country"); // 国家代码，如“86”
                    String phone = (String) phoneMap.get("phone"); // 手机号码，如“13800138000”
                    // TODO 利用国家代码和手机号码进行后续的操作
                } else {
                    // TODO 处理错误的结果
                }
            }
        });
        page.show(context);
    }

    protected void onStop() {
        super.onStop();
        //用完回调要注销掉，否则可能会出现内存泄露
        SMSSDK.unregisterEventHandler(eh);
    }

    @Override
    public void smsSendSuccess(SmsSend smsSend) {

        SnackbarUtils.Short(btnNext, smsSend.getMsg()).info().show();
    }
}
