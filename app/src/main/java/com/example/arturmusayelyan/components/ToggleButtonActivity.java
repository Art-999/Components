package com.example.arturmusayelyan.components;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.ToggleButton;

public class ToggleButtonActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
    RelativeLayout layout;
    ToggleButton toggleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle_button);

        toggleButton = (ToggleButton) findViewById(R.id.toggleButton1);
        layout = (RelativeLayout) findViewById(R.id.relativeLayout_toggleButton);
        toggleButton.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (isChecked) {
            layout.setBackgroundColor(Color.BLACK);
        } else {
            layout.setBackgroundColor(Color.WHITE);
        }

    }
}
