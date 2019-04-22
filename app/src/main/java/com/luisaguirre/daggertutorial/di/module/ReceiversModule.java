package com.luisaguirre.daggertutorial.di.module;

import android.support.annotation.NonNull;

import com.luisaguirre.daggertutorial.network.NetworkChannel;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ReceiversModule {

    @Singleton
    @NonNull
    @Provides
    public NetworkChannel provideNetworkChannel() {
        return new NetworkChannel();
    }
}
