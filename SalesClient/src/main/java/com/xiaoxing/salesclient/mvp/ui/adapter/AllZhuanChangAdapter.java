package com.xiaoxing.salesclient.mvp.ui.adapter;

import android.content.Context;
import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.xiaoxing.salesclient.mvp.model.entity.Specialcat;

import java.util.List;

import cn.iwgang.countdownview.CountdownView;
import xiaoxing.com.salesclient.R;


/**
 * Created by tad on 2017/11/16.
 */

public class AllZhuanChangAdapter extends BaseQuickAdapter<Specialcat.DataBean, BaseViewHolder> {
    private Context mContext;

    public AllZhuanChangAdapter(Context context, @Nullable List<Specialcat.DataBean> data) {
        super(R.layout.sales_client_listitem_all_zhuan_chang, data);
        this.mContext = context;
    }

    @Override
    protected void convert(BaseViewHolder helper, Specialcat.DataBean item) {

        Glide.with(mContext).load(item.getTouch_icon()).into((ImageView) helper.getView(R.id.img_1));
        Glide.with(mContext).load(item.getTouch_icon()).into((ImageView) helper.getView(R.id.img_2));
        Glide.with(mContext).load(item.getTouch_icon()).into((ImageView) helper.getView(R.id.img_3));

        helper.setText(R.id.tv_name, item.getCat_name());
        helper.setText(R.id.tv_title, item.getCat_desc());
        helper.setText(R.id.tv_ren_shu, item.getOnlookers_num());
        initCountdownView(helper);
    }

    private void initCountdownView(BaseViewHolder viewHolder) {
        CountdownView mCvCountdownViewTest4 = (CountdownView) viewHolder.getView(R.id.cv_countdownView);
        long time4 = (long) 150 * 24 * 60 * 60 * 1000;
        mCvCountdownViewTest4.start(time4);
    }
}
