package com.xiaoxing.seller.mvp.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.Button;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.jess.arms.base.BaseActivity;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.utils.ArmsUtils;
import com.xiaoxing.order.mvp.ui.fragment.FragmentOrderList;
import com.xiaoxing.seller.R;
import com.xiaoxing.seller.R2;
import com.xiaoxing.seller.di.component.DaggerSpecialManagementComponent;
import com.xiaoxing.seller.di.module.SpecialManagementModule;
import com.xiaoxing.seller.mvp.contract.SpecialManagementContract;
import com.xiaoxing.seller.mvp.presenter.SpecialManagementPresenter;

import java.util.ArrayList;

import butterknife.BindView;
import me.jessyan.armscomponent.commonres.utils.SlidingTabLayoutUtil;
import me.jessyan.armscomponent.commonres.utils.ToolbarUtils;
import me.jessyan.armscomponent.commonsdk.core.RouterHub;
import me.jessyan.armscomponent.commonsdk.utils.Utils;

import static com.jess.arms.utils.Preconditions.checkNotNull;

@Route(path = RouterHub.SELLER_CLIENT_SPECIAL_MANAGEMENT_ACTIVITY)
public class SpecialManagementActivity extends BaseActivity<SpecialManagementPresenter> implements SpecialManagementContract.View {

    private final String[] mTitles = {"全部", "未发布", "已发布"};

    @BindView(R2.id.btnRight)
    Button mBtnRight;
    private View.OnClickListener mRightListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Utils.navigation(SpecialManagementActivity.this, RouterHub.SELLER_CLIENT_SPECIAL_MANAGEMENT_ADD_ACTIVITY);

        }
    };


    @Override
    public void setupActivityComponent(@NonNull AppComponent appComponent) {
        DaggerSpecialManagementComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .specialManagementModule(new SpecialManagementModule(this))
                .build()
                .inject(this);
    }

    @Override
    public int initView(@Nullable Bundle savedInstanceState) {
        return R.layout.public_activity_top_tab_title_right_button; //如果你不需要框架帮你设置 setContentView(id) 需要自行设置,请返回 0
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {

        ToolbarUtils.initToolbarTitleBackWithRightButton(this, getString(R.string.seller_client_exhibition_management), mRightListener);

        ArrayList<Fragment> mFragments = new ArrayList<>();
        mFragments.add(new FragmentOrderList());
        mFragments.add(new FragmentOrderList());
        mFragments.add(new FragmentOrderList());

        SlidingTabLayoutUtil.init(this, mTitles, mFragments);
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
}
