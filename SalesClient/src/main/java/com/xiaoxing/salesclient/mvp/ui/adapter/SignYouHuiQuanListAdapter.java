package com.xiaoxing.salesclient.mvp.ui.adapter;

import android.graphics.Color;
import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.xiaoxing.salesclient.mvp.model.entity.Category;

import java.util.List;

import xiaoxing.com.salesclient.R;

public class SignYouHuiQuanListAdapter extends BaseQuickAdapter<Category.DataBean.FirstCategoryBean.SecondCategoryBean, BaseViewHolder> {
    private int selectPos = 0;

    public SignYouHuiQuanListAdapter(@Nullable List<Category.DataBean.FirstCategoryBean.SecondCategoryBean> data) {
        super(R.layout.sales_client_item_navigation_list_left, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, Category.DataBean.FirstCategoryBean.SecondCategoryBean item) {
        if (selectPos == helper.getAdapterPosition()) {
            helper.setVisible(R.id.item_main_left_bg, true);
            helper.convertView.setBackgroundColor(Color.parseColor("#FFFFFF"));
            helper.setTextColor(R.id.item_main_left_type, Color.parseColor("#40a5f3"));
        } else {
            helper.convertView.setBackgroundColor(Color.parseColor("#f7f7f7"));
            helper.setTextColor(R.id.item_main_left_type, Color.parseColor("#333333"));
            helper.setVisible(R.id.item_main_left_bg, false);
        }

        helper.setText(R.id.item_main_left_type, item.getCat_name());

    }

    public int getSelectPos() {
        return selectPos;
    }

    public void setSelectPos(int selectPos) {
        this.selectPos = selectPos;
    }


}
