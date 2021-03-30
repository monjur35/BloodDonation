package com.example.blooddonation.fragment;

import android.content.res.ColorStateList;
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
import com.example.blooddonation.databinding.FragmentWeightSelectBinding;


public class WeightSelectFragment extends Fragment {

    FragmentWeightSelectBinding binding;


    public WeightSelectFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

       binding=FragmentWeightSelectBinding.inflate(inflater);

       return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.cardUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (binding.cardUp.getCardBackgroundColor()== ColorStateList.valueOf(Color.RED)){
                    binding.cardUp.setCardBackgroundColor(Color.WHITE);
                }
                else {
                    binding.cardUp.setCardBackgroundColor(Color.RED);
                }
            }
        });
        binding.cardDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (binding.cardDown.getCardBackgroundColor()== ColorStateList.valueOf(Color.RED)){
                    binding.cardDown.setCardBackgroundColor(Color.WHITE);
                }
                else {
                    binding.cardDown.setCardBackgroundColor(Color.RED);
                }

            }
        });
        binding.nextBtnInWightSelection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_weightSelectFragment_to_genderSelecteionFragment);
            }
        });
    }
}