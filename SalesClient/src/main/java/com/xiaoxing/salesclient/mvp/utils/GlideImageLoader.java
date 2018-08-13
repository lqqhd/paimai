package com.xiaoxing.salesclient.mvp.utils;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;
import com.xiaoxing.salesclient.mvp.ui.entity.BannerItem;
import com.youth.banner.loader.ImageLoader;

import me.jessyan.armscomponent.commonres.utils.GlideUtil;
import xiaoxing.com.salesclient.R;

public class GlideImageLoader extends ImageLoader {
    @Override
    public void displayImage(Context context, Object path, ImageView imageView) {

        RequestOptions options = new RequestOptions()
                .placeholder(R.drawable.icon_default)// 正在加载中的图片
                .error(R.drawable.icon_default) // 加载失败的图片
                .diskCacheStrategy(DiskCacheStrategy.ALL); // 磁盘缓存策略
        Glide.with(context).load(((BannerItem) path).pic).apply(options).into(imageView);

    }
}