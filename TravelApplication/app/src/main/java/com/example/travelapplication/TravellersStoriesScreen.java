package com.example.travelapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.travelapplication.databinding.ActivityTravellersStoriesScreenBinding;

public class TravellersStoriesScreen extends AppCompatActivity {

    ActivityTravellersStoriesScreenBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityTravellersStoriesScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intiView();
            }
        });
        binding.loutExplore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(TravellersStoriesScreen.this,ExploreScreen.class);
                startActivity(i);
                finish();
            }
        });
        binding.loutMyTrips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(TravellersStoriesScreen.this,MyTripsScreen.class);
                startActivity(i);
                finish();
            }
        });
        binding.loutHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(TravellersStoriesScreen.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        });
    }

    private void intiView() {
        Intent i=new Intent(TravellersStoriesScreen.this,MainActivity.class);
        startActivity(i);
        finish();
    }
}