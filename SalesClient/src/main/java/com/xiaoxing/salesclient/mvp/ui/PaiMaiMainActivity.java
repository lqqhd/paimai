package com.xiaoxing.salesclient.mvp.ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.mobileim.IYWLoginService;
import com.alibaba.mobileim.YWAPI;
import com.alibaba.mobileim.YWIMKit;
import com.alibaba.mobileim.YWLoginParam;
import com.alibaba.mobileim.channel.event.IWxCallback;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.jess.arms.base.BaseActivity;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.utils.ArmsUtils;
import com.jess.arms.utils.DeviceUtils;
import com.qmuiteam.qmui.widget.dialog.QMUIDialog;
import com.uuch.adlibrary.AdConstant;
import com.uuch.adlibrary.AdManager;
import com.uuch.adlibrary.bean.AdInfo;
import com.uuch.adlibrary.utils.DisplayUtil;
import com.xiaoxing.salesclient.di.component.DaggerPaiMaiMainComponent;
import com.xiaoxing.salesclient.di.module.PaiMaiMainModule;
import com.xiaoxing.salesclient.mvp.contract.PaiMaiMainContract;
import com.xiaoxing.salesclient.mvp.presenter.PaiMaiMainPresenter;

import me.jessyan.armscomponent.commonres.utils.AppUpdate;

import com.xiaoxing.salesclient.mvp.ui.popup.QianDaoPopup;
import com.xiaoxing.salesclient.mvp.ui.viewpager.MyViewPagerAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import me.jessyan.armscomponent.commonres.utils.CheckVersionUtil;
import me.jessyan.armscomponent.commonres.utils.CouponsReceive;
import me.jessyan.armscomponent.commonres.utils.MySgninCouponsList;
import me.jessyan.armscomponent.commonres.utils.TodayIsSign;
import me.jessyan.armscomponent.commonsdk.core.BaseConstants;
import me.jessyan.armscomponent.commonsdk.core.RouterHub;
import me.jessyan.armscomponent.commonsdk.utils.Utils;
import me.majiajie.pagerbottomtabstrip.NavigationController;
import me.majiajie.pagerbottomtabstrip.PageNavigationView;
import me.majiajie.pagerbottomtabstrip.SpecialTab;
import me.majiajie.pagerbottomtabstrip.SpecialTabRound;
import me.majiajie.pagerbottomtabstrip.item.BaseTabItem;
import me.majiajie.pagerbottomtabstrip.listener.OnTabItemSelectedListener;
import xiaoxing.com.salesclient.R;

import static com.jess.arms.base.BaseApplication.APP_KEY;

@Route(path = RouterHub.SALES_CLIENT_PAI_MAI_MAIN_ACTIVITY)
public class PaiMaiMainActivity extends BaseActivity<PaiMaiMainPresenter> implements PaiMaiMainContract.View, QianDaoPopup.QianDao {
    private int mCurrentDialogStyle = com.qmuiteam.qmui.R.style.QMUI_Dialog;
    private static PaiMaiMainActivity instance;
    private ViewPager viewPager;
    private List<AdInfo> advList = null;

    private HashMap<String, Boolean> sign = new HashMap<>();

    private Handler popupHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case 0:
                    new QianDaoPopup(PaiMaiMainActivity.this, PaiMaiMainActivity.this, sign).showPopupWindow();

                    break;
            }
        }

    };


    @Override
    public void setupActivityComponent(@NonNull AppComponent appComponent) {
        DaggerPaiMaiMainComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .paiMaiMainModule(new PaiMaiMainModule(this))
                .build()
                .inject(this);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fresco.initialize(this);
//        initDisplayOpinion();
//        initAdData();
//        showDialog();

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
//        CheckVersionUtil.checkVersion(this);

        PageNavigationView tab = (PageNavigationView) findViewById(R.id.tab);

        NavigationController navigationController = tab.custom()
                .addItem(newItem(R.drawable.home_icon, R.drawable.home_icon, "首页"))
                .addItem(newItem(R.drawable.cate_icon, R.drawable.cate_icon, "分类"))
                .addItem(newRoundItem(R.drawable.fb_active_icon, R.drawable.fb_active_icon, "发布"))
                .addItem(newItem(R.drawable.sns_icon, R.drawable.sns_icon, "消息"))
                .addItem(newItem(R.drawable.mem_icon, R.drawable.mem_icon, "我的"))
                .build();

        viewPager = (ViewPager) findViewById(R.id.viewPager);
        viewPager.setAdapter(new MyViewPagerAdapter(getSupportFragmentManager(), navigationController.getItemCount()));
        viewPager.setOffscreenPageLimit(5);
        //自动适配ViewPager页面切换
        navigationController.setupWithViewPager(viewPager);
        navigationController.addTabItemSelectedListener(new OnTabItemSelectedListener() {
            @Override
            public void onSelected(int index, int old) {
                if (index == 3) {

                    Toast.makeText(PaiMaiMainActivity.this, "正在登陆聊天服务器...", Toast.LENGTH_SHORT).show();
                    //此实现不一定要放在Application onCreate中
                    final String userid = "testpro1";
                    //此对象获取到后，保存为全局对象，供APP使用
                    //此对象跟用户相关，如果切换了用户，需要重新获取
                    YWIMKit mIMKit = YWAPI.getIMKitInstance(userid, APP_KEY);

                    //开始登录
                    String password = "taobao1234";
                    IYWLoginService loginService = mIMKit.getLoginService();
                    YWLoginParam loginParam = YWLoginParam.createLoginParam(userid, password);
                    loginService.login(loginParam, new IWxCallback() {

                        @Override
                        public void onSuccess(Object... arg0) {

                            final String target = "testpro2"; //消息接收者ID
                            final String appkey = "23015524"; //消息接收者appKey
                            Intent intent = mIMKit.getChattingActivityIntent(target, appkey);
                            startActivity(intent);


//                            EServiceContact contact = new EServiceContact("testpro2", 0);
//                            Fragment fragment = mIMKit.getChattingFragment(contact);
                        }

                        @Override
                        public void onProgress(int arg0) {
                            // TODO Auto-generated method stub
                        }

                        @Override
                        public void onError(int errCode, String description) {
                            //如果登录失败，errCode为错误码,description是错误的具体描述信息
                        }
                    });
                } else if (index == 2) {
                    showChuangJianDialog();
                } else {
                    setCurrentItem(index);
                }
            }

            @Override
            public void onRepeat(int index) {
                if (index == 3) {

                    Toast.makeText(PaiMaiMainActivity.this, "正在登陆聊天服务器...", Toast.LENGTH_SHORT).show();
                    //此实现不一定要放在Application onCreate中
                    final String userid = "testpro1";
                    //此对象获取到后，保存为全局对象，供APP使用
                    //此对象跟用户相关，如果切换了用户，需要重新获取
                    YWIMKit mIMKit = YWAPI.getIMKitInstance(userid, APP_KEY);

                    //开始登录
                    String password = "taobao1234";
                    IYWLoginService loginService = mIMKit.getLoginService();
                    YWLoginParam loginParam = YWLoginParam.createLoginParam(userid, password);
                    loginService.login(loginParam, new IWxCallback() {

                        @Override
                        public void onSuccess(Object... arg0) {

                            final String target = "testpro2"; //消息接收者ID
                            final String appkey = "23015524"; //消息接收者appKey
                            Intent intent = mIMKit.getChattingActivityIntent(target, appkey);
                            startActivity(intent);


//                            EServiceContact contact = new EServiceContact("testpro2", 0);
//                            Fragment fragment = mIMKit.getChattingFragment(contact);
                        }

                        @Override
                        public void onProgress(int arg0) {
                            // TODO Auto-generated method stub
                        }

                        @Override
                        public void onError(int errCode, String description) {
                            //如果登录失败，errCode为错误码,description是错误的具体描述信息
                        }
                    });
                } else if (index == 2) {
                    showChuangJianDialog();
                }
            }
        });


        mPresenter.checkAppUpdate();
//        mPresenter.todayIsSign(mSharedPreferencesHelper.getString(BaseConstants.TOKEN));
    }

    private void showChuangJianDialog() {
        final String[] items = new String[]{"微拍藏品发布", "专场活动发布", "展厅藏品发布"};
        new QMUIDialog.MenuDialogBuilder(PaiMaiMainActivity.this)
                .addItems(items, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        if (which == 0) {
                            Utils.navigation(PaiMaiMainActivity.this, RouterHub.SALES_CLIENT_CHUANG_JIAN_WEI_PAI_ACTIVITY);
                        } else if (which == 1) {
                            Utils.navigation(PaiMaiMainActivity.this, RouterHub.SALES_CLIENT_CHUANG_JIAN_ZHUAN_CHANG_ACTIVITY);
                        } else if (which == 2) {
                            Utils.navigation(PaiMaiMainActivity.this, RouterHub.SALES_CLIENT_CHUANG_JIAN_ZHAN_PIN_ACTIVITY);
                        }
                        dialog.dismiss();
                    }
                })
                .create(mCurrentDialogStyle).show();
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

    @Override
    public void checkAppUpdate(AppUpdate appUpdate) {

        String versionCode = appUpdate.getVersionCode();
        if (DeviceUtils.getVersionCode(this) == Integer.parseInt(versionCode)) {

        }
    }

    @Override
    public void todayIsSignSuccess(TodayIsSign todayIsSign) {

        if (todayIsSign.getCode() == 200) {

            mPresenter.mySgninCouponsList(mSharedPreferencesHelper.getString(BaseConstants.TOKEN), ArmsUtils.getDataTime("yyyy-MM"));

        } else {

            ArmsUtils.snackbarText(todayIsSign.getMsg());

        }
    }

    @Override
    public void mySgninCouponsListSuccess(MySgninCouponsList mySgninCouponsList) {

        List<MySgninCouponsList.DataBean> dataBeanList = mySgninCouponsList.getData();
        for (int i = 0; i < dataBeanList.size(); i++) {
            if (ArmsUtils.getTimeCompareSize(ArmsUtils.getDataTime("yyyy-MM-dd"), dataBeanList.get(i).getDate()) == 1) {
                sign.put(dataBeanList.get(i).getDate(), dataBeanList.get(i).isIs_sign());
            }
        }

        popupHandler.sendEmptyMessageDelayed(0, 1000);

    }

    @Override
    public void couponsReceiveSuccess(CouponsReceive couponsReceive) {

        ArmsUtils.snackbarText(couponsReceive.getMsg());
    }

    @Override
    public void showMessage(@NonNull String message) {

    }

    @Override
    public void qianDao(String date) {
//        mPresenter.couponsReceive(mSharedPreferencesHelper.getString(BaseConstants.TOKEN), "11");
    }
}
