package com.xiaoxing.salesclient.mvp.ui.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.RelativeLayout;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import com.innodroid.expandablerecycler.ExpandableRecyclerAdapter;
import com.xiaoxing.salesclient.mvp.utils.GlideImageLoader;
import com.youth.banner.Banner;
import com.youth.banner.listener.OnBannerClickListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import me.jessyan.armscomponent.commonsdk.core.RouterHub;
import me.jessyan.armscomponent.commonsdk.utils.Utils;
import xiaoxing.com.salesclient.R;

//import static com.xiaoxing.salesclient.mvp.ui.fragment.FragmentHome.BANNER_ITEMS;

public class NavigationListAdapter extends ExpandableRecyclerAdapter<NavigationListAdapter.NavigationListItem> {
    public static final int TYPE_SHANG_JIA_NAME = 1000; //商家名称
    public static final int TYPE_PRODUCTS = 1001; //商家订单多个商品
    public static final int TYPE_FOOTER = 1002; //商家订单底部统计
    private Context mContext;

    public NavigationListAdapter(Context context) {
        super(context);
        this.mContext = context;
        setItems(getSampleItems());
    }

    public static class NavigationListItem extends ExpandableRecyclerAdapter.ListItem {
        public String Text;

        public NavigationListItem(String group) {
            super(TYPE_SHANG_JIA_NAME);
            Text = group;
        }

        public NavigationListItem(String first, String last) {
            super(TYPE_PRODUCTS);
            Text = first + " " + last;
        }

        public NavigationListItem(String first, String last, String footer) {
            super(TYPE_FOOTER);
            Text = first + " " + last + " " + footer;
        }
    }

    public class ShangJiaNameViewHolder extends ExpandableRecyclerAdapter.ViewHolder {

        public ShangJiaNameViewHolder(View view) {
            super(view);
//            Banner banner = view.findViewById(R.id.convenientBanner);
//
//            banner.setImageLoader(new GlideImageLoader());
//            banner.setImages(BANNER_ITEMS);
//            banner.start();
//
//            banner.setOnBannerClickListener(new OnBannerClickListener() {
//                @Override
//                public void OnBannerClick(int position) {
//                    Utils.navigation(mContext, RouterHub.SALES_CLIENT_ZHUANCHANGACTIVITY);
//                }
//            });
        }

        public void bind(int position) {
        }
    }

    public class ProductsViewHolder extends ExpandableRecyclerAdapter.ViewHolder {
        List<Map<String, Object>> data_list;

        public ProductsViewHolder(View view) {
            super(view);
            GridView gridView = (GridView) view.findViewById(R.id.gridview);
            data_list = new ArrayList<Map<String, Object>>();
            SimpleAdapter simpleAdapter = new SimpleAdapter(mContext, getData(), R.layout.sales_client_item_navigation_list_cat1_products, new String[]{"pic", "text"}, new int[]{R.id.img_product, R.id.item_navigation_tv});
            gridView.setAdapter(simpleAdapter);
            gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Utils.navigation(mContext, RouterHub.SALES_CLIENT_CANG_PIN_ACTIVITY);
                }
            });
        }

        public void bind(int position) {
        }

        private List<Map<String, Object>> getData() {
            for (int i = 0; i < 9; i++) {
                Map<String, Object> map = new HashMap<String, Object>();
                map.put("pic", R.mipmap.goods_001);
                map.put("text", "陶瓷");
                data_list.add(map);
            }
            return data_list;
        }
    }

    public class FooterViewHolder extends ExpandableRecyclerAdapter.ViewHolder {

        public FooterViewHolder(View view) {
            super(view);
            RelativeLayout rl_navigation_cat1 = view.findViewById(R.id.rl_navigation_cat1);
            TextView item_navigation_tv_title = view.findViewById(R.id.item_navigation_tv_title);
            item_navigation_tv_title.setText("陶瓷陶器");
            rl_navigation_cat1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Utils.navigation(mContext, RouterHub.SALES_CLIENT_CANG_PIN_ACTIVITY);
                }
            });

        }

        public void bind(int position) {
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        switch (viewType) {
            case TYPE_SHANG_JIA_NAME:
                return new ShangJiaNameViewHolder(inflate(R.layout.sales_client_item_navigation_banner, parent));
            case TYPE_FOOTER:
                return new FooterViewHolder(inflate(R.layout.sales_client_item_navigation_list_cat1, parent));
            case TYPE_PRODUCTS:
            default:
                return new ProductsViewHolder(inflate(R.layout.sales_client_item_navigation_list_gridview, parent));
        }
    }

    @Override
    public void onBindViewHolder(ExpandableRecyclerAdapter.ViewHolder holder, int position) {
        switch (getItemViewType(position)) {
            case TYPE_SHANG_JIA_NAME:
                ((ShangJiaNameViewHolder) holder).bind(position);
                break;
            case TYPE_FOOTER:
                ((FooterViewHolder) holder).bind(position);
                break;
            case TYPE_PRODUCTS:
            default:
                ((ProductsViewHolder) holder).bind(position);
                break;
        }
    }

    private List<NavigationListItem> getSampleItems() {
        List<NavigationListItem> items = new ArrayList<>();

        items.add(new NavigationListItem("Friends"));
        items.add(new NavigationListItem("Pete", "Lake", "统计"));
        items.add(new NavigationListItem("Frank", "Hall"));
        items.add(new NavigationListItem("Sue", "West"));
        items.add(new NavigationListItem("Drew", "Smith"));
        items.add(new NavigationListItem("Alex", "Hall"));
        items.add(new NavigationListItem("Pete", "Lake", "统计"));
        items.add(new NavigationListItem("John", "Jones"));
        items.add(new NavigationListItem("Ed", "Smith"));
        items.add(new NavigationListItem("Jane", "Hall"));
        items.add(new NavigationListItem("Tim", "Lake"));
        items.add(new NavigationListItem("Pete", "Lake", "统计"));
        items.add(new NavigationListItem("Carol", "Jones"));
        items.add(new NavigationListItem("Alex", "Smith"));
        items.add(new NavigationListItem("Kristin", "Hall"));
        items.add(new NavigationListItem("Pete", "Lake"));

        return items;
    }
}
