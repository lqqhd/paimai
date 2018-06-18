package com.xiaoxing.salesclient.mvp.ui;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.widget.TextView;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.allenliu.versionchecklib.v2.AllenVersionChecker;
import com.allenliu.versionchecklib.v2.builder.DownloadBuilder;
import com.allenliu.versionchecklib.v2.builder.UIData;
import com.allenliu.versionchecklib.v2.callback.CustomVersionDialogListener;
import com.allenliu.versionchecklib.v2.callback.RequestVersionListener;
import com.jess.arms.base.BaseActivity;
import com.jess.arms.di.component.AppComponent;
import com.xiaoxing.salesclient.mvp.ui.viewpager.MyViewPagerAdapter;

import cn.addapp.pickers.common.BaseDialog;
import me.jessyan.armscomponent.commonres.utils.CheckVersionUtil;
import me.jessyan.armscomponent.commonsdk.core.RouterHub;
import me.majiajie.pagerbottomtabstrip.NavigationController;
import me.majiajie.pagerbottomtabstrip.PageNavigationView;
import me.majiajie.pagerbottomtabstrip.SpecialTab;
import me.majiajie.pagerbottomtabstrip.SpecialTabRound;
import me.majiajie.pagerbottomtabstrip.item.BaseTabItem;
import xiaoxing.com.salesclient.R;

@Route(path = RouterHub.SALES_CLIENT_PAIMAIMAINACTIVITY)
public class PaiMaiMainActivity extends BaseActivity {

    private static PaiMaiMainActivity instance;
    private ViewPager viewPager;

    @Override
    public void setupActivityComponent(@NonNull AppComponent appComponent) {

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
