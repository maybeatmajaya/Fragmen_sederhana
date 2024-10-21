package com.example.fragmenfrompakely;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class TabsAdapter extends FragmentPagerAdapter {

    private int tabCount;

    public TabsAdapter(FragmentManager fm, int tabCount) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        this.tabCount = tabCount;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new HomeFragment();  // Tab pertama (Home)
            case 1:
                return new AboutFragment();  // Tab kedua (About)
            case 2:
                return new ContactFragment();  // Tab ketiga (Contact)
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}