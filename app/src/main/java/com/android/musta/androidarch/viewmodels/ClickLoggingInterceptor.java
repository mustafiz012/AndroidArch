package com.android.musta.androidarch.viewmodels;

import android.util.Log;

/**
 * Created by musta on 11/11/2017.
 */

public class ClickLoggingInterceptor {
    private static final String TAG = ClickLoggingInterceptor.class.getSimpleName();

    public void intercept(int clickCount) {
        Log.i(TAG, "processed click " + clickCount);
    }
}
