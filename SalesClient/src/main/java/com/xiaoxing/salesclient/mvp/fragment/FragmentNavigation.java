package com.xiaoxing.salesclient.mvp.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jess.arms.base.BaseFragment;
import com.jess.arms.di.component.AppComponent;

import java.util.ArrayList;

import me.jessyan.armscomponent.commonres.utils.SlidingTabLayoutUtil;
import me.jessyan.armscomponent.commonres.utils.ToolbarUtils;
import test.xiaoxing.com.salesclient.R;

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
        mFragments.add(new FragmentHome());
        mFragments.add(new FragmentHome());

        SlidingTabLayoutUtil.init(view, this, mTitles, mFragments);
        return view;
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {

    }

    @Override
    public void setData(@Nullable Object data) {

    }
}
