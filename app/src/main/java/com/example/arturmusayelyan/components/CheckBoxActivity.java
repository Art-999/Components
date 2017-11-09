package com.example.arturmusayelyan.components;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class CheckBoxActivity extends AppCompatActivity implements View.OnClickListener {
    CheckBox checkBox1;
    CheckBox checkBox2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);

        checkBox1 = (CheckBox) findViewById(R.id.checkbox_1);
        checkBox2 = (CheckBox) findViewById(R.id.checkbox_2);
        checkBox1.setOnClickListener(this);
        checkBox2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        CheckBox temp;
        switch (v.getId()) {
            case R.id.checkbox_1:
                temp = (CheckBox) v;
                if (temp.isChecked()) {
                    Toast.makeText(this, "You want coffee with sugar ?", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this, "I know you are diet conscious :D I like it", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.checkbox_2:
                temp = (CheckBox) v;
                if(temp.isChecked()){
                    Toast.makeText(this, "You want coffee with milk ?", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(this, "I know you dont like coffee with milk ", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }
}
