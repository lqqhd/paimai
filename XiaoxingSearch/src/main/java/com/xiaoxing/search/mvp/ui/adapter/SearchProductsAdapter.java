package com.xiaoxing.search.mvp.ui.adapter;

import android.content.Context;
import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.xiaoxing.search.R;
import com.xiaoxing.search.mvp.model.entity.AuctionSearch;

import java.util.List;


/**
 * Created by tad on 2017/11/16.
 */

public class SearchProductsAdapter extends BaseQuickAdapter<AuctionSearch.DataBean, BaseViewHolder> {
    private Context mContext;

    public SearchProductsAdapter(Context context, @Nullable List<AuctionSearch.DataBean> data) {
        super(R.layout.listitem_search_products, data);
        this.mContext = context;
    }

    @Override
    protected void convert(BaseViewHolder helper, AuctionSearch.DataBean item) {


        Glide.with(mContext).load(item.getGoods_thumb()).into((ImageView) helper.getView(R.id.img));
        helper.setText(R.id.tv_name, item.getAct_name());
        helper.setText(R.id.tv_time, "当前￥" + item.getCurrent_price());
        helper.setText(R.id.tv_title, "出价" + item.getCurrent_count() + "次");
    }
}
