package com.xiaoxing.login.mvp.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.widget.Button;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.jess.arms.base.BaseActivity;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.utils.ArmsUtils;
import com.xiaoxing.gifloadingview.LoadingDialogUtil;
import com.xiaoxing.login.R;
import com.xiaoxing.login.R2;
import com.xiaoxing.login.di.component.DaggerSetNewPasswordComponent;
import com.xiaoxing.login.di.module.SetNewPasswordModule;
import com.xiaoxing.login.mvp.contract.SetNewPasswordContract;
import com.xiaoxing.login.mvp.model.entity.UserRegister;
import com.xiaoxing.login.mvp.model.entity.UserSetpassword;
import com.xiaoxing.login.mvp.presenter.SetNewPasswordPresenter;
import com.xw.repo.XEditText;

import butterknife.BindView;
import butterknife.OnClick;
import me.jessyan.armscomponent.commonres.utils.ToolbarUtils;
import me.jessyan.armscomponent.commonsdk.core.RouterHub;
import me.jessyan.armscomponent.commonsdk.utils.SnackbarUtils;

import static com.jess.arms.utils.Preconditions.checkNotNull;

@Route(path = RouterHub.XIAO_XING_LOGIN_SET_NEW_PASSWORD_ACTIVITY)
public class SetNewPasswordActivity extends BaseActivity<SetNewPasswordPresenter> implements SetNewPasswordContract.View {
    @BindView(R2.id.xet_new_password)
    XEditText xetNewPassword;
    @BindView(R2.id.xet_new_password_again)
    XEditText xetNewPasswordAgain;
    @BindView(R2.id.btn_ok)
    Button btnOk;

    @Autowired
    String mPhone;

    @Override
    public void setupActivityComponent(@NonNull AppComponent appComponent) {
        DaggerSetNewPasswordComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .setNewPasswordModule(new SetNewPasswordModule(this))
                .build()
                .inject(this);
        ARouter.getInstance().inject(this);
    }

    @Override
    public int initView(@Nullable Bundle savedInstanceState) {
        return R.layout.xiaoxing_login_activity_set_new_password; //如果你不需要框架帮你设置 setContentView(id) 需要自行设置,请返回 0
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {
        ToolbarUtils.initToolbarTitleBack(this, getString(R.string.xiaoxing_login_set_pwd));
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

    private void wanCheng() {

        if (TextUtils.isEmpty(getNewPassword())) {

            SnackbarUtils.Short(btnOk, "新密码不能为空").info().show();
            return;
        }
        if (TextUtils.isEmpty(getNewPasswordAgain())) {

            SnackbarUtils.Short(btnOk, "确认密码不能为空").info().show();
            return;
        }

        if (!getNewPassword().equals(getNewPasswordAgain())) {
            SnackbarUtils.Short(btnOk, "两次密码输入的不一致，请重新输入").info().show();
            return;
        }

        mPresenter.userSetpassword(mPhone, getNewPassword());
    }

    @NonNull
    private String getNewPasswordAgain() {
        return xetNewPasswordAgain.getText().toString();
    }

    @NonNull
    private String getNewPassword() {
        return xetNewPassword.getText().toString();
    }


    @OnClick(R2.id.btn_ok)
    public void onClick() {
        wanCheng();

    }


    @Override
    public void userSetpasswordSuccess(UserSetpassword userSetpassword) {
        SnackbarUtils.Short(btnOk, userSetpassword.getMsg()).info().show();
        if (userSetpassword.getCode() == 200)
            killMyself();
    }
}
