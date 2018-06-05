package com.xiaoxing.salesclient.mvp.adapter;


import android.support.annotation.Nullable;
import android.text.TextUtils;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.xiaoxing.salesclient.mvp.entity.FeedArticleData;
import com.xiaoxing.salesclient.mvp.entity.NavigationListData;

import java.util.List;

import test.xiaoxing.com.salesclient.R;


/**
 * @author quchao
 * @date 2018/3/2
 */

public class NavigationAdapter extends BaseQuickAdapter<NavigationListData, NavigationViewHolder> {

    public NavigationAdapter(int layoutResId, @Nullable List<NavigationListData> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(NavigationViewHolder helper, NavigationListData item) {
        if (!TextUtils.isEmpty(item.getName())) {
            helper.setText(R.id.item_navigation_tv, item.getName());
        }
        List<FeedArticleData> mArticles = item.getArticles();

    }
}
