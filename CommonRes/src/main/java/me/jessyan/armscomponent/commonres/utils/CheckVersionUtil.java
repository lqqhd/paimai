package me.jessyan.armscomponent.commonres.utils;

import android.content.Context;
import android.support.annotation.Nullable;
import android.widget.TextView;
import android.widget.Toast;

import com.allenliu.versionchecklib.v2.AllenVersionChecker;
import com.allenliu.versionchecklib.v2.builder.DownloadBuilder;
import com.allenliu.versionchecklib.v2.builder.UIData;
import com.allenliu.versionchecklib.v2.callback.CustomVersionDialogListener;
import com.allenliu.versionchecklib.v2.callback.RequestVersionListener;
import com.google.gson.Gson;
import com.jess.arms.utils.DeviceUtils;

import me.jessyan.armscomponent.commonres.R;
import me.jessyan.armscomponent.commonres.dialog.BaseDialog;

public class CheckVersionUtil {

    public static void checkVersion(final Context context) {

        DownloadBuilder builder = AllenVersionChecker
                .getInstance()
                .requestVersion()
                .setRequestUrl("http://47.100.103.123/api/update.php")
                .request(new RequestVersionListener() {
                    @Nullable
                    @Override
                    public UIData onRequestVersionSuccess(String result) {
//                        Toast.makeText(context, "request successful", Toast.LENGTH_SHORT).show();

                        // 使用new方法
                        Gson gson = new Gson();

                        // fromJson 将json字符串转为bean对象
                        AppUpdate appUpdate = gson.fromJson(result, AppUpdate.class);

                        if (DeviceUtils.getVersionCode(context) == Integer.parseInt(appUpdate.getVersionCode())) {
                            return crateUIData(context, appUpdate);
                        }

                        return null;
                    }

                    @Override
                    public void onRequestVersionFailure(String message) {
//                        Toast.makeText(context, "request failed", Toast.LENGTH_SHORT).show();

                    }
                });

        builder.setCustomVersionDialogListener(createCustomDialogTwo());
        builder.excuteMission(context);
    }

    /**
     * @return
     * @important 使用请求版本功能，可以在这里设置downloadUrl
     * 这里可以构造UI需要显示的数据
     * UIData 内部是一个Bundle
     */
    private static UIData crateUIData(Context context, AppUpdate appUpdate) {
        UIData uiData = UIData.create();
        uiData.setTitle(appUpdate.getMsg());
        uiData.setDownloadUrl(appUpdate.getDownloadUrl());
        uiData.setContent(appUpdate.getModifyContent());
        return uiData;
    }


    private static CustomVersionDialogListener createCustomDialogTwo() {
        return (context, versionBundle) -> {
            BaseDialog baseDialog = new BaseDialog(context, R.style.BaseDialog, R.layout.custom_dialog_two_layout);
            TextView textView = baseDialog.findViewById(R.id.tv_msg);
            textView.setText(versionBundle.getContent());
            baseDialog.setCanceledOnTouchOutside(true);
            return baseDialog;
        };
    }

}
