package com.xiaoxing.salesclient.mvp.ui.adapter;

import android.content.Context;
import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.xiaoxing.salesclient.mvp.model.entity.AuctionList;

import java.util.List;

import cn.iwgang.countdownview.CountdownView;
import xiaoxing.com.salesclient.R;


/**
 * Created by tad on 2017/11/16.
 */

public class WeiPaiAdapter extends BaseQuickAdapter<AuctionList.DataBean, BaseViewHolder> {
    private Context mContext;

    public WeiPaiAdapter(Context context, @Nullable List<AuctionList.DataBean> data) {
        super(R.layout.sales_client_listitem_wei_pai, data);
        this.mContext = context;
    }

    @Override
    protected void convert(BaseViewHolder helper, AuctionList.DataBean item) {


        Glide.with(mContext).load(item.getGoods_thumb()).into((ImageView) helper.getView(R.id.img));

        helper.setText(R.id.tv_name, item.getAct_name());
        helper.setText(R.id.tv_dang_qian_jia, "当前￥" + item.getCurrent_price());
        helper.setText(R.id.tv_chu_jia, "出价" + item.getCurrent_count() + "次");

        long time = Long.parseLong(item.getEnd_time()) * 1000 - System.currentTimeMillis();
        CountdownView mCvCountdownViewTest4 = (CountdownView) helper.getView(R.id.cv_countdownViewTest4);
        mCvCountdownViewTest4.start(time);
    }
}
