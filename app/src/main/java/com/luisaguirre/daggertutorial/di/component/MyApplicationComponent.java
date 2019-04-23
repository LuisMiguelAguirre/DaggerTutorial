package com.luisaguirre.daggertutorial.di.component;

import android.content.Context;

import com.luisaguirre.daggertutorial.App;
import com.luisaguirre.daggertutorial.di.module.MyApplicationModule;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;

@Component(modules = {AndroidInjectionModule.class, MyApplicationModule.class})
public interface MyApplicationComponent extends AndroidInjector<App>{
    @Component.Builder
    interface Builder {
        @BindsInstance
        MyApplicationComponent.Builder context(Context context);
        MyApplicationComponent build();
    }
}
