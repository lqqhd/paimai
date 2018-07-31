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
import com.xiaoxing.salesclient.di.component.DaggerFragmentNavigationComponent;
import com.xiaoxing.salesclient.di.module.FragmentNavigationModule;
import com.xiaoxing.salesclient.mvp.contract.FragmentNavigationContract;
import com.xiaoxing.salesclient.mvp.model.entity.Category;
import com.xiaoxing.salesclient.mvp.presenter.FragmentNavigationPresenter;

import java.util.ArrayList;
import java.util.List;

import butterknife.OnClick;
import me.jessyan.armscomponent.commonres.utils.SlidingTabLayoutUtil;
import me.jessyan.armscomponent.commonres.utils.ToolbarUtils;
import me.jessyan.armscomponent.commonsdk.core.RouterHub;
import me.jessyan.armscomponent.commonsdk.utils.Utils;
import xiaoxing.com.salesclient.R;
import xiaoxing.com.salesclient.R2;

public class FragmentNavigation extends BaseFragment<FragmentNavigationPresenter> implements FragmentNavigationContract.View {

    private final String[] mTitles = {"古董古玩", "现代艺术"};
    private View view;

    public static FragmentNavigation newInstance(String content) {
        Bundle args = new Bundle();
        args.putString("", content);
        FragmentNavigation fragment = new FragmentNavigation();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void setupFragmentComponent(@NonNull AppComponent appComponent) {
        DaggerFragmentNavigationComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .fragmentNavigationModule(new FragmentNavigationModule(this))
                .build()
                .inject(this);
    }

    @Override
    public View initView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.sales_client_fragment_navigation, null);

        ToolbarUtils.initToolbarTitleNoBack(view, this, getString(R.string.sales_client_navigation));


        return view;
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {
        mPresenter.getCategory();
    }

    @Override
    public void setData(@Nullable Object data) {

    }

    @OnClick(R2.id.et_search)
    void toSearch() {
        Utils.navigation(getActivity(), RouterHub.XIAO_XING_SEARCH_SearchActivity);
    }

    @Override
    public void categorySuccess(Category category) {

        List<Category.DataBean.FirstCategoryBean> firstCategoryBeanList = category.getData().getFirst_category();

        ArrayList<Fragment> mFragments = new ArrayList<>();
        String[] titles = new String[firstCategoryBeanList.size()];
//        String[] titles = new String[2];
        for (int i = 0; i < firstCategoryBeanList.size(); i++) {
            if (firstCategoryBeanList.get(i).getSecond_category() != null) {
                mFragments.add(FragmentNavigationList.getInstance(i, category));
                titles[i] = firstCategoryBeanList.get(i).getCat_name();

            }
        }


        SlidingTabLayoutUtil.init(view, this, titles, mFragments);
    }

    @Override
    public void showMessage(@NonNull String message) {

    }
}
