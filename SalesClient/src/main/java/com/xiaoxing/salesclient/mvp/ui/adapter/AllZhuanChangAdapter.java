package com.xiaoxing.salesclient.mvp.ui.adapter;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.xiaoxing.salesclient.mvp.ui.entity.AddressList;

import java.util.List;

import cn.iwgang.countdownview.CountdownView;
import xiaoxing.com.salesclient.R;


/**
 * Created by tad on 2017/11/16.
 */

public class AllZhuanChangAdapter extends BaseQuickAdapter<AddressList, BaseViewHolder> {
    public AllZhuanChangAdapter(@Nullable List<AddressList> data) {
        super(R.layout.sales_client_listitem_all_zhuan_chang, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, AddressList item) {

        initCountdownView(helper);
    }

    private void initCountdownView(BaseViewHolder viewHolder) {
        CountdownView mCvCountdownViewTest4 = (CountdownView) viewHolder.getView(R.id.cv_countdownView);
        long time4 = (long) 150 * 24 * 60 * 60 * 1000;
        mCvCountdownViewTest4.start(time4);
    }
}
