package com.xiaoxing.welcome.mvp.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.KeyEvent;
import android.widget.ImageView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.jess.arms.base.BaseActivity;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.utils.DataHelper;
import com.xiaoxing.welcome.BuildConfig;
import com.xiaoxing.welcome.R;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import me.jessyan.armscomponent.commonsdk.core.RouterHub;
import me.jessyan.armscomponent.commonsdk.utils.Utils;


/**
 * 欢迎页面，启动页
 */

@Route(path = RouterHub.WELCOME_WELCOMEACTIVITY)
public class WelcomeActivity extends BaseActivity {

    private static final int ANIM_TIME = 2000;
    private static final float SCALE_END = 1.15F;
    private static final int[] Imgs = {
            R.mipmap.welcomimg1, R.mipmap.welcomimg2,
            R.mipmap.welcomimg3, R.mipmap.welcomimg4,
            R.mipmap.welcomimg5, R.mipmap.welcomimg6,
            R.mipmap.welcomimg7, R.mipmap.welcomimg8,
            R.mipmap.welcomimg9, R.mipmap.welcomimg10,
            R.mipmap.welcomimg11, R.mipmap.welcomimg12};
    ImageView mIVEntry;


    @Override
    public void setupActivityComponent(@NonNull AppComponent appComponent) {

    }

    @Override
    public int initView(@Nullable Bundle savedInstanceState) {
        return R.layout.activity_welcome;
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {


        mIVEntry = findViewById(R.id.iv_entry);
        // 判断是否是第一次开启应用
        boolean isFirstOpen = DataHelper.getBoolean(this, AppConstants.FIRST_OPEN, true);
        // 如果是第一次启动，则先进入功能引导页
        if (isFirstOpen) {
            Intent intent = new Intent(this, WelcomeGuideActivity.class);
            startActivity(intent);
            finish();
            return;
        }

        startMainActivity();
    }

    private void startMainActivity() {
        Random random = new Random(SystemClock.elapsedRealtime());//SystemClock.elapsedRealtime() 从开机到现在的毫秒数（手机睡眠(sleep)的时间也包括在内）
        mIVEntry.setImageResource(Imgs[random.nextInt(Imgs.length)]);


        Observable.timer(1000, TimeUnit.MILLISECONDS)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<Long>() {
                    @Override
                    public void accept(Long aLong) throws Exception {
                        startAnim();
                    }
                });
    }

    private void startAnim() {

        ObjectAnimator animatorX = ObjectAnimator.ofFloat(mIVEntry, "scaleX", 1f, SCALE_END);
        ObjectAnimator animatorY = ObjectAnimator.ofFloat(mIVEntry, "scaleY", 1f, SCALE_END);

        AnimatorSet set = new AnimatorSet();
        set.setDuration(ANIM_TIME).play(animatorX).with(animatorY);
        set.start();

        set.addListener(new AnimatorListenerAdapter() {

            @Override
            public void onAnimationEnd(Animator animation) {
                if (BuildConfig.IS_SALALS_CLIENT) {
                    Utils.navigation(WelcomeActivity.this, RouterHub.XIAO_XING_LOGIN_LOGIN_ACTIVITY);
                } else {
                    Utils.navigation(WelcomeActivity.this, RouterHub.XIAO_XING_LOGIN_LOGIN_ACTIVITY);
                }
                finish();
            }
        });
    }

    /**
     * 屏蔽物理返回按钮
     *
     * @param keyCode
     * @param event
     * @return
     */
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}
