package com.xiaoxing.salesclient.mvp.ui.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.alibaba.android.arouter.launcher.ARouter;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemChildClickListener;
import com.chad.library.adapter.base.listener.SimpleClickListener;
import com.jess.arms.base.BaseFragment;
import com.jess.arms.di.component.AppComponent;
import com.xiaoxing.salesclient.di.component.DaggerFragmentNavigationListComponent;
import com.xiaoxing.salesclient.di.module.FragmentNavigationListModule;
import com.xiaoxing.salesclient.mvp.contract.FragmentNavigationListContract;
import com.xiaoxing.salesclient.mvp.model.entity.Category;
import com.xiaoxing.salesclient.mvp.presenter.FragmentNavigationListPresenter;
import com.xiaoxing.salesclient.mvp.ui.adapter.NavigationListLeftAdapter;
import com.xiaoxing.salesclient.mvp.ui.adapter.NavigationListRightAdapter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import me.jessyan.armscomponent.commonsdk.core.RouterHub;
import xiaoxing.com.salesclient.R;
import xiaoxing.com.salesclient.R2;

import static com.xiaoxing.salesclient.mvp.ui.fragment.FragmentCangPin.PRODUCTS_LIST;

public class FragmentNavigationList extends BaseFragment<FragmentNavigationListPresenter> implements FragmentNavigationListContract.View {

    public static final String INDEX = "index";
    public static final String CATEGORY = "category";
    public static final String PRODUCT_ID = "product_id";
    public static String[] cates = {"陶瓷陶器", "玉器玉雕", "古币纸钱", "收藏杂项", "铜器铜雕", "中国书画", "古典家具", "邮票邮品", "齐化奇石", "金银珠宝", "专题收藏", "雕品工艺", "图书报刊", "西画雕塑"};
    Unbinder unbinder;


    private RecyclerView mLeftRvRecyclerView;
    private RecyclerView mRightRvRecyclerView;
    private NavigationListLeftAdapter leftAdapter;
    private NavigationListRightAdapter rightAdapter;
    private TextView item_navigation_tv_title;

    private List<Category.DataBean.FirstCategoryBean.SecondCategoryBean.GoodsBean> mGoodsBeanList = new ArrayList<>();
    private List<Category.DataBean.FirstCategoryBean.SecondCategoryBean> mSecondCategoryBeans = new ArrayList<>();
    private Category mCategory;
    private int mIndex;

    public static FragmentNavigationList getInstance(int index, Category category) {
        FragmentNavigationList fragment = new FragmentNavigationList();
        Bundle args = new Bundle();
        args.putInt(INDEX, index);
        args.putSerializable(CATEGORY, (Serializable) category);
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public void setupFragmentComponent(@NonNull AppComponent appComponent) {
        DaggerFragmentNavigationListComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .fragmentNavigationListModule(new FragmentNavigationListModule(this))
                .build()
                .inject(this);
    }

    @Override
    public View initView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.sales_client_fragment_navigation_list, null);
        mLeftRvRecyclerView = (RecyclerView) view.findViewById(R.id.main_left_rv);
        mRightRvRecyclerView = (RecyclerView) view.findViewById(R.id.main_right_rv);
        item_navigation_tv_title = (TextView) view.findViewById(R.id.item_navigation_tv_title);
        return view;
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {


        mCategory = (Category) getArguments().getSerializable(CATEGORY);
        mIndex = getArguments().getInt(INDEX);


        leftAdapter = new NavigationListLeftAdapter(mSecondCategoryBeans);
        mLeftRvRecyclerView.setAdapter(leftAdapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        mLeftRvRecyclerView.setLayoutManager(linearLayoutManager);

        rightAdapter = new NavigationListRightAdapter(getActivity(), mGoodsBeanList);
        mRightRvRecyclerView.setAdapter(rightAdapter);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 3);
        mRightRvRecyclerView.setLayoutManager(gridLayoutManager);


        mLeftRvRecyclerView.addOnItemTouchListener(new SimpleClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i) {


                mGoodsBeanList.clear();
                mGoodsBeanList.addAll(mCategory.getData().getFirst_category().get(mIndex).getSecond_category().get(i).getGoods());

                leftAdapter.setSelectPos(i);
                leftAdapter.notifyDataSetChanged();
                rightAdapter.notifyDataSetChanged();

                item_navigation_tv_title.setText(mCategory.getData().getFirst_category().get(mIndex).getSecond_category().get(i).getCat_name());
            }

            @Override
            public void onItemLongClick(BaseQuickAdapter baseQuickAdapter, View view, int i) {

            }

            @Override
            public void onItemChildClick(BaseQuickAdapter baseQuickAdapter, View view, int i) {

            }

            @Override
            public void onItemChildLongClick(BaseQuickAdapter baseQuickAdapter, View view, int i) {

            }
        });
        mRightRvRecyclerView.addOnItemTouchListener(new SimpleClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                ARouter.getInstance().build(RouterHub.SALES_CLIENT_WEI_PAI_DETAIL_ACTIVITY).withString(PRODUCT_ID, mGoodsBeanList.get(position).getGoods_id()).navigation();

            }

            @Override
            public void onItemLongClick(BaseQuickAdapter adapter, View view, int position) {

            }

            @Override
            public void onItemChildClick(BaseQuickAdapter adapter, View view, int position) {

            }

            @Override
            public void onItemChildLongClick(BaseQuickAdapter adapter, View view, int position) {

            }
        });

        mSecondCategoryBeans.clear();
        mSecondCategoryBeans.addAll(mCategory.getData().getFirst_category().get(mIndex).getSecond_category());
        leftAdapter.notifyDataSetChanged();


        mGoodsBeanList.clear();
        mGoodsBeanList.addAll(mCategory.getData().getFirst_category().get(mIndex).getSecond_category().get(0).getGoods());
        rightAdapter.notifyDataSetChanged();

        item_navigation_tv_title.setText(mCategory.getData().getFirst_category().get(mIndex).getSecond_category().get(0).getCat_name());


//        mPresenter.getCategory();


    }


    @Override
    public void setData(@Nullable Object data) {

    }

    @Override
    public void showMessage(@NonNull String message) {

    }

    @Override
    public void categorySuccess(Category category) {

        mCategory = category;


        mSecondCategoryBeans.clear();
        mSecondCategoryBeans.addAll(category.getData().getFirst_category().get(0).getSecond_category());
        leftAdapter.notifyDataSetChanged();


        mGoodsBeanList.clear();
        mGoodsBeanList.addAll(category.getData().getFirst_category().get(0).getSecond_category().get(0).getGoods());
        rightAdapter.notifyDataSetChanged();

        item_navigation_tv_title.setText(category.getData().getFirst_category().get(0).getSecond_category().get(0).getCat_name());

    }


    @OnClick(R2.id.rl_navigation_cat1)
    public void onClick() {

        ARouter.getInstance().build(RouterHub.SALES_CLIENT_CANG_PIN_ACTIVITY).withSerializable(PRODUCTS_LIST, (Serializable) mGoodsBeanList).navigation();

    }
}
