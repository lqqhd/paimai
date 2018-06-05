package com.xiaoxing.salesclient.mvp.viewpager;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.xiaoxing.salesclient.mvp.fragment.FragmentHome;
import com.xiaoxing.salesclient.mvp.fragment.FragmentMine;
import com.xiaoxing.salesclient.mvp.fragment.FragmentNavigation;

public class MyViewPagerAdapter extends FragmentPagerAdapter {

    private int size;

    public MyViewPagerAdapter(FragmentManager fm, int size) {
        super(fm);
        this.size = size;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0:
                fragment = FragmentHome.newInstance(position + "");
                break;
            case 1:
                fragment = FragmentNavigation.newInstance(position + "");
                break;
            case 2:
                fragment = FragmentMine.newInstance(position + "");
                break;
            case 3:
                fragment = FragmentMine.newInstance(position + "");
                break;
            case 4:
                fragment = FragmentMine.newInstance(position + "");
                break;
        }

        return fragment;
    }

    @Override
    public int getCount() {
        return size;
    }
}
