package com.xiaoxing.salesclient.mvp.ui.adapter;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.xiaoxing.salesclient.mvp.ui.entity.AddressList;

import java.util.List;

import xiaoxing.com.salesclient.R;


/**
 * Created by tad on 2017/11/16.
 */

public class ZhanTingAdapter extends BaseQuickAdapter<AddressList, BaseViewHolder> {
    public ZhanTingAdapter(@Nullable List<AddressList> data) {
        super(R.layout.sales_client_listitem_zhan_ting, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, AddressList item) {


    }
}
