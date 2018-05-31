package com.xiaoxing.address.mvp.ui.activity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.jess.arms.base.BaseActivity;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.utils.ArmsUtils;
import com.scwang.smartrefresh.layout.api.RefreshFooter;
import com.scwang.smartrefresh.layout.api.RefreshHeader;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.scwang.smartrefresh.layout.header.ClassicsHeader;
import com.scwang.smartrefresh.layout.listener.OnMultiPurposeListener;
import com.xiaoxing.address.R;
import com.xiaoxing.address.di.component.DaggerAddressListComponent;
import com.xiaoxing.address.di.module.AddressListModule;
import com.xiaoxing.address.mvp.contract.AddressListContract;
import com.xiaoxing.address.mvp.presenter.AddressListPresenter;
import com.xiaoxing.address.mvp.ui.adapter.DiZhiAdapter;
import com.xiaoxing.address.mvp.ui.entity.AddressList;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Random;

import ezy.ui.layout.LoadingLayout;
import me.jessyan.armscomponent.commonres.utils.ToolbarUtils;
import me.jessyan.armscomponent.commonsdk.core.RouterHub;
import me.jessyan.armscomponent.commonsdk.utils.DynamicTimeFormat;
import me.jessyan.armscomponent.commonsdk.utils.Utils;

import static android.support.v7.widget.DividerItemDecoration.VERTICAL;
import static com.jess.arms.utils.Preconditions.checkNotNull;

@Route(path = RouterHub.XIAO_XING_ADDRESS_ADDRESSLISTACTIVITY)
public class AddressListActivity extends BaseActivity<AddressListPresenter> implements AddressListContract.View {
    private RecyclerView mRecyclerView;
    private RefreshLayout mRefreshLayout;
    private ClassicsHeader mClassicsHeader;
    private Drawable mDrawableProgress;
    private static boolean isFirstEnter = true;
    private LoadingLayout mLoadingLayout;
    private DiZhiAdapter mAdapter;
    private View.OnClickListener mRightListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Utils.navigation(AddressListActivity.this, RouterHub.XIAO_XING_ADDRESS_ADDRESSADDACTIVITY);
        }
    };

    @Override
    public void setupActivityComponent(@NonNull AppComponent appComponent) {
        DaggerAddressListComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .addressListModule(new AddressListModule(this))
                .build()
                .inject(this);
    }

    @Override
    public int initView(@Nullable Bundle savedInstanceState) {
        return R.layout.activity_address_list; //如果你不需要框架帮你设置 setContentView(id) 需要自行设置,请返回 0
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {
        Toolbar toolbar = ToolbarUtils.initToolbarTitleBackWithRightButton(this, getString(R.string.address_list), mRightListener);

        mRefreshLayout = (RefreshLayout) findViewById(R.id.refreshLayout);

        int delta = new Random().nextInt(7 * 24 * 60 * 60 * 1000);
        mClassicsHeader = (ClassicsHeader) mRefreshLayout.getRefreshHeader();
        mClassicsHeader.setLastUpdateTime(new Date(System.currentTimeMillis() - delta));
        mClassicsHeader.setTimeFormat(new SimpleDateFormat("更新于 MM-dd HH:mm", Locale.CHINA));
        mClassicsHeader.setTimeFormat(new DynamicTimeFormat("更新于 %s"));

//        mDrawableProgress = mClassicsHeader.getProgressView().getDrawable();
        mDrawableProgress = ((ImageView) mClassicsHeader.findViewById(ClassicsHeader.ID_IMAGE_PROGRESS)).getDrawable();
        if (mDrawableProgress instanceof LayerDrawable) {
            mDrawableProgress = ((LayerDrawable) mDrawableProgress).getDrawable(0);
        }
        View view = findViewById(R.id.recyclerView);
        if (view instanceof RecyclerView) {
            RecyclerView recyclerView = (RecyclerView) view;
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            recyclerView.addItemDecoration(new DividerItemDecoration(this, VERTICAL));
            recyclerView.setItemAnimator(new DefaultItemAnimator());
            recyclerView.setAdapter(mAdapter = new DiZhiAdapter(loadModels()));
            mRecyclerView = recyclerView;
        }

        if (isFirstEnter) {
            isFirstEnter = false;
            //触发自动刷新
            mRefreshLayout.autoRefresh();
        }

    }

    /**
     * 模拟数据
     */
    private List<AddressList> loadModels() {
        List<AddressList> addressLists = new ArrayList<>();

        for (int i = 0; i < 5; i++) {

            AddressList addressList = new AddressList();
            addressList.setName("name" + i);
            addressList.setAddress("address" + i);
            addressList.setPhone("1580000000" + i);
            addressLists.add(addressList);
        }


        return addressLists;
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
