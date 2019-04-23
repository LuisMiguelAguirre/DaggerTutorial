package com.luisaguirre.daggertutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.luisaguirre.daggertutorial.util.NetworkUtils;
import com.luisaguirre.daggertutorial.util.RxUtils;
import com.luisaguirre.daggertutorial.util.RxUtilsAbs;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

public class MainActivity extends AppCompatActivity {

    @Inject
    NetworkUtils networkUtils;

    @Inject
    RxUtils rxUtils;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
