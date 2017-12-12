package com.android.musta.androidarch.viewmodels;

import android.arch.lifecycle.ViewModel;

/**
 * Created by musta on 11/10/2017.
 */

public class DemoActivityVM extends ViewModel {
    private int count=0;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
