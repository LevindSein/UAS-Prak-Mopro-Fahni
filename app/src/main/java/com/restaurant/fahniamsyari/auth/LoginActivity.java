package com.restaurant.fahniamsyari.auth;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.restaurant.fahniamsyari.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_login);


    }
}
