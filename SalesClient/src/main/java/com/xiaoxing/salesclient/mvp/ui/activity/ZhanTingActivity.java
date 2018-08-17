package com.xiaoxing.salesclient.mvp.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.jess.arms.base.BaseActivity;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.utils.ArmsUtils;
import com.jess.arms.utils.LogUtils;
import com.xiaoxing.salesclient.di.component.DaggerZhanTingComponent;
import com.xiaoxing.salesclient.di.module.ZhanTingModule;
import com.xiaoxing.salesclient.mvp.contract.ZhanTingContract;
import com.xiaoxing.salesclient.mvp.presenter.ZhanTingPresenter;
import com.xiaoxing.salesclient.mvp.ui.fragment.FragmentZhanTing;

import java.util.ArrayList;

import me.jessyan.armscomponent.commonres.utils.SlidingTabLayoutUtil;
import me.jessyan.armscomponent.commonres.utils.ToolbarUtils;
import me.jessyan.armscomponent.commonsdk.core.RouterHub;
import me.jessyan.armscomponent.commonsdk.utils.Utils;
import xiaoxing.com.salesclient.R;

import static com.jess.arms.utils.Preconditions.checkNotNull;

@Route(path = RouterHub.SALES_CLIENT_ZHAN_TING_ACTIVITY)
public class ZhanTingActivity extends BaseActivity<ZhanTingPresenter> implements ZhanTingContract.View {
    private final String[] mTitles = {"最新", "诚信", "最旺", "排行"};

    @Override
    public void setupActivityComponent(@NonNull AppComponent appComponent) {
        DaggerZhanTingComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .zhanTingModule(new ZhanTingModule(this))
                .build()
                .inject(this);
    }

    @Override
    public int initView(@Nullable Bundle savedInstanceState) {
        return R.layout.sales_client_activity_zhan_ting; //如果你不需要框架帮你设置 setContentView(id) 需要自行设置,请返回 0
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {
        Toolbar toolbar = ToolbarUtils.initToolbarTitleBackWithSearch(this);

        EditText et_search = toolbar.findViewById(R.id.et_search);
        et_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.navigation(ZhanTingActivity.this, RouterHub.XIAO_XING_SEARCH_SearchActivity);
            }
        });
        ArrayList<Fragment> mFragments = new ArrayList<>();
        mFragments.add(FragmentZhanTing.newInstance("sales_volume"));
        mFragments.add(FragmentZhanTing.newInstance(""));
        mFragments.add(FragmentZhanTing.newInstance("sales_volume"));
        mFragments.add(FragmentZhanTing.newInstance("goods_number"));

        SlidingTabLayoutUtil.init(this, mTitles, mFragments);


//        LogUtils.debugInfo("230dp == " + ArmsUtils.dip2px(this, 230));
//        LogUtils.debugInfo("120dp == " + ArmsUtils.dip2px(this, 120));
//        LogUtils.debugInfo("110dp == " + ArmsUtils.dip2px(this, 110));
//        LogUtils.debugInfo("60dp == " + ArmsUtils.dip2px(this, 60));
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
