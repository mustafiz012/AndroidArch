package com.android.musta.androidarch.uicontrollers;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.android.musta.androidarch.R;
import com.android.musta.androidarch.viewmodels.ViewModelDataHolder;

public class MainActivity extends AppCompatActivity {

    private ViewModelDataHolder dataHolder;
    private int sum;
    private EditText editText, editText1, editText2;
    private TextView textView;
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dataHolder = ViewModelProviders.of(this).get(ViewModelDataHolder.class);
        editText = findViewById(R.id.editText);
        editText1 = findViewById(R.id.editText2);
        editText2 = findViewById(R.id.editText3);
        textView = findViewById(R.id.textView2);
        findViewById(R.id.doSum).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sum = (Integer.parseInt(editText.getText().toString()) + Integer.parseInt(editText1.getText().toString()) + Integer.parseInt(editText2.getText().toString()));
                dataHolder.setSumValue(sum);
                updateResultOnScreen();
            }
        });
        findViewById(R.id.goNewOne).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, DemoActivity.class));
            }
        });
        updateResultOnScreen();
    }

    private void updateResultOnScreen() {
        textView.setText("" + dataHolder.getSumValue());
    }
}
