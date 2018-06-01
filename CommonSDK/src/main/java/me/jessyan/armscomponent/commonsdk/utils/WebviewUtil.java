package me.jessyan.armscomponent.commonsdk.utils;

import android.webkit.WebSettings;
import android.webkit.WebView;

public class WebviewUtil {

    public static void loadData(WebView webView, String htmlData) {
        WebSettings settings;
        settings = webView.getSettings();
        settings.setSupportZoom(true);
        settings.setTextSize(WebSettings.TextSize.SMALLER);

        webView.loadData(htmlData, "text/html; charset=UTF-8", null);//这种写法可以正确解码
    }
}
