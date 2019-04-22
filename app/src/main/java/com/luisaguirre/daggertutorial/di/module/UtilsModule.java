package com.luisaguirre.daggertutorial.di.module;

import android.content.Context;
import android.support.annotation.NonNull;

import com.luisaguirre.daggertutorial.network.NetworkChannel;
import com.luisaguirre.daggertutorial.util.NetworkUtils;
import com.luisaguirre.daggertutorial.util.RxUtils;
import com.luisaguirre.daggertutorial.util.RxUtilsAbs;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class UtilsModule {

    @Binds
    @NonNull
    @Singleton
    public abstract RxUtilsAbs provideRxUtilsAbs(RxUtils rxUtils);


    @Provides
    @NonNull
    @Singleton
    public static NetworkUtils provideNetworkUtils(Context context, NetworkChannel networkChannel) {
        return new NetworkUtils(context, networkChannel);
    }
}
