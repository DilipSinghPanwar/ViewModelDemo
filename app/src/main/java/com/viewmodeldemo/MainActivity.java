package com.viewmodeldemo;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        MainActivityDataGenerator mainActivityDataGenerator = new MainActivityDataGenerator();
        MainActivityDataGenerator mainActivityDataGenerator = ViewModelProviders.of(this).get(MainActivityDataGenerator.class);
        String myRandomNumber = mainActivityDataGenerator.getNumber();
        tvData = findViewById(R.id.tvData);
        tvData.setText(myRandomNumber);
    }
}