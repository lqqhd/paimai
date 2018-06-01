package me.jessyan.armscomponent.commonres.utils;

import android.app.Activity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import me.jessyan.armscomponent.commonres.R;

public class ToolbarUtils {

    /**
     * 设置标题，返回
     *
     * @param activity
     * @param title
     */
    public static void initToolbarTitleBack(final Activity activity, String title) {
        TextView tvTitle = activity.findViewById(R.id.title);
        Toolbar toolbar = activity.findViewById(R.id.toolbar);

        tvTitle.setText(title);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.finish();

            }
        });
    }

    public static Toolbar initToolbarTitleNoBack(final Activity activity, String title) {
        TextView tvTitle = activity.findViewById(R.id.title);
        Toolbar toolbar = activity.findViewById(R.id.toolbar);

        tvTitle.setText(title);
        toolbar.setNavigationIcon(null);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.finish();

            }
        });


        return toolbar;
    }

    /**
     * 带右侧按钮
     *
     * @param activity
     * @param title
     * @param onClickListener
     */
    public static Toolbar initToolbarTitleBackWithRightButton(final Activity activity, String title, View.OnClickListener onClickListener) {
        TextView tvTitle = activity.findViewById(R.id.title);
        Button rightButton = activity.findViewById(R.id.btnRight);
        Toolbar toolbar = activity.findViewById(R.id.toolbar);

        tvTitle.setText(title);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.finish();

            }
        });
        rightButton.setOnClickListener(onClickListener);
        return toolbar;
    }

}
