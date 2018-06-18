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

import me.jessyan.armscomponent.commonres.R;
import me.jessyan.armscomponent.commonres.dialog.BaseDialog;

public class CheckVersionUtil {

    public static void checkVersion(final Context context) {

        DownloadBuilder builder = AllenVersionChecker
                .getInstance()
                .requestVersion()
                .setRequestUrl("https://www.baidu.com")
                .request(new RequestVersionListener() {
                    @Nullable
                    @Override
                    public UIData onRequestVersionSuccess(String result) {
                        Toast.makeText(context, "request successful", Toast.LENGTH_SHORT).show();
                        return crateUIData(context);
                    }

                    @Override
                    public void onRequestVersionFailure(String message) {
                        Toast.makeText(context, "request failed", Toast.LENGTH_SHORT).show();

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
    private static UIData crateUIData(Context context) {
        UIData uiData = UIData.create();
        uiData.setTitle(context.getString(R.string.update_title));
        uiData.setDownloadUrl("http://test-1251233192.coscd.myqcloud.com/1_1.apk");
        uiData.setContent(context.getString(R.string.updatecontent));
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
