package com.xiaoxing.salesclient.mvp.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import me.jessyan.armscomponent.commonsdk.utils.ScreenShotUtil;
import xiaoxing.com.salesclient.R;

import static me.jessyan.armscomponent.commonsdk.utils.ScreenShotUtil.boolean_permission;
import static me.jessyan.armscomponent.commonsdk.utils.ScreenShotUtil.boolean_save;
import static me.jessyan.armscomponent.commonsdk.utils.ScreenShotUtil.fn_permission;

public class ScreenshotCreateActivity extends AppCompatActivity {

    Button btn_screenshot;
    ScrollView scrollView;
    LinearLayout ll_linear;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_shot_create);
        init();
        fn_permission(this);
    }

    private void init() {
        btn_screenshot = (Button) findViewById(R.id.btn_screenshot);
        scrollView = (ScrollView) findViewById(R.id.scrollView);
        ll_linear = (LinearLayout) findViewById(R.id.ll_linear);

        btn_screenshot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (boolean_save) {
                    Intent intent = new Intent(getApplicationContext(), ScreenshotShowActivity.class);
                    startActivity(intent);

                } else {
                    if (boolean_permission) {


                    } else {

                    }
                }

            }
        });
    }


    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        ScreenShotUtil.onRequestPermissionsResult(requestCode, grantResults);
    }


}
