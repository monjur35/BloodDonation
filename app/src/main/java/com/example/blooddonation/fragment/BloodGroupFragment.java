package com.example.blooddonation.fragment;

import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.blooddonation.R;
import com.example.blooddonation.databinding.FragmentBloodGroupBinding;


public class BloodGroupFragment extends Fragment {
    FragmentBloodGroupBinding binding;
    private String bloodGroup;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding=FragmentBloodGroupBinding.inflate(inflater);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.abNegetive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               if ( binding.abNegetive.isSelected()){
                   binding.abNegetive.setSelected(false);
                   binding.abNegetive.setTextColor(Color.RED);
               }
               else {
                   binding.abNegetive.setTextColor(Color.WHITE);
                   binding.abNegetive.setSelected(true);


                   binding.abPositive.setSelected(false);
                   binding.aPostiveId.setSelected(false);
                   binding.aNegetiveId.setSelected(false);
                   binding.bNegetive.setSelected(false);
                   binding.bPostiveId.setSelected(false);
                   binding.oPositive.setSelected(false);
                   binding.oNegetive.setSelected(false);
               }

            }
        });
        binding.aPostiveId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ( binding.aPostiveId.isSelected()){
                    binding.aPostiveId.setSelected(false);
                    binding.aPostiveId.setTextColor(Color.RED);
                }
                else {
                    binding.aPostiveId.setTextColor(Color.WHITE);
                    binding.aPostiveId.setSelected(true);
                    bloodGroup= binding.aPostiveId.getText().toString();
                }

            }
        });


        binding.aNegetiveId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ( binding.aNegetiveId.isSelected()){
                    binding.aNegetiveId.setSelected(false);
                    binding.aNegetiveId.setTextColor(Color.RED);
                }
                else {
                    binding.aNegetiveId.setTextColor(Color.WHITE);
                    binding.aNegetiveId.setSelected(true);

                }

            }
        });

        binding.bPostiveId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ( binding.bPostiveId.isSelected()){
                    binding.bPostiveId.setSelected(false);
                    binding.bPostiveId.setTextColor(Color.RED);
                }
                else {
                    binding.bPostiveId.setTextColor(Color.WHITE);
                    binding.bPostiveId.setSelected(true);
                }

            }
        });

        binding.bNegetive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ( binding.bNegetive.isSelected()){
                    binding.bNegetive.setSelected(false);
                    binding.bNegetive.setTextColor(Color.RED);
                }
                else {
                    binding.bNegetive.setTextColor(Color.WHITE);
                    binding.bNegetive.setSelected(true);
                }

            }
        });
        binding.oPositive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ( binding.oPositive.isSelected()){
                    binding.oPositive.setSelected(false);
                    binding.oPositive.setTextColor(Color.RED);
                }
                else {
                    binding.oPositive.setTextColor(Color.WHITE);
                    binding.oPositive.setSelected(true);
                }

            }
        });
        binding.oNegetive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ( binding.oNegetive.isSelected()){
                    binding.oNegetive.setSelected(false);
                    binding.oNegetive.setTextColor(Color.RED);
                }
                else {
                    binding.oNegetive.setTextColor(Color.WHITE);
                    binding.oNegetive.setSelected(true);
                }

            }
        });
        binding.abPositive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ( binding.abPositive.isSelected()){
                    binding.abPositive.setSelected(false);
                    binding.abPositive.setTextColor(Color.RED);
                }
                else {
                    binding.abPositive.setTextColor(Color.WHITE);
                    binding.abPositive.setSelected(true);
                }

            }
        });

        binding.nextBtnInBloodGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_bloodGroupFragment_to_weightSelectFragment);
            }
        });

    }
}