package com.example.blooddonation.acitivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

import com.example.blooddonation.fragment.HomeFragment;
import com.example.blooddonation.fragment.MapFragment;
import com.example.blooddonation.fragment.NotificationFragment;
import com.example.blooddonation.fragment.ProfileFragment;
import com.example.blooddonation.R;
import com.ismaeldivita.chipnavigation.ChipNavigationBar;

public class HomeActivity extends AppCompatActivity {

    private ChipNavigationBar navigationBar;
    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        navigationBar=findViewById(R.id.navigationBar);

        navigationBar.setOnItemSelectedListener(new ChipNavigationBar.OnItemSelectedListener() {
            @Override
            public void onItemSelected(int i) {
                Fragment selectedFragment=new HomeFragment();
                switch (i){

                    case R.id.home:
                        selectedFragment=new HomeFragment();
                        break;
                    case R.id.notification:
                        selectedFragment=new NotificationFragment();
                        break;
                    case R.id.map:
                        selectedFragment=new MapFragment();
                        break;
                    case R.id.profile:
                        selectedFragment=new ProfileFragment();
                        break;

                    default:
                        selectedFragment=new HomeFragment();

                }

                if (selectedFragment!=null){
                    fragmentManager=getSupportFragmentManager();
                    fragmentManager.beginTransaction().replace(R.id.bottom_container,selectedFragment).commit();
                }
            }
        });










    }
}