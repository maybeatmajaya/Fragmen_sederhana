package com.example.fragmenfrompakely;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Setup Toolbar
        Toolbar toolbar = findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);

        // Setup TabLayout and ViewPager
        TabLayout tabLayout = findViewById(R.id.tab_layout);
        ViewPager viewPager = findViewById(R.id.view_pager);

        // Add tabs to the TabLayout
        tabLayout.addTab(tabLayout.newTab().setText("Home"));
        tabLayout.addTab(tabLayout.newTab().setText("About"));
        tabLayout.addTab(tabLayout.newTab().setText("Contact"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        // Setup ViewPager with TabsAdapter
        TabsAdapter adapter = new TabsAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);

        // Link TabLayout and ViewPager
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                tabLayout.setBackgroundColor(getResources().getColor(R.color.tabBackgroundColor)); // Set background color
                tabLayout.setTabTextColors(getResources().getColor(R.color.tabUnselectedColor), getResources().getColor(R.color.tabSelectedColor)); // Set text colors
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                // Optional: You can implement behavior for unselected tabs if needed
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                // Optional: Handle reselection if necessary
            }
        });

        // Set initial colors
        tabLayout.setBackgroundColor(getResources().getColor(R.color.tabBackgroundColor));
        tabLayout.setTabTextColors(getResources().getColor(R.color.tabUnselectedColor), getResources().getColor(R.color.tabSelectedColor));
    }
}