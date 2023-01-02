package com.example.travelapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.travelapplication.databinding.ActivityPlantripscreenBinding;

public class PlanTripScreen extends AppCompatActivity {

    ActivityPlantripscreenBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityPlantripscreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(PlanTripScreen.this,FindDealScreen.class);
                startActivity(i);
                finish();
            }
        });

    }
}