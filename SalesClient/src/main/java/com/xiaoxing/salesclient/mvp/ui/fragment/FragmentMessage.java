package com.xiaoxing.salesclient.mvp.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alibaba.mobileim.IYWLoginService;
import com.alibaba.mobileim.YWAPI;
import com.alibaba.mobileim.YWIMKit;
import com.alibaba.mobileim.YWLoginParam;
import com.alibaba.mobileim.channel.event.IWxCallback;
import com.alibaba.mobileim.conversation.EServiceContact;
import com.jess.arms.base.BaseFragment;
import com.jess.arms.di.component.AppComponent;


import xiaoxing.com.salesclient.R;

import static com.jess.arms.base.BaseApplication.APP_KEY;


public class FragmentMessage extends BaseFragment {

    public static FragmentMessage newInstance(String content) {

        Bundle args = new Bundle();
        args.putString("", content);
        FragmentMessage fragment = new FragmentMessage();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void setupFragmentComponent(@NonNull AppComponent appComponent) {

    }

    @Override
    public View initView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.sales_client_fragment_message, null);


        return view;
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {
    }

    @Override
    public void setData(@Nullable Object data) {

    }


}
