package com.android.musta.androidarch.uicontrollers;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.android.musta.androidarch.R;
import com.android.musta.androidarch.viewmodels.DemoActivityVM;

import java.util.List;

import butterknife.BindViews;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class DemoActivity extends AppCompatActivity {

    /*@BindViews(R.id.click_count_text)
    protected TextView clickCountText;*/
    @BindViews({R.id.click_count_text, R.id.prev})
    protected List<TextView> textViews;
    private DemoActivityVM dataHolder;
    private static final String TAG = "DemoActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);

        ButterKnife.bind(this);
        dataHolder = ViewModelProviders.of(this).get(DemoActivityVM.class);
        displayCountText(dataHolder.getCount());
    }

    @OnClick(R.id.increment_button)
    public void incrementClickCount(View button) {
        Log.i(TAG, "incrementClickCount: " + dataHolder.getCount());
        dataHolder.setCount(dataHolder.getCount() + 1);
        displayCountText(dataHolder.getCount());
    }

    private void displayCountText(int clickCount) {
        textViews.get(0).setText(String.valueOf(clickCount));
        if (clickCount > 0) textViews.get(1).setText("Previous: " + (clickCount - 1));
    }
}
