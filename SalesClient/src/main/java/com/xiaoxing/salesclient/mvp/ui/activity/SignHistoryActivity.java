package com.xiaoxing.salesclient.mvp.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.hzw.zwcalendar.ZWCalendarView;
import com.jess.arms.base.BaseActivity;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.utils.ArmsUtils;
import com.xiaoxing.salesclient.di.component.DaggerSignHistoryComponent;
import com.xiaoxing.salesclient.di.module.SignHistoryModule;
import com.xiaoxing.salesclient.mvp.contract.SignHistoryContract;
import com.xiaoxing.salesclient.mvp.presenter.SignHistoryPresenter;

import java.util.HashMap;
import java.util.List;

import me.jessyan.armscomponent.commonres.utils.MySgninCouponsList;
import me.jessyan.armscomponent.commonres.utils.ToolbarUtils;
import me.jessyan.armscomponent.commonsdk.core.BaseConstants;
import me.jessyan.armscomponent.commonsdk.core.RouterHub;
import xiaoxing.com.salesclient.R;

import static com.jess.arms.utils.Preconditions.checkNotNull;
import static me.jessyan.armscomponent.commonsdk.core.BaseConstants.TOKEN;


@Route(path = RouterHub.SALES_CLIENT_SIGN_HISTORY_ACTIVITY)
public class SignHistoryActivity extends BaseActivity<SignHistoryPresenter> implements SignHistoryContract.View, View.OnClickListener {

    private ZWCalendarView calendarView;

    @Override
    public void setupActivityComponent(@NonNull AppComponent appComponent) {
        DaggerSignHistoryComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .signHistoryModule(new SignHistoryModule(this))
                .build()
                .inject(this);
    }

    @Override
    public int initView(@Nullable Bundle savedInstanceState) {
        return R.layout.activity_sign_history; //如果你不需要框架帮你设置 setContentView(id) 需要自行设置,请返回 0
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {

        ToolbarUtils.initToolbarTitleBack(this, "签到记录");


        findViewById(R.id.img_close).setOnClickListener(this);
        calendarView = (ZWCalendarView) findViewById(R.id.calendarView);
//        show = (TextView) findViewById(R.id.tv_calendar_show);
        calendarView.setSelectListener(new ZWCalendarView.SelectListener() {
            @Override
            public void change(int year, int month) {
//                    show.setText(String.format("%s 年 %s 月", year, month));

//                    ArmsUtils.snackbarText("change");
            }

            @Override
            public void select(int year, int month, int day, int week) {
//                    Toast.makeText(mActivity,
//                            String.format("%s 年 %s 月 %s日，周%s", year, month, day, week),
//                            Toast.LENGTH_SHORT).show();
//                if (ArmsUtils.getTimeCompareSize(ArmsUtils.getDataTime("yyyy-MM-dd"), year + "-" + month + "-" + day) == 3) {
//                    ArmsUtils.snackbarText("时间还未到");
//                    return;
//                } else if (ArmsUtils.getTimeCompareSize(ArmsUtils.getDataTime("yyyy-MM-dd"), year + "-" + month + "-" + day) == 1) {
//                    ArmsUtils.snackbarText("时间已过");
//                    return;
//                } else {
////                    mQianDao.qianDao(year + "-" + month + "-" + day);
//                }
            }
        });

        //代码选中一个日期
//            show.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    calendarView.selectDate(2018, 9, 3);
//                }
//            });

        //前一月
        findViewById(R.id.calendar_previous).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calendarView.showPreviousMonth();
            }
        });

        //后一月
        findViewById(R.id.calendar_next).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calendarView.showNextMonth();
            }
        });

        //返回今天
        findViewById(R.id.tv_calendar_today).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calendarView.backToday();
            }
        });

//            HashMap<String, Boolean> sign = new HashMap<>();
//            sign.put("2018-07-12", true);
//            sign.put("2018-07-23", true);
//            sign.put("2018-07-24", false);
//            sign.put("2018-07-25", true);
//            sign.put("2018-08-12", false);
//            sign.put("2018-08-13", true);
//            sign.put("2018-08-14", true);
//            sign.put("2018-08-15", false);
//            sign.put("2018-08-18", false);
//            sign.put("2018-08-31", true);
//            sign.put("2018-09-05", true);
//            sign.put("2018-09-07", false);
//            sign.put("2018-09-08", false);
//            sign.put("2018-09-09", true);
//            sign.put("2018-10-09", true);


        mPresenter.mySgninCouponsList(mSharedPreferencesHelper.getString(BaseConstants.TOKEN), ArmsUtils.getDataTime("yyyy-MM"));
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

    @Override
    public void mySgninCouponsListSuccess(MySgninCouponsList mySgninCouponsList) {
        HashMap<String, Boolean> mSign = new HashMap<>();
        List<MySgninCouponsList.DataBean> dataBeanList = mySgninCouponsList.getData();
        for (int i = 0; i < dataBeanList.size(); i++) {
            if (ArmsUtils.getTimeCompareSize(ArmsUtils.getDataTime("yyyy-MM-dd"), dataBeanList.get(i).getDate()) != 3) {
                mSign.put(dataBeanList.get(i).getDate(), dataBeanList.get(i).isIs_sign());
            }
        }
        calendarView.setSignRecords(mSign);

    }


    @Override
    public void onClick(View v) {
        int i = v.getId();


    }
}
