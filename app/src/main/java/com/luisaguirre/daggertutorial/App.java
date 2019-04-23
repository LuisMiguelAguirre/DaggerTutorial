package com.luisaguirre.daggertutorial;

import android.app.Application;

import com.luisaguirre.daggertutorial.di.component.AppComponent;
import com.luisaguirre.daggertutorial.di.component.DaggerAppComponent;

public class App extends Application {

    private static AppComponent component;

    public static AppComponent getComponent() {
        return component;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        component = buildComponent();
    }

    private AppComponent buildComponent() {

        return DaggerAppComponent.builder()
                .context(this)
                .build();
    }
}
