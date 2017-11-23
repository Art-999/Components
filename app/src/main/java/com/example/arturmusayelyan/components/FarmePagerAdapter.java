package com.example.arturmusayelyan.components;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by artur.musayelyan on 23/11/2017.
 */

public class FarmePagerAdapter extends FragmentPagerAdapter {

    int colorArray[]={android.R.color.holo_red_light,android.R.color.holo_blue_bright,android.R.color.holo_green_light,android.R.color.holo_purple,android.R.color.holo_orange_light};
    public FarmePagerAdapter(FragmentManager fm) {
        super(fm);
    }



    @Override
    public Fragment getItem(int position) {
        return ItemFragment.newInstance(position,colorArray[position]);
    }

    @Override
    public int getCount() {
        return 5;
    }
}
