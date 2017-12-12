package com.android.musta.androidarch.viewmodels;

import android.arch.lifecycle.ViewModel;
import android.util.Log;

/**
 * Created by musta on 11/11/2017.
 */

public class ClickCountVM extends ViewModel{
    private int count=0;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
