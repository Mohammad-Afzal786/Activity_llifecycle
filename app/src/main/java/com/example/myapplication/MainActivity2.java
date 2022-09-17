package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
Button button;
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button=findViewById(R.id.button2);
        textView=findViewById(R.id.textView);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setVisibility(View.GONE);
                button.setVisibility(View.GONE);
                First_Fragmnet fragmnet=new First_Fragmnet();
                FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frame_layout,fragmnet).commit();
            }
        });

        Toast toast=Toast.makeText(this,"sec On Create",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,2,2);
        toast.show();
    }
        @Override
        protected void onStart() {
            Toast toast=Toast.makeText(this,"sec On Start",Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER,2,2);
            toast.show();
            super.onStart();
        }
        @Override
        protected void onResume() {
            Toast toast=Toast.makeText(this,"sec On Resume",Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER,2,2);
            toast.show();
            super.onResume();

        }
        @Override
        protected void onPause() {
            Toast toast=Toast.makeText(this,"sec On Pause",Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER,2,2);
            toast.show();
            super.onPause();

        }
        @Override
        protected void onStop() {
            Toast toast=Toast.makeText(this,"sec On Stop",Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER,2,2);
            toast.show();
            super.onStop();
        }
        @Override
        protected void onRestart() {
            Toast toast=Toast.makeText(this," sec On Restart",Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER,2,2);
            toast.show();
            super.onRestart();

        }
        @Override
        protected void onDestroy() {
            Toast toast=Toast.makeText(this,"Sec On Destroy",Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER,2,2);
            toast.show();
            super.onDestroy();
        }
    }
