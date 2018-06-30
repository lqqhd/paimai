package com.xiaoxing.login.mvp.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.jess.arms.base.BaseActivity;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.utils.ArmsUtils;
import com.xiaoxing.login.R;
import com.xiaoxing.login.R2;
import com.xiaoxing.login.di.component.DaggerRegisterSendPhoneComponent;
import com.xiaoxing.login.di.module.RegisterSendPhoneModule;
import com.xiaoxing.login.mvp.contract.RegisterSendPhoneContract;
import com.xiaoxing.login.mvp.presenter.RegisterSendPhonePresenter;
import com.xw.repo.XEditText;

import butterknife.BindView;
import butterknife.OnClick;
import me.jessyan.armscomponent.commonres.utils.ToolbarUtils;
import me.jessyan.armscomponent.commonsdk.core.RouterHub;
import me.jessyan.armscomponent.commonsdk.utils.SnackbarUtils;
import me.jessyan.armscomponent.commonsdk.utils.Utils;

import static com.jess.arms.utils.Preconditions.checkNotNull;

@Route(path = RouterHub.XIAO_XING_LOGIN_REGISTER_SEND_PHONE_ACTIVITY)
public class RegisterSendPhoneActivity extends BaseActivity<RegisterSendPhonePresenter> implements RegisterSendPhoneContract.View {

    public static final String PHONE = "phone";
    @BindView(R2.id.xet_phone)
    XEditText xetPhone;
    @BindView(R2.id.btn_next)
    Button btnNext;
    @BindView(R2.id.cb)
    CheckBox cb;
    @BindView(R2.id.tv_xie_yi)
    TextView tvXieYi;

    @Override
    public void setupActivityComponent(@NonNull AppComponent appComponent) {
        DaggerRegisterSendPhoneComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .registerSendPhoneModule(new RegisterSendPhoneModule(this))
                .build()
                .inject(this);
    }

    @Override
    public int initView(@Nullable Bundle savedInstanceState) {
        return R.layout.xiaoxing_login_activity_register_send_phone; //如果你不需要框架帮你设置 setContentView(id) 需要自行设置,请返回 0
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {
        ToolbarUtils.initToolbarTitleBack(this, getString(R.string.xiaoxing_login_register));
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

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


    @OnClick({R2.id.btn_next, R2.id.tv_xie_yi})
    public void onViewClicked(View view) {
        if (view.getId() == R.id.btn_next) {
            next();
        } else if (view.getId() == R.id.tv_xie_yi) {
            Utils.navigation(RegisterSendPhoneActivity.this, RouterHub.XIAO_XING_LOGIN_PROTOCOL_ACTIVITY);
        }

    }

    public void next() {

        if (TextUtils.isEmpty(getPhone())) {

            SnackbarUtils.Short(btnNext, "手机号不能为空").info().show();
            return;
        } else {

            if (!isMobileNO(getPhone())) {
                SnackbarUtils.Short(btnNext, "手机号格式不正确").info().show();
                return;
            }
        }

        if (cb.isChecked() == false) {
            SnackbarUtils.Short(btnNext, "请先阅读协议").info().show();
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString(PHONE, getPhone());
        Utils.navigation(RegisterSendPhoneActivity.this, RouterHub.XIAO_XING_LOGIN_REGISTER_VERIFICATION_CODEA_CTIVITY, bundle);
        killMyself();
    }

    @NonNull
    private String getPhone() {
        return xetPhone.getText().toString();
    }

    public static boolean isMobileNO(String mobileNums) {
        /**
         * 判断字符串是否符合手机号码格式
         * 移动号段: 134,135,136,137,138,139,147,150,151,152,157,158,159,170,178,182,183,184,187,188
         * 联通号段: 130,131,132,145,155,156,170,171,175,176,185,186
         * 电信号段: 133,149,153,170,173,177,180,181,189
         * @param str
         * @return 待检测的字符串
         */
        String telRegex = "^((13[0-9])|(14[5,7,9])|(15[^4])|(18[0-9])|(17[0,1,3,5,6,7,8]))\\d{8}$";// "[1]"代表第1位为数字1，"[358]"代表第二位可以为3、5、8中的一个，"\\d{9}"代表后面是可以是0～9的数字，有9位。
        if (TextUtils.isEmpty(mobileNums))
            return false;
        else
            return mobileNums.matches(telRegex);
    }
}
