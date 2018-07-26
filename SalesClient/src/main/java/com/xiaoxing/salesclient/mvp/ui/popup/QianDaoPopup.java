package com.xiaoxing.salesclient.mvp.ui.popup;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.view.View;
import android.view.animation.Animation;
import android.widget.TextView;
import android.widget.Toast;

import com.hzw.zwcalendar.ZWCalendarView;

import java.util.HashMap;

import me.jessyan.armscomponent.commonres.view.popup.BasePopupWindow;
import me.jessyan.armscomponent.commonres.view.popup.OverShootInterpolator;
import xiaoxing.com.salesclient.R;


/**
 * 全屏的popup
 */

public class QianDaoPopup extends BasePopupWindow implements View.OnClickListener {
    private View popupView;
    private Activity mActivity;
    private ZWCalendarView calendarView;
    private TextView show;
    private QianDao mQianDao;

    public interface QianDao {
        void qianDao(String date);
    }


    public QianDaoPopup(Activity context) {
        super(context);
        this.mActivity = context;
        /**全屏popup*/
        setPopupWindowFullScreen(true);
        bindEvent();
    }

    @Override
    protected Animation initShowAnimation() {
        return null;
    }

    @Override
    public Animator initShowAnimator() {
        AnimatorSet set;
        set = new AnimatorSet();
        ObjectAnimator transAnimator = ObjectAnimator.ofFloat(mAnimaView, "translationY", 250, 0).setDuration(600);
        transAnimator.setInterpolator(new OverShootInterpolator());
        ObjectAnimator alphaAnimator = ObjectAnimator.ofFloat(mAnimaView, "alpha", 0.4f, 1).setDuration(250 * 3 / 2);
        set.playTogether(transAnimator, alphaAnimator);
        return set;
    }

    @Override
    public Animator initExitAnimator() {
        AnimatorSet set;
        set = new AnimatorSet();
        ObjectAnimator transAnimator = ObjectAnimator.ofFloat(mAnimaView, "translationY", 0, 250).setDuration(600);
        transAnimator.setInterpolator(new OverShootInterpolator(-6));
        ObjectAnimator alphaAnimator = ObjectAnimator.ofFloat(mAnimaView, "alpha", 1f, 0).setDuration(800);
        set.playTogether(transAnimator, alphaAnimator);
        return set;
    }

    @Override
    public View getClickToDismissView() {
        return getPopupWindowView();
    }

    @Override
    public View onCreatePopupView() {
        popupView = createPopupById(R.layout.popup_qian_dao);
        return popupView;
    }

    @Override
    public View initAnimaView() {
        return findViewById(R.id.popup_anima);
    }

    private void bindEvent() {
        if (popupView != null) {

            popupView.findViewById(R.id.img_close).setOnClickListener(this);
            calendarView = (ZWCalendarView) popupView.findViewById(R.id.calendarView);
            show = (TextView) popupView.findViewById(R.id.tv_calendar_show);
            calendarView.setSelectListener(new ZWCalendarView.SelectListener() {
                @Override
                public void change(int year, int month) {
                    show.setText(String.format("%s 年 %s 月", year, month));
                }

                @Override
                public void select(int year, int month, int day, int week) {
                    Toast.makeText(mActivity,
                            String.format("%s 年 %s 月 %s日，周%s", year, month, day, week),
                            Toast.LENGTH_SHORT).show();

                    mQianDao.qianDao(year + "-" + month);
                }
            });

            //代码选中一个日期
            show.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    calendarView.selectDate(2018, 9, 3);
                }
            });

            //前一月
            popupView.findViewById(R.id.calendar_previous).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    calendarView.showPreviousMonth();
                }
            });

            //后一月
            popupView.findViewById(R.id.calendar_next).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    calendarView.showNextMonth();
                }
            });

            //返回今天
            popupView.findViewById(R.id.tv_calendar_today).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    calendarView.backToday();
                }
            });

            HashMap<String, Boolean> sign = new HashMap<>();
            sign.put("2018-07-12", true);
            sign.put("2018-07-23", true);
            sign.put("2018-07-24", false);
            sign.put("2018-07-25", true);
            sign.put("2018-08-12", false);
            sign.put("2018-08-13", true);
            sign.put("2018-08-14", true);
            sign.put("2018-08-15", false);
            sign.put("2018-08-18", false);
            sign.put("2018-08-31", true);
            sign.put("2018-09-05", true);
            sign.put("2018-09-07", false);
            sign.put("2018-09-08", false);
            sign.put("2018-09-09", true);
            sign.put("2018-10-09", true);
            calendarView.setSignRecords(sign);


        }
    }


    @Override
    public void onClick(View v) {
        int i = v.getId();

        if (i == R.id.img_close) {
            dismiss();
        }

    }
}
