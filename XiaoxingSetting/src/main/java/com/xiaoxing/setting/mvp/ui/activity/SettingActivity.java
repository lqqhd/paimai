package com.xiaoxing.setting.mvp.ui.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.InputType;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.jess.arms.base.BaseActivity;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.utils.ArmsUtils;
import com.qmuiteam.qmui.widget.dialog.QMUIDialog;
import com.qmuiteam.qmui.widget.dialog.QMUIDialogAction;
import com.xiaoxing.setting.R;
import com.xiaoxing.setting.R2;
import com.xiaoxing.setting.di.component.DaggerSettingComponent;
import com.xiaoxing.setting.di.module.SettingModule;
import com.xiaoxing.setting.mvp.contract.SettingContract;
import com.xiaoxing.setting.mvp.presenter.SettingPresenter;

import butterknife.BindView;
import butterknife.OnClick;
import cn.addapp.pickers.picker.DatePicker;
import me.jessyan.armscomponent.commonres.utils.ToolbarUtils;
import me.jessyan.armscomponent.commonsdk.core.RouterHub;
import me.jessyan.armscomponent.commonsdk.utils.Utils;

import static com.jess.arms.utils.Preconditions.checkNotNull;

@Route(path = RouterHub.XIAO_XING_SETTING_SETTING)
public class SettingActivity extends BaseActivity<SettingPresenter> implements SettingContract.View {
    private int mCurrentDialogStyle = com.qmuiteam.qmui.R.style.QMUI_Dialog;
    @BindView(R2.id.tv_xing_ming)
    TextView tvXingMing;
    @BindView(R2.id.tv_ni_cheng)
    TextView tvNiCheng;
    @BindView(R2.id.tv_sheng_ri)
    TextView tvShengRi;
    @BindView(R2.id.tv_xing_bie)
    TextView tvXingBie;
    @BindView(R2.id.img_head)
    ImageView imgHead;
    @BindView(R2.id.tv_shou_huo_di_zhi)
    TextView tvShouHuoDiZhi;
    @BindView(R2.id.tv_an_quan_zhong_xin)
    TextView tvAnQuanZhongXin;
    @BindView(R2.id.tv_shi_ming_ren_zheng)
    TextView tvShiMingRenZheng;

    @Override
    public void setupActivityComponent(@NonNull AppComponent appComponent) {
        DaggerSettingComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .settingModule(new SettingModule(this))
                .build()
                .inject(this);
    }

    @Override
    public int initView(@Nullable Bundle savedInstanceState) {
        return R.layout.xiaoxing_setting__activity_setting; //如果你不需要框架帮你设置 setContentView(id) 需要自行设置,请返回 0
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {
        ToolbarUtils.initToolbarTitleBack(this, getString(R.string.xiaoxing_setting_she_zhi));
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


    @OnClick({R2.id.rl_xing_ming, R2.id.rl_ni_cheng, R2.id.rl_sheng_ri, R2.id.rl_tou_xiang, R2.id.rl_shou_huo_di_zhi, R2.id.rl_an_quan_zhong_xin,
            R2.id.rl_shi_ming_ren_zheng,
            R2.id.rl_xing_bie,
            R2.id.btn_sign_out
    })
    public void onViewClicked(View view) {

        if (view.getId() == R.id.rl_xing_ming) {
            showEditTextDialog("修改姓名", "请输入您的姓名");
        } else if (view.getId() == R.id.rl_ni_cheng) {
            showEditTextDialog("修改昵称", "4-20个字符，可由中英文、数字、 _ 、- 组成");

        } else if (view.getId() == R.id.rl_xing_bie) {
            showSexDialog();
        } else if (view.getId() == R.id.rl_sheng_ri) {
            onYearMonthDayPicker(tvShengRi);
        } else if (view.getId() == R.id.rl_tou_xiang) {
            showTouXiangDialog();
        } else if (view.getId() == R.id.rl_shou_huo_di_zhi) {
            Utils.navigation(SettingActivity.this, RouterHub.XIAO_XING_ADDRESS_ADDRESSLISTACTIVITY);
        } else if (view.getId() == R.id.rl_an_quan_zhong_xin) {

        } else if (view.getId() == R.id.rl_shi_ming_ren_zheng) {

        } else if (view.getId() == R.id.btn_sign_out) {
            showConfirmMessageDialog();
        }

    }

    private void showEditTextDialog(String title, String hint) {
        final QMUIDialog.EditTextDialogBuilder builder = new QMUIDialog.EditTextDialogBuilder(SettingActivity.this);
        builder.setTitle(title)
                .setPlaceholder(hint)
                .setInputType(InputType.TYPE_CLASS_TEXT)
                .addAction("取消", new QMUIDialogAction.ActionListener() {
                    @Override
                    public void onClick(QMUIDialog dialog, int index) {
                        dialog.dismiss();
                    }
                })
                .addAction("确定", new QMUIDialogAction.ActionListener() {
                    @Override
                    public void onClick(QMUIDialog dialog, int index) {
                        CharSequence text = builder.getEditText().getText();
                        if (text != null && text.length() > 0) {
                            Toast.makeText(SettingActivity.this, "您的昵称: " + text, Toast.LENGTH_SHORT).show();
                            dialog.dismiss();
                        } else {
                            Toast.makeText(SettingActivity.this, "请填入昵称", Toast.LENGTH_SHORT).show();
                        }
                    }
                })
                .create(mCurrentDialogStyle).show();
    }

    private void showConfirmMessageDialog() {
        new QMUIDialog.CheckBoxMessageDialogBuilder(SettingActivity.this)
                .setTitle("退出后是否删除账号信息?")
                .setMessage("删除账号信息")
                .setChecked(true)
                .addAction("取消", new QMUIDialogAction.ActionListener() {
                    @Override
                    public void onClick(QMUIDialog dialog, int index) {
                        dialog.dismiss();
                    }
                })
                .addAction("退出", new QMUIDialogAction.ActionListener() {
                    @Override
                    public void onClick(QMUIDialog dialog, int index) {
                        dialog.dismiss();
                    }
                })
                .create(mCurrentDialogStyle).show();
    }

    private void showSexDialog() {
        final String[] items = new String[]{"男", "女", "保密"};
        new QMUIDialog.MenuDialogBuilder(SettingActivity.this)
                .addItems(items, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .create(mCurrentDialogStyle).show();
    }

    private void showTouXiangDialog() {
        final String[] items = new String[]{"相机", "相册", "取消"};
        new QMUIDialog.MenuDialogBuilder(SettingActivity.this)
                .addItems(items, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .create(mCurrentDialogStyle).show();
    }

    public void onYearMonthDayPicker(View view) {
        final DatePicker picker = new DatePicker(this);
        picker.setCanLoop(true);
        picker.setWheelModeEnable(true);
        picker.setTopPadding(15);
        picker.setRangeStart(2016, 8, 29);
        picker.setRangeEnd(2111, 1, 11);
        picker.setSelectedItem(2050, 10, 14);
        picker.setWeightEnable(true);
        picker.setLineColor(Color.BLACK);
        picker.setOnDatePickListener(new DatePicker.OnYearMonthDayPickListener() {
            @Override
            public void onDatePicked(String year, String month, String day) {
//                showToast(year + "-" + month + "-" + day);
            }
        });
        picker.setOnWheelListener(new DatePicker.OnWheelListener() {
            @Override
            public void onYearWheeled(int index, String year) {
                picker.setTitleText(year + "-" + picker.getSelectedMonth() + "-" + picker.getSelectedDay());
            }

            @Override
            public void onMonthWheeled(int index, String month) {
                picker.setTitleText(picker.getSelectedYear() + "-" + month + "-" + picker.getSelectedDay());
            }

            @Override
            public void onDayWheeled(int index, String day) {
                picker.setTitleText(picker.getSelectedYear() + "-" + picker.getSelectedMonth() + "-" + day);
            }
        });
        picker.show();
    }

}
