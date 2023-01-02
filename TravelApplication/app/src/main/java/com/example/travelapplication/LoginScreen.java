package com.example.travelapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.travelapplication.databinding.ActivityLoginScreenBinding;

public class LoginScreen extends AppCompatActivity {

    ActivityLoginScreenBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityLoginScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.txtSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(LoginScreen.this,SignupScreen.class);
                startActivity(i);
                finish();
            }
        });
        binding.btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String id=binding.edtId.getText().toString();
                String password=binding.edtPassword.getText().toString();

                if(id.isEmpty()){
                    Toast.makeText(LoginScreen.this, "Please Enter Id", Toast.LENGTH_SHORT).show();
                }
                else if(password.length()<=8){
                    Toast.makeText( LoginScreen.this, "Password Must More Than 8 Letter", Toast.LENGTH_SHORT).show();
                }
                else if(password.length()>=12){
                    Toast.makeText( LoginScreen.this, "Password Must Less Than 12 Letter", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(LoginScreen.this, "User Login Successfully", Toast.LENGTH_SHORT).show();

                    Intent main = new Intent(LoginScreen.this, MainActivity.class);
                    startActivity(main);
                    finish();
                }
            }
        });
        binding.loutFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent facebook=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/login/"));
                startActivity(facebook);
            }
        });
        binding.loutTwitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent twitter=new Intent(Intent.ACTION_VIEW,Uri.parse("https://twitter.com/i/flow/login"));
                startActivity(twitter);
            }
        });
        binding.imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LoginScreen.this,FindDealScreen.class);
                startActivity(intent);
                finish();
            }
        });
    }
}