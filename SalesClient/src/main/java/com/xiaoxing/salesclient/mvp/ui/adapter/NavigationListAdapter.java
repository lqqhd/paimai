package com.xiaoxing.salesclient.mvp.ui.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.innodroid.expandablerecycler.ExpandableRecyclerAdapter;
import com.xiaoxing.salesclient.mvp.model.entity.Category;
import com.xiaoxing.salesclient.mvp.ui.entity.BannerItem;
import com.xiaoxing.salesclient.mvp.utils.GlideImageLoader;
import com.youth.banner.Banner;
import com.youth.banner.listener.OnBannerClickListener;

import java.util.ArrayList;
import java.util.List;

import me.jessyan.armscomponent.commonsdk.core.RouterHub;
import me.jessyan.armscomponent.commonsdk.utils.Utils;
import xiaoxing.com.salesclient.R;

import static com.xiaoxing.salesclient.mvp.ui.activity.WeiPaiDetailActivity.BANNER_ITEMS;

public class NavigationListAdapter extends ExpandableRecyclerAdapter<NavigationListAdapter.NavigationListItem> {
    public static final int TYPE_BANNER = 1000; //商家名称
    public static final int TYPE_CATNAME = 1001; //商家订单多个商品
    public static final int TYPE_GOODS = 1002; //商家订单底部统计
    private Context mContext;

    public NavigationListAdapter(Context context, Category category) {
        super(context);
        this.mContext = context;
        setItems(getSampleItems(category));
    }

    public static class NavigationListItem extends ExpandableRecyclerAdapter.ListItem {
        public String Text;

        public String mCatname;
        public String mGoodsName;
        public String mGoodsImg;
        public List<Category.DataBean.SecondCategoryBean.GoodsBean> mGoodsBeanList;

        public NavigationListItem(String group) {
            super(TYPE_BANNER);
            Text = group;
        }

        public NavigationListItem(String first, String last) {
            super(TYPE_CATNAME);
            Text = first + " " + last;

            mCatname = first;
        }

        public NavigationListItem(List<Category.DataBean.SecondCategoryBean.GoodsBean> goodsBeans, String last, String footer) {
            super(TYPE_GOODS);
            mGoodsBeanList = goodsBeans;
        }
    }

    public class BannerViewHolder extends ExpandableRecyclerAdapter.ViewHolder {

        public BannerViewHolder(View view) {
            super(view);

            //设置图片加载集合
            List<BannerItem> imageArray = new ArrayList<>();

            imageArray.add(new BannerItem("最后的骑士", "http://47.100.103.123/images/201807/goods_img/923_G_1532062567485.jpg"));
            imageArray.add(new BannerItem("最后的骑士", "http://47.100.103.123/images/201807/goods_img/923_G_1532062567485.jpg"));


            Banner banner = view.findViewById(R.id.convenientBanner);

            banner.setImageLoader(new GlideImageLoader());
            banner.setImages(imageArray);
            banner.start();

            banner.setOnBannerClickListener(new OnBannerClickListener() {
                @Override
                public void OnBannerClick(int position) {
                    Utils.navigation(mContext, RouterHub.SALES_CLIENT_ZHUANCHANGACTIVITY);
                }
            });
        }

        public void bind(int position) {
        }
    }

    public class GoodsViewHolder extends ExpandableRecyclerAdapter.ViewHolder {
        List<Category.DataBean.SecondCategoryBean.GoodsBean> data_list;

        private NavigationGridGoodsAdapter simpleAdapter;
        private List<Category.DataBean.SecondCategoryBean.GoodsBean> mList = new ArrayList<>();

        public GoodsViewHolder(View view) {
            super(view);
            GridView gridView = (GridView) view.findViewById(R.id.gridview);
            data_list = new ArrayList();
            simpleAdapter = new NavigationGridGoodsAdapter(mContext, mList);
            gridView.setAdapter(simpleAdapter);
            gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Utils.navigation(mContext, RouterHub.SALES_CLIENT_CANG_PIN_ACTIVITY);
                }
            });
        }

        public void bind(int position) {

            mList.addAll(visibleItems.get(position).mGoodsBeanList);
            simpleAdapter.notifyDataSetChanged();

        }

//        private List<Map<String, Object>> getData() {
//            for (int i = 0; i < visibleItems.get(position).mCatname; i++) {
//                Map<String, Object> map = new HashMap<String, Object>();
//                map.put("pic", R.mipmap.goods_001);
//                map.put("text", "陶瓷");
//                data_list.add(map);
//            }
//            return data_list;
//        }
    }

    public class CatnameViewHolder extends ExpandableRecyclerAdapter.ViewHolder {

        private TextView item_navigation_tv_title;

        public CatnameViewHolder(View view) {
            super(view);
            RelativeLayout rl_navigation_cat1 = view.findViewById(R.id.rl_navigation_cat1);
            item_navigation_tv_title = view.findViewById(R.id.item_navigation_tv_title);
            rl_navigation_cat1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Utils.navigation(mContext, RouterHub.SALES_CLIENT_CANG_PIN_ACTIVITY);
                }
            });

        }

        public void bind(int position) {
            item_navigation_tv_title.setText(visibleItems.get(position).mCatname);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        switch (viewType) {
            case TYPE_BANNER:
                return new BannerViewHolder(inflate(R.layout.sales_client_item_navigation_banner, parent));
            case TYPE_CATNAME:
                return new CatnameViewHolder(inflate(R.layout.sales_client_item_navigation_list_cat1, parent));
            case TYPE_GOODS:
            default:
                return new GoodsViewHolder(inflate(R.layout.sales_client_item_navigation_list_gridview, parent));
        }
    }

    @Override
    public void onBindViewHolder(ExpandableRecyclerAdapter.ViewHolder holder, int position) {
        switch (getItemViewType(position)) {
            case TYPE_BANNER:
                ((BannerViewHolder) holder).bind(position);
                break;
            case TYPE_CATNAME:
                ((CatnameViewHolder) holder).bind(position);
                break;
            case TYPE_GOODS:
            default:
                ((GoodsViewHolder) holder).bind(position);
                break;
        }
    }

    private List<NavigationListItem> getSampleItems() {
        List<NavigationListItem> items = new ArrayList<>();

//        items.add(new NavigationListItem("Friends"));
//        items.add(new NavigationListItem("Pete", "Lake", "统计"));
//        items.add(new NavigationListItem("Frank", "Hall"));
//        items.add(new NavigationListItem("Sue", "West"));
//        items.add(new NavigationListItem("Drew", "Smith"));
//        items.add(new NavigationListItem("Alex", "Hall"));
//        items.add(new NavigationListItem("Pete", "Lake", "统计"));
//        items.add(new NavigationListItem("John", "Jones"));
//        items.add(new NavigationListItem("Ed", "Smith"));
//        items.add(new NavigationListItem("Jane", "Hall"));
//        items.add(new NavigationListItem("Tim", "Lake"));
//        items.add(new NavigationListItem("Pete", "Lake", "统计"));
//        items.add(new NavigationListItem("Carol", "Jones"));
//        items.add(new NavigationListItem("Alex", "Smith"));
//        items.add(new NavigationListItem("Kristin", "Hall"));
//        items.add(new NavigationListItem("Pete", "Lake"));

        return items;
    }

    public List<NavigationListAdapter.NavigationListItem> getSampleItems(Category category) {
        List<NavigationListAdapter.NavigationListItem> items = new ArrayList<>();

        items.add(new NavigationListAdapter.NavigationListItem(""));
        List<Category.DataBean.SecondCategoryBean> secondCategoryBeanList = category.getData().getSecond_category();
        if (secondCategoryBeanList != null)
            if (secondCategoryBeanList.size() > 0) {
                for (int i = 0; i < secondCategoryBeanList.size(); i++) {

                    items.add(new NavigationListAdapter.NavigationListItem(secondCategoryBeanList.get(i).getCat_name(), ""));

                    List<Category.DataBean.SecondCategoryBean.GoodsBean> goodsListBeanList = secondCategoryBeanList.get(i).getGoods();
                    items.add(new NavigationListAdapter.NavigationListItem(goodsListBeanList, "", ""));

//                    if (goodsListBeanList != null)
//
//                        if (goodsListBeanList.size() > 0) {
//
//                            for (int i1 = 0; i1 < goodsListBeanList.size(); i1++) {
//
//                                items.add(new NavigationListAdapter.NavigationListItem(goodsListBeanList.get(i1).getGoods_name(), goodsListBeanList.get(i1).getGoods_thumb(), ""));
//                            }
//
//                        }


                }
            }


        return items;
    }
}
