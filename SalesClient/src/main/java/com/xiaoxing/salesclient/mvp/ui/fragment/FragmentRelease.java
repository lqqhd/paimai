package com.xiaoxing.salesclient.mvp.ui.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jess.arms.base.BaseFragment;
import com.jess.arms.di.component.AppComponent;

import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import me.jessyan.armscomponent.commonres.utils.ToolbarUtils;
import me.jessyan.armscomponent.commonsdk.core.RouterHub;
import me.jessyan.armscomponent.commonsdk.utils.Utils;
import xiaoxing.com.salesclient.R;
import xiaoxing.com.salesclient.R2;

public class FragmentRelease extends BaseFragment {


    Unbinder unbinder;

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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO: inflate a fragment view
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        unbinder = ButterKnife.bind(this, rootView);
        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @OnClick({R2.id.tv_wei_pai_cang_pin_fa_bu, R2.id.tv_zhuan_chang_huo_dong_fa_huo, R2.id.tv_zhan_ting_cang_pin_fa_bu})
    public void onClick(View view) {
        int i = view.getId();
        if (i == R.id.tv_wei_pai_cang_pin_fa_bu) {
            Utils.navigation(getActivity(), RouterHub.SALES_CLIENT_CHUANG_JIAN_WEI_PAI_ACTIVITY);
        } else if (i == R.id.tv_zhuan_chang_huo_dong_fa_huo) {
            Utils.navigation(getActivity(), RouterHub.SALES_CLIENT_CHUANG_JIAN_ZHUAN_CHANG_ACTIVITY);
        } else if (i == R.id.tv_zhan_ting_cang_pin_fa_bu) {
            Utils.navigation(getActivity(), RouterHub.SALES_CLIENT_CHUANG_JIAN_ZHAN_PIN_ACTIVITY);
        }
    }
}
