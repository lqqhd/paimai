package com.xiaoxing.seller.mvp.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.InputType;
import android.view.View;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.jess.arms.base.BaseActivity;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.utils.ArmsUtils;
import com.qmuiteam.qmui.widget.dialog.QMUIDialog;
import com.qmuiteam.qmui.widget.dialog.QMUIDialogAction;
import com.xiaoxing.seller.R;
import com.xiaoxing.seller.R2;
import com.xiaoxing.seller.di.component.DaggerSecurityCenterComponent;
import com.xiaoxing.seller.di.module.SecurityCenterModule;
import com.xiaoxing.seller.mvp.contract.SecurityCenterContract;
import com.xiaoxing.seller.mvp.presenter.SecurityCenterPresenter;

import butterknife.ButterKnife;
import butterknife.OnClick;
import me.jessyan.armscomponent.commonres.utils.ToolbarUtils;
import me.jessyan.armscomponent.commonsdk.core.RouterHub;

import static com.jess.arms.utils.Preconditions.checkNotNull;

@Route(path = RouterHub.SELLER_CLIENT_SECURITY_CENTER_ACTIVITY)
public class SecurityCenterActivity extends BaseActivity<SecurityCenterPresenter> implements SecurityCenterContract.View {

    private int mCurrentDialogStyle = com.qmuiteam.qmui.R.style.QMUI_Dialog;

    @Override
    public void setupActivityComponent(@NonNull AppComponent appComponent) {
        DaggerSecurityCenterComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .securityCenterModule(new SecurityCenterModule(this))
                .build()
                .inject(this);
    }

    @Override
    public int initView(@Nullable Bundle savedInstanceState) {
        return R.layout.activity_security_center; //如果你不需要框架帮你设置 setContentView(id) 需要自行设置,请返回 0
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {
        ToolbarUtils.initToolbarTitleBack(this, "安全中心");
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }

    @OnClick({R2.id.rl_iu_gai_deng_lu_mi_ma, R2.id.rl_zhi_fu_mi_ma, R2.id.rl_xiu_gai_shou_ji_hao})
    public void onClick(View view) {
        int i = view.getId();
        if (i == R.id.rl_iu_gai_deng_lu_mi_ma) {
            showEditTextDialog("修改登录密码", "请输入登录密码");
        } else if (i == R.id.rl_zhi_fu_mi_ma) {
            showEditTextDialog("修改支付密码", "请输入支付密码");
        } else if (i == R.id.rl_xiu_gai_shou_ji_hao) {
            showEditTextDialog("修改手机号码", "请输入手机号码");
        }
    }


    private void showEditTextDialog(String title, String hint) {
        final QMUIDialog.EditTextDialogBuilder builder = new QMUIDialog.EditTextDialogBuilder(SecurityCenterActivity.this);
        builder.setTitle(title)
                .setPlaceholder(hint)
                .setInputType(InputType.TYPE_CLASS_TEXT)
                .addAction("取消", new QMUIDialogAction.ActionListener() {
                    @Override
                    public void onClick(QMUIDialog dialog, int index) {
                        dialog.dismiss();
                    }
                })
                .addAction("确定", new QMUIDialogAction.ActionListener() {
                    @Override
                    public void onClick(QMUIDialog dialog, int index) {
                        CharSequence text = builder.getEditText().getText();
                        if (text != null && text.length() > 0) {
                            Toast.makeText(SecurityCenterActivity.this, "您的昵称: " + text, Toast.LENGTH_SHORT).show();
                            dialog.dismiss();
                        } else {
                            Toast.makeText(SecurityCenterActivity.this, "请填入昵称", Toast.LENGTH_SHORT).show();
                        }
                    }
                })
                .create(mCurrentDialogStyle).show();
    }

}
