package com.example.travelapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.travelapplication.databinding.ActivityMyTripsScreenBinding;

public class MyTripsScreen extends AppCompatActivity {

    ActivityMyTripsScreenBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMyTripsScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.loutExplore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MyTripsScreen.this,ExploreScreen.class);
                startActivity(i);
                finish();
            }
        });
        binding.loutHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MyTripsScreen.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        });
        binding.imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MyTripsScreen.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        });
        binding.txtCompleted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MyTripsScreen.this,MyTripCompletedScreen.class);
                startActivity(i);
                finish();
            }
        });
    }
}