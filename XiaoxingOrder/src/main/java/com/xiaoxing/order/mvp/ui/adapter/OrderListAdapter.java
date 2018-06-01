package com.xiaoxing.order.mvp.ui.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import com.innodroid.expandablerecycler.ExpandableRecyclerAdapter;
import com.xiaoxing.order.R;

import java.util.ArrayList;
import java.util.List;

public class OrderListAdapter extends ExpandableRecyclerAdapter<OrderListAdapter.OrderListItem> {
    public static final int TYPE_SHANG_JIA_NAME = 1000; //商家名称
    public static final int TYPE_PRODUCTS = 1001; //商家订单多个商品
    public static final int TYPE_FOOTER = 1002; //商家订单底部统计

    public OrderListAdapter(Context context) {
        super(context);

        setItems(getSampleItems());
    }

    public static class OrderListItem extends ExpandableRecyclerAdapter.ListItem {
        public String Text;

        public OrderListItem(String group) {
            super(TYPE_SHANG_JIA_NAME);
            Text = group;
        }

        public OrderListItem(String first, String last) {
            super(TYPE_PRODUCTS);
            Text = first + " " + last;
        }

        public OrderListItem(String first, String last, String footer) {
            super(TYPE_FOOTER);
            Text = first + " " + last + " " + footer;
        }
    }

    public class ShangJiaNameViewHolder extends ExpandableRecyclerAdapter.ViewHolder {

        public ShangJiaNameViewHolder(View view) {
            super(view);

        }

        public void bind(int position) {
        }
    }

    public class ProductsViewHolder extends ExpandableRecyclerAdapter.ViewHolder {

        public ProductsViewHolder(View view) {
            super(view);

        }

        public void bind(int position) {
        }
    }

    public class FooterViewHolder extends ExpandableRecyclerAdapter.ViewHolder {

        public FooterViewHolder(View view) {
            super(view);

        }

        public void bind(int position) {
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        switch (viewType) {
            case TYPE_SHANG_JIA_NAME:
                return new ShangJiaNameViewHolder(inflate(R.layout.item_order_shang_jia, parent));
            case TYPE_FOOTER:
                return new FooterViewHolder(inflate(R.layout.item_order_tong_ji, parent));
            case TYPE_PRODUCTS:
            default:
                return new ProductsViewHolder(inflate(R.layout.item_order_shang_pin, parent));
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

    private List<OrderListItem> getSampleItems() {
        List<OrderListItem> items = new ArrayList<>();

        items.add(new OrderListItem("Friends"));
        items.add(new OrderListItem("Frank", "Hall"));
        items.add(new OrderListItem("Sue", "West"));
        items.add(new OrderListItem("Pete", "Lake", "统计"));
        items.add(new OrderListItem("Family"));
        items.add(new OrderListItem("Drew", "Smith"));
        items.add(new OrderListItem("Alex", "Hall"));
        items.add(new OrderListItem("Pete", "Lake", "统计"));
        items.add(new OrderListItem("Associates"));
        items.add(new OrderListItem("John", "Jones"));
        items.add(new OrderListItem("Ed", "Smith"));
        items.add(new OrderListItem("Jane", "Hall"));
        items.add(new OrderListItem("Tim", "Lake"));
        items.add(new OrderListItem("Pete", "Lake", "统计"));
        items.add(new OrderListItem("Colleagues"));
        items.add(new OrderListItem("Carol", "Jones"));
        items.add(new OrderListItem("Alex", "Smith"));
        items.add(new OrderListItem("Kristin", "Hall"));
        items.add(new OrderListItem("Pete", "Lake"));
        items.add(new OrderListItem("Pete", "Lake", "统计"));

        return items;
    }
}
