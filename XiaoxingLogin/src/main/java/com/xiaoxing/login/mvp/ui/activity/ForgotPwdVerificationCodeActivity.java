package com.xiaoxing.login.mvp.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
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
import com.xiaoxing.login.di.component.DaggerForgotPwdVerificationCodeComponent;
import com.xiaoxing.login.di.module.ForgotPwdVerificationCodeModule;
import com.xiaoxing.login.mvp.contract.ForgotPwdVerificationCodeContract;
import com.xiaoxing.login.mvp.model.entity.SmsSend;
import com.xiaoxing.login.mvp.presenter.ForgotPwdVerificationCodePresenter;
import com.xiaoxing.login.mvp.ui.view.CountDownButton;
import com.xw.repo.XEditText;

import butterknife.BindView;
import butterknife.OnClick;
import me.jessyan.armscomponent.commonres.utils.ToolbarUtils;
import me.jessyan.armscomponent.commonsdk.core.RouterHub;
import me.jessyan.armscomponent.commonsdk.utils.SnackbarUtils;
import me.jessyan.armscomponent.commonsdk.utils.Utils;

import static com.jess.arms.utils.Preconditions.checkNotNull;

@Route(path = RouterHub.XIAO_XING_LOGIN_FORGOT_PWD_VERIFICATION_CODE_ACTIVITY)
public class ForgotPwdVerificationCodeActivity extends BaseActivity<ForgotPwdVerificationCodePresenter> implements ForgotPwdVerificationCodeContract.View {

    @BindView(R2.id.tv_phone)
    TextView tvPhone;
    @BindView(R2.id.xet_code)
    XEditText xetCode;
    @BindView(R2.id.cd_btn)
    CountDownButton cdBtn;
    @BindView(R2.id.btn_next)
    Button btnNext;

    @Autowired
    String mPhone;

    private String mCode = "";

    @Override
    public void setupActivityComponent(@NonNull AppComponent appComponent) {
        DaggerForgotPwdVerificationCodeComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .forgotPwdVerificationCodeModule(new ForgotPwdVerificationCodeModule(this))
                .build()
                .inject(this);
        ARouter.getInstance().inject(this);
    }

    @Override
    public int initView(@Nullable Bundle savedInstanceState) {
        return R.layout.xiaoxing_login_activity_forgot_pwd_verification_code; //如果你不需要框架帮你设置 setContentView(id) 需要自行设置,请返回 0
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {
        ToolbarUtils.initToolbarTitleBack(this, getString(R.string.xiaoxing_login_verification));
        tvPhone.setText(mPhone);
        startCountdown();

    }

    private void smsSend() {
        if (!TextUtils.isEmpty(mCode)) {
            mPresenter.smsSend(mPhone, mCode);
        }
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

        LoadingDialogUtil.showGifdialog1(getSupportFragmentManager(), R.drawable.loading);
    }

    @Override
    public void hideLoading() {
        LoadingDialogUtil.dismissDialog();
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
            ArmsUtils.snackbarText("验证码不能为空");
            return;
        }
        if (getCode().equals(mCode)) {

            ARouter.getInstance().build(RouterHub.XIAO_XING_LOGIN_SET_NEW_PASSWORD_ACTIVITY).withString("mPhone", mPhone).navigation(this);

            killMyself();
        } else {
            ArmsUtils.snackbarText("验证码错误，请重新输入");
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

    @Override
    public void smsSendSuccess(SmsSend smsSend) {
        ArmsUtils.snackbarText(smsSend.getMsg());
    }

}
