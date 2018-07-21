package com.xiaoxing.salesclient.mvp.ui.adapter;

import android.content.Context;
import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.xiaoxing.salesclient.mvp.model.entity.StoreShop;

import java.util.List;

import xiaoxing.com.salesclient.R;


/**
 * Created by tad on 2017/11/16.
 */

public class ZhanTingAdapter extends BaseQuickAdapter<StoreShop.DataBean, BaseViewHolder> {
    private Context mContext;

    public ZhanTingAdapter(@Nullable List<StoreShop.DataBean> data, Context context) {
        super(R.layout.sales_client_listitem_zhan_ting, data);
        this.mContext = context;
    }

    @Override
    protected void convert(BaseViewHolder helper, StoreShop.DataBean item) {

        Glide.with(mContext).load(item.getShop_logo()).into((ImageView) helper.getView(R.id.img_logo));
        Glide.with(mContext).load(item.getShop_logo()).into((ImageView) helper.getView(R.id.rl1_img1));
        Glide.with(mContext).load(item.getStreet_thumb()).into((ImageView) helper.getView(R.id.rl1_img2));
        Glide.with(mContext).load(item.getBrand_thumb()).into((ImageView) helper.getView(R.id.rl1_img3));

        helper.setText(R.id.tv_name, item.getGrade_name());
        helper.setText(R.id.tv_shop_name, item.getShop_name().getShop_name());
        helper.setText(R.id.tv_xin_yu_zhi, "信誉值" + item.getSales_volume());
        helper.setText(R.id.tv_xiao_shou_e, "销售额" + item.getSales_volume());
        helper.setText(R.id.tv_hao_ping, "好评" + item.getSales_volume() + "%");
        helper.setText(R.id.tv_fang_wen_liang, "访问量" + item.getSales_volume() + "次");

    }
}
