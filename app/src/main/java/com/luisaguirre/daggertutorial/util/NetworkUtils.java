package com.luisaguirre.daggertutorial.util;

import android.content.Context;
import android.util.Log;

import com.luisaguirre.daggertutorial.network.NetworkChannel;

import javax.inject.Inject;

public class NetworkUtils {
    @Inject
    public NetworkUtils(Context context, NetworkChannel networkChannel) {
        Log.d("TAG", "NetworkUtils: ");
    }
}
