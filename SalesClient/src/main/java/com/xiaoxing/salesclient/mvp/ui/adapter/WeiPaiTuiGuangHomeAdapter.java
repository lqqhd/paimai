package com.xiaoxing.salesclient.mvp.ui.adapter;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.alibaba.android.arouter.launcher.ARouter;
import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.xiaoxing.salesclient.mvp.ui.fragment.FragmentHome;

import cn.iwgang.countdownview.CountdownView;
import me.jessyan.armscomponent.commonres.utils.GlideUtil;
import me.jessyan.armscomponent.commonsdk.core.Constants;
import me.jessyan.armscomponent.commonsdk.core.RouterHub;
import me.jessyan.armscomponent.commonsdk.utils.Utils;
import xiaoxing.com.salesclient.R;

public class WeiPaiTuiGuangHomeAdapter extends BaseQuickAdapter<FragmentHome.Movie, BaseViewHolder> {
    private Context mContext;

    public WeiPaiTuiGuangHomeAdapter(Context context) {

        super(R.layout.sales_client_listitem_wei_pai_tui_guang);

        this.mContext = context;
    }

    @Override
    protected void convert(BaseViewHolder viewHolder, FragmentHome.Movie item) {
//        Glide.with(mContext).load(item.picaddr).into((ImageView) viewHolder.getView(R.id.lmi_avatar));
        GlideUtil.displayImg(mContext, item.picaddr, viewHolder.getView(R.id.lmi_avatar));

        RelativeLayout rl_wei_pai_item = viewHolder.getView(R.id.rl_wei_pai_item);

        long time = Long.parseLong(item.grade) * 1000 - System.currentTimeMillis();
        initCountdownView(viewHolder, time);

        rl_wei_pai_item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Utils.navigation(mContext, RouterHub.SALES_CLIENT_WEI_PAI_DETAIL_ACTIVITY);
                ARouter.getInstance().build(RouterHub.SALES_CLIENT_WEI_PAI_DETAIL_ACTIVITY).withString(Constants.PRODUCT_ID, item.product_id).navigation(mContext);

            }
        });
    }

    private void initCountdownView(BaseViewHolder viewHolder, long time) {
        CountdownView mCvCountdownViewTest4 = (CountdownView) viewHolder.getView(R.id.cv_countdownViewTest4);
//        long time4 = (long) 150 * 24 * 60 * 60 * 1000;
        mCvCountdownViewTest4.start(time);
    }
}