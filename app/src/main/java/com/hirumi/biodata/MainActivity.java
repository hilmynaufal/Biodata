package com.hirumi.biodata;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.ActionBar;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter viewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = (TabLayout) findViewById(R.id.tablayout_id);
        viewPager = (ViewPager) findViewById(R.id.viewpager_id);
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());

        viewPagerAdapter.AddFragment(new FragmentProfile(), "PROFILE");
        viewPagerAdapter.AddFragment(new FragmentHobi(), "HOBI");
        viewPagerAdapter.AddFragment(new FragmentMakanan(), "MAKANAN");
        viewPagerAdapter.AddFragment(new FragmentMinuman(), "MINUMAN");
        viewPagerAdapter.AddFragment(new FragmentLagu(), "LAGU");
        viewPagerAdapter.AddFragment(new FragmentFilm(), "FILM");
        viewPager.setAdapter(viewPagerAdapter);

        tabLayout.setupWithViewPager(viewPager);
    }
}