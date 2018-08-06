package com.xiaoxing.login.mvp.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.jess.arms.base.BaseActivity;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.utils.ArmsUtils;
import com.xiaoxing.gifloadingview.LoadingDialogUtil;
import com.xiaoxing.login.R;
import com.xiaoxing.login.R2;
import com.xiaoxing.login.di.component.DaggerForgotPwdSendPhoneComponent;
import com.xiaoxing.login.di.module.ForgotPwdSendPhoneModule;
import com.xiaoxing.login.mvp.contract.ForgotPwdSendPhoneContract;
import com.xiaoxing.login.mvp.presenter.ForgotPwdSendPhonePresenter;
import com.xw.repo.XEditText;

import butterknife.BindView;
import butterknife.OnClick;
import me.jessyan.armscomponent.commonres.utils.ToolbarUtils;
import me.jessyan.armscomponent.commonsdk.core.RouterHub;

import static com.jess.arms.utils.Preconditions.checkNotNull;

@Route(path = RouterHub.XIAO_XING_LOGIN_FORGOT_PWD_SEND_PHONE_ACTIVITY)
public class ForgotPwdSendPhoneActivity extends BaseActivity<ForgotPwdSendPhonePresenter> implements ForgotPwdSendPhoneContract.View {

    @BindView(R2.id.xet_phone)
    XEditText xetPhone;
    @BindView(R2.id.btn_next)
    Button btnNext;

    @Override
    public void setupActivityComponent(@NonNull AppComponent appComponent) {
        DaggerForgotPwdSendPhoneComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .forgotPwdSendPhoneModule(new ForgotPwdSendPhoneModule(this))
                .build()
                .inject(this);
    }

    @Override
    public int initView(@Nullable Bundle savedInstanceState) {
        return R.layout.xiaoxing_login_activity_forgot_pwd_send_phone; //如果你不需要框架帮你设置 setContentView(id) 需要自行设置,请返回 0
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {
        ToolbarUtils.initToolbarTitleBack(this, getString(R.string.xiaoxing_login_verification));

    }

    @Override
    public void showLoading() {

        LoadingDialogUtil.showGifdialog1(getSupportFragmentManager(), R.drawable.loading);

    }

    @Override
    public void hideLoading() {
        LoadingDialogUtil.dismissDialog();
    }

    @NonNull
    private String getPhone() {
        return xetPhone.getText().toString();
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


            if (TextUtils.isEmpty(getPhone())) {

                ArmsUtils.snackbarText("手机号不能为空");
                return;
            } else {

                if (!ArmsUtils.isMobileNO(getPhone())) {
                    ArmsUtils.snackbarText("手机号格式不正确");
                    return;
                }
            }

            ARouter.getInstance().build(RouterHub.XIAO_XING_LOGIN_FORGOT_PWD_VERIFICATION_CODE_ACTIVITY).withString("mPhone", getPhone()).navigation(this);

            killMyself();
        }

    }

}
