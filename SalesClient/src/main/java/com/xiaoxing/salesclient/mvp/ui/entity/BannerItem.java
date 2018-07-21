package com.xiaoxing.salesclient.mvp.ui.entity;

public class BannerItem {

    public String pic;
    public int pic1;
    public String title;

    public BannerItem() {
    }

    public BannerItem(String title, String pic) {
        this.pic = pic;
        this.title = title;
    }
    public BannerItem(String title, int pic) {
        this.pic1 = pic;
        this.title = title;
    }
}
