package com.pml_dispatch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.pml_dispatch.R;

public class userProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
    }
}