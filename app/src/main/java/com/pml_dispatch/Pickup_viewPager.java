package com.pml_dispatch;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

public class Pickup_viewPager extends FragmentPagerAdapter {
    private int numOfTab;
    public Pickup_viewPager(FragmentManager fm,int numOfTab){
        super(fm);
        this.numOfTab=numOfTab;
    }
    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new pickup_fragment();
            case 1:
                return new pending_fragment();

            default:return null;
        }

    }

    @Override
    public int getCount() {
        return numOfTab;
    }
}
