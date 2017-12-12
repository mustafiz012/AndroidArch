package com.android.musta.androidarch.viewmodels;

/**
 * Created by musta on 11/10/2017.
 */

public class NonDefaultConstructorVM extends ClickCountVM {
    private final ClickLoggingInterceptor loggingInterceptor;

    public NonDefaultConstructorVM(ClickLoggingInterceptor loggingInterceptor) {
        this.loggingInterceptor = loggingInterceptor;
    }

    @Override
    public void setCount(int count) {
        super.setCount(count);
        loggingInterceptor.intercept(count);
    }
}
