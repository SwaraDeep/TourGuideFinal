package com.example.unknown.tourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ItemAdapter extends FragmentPagerAdapter {

    Context mContext;

    public ItemAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int i) {
        if (i == 0) {
            return new AboutFragment();
        } else if (i == 1) {
            return new PlacesFragment();
        } else if (i == 2) {
            return new HotelFragment();
        } else if (i == 3) {
            return new RestaurantsFragment();
        } else
            return new HospitalsFragment();
    }

    @Override
    public int getCount() {
        int tabAmount = 5;
        return tabAmount;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return "About";
        } else if (position == 1) {
            return "Places";
        } else if (position == 2) {
            return "Hotels";
        } else if (position == 3) {
            return "Restaurants";
        } else {
            return "Hospitals";
        }
    }
}
