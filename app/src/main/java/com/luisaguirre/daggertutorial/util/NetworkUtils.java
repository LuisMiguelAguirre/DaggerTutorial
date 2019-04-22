package com.luisaguirre.daggertutorial.util;

import android.content.Context;
import android.util.Log;

import com.luisaguirre.daggertutorial.network.NetworkChannel;

public class NetworkUtils {
    public NetworkUtils(Context context, NetworkChannel networkChannel) {
        Log.d("TAG", "NetworkUtils: ");
    }
}
