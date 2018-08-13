package me.jessyan.armscomponent.commonres.utils;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;

import me.jessyan.armscomponent.commonres.R;


/**
 * 描述：
 * 作者：xiaoxing on 17/5/5 09:26
 * 邮箱：2235445233@qq.com
 */
public class GlideUtil {

    /**
     * 用Glide加载图片
     *
     * @param context
     * @param imgPath
     * @param view
     */
    public static void displayImg(Context context, String imgPath, View view) {

        RequestOptions options = new RequestOptions()
                .placeholder(R.drawable.icon_default)// 正在加载中的图片
                .error(R.drawable.icon_default) // 加载失败的图片
                .diskCacheStrategy(DiskCacheStrategy.ALL); // 磁盘缓存策略
        Glide.with(context).load(imgPath).apply(options).into((ImageView) view);

    }

    public static void displayImg(Context context, int imgPath, View view) {
        RequestOptions options = new RequestOptions()
                .placeholder(R.drawable.icon_default)// 正在加载中的图片
                .error(R.drawable.icon_default) // 加载失败的图片
                .diskCacheStrategy(DiskCacheStrategy.ALL); // 磁盘缓存策略
        Glide.with(context).load(imgPath).apply(options).into((ImageView) view);

    }

}
