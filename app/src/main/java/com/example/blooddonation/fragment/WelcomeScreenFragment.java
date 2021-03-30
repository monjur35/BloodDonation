package com.example.blooddonation.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.blooddonation.HomeActivity;
import com.example.blooddonation.R;
import com.example.blooddonation.databinding.FragmentWelcomeScreenBinding;


public class WelcomeScreenFragment extends Fragment {

    FragmentWelcomeScreenBinding binding;


    public WelcomeScreenFragment() {

    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       binding=FragmentWelcomeScreenBinding.inflate(inflater);
       return binding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.startJourny.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent=new Intent(getActivity(), HomeActivity.class);
                startActivity(homeIntent);
                getActivity().finish();

            }
        });
    }
}