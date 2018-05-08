package com.example.rohangupta.bottom_navigation_sample;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.rohangupta.bottom_navigation_sample.databinding.ActivityHomeBinding;

public class HomeActivity extends AppCompatActivity implements HomeMvvm.View {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityHomeBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_home);
        binding.setVm(new HomeViewModel(this));
    }

    @Override
    public Context getContext() {
        return this;
    }

    @Override
    public int getFragmentContainer() {
        return R.id.container;
    }
}
