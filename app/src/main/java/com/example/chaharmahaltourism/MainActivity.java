package com.example.chaharmahaltourism;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.chaharmahaltourism.Adapters.HomeViewPagerAdapter;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.tool_bar_home);
        tabLayout = findViewById(R.id.tab_layout_home);
        viewPager = findViewById(R.id.view_pager_tab_layout_home);
        setSupportActionBar(toolbar);

        HomeViewPagerAdapter homeViewPagerAdapter =new HomeViewPagerAdapter(getSupportFragmentManager());
        homeViewPagerAdapter.addFrg(new HomeFragment(),"Home");
        homeViewPagerAdapter.addFrg(new WeatherFragment(),"Weather");
        homeViewPagerAdapter.addFrg(new MapFragment(),"Map");

        viewPager.setAdapter(homeViewPagerAdapter);

        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(1).setIcon(R.drawable.ic_weather_tablayout);
        tabLayout.getTabAt(0).setIcon(R.drawable.ic_home_tablayout);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_map_tablayout);
    }
}