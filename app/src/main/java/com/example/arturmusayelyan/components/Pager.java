package com.example.arturmusayelyan.components;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Pager extends AppCompatActivity {
    //https://www.journaldev.com/10096/android-viewpager-example-tutorial
    //http://www.viralandroid.com/2016/04/android-image-slider-tutorial.html

    private ViewPager pager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pager);

        pager = findViewById(R.id.viewpager);
       // pager.setAdapter(new CustomPagerAdapter(this));
        pager.setAdapter(new CustomImageAdapter(this));
    }
}
