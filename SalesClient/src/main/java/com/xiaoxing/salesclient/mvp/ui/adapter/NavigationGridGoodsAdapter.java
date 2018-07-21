package com.xiaoxing.salesclient.mvp.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.tencent.bugly.crashreport.common.info.AppInfo;
import com.xiaoxing.salesclient.mvp.model.entity.Category;

import java.util.ArrayList;
import java.util.List;

import xiaoxing.com.salesclient.R;

/**
 * @author 小星 QQ:753940262
 * @class describe
 * @time 2018/7/21 0021 21:26
 */
public class NavigationGridGoodsAdapter extends BaseAdapter {

    LayoutInflater inflater = null;

    private Context mContext;
    private List<Category.DataBean.SecondCategoryBean.GoodsBean> mGoodsBeanList;

    public NavigationGridGoodsAdapter(Context context, List<Category.DataBean.SecondCategoryBean.GoodsBean> data_list) {
        inflater = LayoutInflater.from(context);
        this.mContext = context;
        this.mGoodsBeanList = data_list;
    }

    @Override
    public int getCount() {
        return mGoodsBeanList.size();
    }

    @Override
    public Object getItem(int index) {
        return mGoodsBeanList.get(index);
    }

    @Override
    public long getItemId(int index) {
        return index;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null || convertView.getTag() == null) {
            convertView = inflater.inflate(R.layout.sales_client_item_navigation_list_cat1_products, null);
            holder = new ViewHolder();
            holder.imageView = (ImageView) convertView.findViewById(R.id.img_product);
            holder.textView = (TextView) convertView.findViewById(R.id.item_navigation_tv);
            convertView.setTag(holder);
        } else {

            holder = (ViewHolder) convertView.getTag();
        }


        Glide.with(mContext).load(mGoodsBeanList.get(position).getGoods_img()).into(holder.imageView);
        holder.textView.setText(mGoodsBeanList.get(position).getGoods_name());
        return convertView;
    }

    public class ViewHolder {
        ImageView imageView;
        TextView textView;
    }
}