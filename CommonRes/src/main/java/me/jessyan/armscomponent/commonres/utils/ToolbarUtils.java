package me.jessyan.armscomponent.commonres.utils;

import android.app.Activity;
import android.support.v7.widget.Toolbar;
import android.view.View;
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

    public static void initToolbarTitleNoBack(final Activity activity, String title) {
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
    }
}