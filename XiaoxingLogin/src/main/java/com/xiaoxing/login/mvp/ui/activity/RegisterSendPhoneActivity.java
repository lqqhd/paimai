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
import com.alibaba.android.arouter.launcher.ARouter;
import com.jess.arms.base.BaseActivity;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.utils.ArmsUtils;
import com.xiaoxing.gifloadingview.LoadingDialogUtil;
import com.xiaoxing.login.R;
import com.xiaoxing.login.R2;
import com.xiaoxing.login.di.component.DaggerRegisterSendPhoneComponent;
import com.xiaoxing.login.di.module.RegisterSendPhoneModule;
import com.xiaoxing.login.mvp.contract.RegisterSendPhoneContract;
import com.xiaoxing.login.mvp.model.entity.UserCheckphone;
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

            if (!ArmsUtils.isMobileNO(getPhone())) {
                SnackbarUtils.Short(btnNext, "手机号格式不正确").info().show();
                return;
            }
        }

        if (cb.isChecked() == false) {
            SnackbarUtils.Short(btnNext, "请先阅读协议").info().show();
            return;
        }

        mPresenter.userCheckphone(getPhone());


    }

    @NonNull
    private String getPhone() {
        return xetPhone.getText().toString();
    }


    @Override
    public void userCheckphoneSuccess(UserCheckphone userCheckphone) {

        if (userCheckphone.getCode() == 200) {

            Bundle bundle = new Bundle();
            bundle.putString(PHONE, getPhone());

            ARouter.getInstance().build(RouterHub.XIAO_XING_LOGIN_REGISTER_VERIFICATION_CODEA_CTIVITY).withString("mPhone",getPhone()).navigation(this);

//            Utils.navigation(RegisterSendPhoneActivity.this, RouterHub.XIAO_XING_LOGIN_REGISTER_VERIFICATION_CODEA_CTIVITY, bundle);
            killMyself();
        } else {
            SnackbarUtils.Short(btnNext, userCheckphone.getMsg()).info().show();
        }
    }
}
