package com.xiaoxing.salesclient.mvp.ui.fragment;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.jess.arms.base.BaseFragment;
import com.jess.arms.di.component.AppComponent;
import com.xiaoxing.salesclient.mvp.ui.entity.AddressList;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import me.jessyan.armscomponent.commonsdk.utils.WebviewUtil;
import xiaoxing.com.salesclient.R;
import xiaoxing.com.salesclient.R2;

/**
 * 使用示例-空布页面
 * A simple {@link Fragment} subclass.
 */
public class FragmentWeiPaiDetail extends BaseFragment {
    @BindView(R2.id.webview)
    WebView webview;


    public static FragmentWeiPaiDetail newInstance(String detail) {

        Bundle args = new Bundle();
        args.putString("detail", detail);
        FragmentWeiPaiDetail fragment = new FragmentWeiPaiDetail();
        fragment.setArguments(args);
        return fragment;

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

    }

    @Override
    public View initView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.sales_client_fragment_wei_pai_detail, container, false);

        return root;
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {

        String detail = getArguments().getString("detail");
        WebviewUtil.loadData(getActivity(), webview, detail);
    }

    @Override
    public void setData(@Nullable Object data) {

    }


}
