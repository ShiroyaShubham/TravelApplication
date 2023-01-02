package com.example.travelapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.travelapplication.databinding.ActivityFindDealScreenBinding;

public class FindDealScreen extends AppCompatActivity {

    ActivityFindDealScreenBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityFindDealScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnCreateAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(FindDealScreen.this,LoginScreen.class);
                startActivity(i);
                finish();
            }
        });
    }
}