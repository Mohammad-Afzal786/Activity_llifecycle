package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toast toast=Toast.makeText(this,"sec On Create",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,2,2);
        toast.show();
    }
        @Override
        protected void onStart() {
            Toast toast=Toast.makeText(this,"sec On Start",Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER,4,4);
            toast.show();
            super.onStart();
        }
        @Override
        protected void onResume() {
            Toast toast=Toast.makeText(this,"sec On Resume",Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER,6,6);
            toast.show();
            super.onResume();

        }
        @Override
        protected void onPause() {
            Toast toast=Toast.makeText(this,"sec On Pause",Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER,8,8);
            toast.show();
            super.onPause();

        }
        @Override
        protected void onStop() {
            Toast toast=Toast.makeText(this,"sec On Stop",Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER,10,10);
            toast.show();
            super.onStop();
        }
        @Override
        protected void onRestart() {
            Toast toast=Toast.makeText(this," sec On Restart",Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER,12,12);
            toast.show();
            super.onRestart();

        }
        @Override
        protected void onDestroy() {
            Toast toast=Toast.makeText(this,"Sec On Destroy",Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER,16,16);
            toast.show();
            super.onDestroy();
        }
    }
