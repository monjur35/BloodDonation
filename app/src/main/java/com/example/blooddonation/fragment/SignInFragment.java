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

import com.example.blooddonation.acitivity.HomeActivity;
import com.example.blooddonation.R;
import com.example.blooddonation.databinding.FragmentSignInBinding;
import com.ismaeldivita.chipnavigation.ChipNavigationBar;


public class SignInFragment extends Fragment {

    FragmentSignInBinding binding;
    ChipNavigationBar navigationBar;

    public SignInFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       binding=FragmentSignInBinding.inflate(inflater);
       navigationBar=getActivity().findViewById(R.id.navigationBar);
       return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.signUpText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_signInFragment_to_signUp1Fragment);
            }
        });

        binding.loginId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getActivity(), HomeActivity.class);
                startActivity(i);
            }
        });
    }
}