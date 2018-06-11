package com.xiaoxing.salesclient.mvp.ui.activity;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.xiaoxing.salesclient.mvp.ui.fragment.FragmentHome;

import me.jessyan.armscomponent.commonsdk.core.RouterHub;
import me.jessyan.armscomponent.commonsdk.utils.Utils;
import xiaoxing.com.salesclient.R;

public class ZhanTingTuiGuangDetailAdapter extends BaseQuickAdapter<FragmentHome.Movie, BaseViewHolder> {
    private Context mContext;

    public ZhanTingTuiGuangDetailAdapter(Context context) {

        super(R.layout.sales_client_listitem_zhan_ting_tui_guang_detail);

        this.mContext = context;
    }

    @Override
    protected void convert(BaseViewHolder viewHolder, FragmentHome.Movie item) {
        Glide.with(mContext).load(item.picaddr).into((ImageView) viewHolder.getView(R.id.lmi_avatar));
        RelativeLayout rl_wei_pai_item = viewHolder.getView(R.id.rl_wei_pai_item);
        rl_wei_pai_item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.navigation(mContext, RouterHub.SALES_CLIENT_WEIPAIDETAILACTIVITY);

            }
        });
    }
}