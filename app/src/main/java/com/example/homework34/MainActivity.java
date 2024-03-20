package com.example.homework34;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.homework34.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());
        getSupportFragmentManager().beginTransaction()
                .add(R.id.container, new ContinentsFragment()).commit();
    }
}