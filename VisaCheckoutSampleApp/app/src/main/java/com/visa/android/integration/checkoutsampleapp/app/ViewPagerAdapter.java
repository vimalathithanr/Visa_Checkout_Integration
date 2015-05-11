package com.visa.android.integration.checkoutsampleapp.app;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 *  Adapter for tab fragments
 */
public class ViewPagerAdapter extends FragmentPagerAdapter {

    final int PAGE_COUNT = 3;

    // Tab Titles
    private String tabtitles[] = new String[] { "Express Checkout" , "Visa Payment Button", "Custom View" };

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 2:
                return new CustomViewVisaCheckoutFragment();
            case 1:
                return new VisaPaymentButtonFragment();
            case 0:
                return new VisaExpressCheckoutFragment();
        }
        return null;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabtitles[position];
    }
}
