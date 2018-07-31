package com.xiaoxing.salesclient.mvp.ui.adapter;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.jess.arms.utils.ArmsUtils;

import java.util.List;

import me.jessyan.armscomponent.commonres.utils.MyCouponsList;
import xiaoxing.com.salesclient.R;

public class SignYouHuiQuanListAdapter extends BaseQuickAdapter<MyCouponsList.DataBean.NoUseBean, BaseViewHolder> {

    public SignYouHuiQuanListAdapter(@Nullable List<MyCouponsList.DataBean.NoUseBean> data) {
        super(R.layout.sales_client_listitem_you_hui_quan, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, MyCouponsList.DataBean.NoUseBean item) {

        helper.setText(R.id.tv_title, item.getCou_title());
        helper.setText(R.id.tv_you_xiao_ri_qi, "到期时间：" + ArmsUtils.stampToDate(item.getCou_end_time()));

    }


}
