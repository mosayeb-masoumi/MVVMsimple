package com.example.mvvmtestnew;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.mvvmtestnew.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        MainViewModel viewModel = new MainViewModel();
        viewModel.setMutableUsers();

        viewModel.getMutableUsers().observe(this, new Observer<List<User>>() {
            @Override
            public void onChanged(List<User> users) {
                binding.recyclerview.setLayoutManager(new LinearLayoutManager(MainActivity.this));
                adapter = new Adapter(users, MainActivity.this);
                binding.recyclerview.setAdapter(adapter);
            }
        });



    }
}