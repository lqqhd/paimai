package com.xiaoxing.salesclient.mvp.ui;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.jess.arms.base.BaseActivity;
import com.jess.arms.di.component.AppComponent;
import com.uuch.adlibrary.AdConstant;
import com.uuch.adlibrary.AdManager;
import com.uuch.adlibrary.bean.AdInfo;
import com.uuch.adlibrary.utils.DisplayUtil;
import com.xiaoxing.salesclient.mvp.ui.viewpager.MyViewPagerAdapter;

import java.util.ArrayList;
import java.util.List;

import me.jessyan.armscomponent.commonres.utils.CheckVersionUtil;
import me.jessyan.armscomponent.commonsdk.core.RouterHub;
import me.jessyan.armscomponent.commonsdk.utils.Utils;
import me.majiajie.pagerbottomtabstrip.NavigationController;
import me.majiajie.pagerbottomtabstrip.PageNavigationView;
import me.majiajie.pagerbottomtabstrip.SpecialTab;
import me.majiajie.pagerbottomtabstrip.SpecialTabRound;
import me.majiajie.pagerbottomtabstrip.item.BaseTabItem;
import xiaoxing.com.salesclient.R;

@Route(path = RouterHub.SALES_CLIENT_PAI_MAI_MAIN_ACTIVITY)
public class PaiMaiMainActivity extends BaseActivity {

    private static PaiMaiMainActivity instance;
    private ViewPager viewPager;
    private List<AdInfo> advList = null;

    @Override
    public void setupActivityComponent(@NonNull AppComponent appComponent) {

    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fresco.initialize(this);
        initDisplayOpinion();
        initAdData();
        showDialog();
    }

    /**
     * 初始化数据
     */
    private void initAdData() {
        advList = new ArrayList<>();
        AdInfo adInfo = new AdInfo();
        adInfo.setActivityImg("https://raw.githubusercontent.com/yipianfengye/android-adDialog/master/images/testImage1.png");
        advList.add(adInfo);

        adInfo = new AdInfo();
        adInfo.setActivityImg("https://raw.githubusercontent.com/yipianfengye/android-adDialog/master/images/testImage2.png");
        advList.add(adInfo);
    }

    private void initDisplayOpinion() {
        DisplayMetrics dm = getResources().getDisplayMetrics();
        DisplayUtil.density = dm.density;
        DisplayUtil.densityDPI = dm.densityDpi;
        DisplayUtil.screenWidthPx = dm.widthPixels;
        DisplayUtil.screenhightPx = dm.heightPixels;
        DisplayUtil.screenWidthDip = DisplayUtil.px2dip(getApplicationContext(), dm.widthPixels);
        DisplayUtil.screenHightDip = DisplayUtil.px2dip(getApplicationContext(), dm.heightPixels);
    }

    private void showDialog() {
        AdManager adManager = new AdManager(this, advList);

        adManager.setOnImageClickListener(new AdManager.OnImageClickListener() {
            @Override
            public void onImageClick(View view, AdInfo advInfo) {
                Toast.makeText(PaiMaiMainActivity.this, "您点击了ViewPagerItem...", Toast.LENGTH_SHORT).show();

                Utils.navigation(PaiMaiMainActivity.this, RouterHub.SALES_CLIENT_HUO_DONG_ACTIVITY);

            }
        })
                .setPadding(100)
                .setWidthPerHeight(0.5f)
                .showAdDialog(AdConstant.ANIM_UP_TO_DOWN);
    }

    @Override
    public int initView(@Nullable Bundle savedInstanceState) {
        return R.layout.sales_client_activity_pai_mai_main;
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {
        instance = this;
        CheckVersionUtil.checkVersion(this);
        PageNavigationView tab = (PageNavigationView) findViewById(R.id.tab);

        NavigationController navigationController = tab.custom()
                .addItem(newItem(R.mipmap.home_icon, R.mipmap.home_active_icon, "首页"))
                .addItem(newItem(R.mipmap.cate_icon, R.mipmap.cate_active_icon, "分类"))
                .addItem(newRoundItem(R.mipmap.fb_active_icon, R.mipmap.fb_active_icon, "发布"))
                .addItem(newItem(R.mipmap.sns_icon, R.mipmap.sns_active_icon, "消息"))
                .addItem(newItem(R.mipmap.mem_icon, R.mipmap.mem_active_icon, "我的"))
                .build();

        viewPager = (ViewPager) findViewById(R.id.viewPager);
        viewPager.setAdapter(new MyViewPagerAdapter(getSupportFragmentManager(), navigationController.getItemCount()));
        viewPager.setOffscreenPageLimit(5);
        //自动适配ViewPager页面切换
        navigationController.setupWithViewPager(viewPager);
    }


    /**
     * 正常tab
     */
    private BaseTabItem newItem(int drawable, int checkedDrawable, String text) {
        SpecialTab mainTab = new SpecialTab(this);
        mainTab.initialize(drawable, checkedDrawable, text);
        mainTab.setTextDefaultColor(getResources().getColor(R.color.sales_client_menu_normal_color));
        mainTab.setTextCheckedColor(getResources().getColor(R.color.sales_client_menu_selected_color));
        return mainTab;
    }

    /**
     * 圆形tab
     */
    private BaseTabItem newRoundItem(int drawable, int checkedDrawable, String text) {
        SpecialTabRound mainTab = new SpecialTabRound(this);
        mainTab.initialize(drawable, checkedDrawable, text);
        mainTab.setTextDefaultColor(getResources().getColor(R.color.sales_client_menu_normal_color));
        mainTab.setTextCheckedColor(getResources().getColor(R.color.sales_client_menu_selected_color));
        return mainTab;
    }

    public static PaiMaiMainActivity getInstance() {

        return instance;
    }

    public void setCurrentItem(int postion) {
        viewPager.setCurrentItem(postion);
    }
}
