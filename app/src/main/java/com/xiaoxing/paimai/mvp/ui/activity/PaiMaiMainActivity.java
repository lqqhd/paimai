package com.xiaoxing.paimai.mvp.ui.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.jess.arms.base.BaseActivity;
import com.jess.arms.di.component.AppComponent;
import com.xiaoxing.paimai.R;
import com.xiaoxing.paimai.mvp.ui.viewpager.MyViewPagerAdapter;

import me.jessyan.armscomponent.commonsdk.core.RouterHub;
import me.majiajie.pagerbottomtabstrip.NavigationController;
import me.majiajie.pagerbottomtabstrip.PageNavigationView;
import me.majiajie.pagerbottomtabstrip.SpecialTab;
import me.majiajie.pagerbottomtabstrip.SpecialTabRound;
import me.majiajie.pagerbottomtabstrip.item.BaseTabItem;

@Route(path = RouterHub.APP_PAIMAIMAINACTIVITY)
public class PaiMaiMainActivity extends BaseActivity {


    @Override
    public void setupActivityComponent(@NonNull AppComponent appComponent) {

    }

    @Override
    public int initView(@Nullable Bundle savedInstanceState) {
        return R.layout.activity_pai_mai_main;
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {
        PageNavigationView tab = (PageNavigationView) findViewById(R.id.tab);

        NavigationController navigationController = tab.custom()
                .addItem(newItem(R.drawable.ic_restore_gray_24dp, R.drawable.ic_restore_teal_24dp, "首页"))
                .addItem(newItem(R.drawable.ic_favorite_gray_24dp, R.drawable.ic_favorite_teal_24dp, "分类"))
                .addItem(newRoundItem(R.drawable.ic_nearby_gray_24dp, R.drawable.ic_nearby_teal_24dp, "发布"))
                .addItem(newItem(R.drawable.ic_favorite_gray_24dp, R.drawable.ic_favorite_teal_24dp, "消息"))
                .addItem(newItem(R.drawable.ic_restore_gray_24dp, R.drawable.ic_restore_teal_24dp, "我的"))
                .build();

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
        viewPager.setAdapter(new MyViewPagerAdapter(getSupportFragmentManager(), navigationController.getItemCount()));

        //自动适配ViewPager页面切换
        navigationController.setupWithViewPager(viewPager);
    }


    /**
     * 正常tab
     */
    private BaseTabItem newItem(int drawable, int checkedDrawable, String text) {
        SpecialTab mainTab = new SpecialTab(this);
        mainTab.initialize(drawable, checkedDrawable, text);
        mainTab.setTextDefaultColor(0xFF888888);
        mainTab.setTextCheckedColor(0xFF009688);
        return mainTab;
    }

    /**
     * 圆形tab
     */
    private BaseTabItem newRoundItem(int drawable, int checkedDrawable, String text) {
        SpecialTabRound mainTab = new SpecialTabRound(this);
        mainTab.initialize(drawable, checkedDrawable, text);
        mainTab.setTextDefaultColor(0xFF888888);
        mainTab.setTextCheckedColor(0xFF009688);
        return mainTab;
    }
}
