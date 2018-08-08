package com.xiaoxing.salesclient.mvp.ui.adapter;

import android.content.Context;
import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.xiaoxing.salesclient.mvp.model.entity.AuctionDetail;

import java.util.List;

import xiaoxing.com.salesclient.R;


/**
 * Created by tad on 2017/11/16.
 */

public class QiTaPaiPinAdapter extends BaseQuickAdapter<AuctionDetail.DataBean.OtherGoodsBean, BaseViewHolder> {
    private Context mContext;

    public QiTaPaiPinAdapter(Context context, @Nullable List<AuctionDetail.DataBean.OtherGoodsBean> data) {
        super(R.layout.sales_client_listitem_cang_pin, data);
        this.mContext = context;
    }

    @Override
    protected void convert(BaseViewHolder helper, AuctionDetail.DataBean.OtherGoodsBean item) {

        Glide.with(mContext).load(item.getGoods_img()).into((ImageView) helper.getView(R.id.shop_logo));
        helper.setText(R.id.tv_name, item.getGoods_name());
        helper.setText(R.id.tv_dang_qian_jia, "￥" + item.getShop_price());

    }
}
