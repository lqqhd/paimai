package com.xiaoxing.salesclient.mvp.ui.activity;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;

import me.jessyan.armscomponent.commonres.utils.ToolbarUtils;
import xiaoxing.com.salesclient.R;

import static me.jessyan.armscomponent.commonsdk.utils.ScreenShotUtil.FILE_NAME;


/**
 * Created by deepshikha on 8/5/17.
 */

public class ScreenshotShowActivity extends Activity {
    ImageView iv_image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_shot_show);

        ToolbarUtils.initToolbarTitleBack(this, "个人名片");
        init();
    }

    private void init() {
        iv_image = (ImageView) findViewById(R.id.iv_image);
        String completePath = Environment.getExternalStorageDirectory() + "/" + FILE_NAME;
        RequestOptions options = new RequestOptions()
                .skipMemoryCache(true).diskCacheStrategy(DiskCacheStrategy.NONE); // 磁盘缓存策略
        Glide.with(ScreenshotShowActivity.this).load(completePath).apply(options).into(iv_image);

    }

}
