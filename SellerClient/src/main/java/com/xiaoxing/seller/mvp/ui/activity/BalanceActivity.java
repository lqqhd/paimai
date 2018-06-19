package com.xiaoxing.seller.mvp.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.jess.arms.base.BaseActivity;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.utils.ArmsUtils;
import com.xiaoxing.seller.R;
import com.xiaoxing.seller.R2;
import com.xiaoxing.seller.di.component.DaggerBalanceComponent;
import com.xiaoxing.seller.di.module.BalanceModule;
import com.xiaoxing.seller.mvp.contract.BalanceContract;
import com.xiaoxing.seller.mvp.presenter.BalancePresenter;

import butterknife.OnClick;
import me.jessyan.armscomponent.commonres.utils.ToolbarUtils;
import me.jessyan.armscomponent.commonsdk.core.RouterHub;
import me.jessyan.armscomponent.commonsdk.utils.Utils;

import static com.jess.arms.utils.Preconditions.checkNotNull;

@Route(path = RouterHub.SELLER_CLIENT_BALANCE_ACTIVITY)
public class BalanceActivity extends BaseActivity<BalancePresenter> implements BalanceContract.View {

    @Override
    public void setupActivityComponent(@NonNull AppComponent appComponent) {
        DaggerBalanceComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .balanceModule(new BalanceModule(this))
                .build()
                .inject(this);
    }

    @Override
    public int initView(@Nullable Bundle savedInstanceState) {
        return R.layout.seller_client_activity_balance; //如果你不需要框架帮你设置 setContentView(id) 需要自行设置,请返回 0
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {
        ToolbarUtils.initToolbarTitleBack(this, getString(R.string.seller_client_balance));
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


    @OnClick({R2.id.rl_wo_de_zi_chan, R2.id.rl_chong_zhi, R2.id.rl_ti_xian, R2.id.tl_yin_hang_ka, R2.id.rl_zhi_fu_an_quan, R2.id.rl_xiao_bao_jin})
    public void onViewClicked(View view) {

        if (view.getId() == R.id.rl_wo_de_zi_chan) {
            Utils.navigation(BalanceActivity.this, RouterHub.SELLER_CLIENT_BALANCE_DETAILS_ACTIVITY);
        } else if (view.getId() == R.id.rl_chong_zhi) {
            Utils.navigation(BalanceActivity.this, RouterHub.SELLER_CLIENT_BALANCE_RECHARGE_ACTIVITY);
        } else if (view.getId() == R.id.rl_ti_xian) {
            Utils.navigation(BalanceActivity.this, RouterHub.SELLER_CLIENT_BALANCE_WITH_DRAW_LOGIN_ACTIVITY);
        } else if (view.getId() == R.id.rl_xiao_bao_jin) {
            Utils.navigation(BalanceActivity.this, RouterHub.SELLER_CLIENT_BALANCE_XIAO_BAO_JIN_ACTIVITY);
        } else if (view.getId() == R.id.tl_yin_hang_ka) {
            Utils.navigation(BalanceActivity.this, RouterHub.SELLER_CLIENT_BALANCE_ADD_BANK_CARD_LIST_ACTIVITY);
        } else if (view.getId() == R.id.rl_zhi_fu_an_quan) {
            Utils.navigation(BalanceActivity.this, RouterHub.SELLER_CLIENT_BALANCE_PAYMENT_SECURITY_ACTIVITY);
        }

    }
}
