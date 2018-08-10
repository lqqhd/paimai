package com.xiaoxing.salesclient.mvp.ui.adapter;

import android.content.Context;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.xiaoxing.salesclient.mvp.model.entity.SpecialcatList;

import java.util.List;

import xiaoxing.com.salesclient.R;


/**
 * Created by tad on 2017/11/16.
 */

public class ZhanTingGoodsListAdapter extends BaseQuickAdapter<SpecialcatList.DataBean.GoodsBean, BaseViewHolder> {
    private Context mContext;

    public ZhanTingGoodsListAdapter(@Nullable List<SpecialcatList.DataBean.GoodsBean> data) {
        super(R.layout.sales_client_listitem_zhan_ting_goods_list, data);
    }

    public ZhanTingGoodsListAdapter(Context context, @Nullable List<SpecialcatList.DataBean.GoodsBean> data) {
        super(R.layout.sales_client_listitem_zhan_ting_goods_list, data);
        this.mContext = context;
    }

    @Override
    protected void convert(BaseViewHolder helper, SpecialcatList.DataBean.GoodsBean item) {


        Glide.with(mContext).load(item.getGoods_img()).into((ImageView) helper.getView(R.id.shop_logo));

        helper.setText(R.id.tv_name, item.getGoods_name());
        helper.setText(R.id.tv_dang_qian_chu_jia, "当前￥" + item.getGoods_number());
        helper.setText(R.id.tv_chu_jia_ci_shu, "出价" + item.getGoods_number() + "次");
        helper.setText(R.id.tv_wei_guan, "围观" + item.getGoods_number() + "次");

        LinearLayout ll_pai_mai = helper.getView(R.id.ll_pai_mai);
        ll_pai_mai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}
