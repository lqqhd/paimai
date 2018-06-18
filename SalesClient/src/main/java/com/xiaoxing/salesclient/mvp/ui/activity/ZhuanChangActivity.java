package com.xiaoxing.salesclient.mvp.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.jess.arms.base.BaseActivity;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.utils.ArmsUtils;
import com.xiaoxing.salesclient.di.component.DaggerZhuanChangComponent;
import com.xiaoxing.salesclient.di.module.ZhuanChangModule;
import com.xiaoxing.salesclient.mvp.contract.ZhuanChangContract;
import com.xiaoxing.salesclient.mvp.presenter.ZhuanChangPresenter;
import com.xiaoxing.salesclient.mvp.ui.adapter.TagAdapter;
import com.xiaoxing.salesclient.mvp.ui.fragment.FragmentAllZhuanChang;
import com.xiaoxing.salesclient.mvp.ui.fragment.FragmentNavigationList;
import com.xiaoxing.salesclient.mvp.ui.fragment.FragmentReMenPaiMai;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;
import me.jessyan.armscomponent.commonres.utils.SlidingTabLayoutUtil;
import me.jessyan.armscomponent.commonres.utils.ToolbarUtils;
import me.jessyan.armscomponent.commonres.view.flowtag.FlowTagLayout;
import me.jessyan.armscomponent.commonres.view.flowtag.OnTagSelectListener;
import me.jessyan.armscomponent.commonsdk.core.RouterHub;
import me.jessyan.armscomponent.commonsdk.utils.Utils;
import xiaoxing.com.salesclient.R;
import xiaoxing.com.salesclient.R2;

import static com.jess.arms.utils.Preconditions.checkNotNull;

@Route(path = RouterHub.SALES_CLIENT_ZHUANCHANGACTIVITY)
public class ZhuanChangActivity extends BaseActivity<ZhuanChangPresenter> implements ZhuanChangContract.View {


    private final String[] mTitles = {"所有专场", "热门拍品", "我的关注", "筛选"};

    @BindView(R2.id.tv_shai_xuan)
    TextView mTvShaiXuan;
    @BindView(R2.id.tv_chuang_jian_name)
    TextView mTvChuangJianName;
    @BindView(R2.id.rl_chuan_jian)
    RelativeLayout mRlChuangJian;

    @BindView(R2.id.drawer_layout)
    DrawerLayout drawer;
    @BindView(R2.id.nav_view)
    NavigationView navigationView;
    private FlowTagLayout mMobileFlowTagLayout;
    private TagAdapter mMobileTagAdapter;

    @Override
    public void setupActivityComponent(@NonNull AppComponent appComponent) {

        DaggerZhuanChangComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .zhuanChangModule(new ZhuanChangModule(this))
                .build()
                .inject(this);
    }

    @Override
    public int initView(@Nullable Bundle savedInstanceState) {
        return R.layout.sales_client_activity_zhuan_chang; //如果你不需要框架帮你设置 setContentView(id) 需要自行设置,请返回 0
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {
        Toolbar toolbar = ToolbarUtils.initToolbarTitleBackWithSearch(this);
        mTvChuangJianName.setText("创建专场");
        mRlChuangJian.setVisibility(View.VISIBLE);
        EditText et_search = toolbar.findViewById(R.id.et_search);
        et_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.navigation(ZhuanChangActivity.this, RouterHub.XIAO_XING_SEARCH_SearchActivity);
            }
        });

        ArrayList<Fragment> mFragments = new ArrayList<>();
        mFragments.add(new FragmentAllZhuanChang());
        mFragments.add(new FragmentReMenPaiMai());
        mFragments.add(new FragmentReMenPaiMai());

        SlidingTabLayoutUtil.init(this, mTitles, mFragments);


//        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
//                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
//        drawer.addDrawerListener(toggle);
//        toggle.syncState();

        initTag();

    }

    private void initTag() {
        View headerLayout = navigationView.inflateHeaderView(R.layout.sales_client_shai_xuan);

        Button btn_chong_zhi = (Button) headerLayout.findViewById(R.id.btn_chong_zhi);
        Button btn_que_ding = (Button) headerLayout.findViewById(R.id.btn_que_ding);
        btn_chong_zhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMobileFlowTagLayout.clearAllOption();
            }
        });
        btn_que_ding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawer.closeDrawer(GravityCompat.END);
            }
        });


        mMobileFlowTagLayout = (FlowTagLayout) headerLayout.findViewById(R.id.mobile_flow_layout);
        //移动研发标签
        mMobileTagAdapter = new TagAdapter<>(this);
        mMobileFlowTagLayout.setTagCheckedMode(FlowTagLayout.FLOW_TAG_CHECKED_MULTI);
        mMobileFlowTagLayout.setAdapter(mMobileTagAdapter);
        mMobileFlowTagLayout.setOnTagSelectListener(new OnTagSelectListener() {
            @Override
            public void onItemSelect(FlowTagLayout parent, List<Integer> selectedList) {
                if (selectedList != null && selectedList.size() > 0) {
                    StringBuilder sb = new StringBuilder();

                    for (int i : selectedList) {
                        sb.append(parent.getAdapter().getItem(i));
                        sb.append(":");
                    }
                    Snackbar.make(parent, "" + sb.toString(), Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                } else {
                    Snackbar.make(parent, "没有选择标签", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }
            }
        });

        initMobileData();

    }

    private void initMobileData() {
        List<String> dataSource = new ArrayList<>();

        for (int i = 0; i < FragmentNavigationList.cates.length; i++) {
            dataSource.add(FragmentNavigationList.cates[i]);
        }
        mMobileTagAdapter.onlyAddAll(dataSource);
    }


    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.END)) {
            drawer.closeDrawer(GravityCompat.END);
        } else {
            super.onBackPressed();
        }
    }


    @OnClick(R2.id.tv_shai_xuan)
    void shaiXuan() {
        drawer.openDrawer(GravityCompat.END);
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
