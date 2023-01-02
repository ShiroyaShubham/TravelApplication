package com.example.travelapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.travelapplication.databinding.ActivityStartjourneyscreenBinding;
import com.example.travelapplication.databinding.ActivityStartjourneyscreenBinding;

public class StartJourneyScreen extends AppCompatActivity {

    ActivityStartjourneyscreenBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityStartjourneyscreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnStartJourney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(StartJourneyScreen.this, PlanTripScreen.class);
                startActivity(i);
                finish();
            }
        });
    }
}