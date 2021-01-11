package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int a, b, sum;
        a = 10;
        b = 15;
        sum = a + b;
        Log.i("jinhong", "sum is " + sum);
        Log.e("jinhong", "sum is " + sum);
        Log.w("jinhong", "sum is " + sum);
        Log.v("jinhong", "sum is " + sum);

        setContentView(R.layout.activity_main);
    }
}