package com.example.travelapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.travelapplication.databinding.ActivitySignupScreenBinding;

public class SignupScreen extends AppCompatActivity {

    ActivitySignupScreenBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignupScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.txtLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(SignupScreen.this, LoginScreen.class);
                startActivity(i);
                finish();
            }
        });
        binding.loutFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent facebook = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/login/"));
                startActivity(facebook);
            }
        });
        binding.loutTwitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent twitter = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/i/flow/login"));
                startActivity(twitter);
            }
        });
        binding.imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(SignupScreen.this,LoginScreen.class);
                startActivity(intent);
                finish();
            }
        });
        binding.btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String firstName = binding.edtFirstName.getText().toString();
                String lastName = binding.edtLastName.getText().toString();
                String mobileNO = binding.edtMobile.getText().toString();
                String password = binding.edtPassword.getText().toString();
                String confirmPassword = binding.edtConfirmPassword.getText().toString();

                if (firstName.isEmpty()) {
                    Toast.makeText(SignupScreen.this, "Please Enter First Name", Toast.LENGTH_SHORT).show();
                } else if (lastName.isEmpty()) {
                    Toast.makeText(SignupScreen.this, "Please Enter Last Name", Toast.LENGTH_SHORT).show();
                } else if (mobileNO.length() != 10) {
                    Toast.makeText(SignupScreen.this, "Please Enter 10 Digit Mobile NO", Toast.LENGTH_SHORT).show();
                } else if (password.length() <= 8) {
                    Toast.makeText(SignupScreen.this, "Password Must More Than 8 Letter", Toast.LENGTH_SHORT).show();
                } else if (password.length() >= 12) {
                    Toast.makeText(SignupScreen.this, "Password Must Less Than 12 Letter", Toast.LENGTH_SHORT).show();
                } else if (!password.equals(confirmPassword)) {
                    Toast.makeText(SignupScreen.this, "Password Not Matched", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(SignupScreen.this, "User Signup Successfully", Toast.LENGTH_SHORT).show();

                    Intent login = new Intent(SignupScreen.this, LoginScreen.class);
                    startActivity(login);
                    finish();
                }
            }
        });
    }
}