package me.jessyan.armscomponent.commonsdk.utils;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebviewUtil {

    @SuppressLint("WrongConstant")
    public static void loadData(Activity activity, WebView webView, String htmlData) {

        WebSettings settings = webView.getSettings();

        settings.setTextSize(WebSettings.TextSize.SMALLER);

//        settings.setJavaScriptEnabled(true);
//
//        settings.setNeedInitialFocus(false);
//
//        settings.setSupportZoom(true);
//
//        settings.setLoadWithOverviewMode(true);//适应屏幕
//
//        settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
//
//        settings.setLoadsImagesAutomatically(true);//自动加载图片
//
//        settings.setCacheMode(WebSettings.LOAD_DEFAULT |WebSettings.LOAD_CACHE_ELSE_NETWORK);


        webView.loadData(htmlData, "text/html; charset=UTF-8", null);//这种写法可以正确解码

    }
}
