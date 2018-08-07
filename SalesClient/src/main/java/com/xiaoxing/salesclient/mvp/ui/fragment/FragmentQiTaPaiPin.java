package com.xiaoxing.salesclient.mvp.ui.fragment;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.alibaba.android.arouter.launcher.ARouter;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.constant.SpinnerStyle;
import com.scwang.smartrefresh.layout.header.ClassicsHeader;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;
import com.xiaoxing.salesclient.mvp.model.entity.AuctionDetail;
import com.xiaoxing.salesclient.mvp.model.entity.Category;
import com.xiaoxing.salesclient.mvp.ui.adapter.CangPinAdapter;
import com.xiaoxing.salesclient.mvp.ui.adapter.QiTaPaiPinAdapter;
import com.xiaoxing.salesclient.mvp.ui.entity.AddressList;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import me.jessyan.armscomponent.commonsdk.core.RouterHub;
import xiaoxing.com.salesclient.R;

import static android.support.v7.widget.DividerItemDecoration.VERTICAL;
import static com.xiaoxing.salesclient.mvp.ui.fragment.FragmentNavigationList.PRODUCT_ID;

/**
 * 使用示例-空布页面
 * A simple {@link Fragment} subclass.
 */
public class FragmentQiTaPaiPin extends Fragment implements OnRefreshListener {

    public static final String PRODUCTS_LIST = "products_list";
    private QiTaPaiPinAdapter mAdapter;


    private View mEmptyLayout;
    private RecyclerView mRecyclerView;
    private RefreshLayout mRefreshLayout;
    private static boolean mIsNeedDemo = true;

    public static FragmentQiTaPaiPin getInstance(List<AuctionDetail.DataBean.OtherGoodsBean> otherGoodsBeans) {
        FragmentQiTaPaiPin fragment = new FragmentQiTaPaiPin();
        Bundle args = new Bundle();
        args.putSerializable(PRODUCTS_LIST, (Serializable) otherGoodsBeans);
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.sales_client_fragment_all_zhuan_chang, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View root, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(root, savedInstanceState);


        mRefreshLayout = root.findViewById(R.id.refreshLayout);
        mRefreshLayout.setRefreshHeader(new ClassicsHeader(getActivity()).setSpinnerStyle(SpinnerStyle.FixedBehind).setPrimaryColorId(R.color.public_colorPrimary).setAccentColorId(android.R.color.white));
        mRefreshLayout.setOnRefreshListener(this);

        mRecyclerView = (RecyclerView) root.findViewById(R.id.recyclerView);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        mRecyclerView.addItemDecoration(new DividerItemDecoration(getActivity(), VERTICAL));

        mEmptyLayout = root.findViewById(R.id.empty);

        ImageView image = (ImageView) root.findViewById(R.id.empty_image);
        image.setImageResource(R.drawable.ic_empty);

        TextView empty = (TextView) root.findViewById(R.id.empty_text);
        empty.setText("暂无数据");
        mEmptyLayout.setVisibility(View.GONE);

        mRefreshLayout.setEnableRefresh(false);
        mRefreshLayout.setEnableLoadMore(false);

        List<AuctionDetail.DataBean.OtherGoodsBean> goodsBeans = (List<AuctionDetail.DataBean.OtherGoodsBean>) getArguments().getSerializable(PRODUCTS_LIST);

        if (goodsBeans != null) {

            mRecyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 2));
            mRecyclerView.addItemDecoration(new DividerItemDecoration(getActivity(), VERTICAL));
            mRecyclerView.setItemAnimator(new DefaultItemAnimator());
            mRecyclerView.setAdapter(mAdapter = new QiTaPaiPinAdapter(getActivity(), goodsBeans));
//                mRecyclerView.setAdapter(new BaseRecyclerAdapter<Item>(Arrays.asList(Item.values()), simple_list_item_2, FragmentOrderList.this) {
//                    @Override
//                    protected void onBindViewHolder(SmartViewHolder holder, Item model, int position) {
//                        holder.text(android.R.id.text1, model.name());
////                        holder.text(android.R.id.text2, model.name);
////                        holder.textColorId(android.R.id.text2, R.color.colorTextAssistant);
//                    }
//                });
            mAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
                @Override
                public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
//                Utils.navigation(getActivity(), RouterHub.SALES_CLIENT_WEI_PAI_DETAIL_ACTIVITY);
                    ARouter.getInstance().build(RouterHub.SALES_CLIENT_WEI_PAI_DETAIL_ACTIVITY).withString(PRODUCT_ID, goodsBeans.get(position).getGoods_id()).navigation();

                }
            });


        } else {
            mEmptyLayout.setVisibility(View.VISIBLE);
        }

    }

    @Override
    public void onRefresh(@NonNull RefreshLayout refreshLayout) {
        mRefreshLayout.finishRefresh();
    }

    /**
     * 模拟数据
     */
    private List<AddressList> loadModels() {
        List<AddressList> addressLists = new ArrayList<>();

        for (int i = 0; i < 5; i++) {

            AddressList addressList = new AddressList();
            addressList.setName("name" + i);
            addressList.setAddress("address" + i);
            addressList.setPhone("1580000000" + i);
            addressLists.add(addressList);
        }


        return addressLists;
    }

}
