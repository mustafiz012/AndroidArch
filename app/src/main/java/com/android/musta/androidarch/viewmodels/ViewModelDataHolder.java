package com.android.musta.androidarch.viewmodels;

import android.arch.lifecycle.ViewModel;

/**
 * Created by musta on 11/10/2017.
 */

public class ViewModelDataHolder extends ViewModel {
    //tracks the summation result
    private int sumValue = 0;

    public int getSumValue() {
        return sumValue;
    }

    public void setSumValue(int sumValue) {
        this.sumValue = sumValue;
    }

}
