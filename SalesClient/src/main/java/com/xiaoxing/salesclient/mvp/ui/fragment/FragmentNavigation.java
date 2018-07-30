package com.xiaoxing.salesclient.mvp.ui.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jess.arms.base.BaseFragment;
import com.jess.arms.di.component.AppComponent;
import com.xiaoxing.salesclient.di.component.DaggerFragmentNavigationListComponent;
import com.xiaoxing.salesclient.di.module.FragmentNavigationListModule;

import java.util.ArrayList;

import butterknife.OnClick;
import me.jessyan.armscomponent.commonres.utils.SlidingTabLayoutUtil;
import me.jessyan.armscomponent.commonres.utils.ToolbarUtils;
import me.jessyan.armscomponent.commonsdk.core.RouterHub;
import me.jessyan.armscomponent.commonsdk.utils.Utils;
import xiaoxing.com.salesclient.R;
import xiaoxing.com.salesclient.R2;

public class FragmentNavigation extends BaseFragment {

    private final String[] mTitles = {"古董古玩", "现代艺术"};


    public static FragmentNavigation newInstance(String content) {
        Bundle args = new Bundle();
        args.putString("", content);
        FragmentNavigation fragment = new FragmentNavigation();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void setupFragmentComponent(@NonNull AppComponent appComponent) {

    }

    @Override
    public View initView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.sales_client_fragment_navigation, null);

        ToolbarUtils.initToolbarTitleNoBack(view, this, getString(R.string.sales_client_navigation));

        ArrayList<Fragment> mFragments = new ArrayList<>();
        mFragments.add(FragmentNavigationList.getInstance("1"));
        mFragments.add(FragmentNavigationList.getInstance("2"));

        SlidingTabLayoutUtil.init(view, this, mTitles, mFragments);
        return view;
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {

    }

    @Override
    public void setData(@Nullable Object data) {

    }

    @OnClick(R2.id.et_search)
    void toSearch() {
        Utils.navigation(getActivity(), RouterHub.XIAO_XING_SEARCH_SearchActivity);
    }
}
