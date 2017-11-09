package com.example.arturmusayelyan.components;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view){
//        //sovorakan Toast
//        Toast toast=Toast.makeText(this,"Toast message",Toast.LENGTH_SHORT);
//        toast.setGravity(Gravity.RIGHT,0,0);
//        toast.show();

        //custom Toast
        Toast toast=new Toast(this);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0);
        LayoutInflater inflater=getLayoutInflater();
        View toastView=inflater.inflate(R.layout.toast_layout,null);
        toast.setView(toastView);
        toast.show();
    }
}
