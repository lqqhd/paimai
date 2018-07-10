package com.xiaoxing.salesclient.mvp.utils;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.xiaoxing.salesclient.mvp.ui.entity.BannerItem;
import com.youth.banner.loader.ImageLoader;

public class GlideImageLoader extends ImageLoader {
    @Override
    public void displayImage(Context context, Object path, ImageView imageView) {

        Glide.with(context).load(((BannerItem) path).pic).into(imageView);
    }
}