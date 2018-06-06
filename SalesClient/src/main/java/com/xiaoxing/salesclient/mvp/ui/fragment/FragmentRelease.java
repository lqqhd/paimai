package com.xiaoxing.salesclient.mvp.ui.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jess.arms.base.BaseFragment;
import com.jess.arms.di.component.AppComponent;

import me.jessyan.armscomponent.commonres.utils.ToolbarUtils;
import xiaoxing.com.salesclient.R;

public class FragmentRelease extends BaseFragment {


    public static FragmentRelease newInstance(String content) {
        Bundle args = new Bundle();
        args.putString("", content);
        FragmentRelease fragment = new FragmentRelease();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void setupFragmentComponent(@NonNull AppComponent appComponent) {

    }

    @Override
    public View initView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.sales_client_fragment_realese, null);

        ToolbarUtils.initToolbarTitleNoBack(view, this, getString(R.string.sales_client_release));

        return view;
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {

    }

    @Override
    public void setData(@Nullable Object data) {

    }
}
