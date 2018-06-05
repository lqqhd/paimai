package me.jessyan.armscomponent.commonres.utils;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.Toast;

import com.flyco.tablayout.SlidingTabLayout;
import com.flyco.tablayout.listener.OnTabSelectListener;

import java.util.ArrayList;

import me.jessyan.armscomponent.commonres.R;
import me.jessyan.armscomponent.commonsdk.adapter.TopTabAdapter;

public class SlidingTabLayoutUtil {


    public static void init(final FragmentActivity activity, String[] mTitles, ArrayList<Fragment> mFragments) {

        ViewPager vp = activity.findViewById(R.id.vp);
        TopTabAdapter mAdapter = new TopTabAdapter(activity.getSupportFragmentManager(), mFragments, mTitles);
        vp.setAdapter(mAdapter);
        SlidingTabLayout tabLayout_2 = activity.findViewById(R.id.tl_2);
        tabLayout_2.setViewPager(vp);
        tabLayout_2.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelect(int position) {
                Toast.makeText(activity, "onTabSelect&position--->" + position, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onTabReselect(int position) {
                Toast.makeText(activity, "onTabReselect&position--->" + position, Toast.LENGTH_SHORT).show();
            }
        });
//        tabLayout_2.showDot(4);
//
//        tabLayout_2.showMsg(3, 5);
//        tabLayout_2.setMsgMargin(3, 0, 10);
//
//        tabLayout_2.showMsg(5, 5);
//        tabLayout_2.setMsgMargin(5, 0, 10);

    }

    public static void init(View view, final Fragment fragment, String[] mTitles, ArrayList<Fragment> mFragments) {

        ViewPager vp = view.findViewById(R.id.vp);
        TopTabAdapter mAdapter = new TopTabAdapter(fragment.getFragmentManager(), mFragments, mTitles);
        vp.setAdapter(mAdapter);
        SlidingTabLayout tabLayout_2 = view.findViewById(R.id.tl_2);
        tabLayout_2.setViewPager(vp);
        tabLayout_2.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelect(int position) {
                Toast.makeText(fragment.getActivity(), "onTabSelect&position--->" + position, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onTabReselect(int position) {
                Toast.makeText(fragment.getActivity(), "onTabReselect&position--->" + position, Toast.LENGTH_SHORT).show();
            }
        });
//        tabLayout_2.showDot(4);
//
//        tabLayout_2.showMsg(3, 5);
//        tabLayout_2.setMsgMargin(3, 0, 10);
//
//        tabLayout_2.showMsg(5, 5);
//        tabLayout_2.setMsgMargin(5, 0, 10);

    }
}
