package com.example.blooddonation.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.blooddonation.R;
import com.example.blooddonation.adapter.BottomSheet1Adapter;
import com.example.blooddonation.databinding.FragmentProfileBinding;
import com.google.android.material.tabs.TabLayout;


public class ProfileFragment extends Fragment {

    FragmentProfileBinding binding;

    BottomSheet1Adapter bottomSheet1Adapter;
    ViewPager viewPager;
    TabLayout tabs;



    public ProfileFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding=FragmentProfileBinding.inflate(inflater);

        viewPager=binding.getRoot().findViewById(R.id.bottomSheet_1ViewPagerId);
        tabs=binding.getRoot().findViewById(R.id.tabInbottomSheet_1);
        Log.d("TAG", "onCreateView:Profile : ViewPager:  "+viewPager +"/n  Tab: "+tabs );
        bottomSheet1Adapter=new BottomSheet1Adapter(getChildFragmentManager(),getContext());

        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        viewPager.setAdapter(bottomSheet1Adapter);
        tabs.setupWithViewPager(viewPager);
    }
}