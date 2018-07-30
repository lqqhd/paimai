package com.xiaoxing.salesclient.mvp.ui.adapter;

import android.content.Context;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.alibaba.android.arouter.launcher.ARouter;
import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.innodroid.expandablerecycler.ExpandableRecyclerAdapter;
import com.xiaoxing.salesclient.mvp.model.entity.Category;
import com.xiaoxing.salesclient.mvp.model.entity.Specialcat;
import com.xiaoxing.salesclient.mvp.ui.entity.BannerItem;
import com.xiaoxing.salesclient.mvp.utils.GlideImageLoader;
import com.youth.banner.Banner;
import com.youth.banner.listener.OnBannerClickListener;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import cn.iwgang.countdownview.CountdownView;
import me.jessyan.armscomponent.commonres.view.CustomGridView;
import me.jessyan.armscomponent.commonsdk.core.RouterHub;
import me.jessyan.armscomponent.commonsdk.utils.Utils;
import xiaoxing.com.salesclient.R;

import static com.xiaoxing.salesclient.mvp.ui.activity.WeiPaiDetailActivity.BANNER_ITEMS;

public class NavigationListRightAdapter extends BaseQuickAdapter<Category.DataBean.SecondCategoryBean.GoodsBean, BaseViewHolder> {
    private Context mContext;

    public NavigationListRightAdapter(Context context, @Nullable List<Category.DataBean.SecondCategoryBean.GoodsBean> data) {
        super(R.layout.sales_client_item_navigation_list_cat1_products, data);
        this.mContext = context;
    }

    @Override
    protected void convert(BaseViewHolder helper, Category.DataBean.SecondCategoryBean.GoodsBean item) {

        Glide.with(mContext).load(item.getGoods_img()).into((ImageView) helper.getView(R.id.img_product));
        helper.setText(R.id.item_navigation_tv, item.getGoods_name());

    }


}
