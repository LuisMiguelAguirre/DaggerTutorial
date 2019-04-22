package com.luisaguirre.daggertutorial.di.module;

import android.content.Context;
import android.support.annotation.NonNull;

import com.luisaguirre.daggertutorial.network.NetworkChannel;
import com.luisaguirre.daggertutorial.util.NetworkUtils;
import com.luisaguirre.daggertutorial.util.RxUtils;
import com.luisaguirre.daggertutorial.util.RxUtilsAbs;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class UtilsModule {

    @Provides
    @NonNull
    @Singleton
    public RxUtilsAbs provideRxUtilsAbs(Context context) {
        return new RxUtils(context);
    }

    @Provides
    @NonNull
    @Singleton
    public NetworkUtils provideNetworkUtils(Context context, NetworkChannel networkChannel) {
        return new NetworkUtils(context, networkChannel);
    }
}
