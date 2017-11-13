package com.example.arturmusayelyan.components;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class SpinnerActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner spinner;
    ArrayAdapter<String> adapter;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        spinner = (Spinner) findViewById(R.id.spinner1);
        button = (Button) findViewById(R.id.button1);

        //adapteri 1-in dzev
        //ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.days, android.R.layout.simple_spinner_dropdown_item);

        //adapteri 2-rd dzev
        String[] daysArray = getResources().getStringArray(R.array.days);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, daysArray);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        TextView myText = (TextView) view;
        Toast.makeText(this, myText.getText(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        if (parent.getAdapter().getCount()==0) {
            Toast.makeText(this, "nothing selected", Toast.LENGTH_SHORT).show();
        }
    }

    public void onClick(View view) {
        if (view.getId() == R.id.button1) {
            spinner.setAdapter(null);
            //adapter.notifyDataSetChanged();
        }
    }
}
