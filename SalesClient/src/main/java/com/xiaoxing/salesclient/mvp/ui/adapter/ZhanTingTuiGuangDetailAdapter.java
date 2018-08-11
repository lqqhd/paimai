package com.xiaoxing.salesclient.mvp.ui.adapter;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.alibaba.android.arouter.launcher.ARouter;
import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.xiaoxing.salesclient.mvp.model.entity.StoreInfo;
import com.xiaoxing.salesclient.mvp.ui.fragment.FragmentHome;

import java.util.List;

import me.jessyan.armscomponent.commonsdk.core.RouterHub;
import me.jessyan.armscomponent.commonsdk.utils.Utils;
import xiaoxing.com.salesclient.R;

import static me.jessyan.armscomponent.commonsdk.core.Constants.PRODUCT_ID;

public class ZhanTingTuiGuangDetailAdapter extends BaseQuickAdapter<StoreInfo.DataBean.GoodsListBean, BaseViewHolder> {
    private Context mContext;

    public ZhanTingTuiGuangDetailAdapter(Context context, List<StoreInfo.DataBean.GoodsListBean> data) {

        super(R.layout.sales_client_listitem_zhan_ting_tui_guang_detail, data);

        this.mContext = context;
    }

    @Override
    protected void convert(BaseViewHolder viewHolder, StoreInfo.DataBean.GoodsListBean item) {
        Glide.with(mContext).load(item.getGoods_url()).into((ImageView) viewHolder.getView(R.id.lmi_avatar));
        viewHolder.setText(R.id.textview1, item.getGoods_name());
        RelativeLayout rl_wei_pai_item = viewHolder.getView(R.id.rl_wei_pai_item);
        rl_wei_pai_item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Utils.navigation(mContext, RouterHub.SALES_CLIENT_WEI_PAI_DETAIL_ACTIVITY);
                ARouter.getInstance().build(RouterHub.SALES_CLIENT_WEI_PAI_DETAIL_ZHENG_CHANG_ACTIVITY).withString(PRODUCT_ID, item.getGoods_id()).navigation();

            }
        });
    }
}