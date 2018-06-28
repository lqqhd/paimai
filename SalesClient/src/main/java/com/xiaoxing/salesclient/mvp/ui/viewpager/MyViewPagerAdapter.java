package com.xiaoxing.salesclient.mvp.ui.viewpager;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.xiaoxing.salesclient.mvp.ui.fragment.FragmentHome;
import com.xiaoxing.salesclient.mvp.ui.fragment.FragmentMessage;
import com.xiaoxing.salesclient.mvp.ui.fragment.FragmentMine;
import com.xiaoxing.salesclient.mvp.ui.fragment.FragmentNavigation;
import com.xiaoxing.salesclient.mvp.ui.fragment.FragmentRelease;

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
                fragment = FragmentRelease.newInstance(position + "");
                break;
            case 3:
                fragment = FragmentMessage.newInstance(position + "");
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
