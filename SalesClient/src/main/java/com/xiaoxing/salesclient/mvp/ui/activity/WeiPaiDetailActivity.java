package com.xiaoxing.salesclient.mvp.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.jess.arms.base.BaseActivity;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.utils.ArmsUtils;
import com.xiaoxing.salesclient.di.component.DaggerWeiPaiDetailComponent;
import com.xiaoxing.salesclient.di.module.WeiPaiDetailModule;
import com.xiaoxing.salesclient.mvp.contract.WeiPaiDetailContract;
import com.xiaoxing.salesclient.mvp.presenter.WeiPaiDetailPresenter;
import com.xiaoxing.salesclient.mvp.ui.entity.BannerItem;
import com.xiaoxing.salesclient.mvp.ui.fragment.FragmentZhanTing;
import com.xiaoxing.salesclient.mvp.utils.GlideImageLoader;
import com.youth.banner.Banner;
import com.youth.banner.listener.OnBannerClickListener;

import java.util.ArrayList;
import java.util.List;

import cn.iwgang.countdownview.CountdownView;
import me.jessyan.armscomponent.commonres.utils.SlidingTabLayoutUtil;
import me.jessyan.armscomponent.commonres.utils.ToolbarUtils;
import me.jessyan.armscomponent.commonsdk.core.RouterHub;
import xiaoxing.com.salesclient.R;

import static com.jess.arms.utils.Preconditions.checkNotNull;

@Route(path = RouterHub.SALES_CLIENT_WEI_PAI_DETAIL_ACTIVITY)
public class WeiPaiDetailActivity extends BaseActivity<WeiPaiDetailPresenter> implements WeiPaiDetailContract.View {


    public static List<BannerItem> BANNER_ITEMS = new ArrayList<BannerItem>() {{
        add(new BannerItem("最后的骑士", R.mipmap.banner_001));
        add(new BannerItem("三生三世十里桃花", R.mipmap.banner_001));
        add(new BannerItem("豆福传", R.mipmap.banner_001));
    }};

    private final String[] mTitles = {"拍品详情", "帮助及保障", "其他拍品"};

    @Override
    public void setupActivityComponent(@NonNull AppComponent appComponent) {
        DaggerWeiPaiDetailComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .weiPaiDetailModule(new WeiPaiDetailModule(this))
                .build()
                .inject(this);
    }

    @Override
    public int initView(@Nullable Bundle savedInstanceState) {
        return R.layout.sales_client_activity_wei_pai_detail; //如果你不需要框架帮你设置 setContentView(id) 需要自行设置,请返回 0
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {

        ToolbarUtils.initToolbarTitleBack(this, "微拍推广详情");


//        Banner banner = findViewById(R.id.convenientBanner);
//
//        banner.setImageLoader(new GlideImageLoader());
//        banner.setImages(BANNER_ITEMS);
//        banner.start();
//
//        banner.setOnBannerClickListener(new OnBannerClickListener() {
//            @Override
//            public void OnBannerClick(int position) {
////                Utils.navigation(WeiPaiDetailActivity.this, RouterHub.SALES_CLIENT_ZHUANCHANGACTIVITY);
//            }
//        });


        ArrayList<Fragment> mFragments = new ArrayList<>();
        mFragments.add(FragmentZhanTing.newInstance(""));
        mFragments.add(FragmentZhanTing.newInstance(""));
        mFragments.add(FragmentZhanTing.newInstance(""));

        SlidingTabLayoutUtil.init(this, mTitles, mFragments);

        initCountdownView();
    }
    private void initCountdownView() {
        CountdownView mCvCountdownViewTest4 = (CountdownView) findViewById(R.id.cv_countdownViewTest4);
        long time4 = (long) 150 * 24 * 60 * 60 * 1000;
        mCvCountdownViewTest4.start(time4);
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
