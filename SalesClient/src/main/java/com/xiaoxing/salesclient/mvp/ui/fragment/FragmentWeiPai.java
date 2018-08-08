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
import com.jess.arms.base.BaseFragment;
import com.jess.arms.di.component.AppComponent;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.constant.SpinnerStyle;
import com.scwang.smartrefresh.layout.header.ClassicsHeader;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;
import com.xiaoxing.salesclient.di.component.DaggerFragmentWeiPaiComponent;
import com.xiaoxing.salesclient.di.module.FragmentWeiPaiModule;
import com.xiaoxing.salesclient.mvp.contract.FragmentWeiPaiContract;
import com.xiaoxing.salesclient.mvp.model.entity.AuctionList;
import com.xiaoxing.salesclient.mvp.presenter.FragmentWeiPaiPresenter;
import com.xiaoxing.salesclient.mvp.ui.adapter.WeiPaiAdapter;
import com.xiaoxing.salesclient.mvp.ui.entity.AddressList;

import java.util.ArrayList;
import java.util.List;

import me.jessyan.armscomponent.commonsdk.core.RouterHub;
import me.jessyan.armscomponent.commonsdk.utils.Utils;
import xiaoxing.com.salesclient.R;

import static android.support.v7.widget.DividerItemDecoration.VERTICAL;
import static me.jessyan.armscomponent.commonsdk.core.Constants.ACT_ID;
import static me.jessyan.armscomponent.commonsdk.core.Constants.PRODUCT_ID;

/**
 * 使用示例-空布页面
 * A simple {@link Fragment} subclass.
 */
public class FragmentWeiPai extends BaseFragment<FragmentWeiPaiPresenter> implements OnRefreshListener, FragmentWeiPaiContract.View {

    private WeiPaiAdapter mAdapter;


    private View mEmptyLayout;
    private RecyclerView mRecyclerView;
    private RefreshLayout mRefreshLayout;
    private static boolean mIsNeedDemo = true;

    private List<AuctionList.DataBean> mDataBeans = new ArrayList<>();


    @Override
    public void onRefresh(@NonNull RefreshLayout refreshLayout) {

        getAuctionListData();
        mRefreshLayout.finishRefresh();
    }

    private void getAuctionListData() {
        mPresenter.getAuctionList("", "end_time", "DESC", "0");
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

    @Override
    public void setupFragmentComponent(@NonNull AppComponent appComponent) {
        DaggerFragmentWeiPaiComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .fragmentWeiPaiModule(new FragmentWeiPaiModule(this))
                .build()
                .inject(this);
    }

    @Override
    public View initView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.sales_client_fragment_all_zhuan_chang, container, false);

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
        empty.setText("暂无数据下拉刷新");

        mRecyclerView.setAdapter(mAdapter = new WeiPaiAdapter(getActivity(), mDataBeans));
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
                ARouter.getInstance().build(RouterHub.SALES_CLIENT_WEI_PAI_DETAIL_ACTIVITY).withString(ACT_ID, mDataBeans.get(position).getAct_id()).navigation();

            }
        });

        mRefreshLayout.autoRefresh();
        mRefreshLayout.setEnableLoadMore(false);


        return root;
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {

    }

    @Override
    public void setData(@Nullable Object data) {

    }

    @Override
    public void auctionListSuccess(AuctionList auctionList) {
        mDataBeans.clear();
        mDataBeans.addAll(auctionList.getData());
        mAdapter.notifyDataSetChanged();
        mEmptyLayout.setVisibility(View.GONE);
    }

    @Override
    public void showMessage(@NonNull String message) {

    }
}
