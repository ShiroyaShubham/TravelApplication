package com.example.travelapplication;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.travelapplication.databinding.ActivityExploreScreenBinding;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ExploreScreen extends AppCompatActivity {

    ActivityExploreScreenBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityExploreScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.loutHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ExploreScreen.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        });
        binding.loutMyTrips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ExploreScreen.this, MyTripsScreen.class);
                startActivity(i);
                finish();
            }
        });
        binding.imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ExploreScreen.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        });
        binding.txtStartDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openStartDatePickerDialog();
            }
        });
        binding.txtEndDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openEndDatePickerDialog();
            }
        });
        binding.imgMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent map=new Intent(ExploreScreen.this,MapsFragmentScreen.class);
                startActivity(map);
            }
        });
    }

    private void openEndDatePickerDialog() {
        final Calendar newCalendar = Calendar.getInstance();
        final DatePickerDialog  StartTime = new DatePickerDialog(ExploreScreen.this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(android.widget.DatePicker datePicker, int year, int monthOfYear, int dayOfMonth) {
                Calendar newDate = Calendar.getInstance();
                newCalendar.set(year, monthOfYear, dayOfMonth);
                binding.txtEndDate.setText(SimpleDateFormat.getDateInstance().format(newCalendar.getTime()));
            }

        }, newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));
        StartTime.show();
    }

    private void openStartDatePickerDialog() {
        final Calendar newCalendar = Calendar.getInstance();
        final DatePickerDialog  StartTime = new DatePickerDialog(ExploreScreen.this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(android.widget.DatePicker datePicker, int year, int monthOfYear, int dayOfMonth) {
                newCalendar.set(year, monthOfYear, dayOfMonth);
                binding.txtStartDate.setText(SimpleDateFormat.getDateInstance().format(newCalendar.getTime()));
            }

        }, newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));
        StartTime.show();
    }
}

