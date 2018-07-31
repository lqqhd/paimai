package com.xiaoxing.salesclient.mvp.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.jess.arms.base.BaseActivity;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.utils.ArmsUtils;
import com.jess.arms.utils.DeviceUtils;
import com.xiaoxing.salesclient.di.component.DaggerGuanYuWoMenComponent;
import com.xiaoxing.salesclient.di.module.GuanYuWoMenModule;
import com.xiaoxing.salesclient.mvp.contract.GuanYuWoMenContract;
import com.xiaoxing.salesclient.mvp.presenter.GuanYuWoMenPresenter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import me.jessyan.armscomponent.commonres.utils.CheckVersionUtil;
import me.jessyan.armscomponent.commonres.utils.ToolbarUtils;
import me.jessyan.armscomponent.commonsdk.core.RouterHub;
import me.jessyan.armscomponent.commonsdk.utils.ScreenShotUtil;
import me.jessyan.armscomponent.commonsdk.utils.Utils;
import xiaoxing.com.salesclient.R;
import xiaoxing.com.salesclient.R2;

import static com.jess.arms.utils.Preconditions.checkNotNull;
import static me.jessyan.armscomponent.commonsdk.utils.ScreenShotUtil.boolean_save;


@Route(path = RouterHub.SALES_CLIENT_GUAN_YU_WO_MEN_ACTIVITY)
public class GuanYuWoMenActivity extends BaseActivity<GuanYuWoMenPresenter> implements GuanYuWoMenContract.View {


    @BindView(R2.id.tv_version)
    TextView tvVersion;


    @Override
    public void setupActivityComponent(@NonNull AppComponent appComponent) {
        DaggerGuanYuWoMenComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .guanYuWoMenModule(new GuanYuWoMenModule(this))
                .build()
                .inject(this);
    }

    @Override
    public int initView(@Nullable Bundle savedInstanceState) {
        return R.layout.activity_guan_yu_wo_men; //如果你不需要框架帮你设置 setContentView(id) 需要自行设置,请返回 0
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {

        ToolbarUtils.initToolbarTitleBack(this, "关于我们");

        tvVersion.setText("Version " + DeviceUtils.getVersionCode(this));

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

    @OnClick({
            R2.id.btn_jian_cha_ban_ben
    })
    public void onViewClicked(View view) {

        if (view.getId() == R.id.btn_jian_cha_ban_ben) {
            CheckVersionUtil.checkVersion(this);
        }
    }

}
