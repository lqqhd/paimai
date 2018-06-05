package com.xiaoxing.seller.mvp.ui.adapter;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.xiaoxing.seller.R;
import com.xiaoxing.seller.mvp.ui.entity.BalanceDetails;

import java.util.List;


/**
 * Created by tad on 2017/11/16.
 */

public class BalanceDetailsAdapter extends BaseQuickAdapter<BalanceDetails, BaseViewHolder> {
    public BalanceDetailsAdapter(@Nullable List<BalanceDetails> data) {
        super(R.layout.seller_client_listitem_balance_details, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, BalanceDetails item) {

        helper.setText(R.id.tv_name, item.getName());
        helper.setText(R.id.tv_phone, item.getPhone());
        helper.setText(R.id.tv_address, item.getAddress());
        helper.setText(R.id.btn_mo_ren, "默认");

    }
}
