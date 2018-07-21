package com.xiaoxing.salesclient.mvp.ui.adapter;

import android.content.Context;
import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.xiaoxing.salesclient.mvp.model.entity.Category;
import com.xiaoxing.salesclient.mvp.model.entity.Specialcat;

import java.util.List;

import cn.iwgang.countdownview.CountdownView;
import xiaoxing.com.salesclient.R;


/**
 * Created by tad on 2017/11/16.
 */

public class NavigationGoodsAdapter extends BaseQuickAdapter<Category.DataBean.SecondCategoryBean.GoodsBean, BaseViewHolder> {
    private Context mContext;

    public NavigationGoodsAdapter(Context context, @Nullable List<Category.DataBean.SecondCategoryBean.GoodsBean> data) {
        super(R.layout.sales_client_item_navigation_list_cat1_products, data);
        this.mContext = context;
    }

    @Override
    protected void convert(BaseViewHolder helper, Category.DataBean.SecondCategoryBean.GoodsBean item) {

//        Glide.with(mContext).load(item.getTouch_icon()).into((ImageView) helper.getView(R.id.img_1));
//
//        helper.setText(R.id.tv_name, item.getCat_name());
 
    }

  
}
