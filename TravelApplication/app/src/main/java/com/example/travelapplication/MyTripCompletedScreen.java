package com.example.travelapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.travelapplication.databinding.ActivityMyTripCompletedScreenBinding;

public class MyTripCompletedScreen extends AppCompatActivity {

    ActivityMyTripCompletedScreenBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMyTripCompletedScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.txtUpcoming.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MyTripCompletedScreen.this, MyTripsScreen.class);
                startActivity(i);
                finish();
            }
        });
        binding.loutExplore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MyTripCompletedScreen.this,ExploreScreen.class);
                startActivity(i);
                finish();
            }
        });
        binding.loutHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MyTripCompletedScreen.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        });
        binding.imgBack.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MyTripCompletedScreen.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        });

    }
}