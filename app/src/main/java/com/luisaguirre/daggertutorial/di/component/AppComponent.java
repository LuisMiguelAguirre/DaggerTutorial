package com.luisaguirre.daggertutorial.di.component;

import com.luisaguirre.daggertutorial.MainActivity;
import com.luisaguirre.daggertutorial.di.module.AppModule;
import com.luisaguirre.daggertutorial.di.module.ReceiversModule;
import com.luisaguirre.daggertutorial.di.module.UtilsModule;

import javax.inject.Singleton;

import dagger.Component;

@Component(modules = {AppModule.class, ReceiversModule.class, UtilsModule.class})
@Singleton
public interface AppComponent {
    void inject(MainActivity mainActivity);
}
