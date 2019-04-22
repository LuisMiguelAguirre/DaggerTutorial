package com.luisaguirre.daggertutorial.util;

import android.content.Context;
import android.util.Log;

import javax.inject.Inject;

public class RxUtils extends RxUtilsAbs {

    @Inject
    public RxUtils(Context context) {
        Log.d("TAG", "RxUtils: ");
    }
}
