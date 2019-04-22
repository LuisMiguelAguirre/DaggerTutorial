package com.luisaguirre.daggertutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.luisaguirre.daggertutorial.util.NetworkUtils;
import com.luisaguirre.daggertutorial.util.RxUtils;
import com.luisaguirre.daggertutorial.util.RxUtilsAbs;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    NetworkUtils networkUtils;

    @Inject
    RxUtilsAbs rxUtils;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        App.getComponent().inject(this);
    }
}
