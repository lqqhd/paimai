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

public class ReMenPaiMaiAdapter extends BaseQuickAdapter<AddressList, BaseViewHolder> {
    public ReMenPaiMaiAdapter(@Nullable List<AddressList> data) {
        super(R.layout.sales_client_listitem_re_men_pai_mai, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, AddressList item) {


    }
}
