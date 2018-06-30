package com.xiaoxing.login.mvp.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.jess.arms.base.BaseActivity;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.utils.ArmsUtils;
import com.xiaoxing.login.R;
import com.xiaoxing.login.R2;
import com.xiaoxing.login.di.component.DaggerRegisterVerificationCodeComponent;
import com.xiaoxing.login.di.module.RegisterVerificationCodeModule;
import com.xiaoxing.login.mvp.contract.RegisterVerificationCodeContract;
import com.xiaoxing.login.mvp.presenter.RegisterVerificationCodePresenter;
import com.xiaoxing.login.mvp.ui.view.CountDownButton;
import com.xw.repo.XEditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
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


    private String mPhone = "";

    @Override
    public void setupActivityComponent(@NonNull AppComponent appComponent) {
        DaggerRegisterVerificationCodeComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .registerVerificationCodeModule(new RegisterVerificationCodeModule(this))
                .build()
                .inject(this);
    }

    @Override
    public int initView(@Nullable Bundle savedInstanceState) {
        return R.layout.xiaoxing_login_activity_register_verification_code; //如果你不需要框架帮你设置 setContentView(id) 需要自行设置,请返回 0
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {
        ToolbarUtils.initToolbarTitleBack(this, getString(R.string.xiaoxing_login_verification));


        Bundle bundle = getIntent().getExtras();
        mPhone = bundle.getString(PHONE);
        tvPhone.setText(mPhone);
        startCountdown();
    }

    private void startCountdown() {
        cdBtn.startCountdown();
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

    @OnClick({R2.id.btn_next})
    public void onViewClicked(View view) {
        if (view.getId() == R.id.btn_next) {
            next();
        }
    }

    private void next() {

        if (TextUtils.isEmpty(xetCode.getText().toString())) {
            SnackbarUtils.Short(btnNext, "验证码不能为空").info().show();
            return;
        }
        Utils.navigation(RegisterVerificationCodeActivity.this, RouterHub.XIAO_XING_LOGIN_REGISTER_SET_PWD_ACTIVITY);
        killMyself();
    }


    @OnClick(R2.id.cd_btn)
    public void onClick() {
        startCountdown();
    }
}
