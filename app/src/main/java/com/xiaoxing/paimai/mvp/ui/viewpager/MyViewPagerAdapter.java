package com.xiaoxing.paimai.mvp.ui.viewpager;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.xiaoxing.paimai.mvp.ui.fragment.FragmentMine;

public class MyViewPagerAdapter extends FragmentPagerAdapter {

    private int size;

    public MyViewPagerAdapter(FragmentManager fm, int size) {
        super(fm);
        this.size = size;
    }

    @Override
    public Fragment getItem(int position) {
        return FragmentMine.newInstance(position + "");
    }

    @Override
    public int getCount() {
        return size;
    }
}
