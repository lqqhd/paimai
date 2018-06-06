package com.xiaoxing.salesclient.mvp.ui.adapter;

import android.view.View;
import android.widget.TextView;

import com.chad.library.adapter.base.BaseViewHolder;

import butterknife.BindView;
import butterknife.ButterKnife;
import xiaoxing.com.salesclient.R2;

/**
 * @author quchao
 * @date 2018/3/14
 */

public class NavigationViewHolder extends BaseViewHolder {

    @BindView(R2.id.item_navigation_tv)
    TextView mTitle;

    public NavigationViewHolder(View view) {
        super(view);
        ButterKnife.bind(this, view);
    }
}
