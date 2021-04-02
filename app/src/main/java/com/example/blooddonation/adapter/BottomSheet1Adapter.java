package com.example.blooddonation.adapter;

import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.blooddonation.R;
import com.example.blooddonation.fragment.bottomsheet1Viewpager.ContactViewPagerFragment;
import com.example.blooddonation.fragment.bottomsheet1Viewpager.InfoViewPagerFragment;

public class BottomSheet1Adapter extends FragmentPagerAdapter {

    private static final int TAB_TITLES[]  =new int[]{ R.string.tab1,R.string.tab2};
    private Context mContext;



    public BottomSheet1Adapter(@NonNull FragmentManager fm,Context mContext) {
        super(fm);
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        Fragment fragment;
        switch (position){
            case 0:
                fragment=new InfoViewPagerFragment();
                Log.e("TAG", "in tab View :explorer" );
                break;
            case 1:
                fragment=new ContactViewPagerFragment();
                Log.e("TAG", "in tab View :Dna" );
                break;


            default:
                fragment=new InfoViewPagerFragment();
                break;
        }
        return fragment;

    }



    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        return 2;
    }
}
