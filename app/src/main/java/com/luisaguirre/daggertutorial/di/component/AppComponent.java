package com.luisaguirre.daggertutorial.di.component;

import android.content.Context;

import com.luisaguirre.daggertutorial.MainActivity;
import com.luisaguirre.daggertutorial.di.module.ReceiversModule;
import com.luisaguirre.daggertutorial.di.module.UtilsModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@Component(modules = {ReceiversModule.class, UtilsModule.class})
@Singleton
public interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance Builder context(Context context);
        AppComponent build();
    }

    void inject(MainActivity mainActivity);
}
