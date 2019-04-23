package com.luisaguirre.daggertutorial.di.module;

import com.luisaguirre.daggertutorial.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class MyApplicationModule {

    @ContributesAndroidInjector
    abstract MainActivity contributeActivityInjector();

}
