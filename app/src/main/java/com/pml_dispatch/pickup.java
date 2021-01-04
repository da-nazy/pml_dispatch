package com.pml_dispatch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class pickup extends AppCompatActivity {
ViewPager viewPager;
TabLayout tabLayout;

TabItem pickup,pending;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pickup);
        bindView();

        // PagerAdapter will pass the adata from tabs and display them in the viewpager
        Pickup_viewPager pickup_viewPager=new Pickup_viewPager(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(pickup_viewPager);

        // change the tabview on the user click
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    public void bindView(){
        viewPager=findViewById(R.id.pickup_viewpager);
        tabLayout=findViewById(R.id.tab_layout_pickup);
        pickup=findViewById(R.id.pick_up_tab_item);
        pending=findViewById(R.id.pending_tab_item);

    }
}