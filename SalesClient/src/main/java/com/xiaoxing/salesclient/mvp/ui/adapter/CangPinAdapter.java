package com.xiaoxing.salesclient.mvp.ui.adapter;

import android.content.Context;
import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.xiaoxing.salesclient.mvp.model.entity.Category;

import java.util.List;

import me.jessyan.armscomponent.commonres.utils.GlideUtil;
import xiaoxing.com.salesclient.R;


/**
 * Created by tad on 2017/11/16.
 */

public class CangPinAdapter extends BaseQuickAdapter<Category.DataBean.FirstCategoryBean.SecondCategoryBean.GoodsBean, BaseViewHolder> {
    private Context mContext;

    public CangPinAdapter(Context context, @Nullable List<Category.DataBean.FirstCategoryBean.SecondCategoryBean.GoodsBean> data) {
        super(R.layout.sales_client_listitem_cang_pin, data);
        this.mContext = context;
    }

    @Override
    protected void convert(BaseViewHolder helper, Category.DataBean.FirstCategoryBean.SecondCategoryBean.GoodsBean item) {

//        Glide.with(mContext).load(item.getGoods_img()).into((ImageView) helper.getView(R.id.shop_logo));
        GlideUtil.displayImg(mContext, item.getGoods_img(), helper.getView(R.id.shop_logo));
        helper.setText(R.id.tv_name, item.getGoods_name());
        helper.setText(R.id.tv_dang_qian_jia, "￥" + item.getShop_price());

    }
}
