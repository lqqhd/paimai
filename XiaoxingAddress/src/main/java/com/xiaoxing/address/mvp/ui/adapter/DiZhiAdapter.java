package com.xiaoxing.address.mvp.ui.adapter;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.xiaoxing.address.R;
import com.xiaoxing.address.mvp.ui.entity.AddressList;

import java.util.List;


/**
 * Created by tad on 2017/11/16.
 */

public class DiZhiAdapter extends BaseQuickAdapter<AddressList, BaseViewHolder> {
    public DiZhiAdapter(@Nullable List<AddressList> data) {
        super(R.layout.listitem_address, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, AddressList item) {

        helper.setText(R.id.tv_name, item.getName());
        helper.setText(R.id.tv_phone, item.getPhone());
        helper.setText(R.id.tv_address, item.getAddress());
        helper.setText(R.id.btn_mo_ren, "默认");

    }
}
