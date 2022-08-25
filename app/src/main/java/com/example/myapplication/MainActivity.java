package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast toast=Toast.makeText(this,"First On Create",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM,2,2);
        toast.show();

        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
            }
        });

    }
    @Override
    protected void onStart() {
        Toast toast=Toast.makeText(this,"First On Start",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM,4,4);
        toast.show();
        super.onStart();
    }
    @Override
    protected void onResume() {
        Toast toast=Toast.makeText(this,"First On Resume",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM,6,6);
        toast.show();
        super.onResume();

    }
    @Override
    protected void onPause() {
        Toast toast=Toast.makeText(this,"First On Pause",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM,8,8);
        toast.show();
        super.onPause();

    }
    @Override
    protected void onStop() {
        Toast toast=Toast.makeText(this,"First On Stop",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM,10,10);
        toast.show();

        super.onStop();
    }
    @Override
    protected void onRestart() {
        Toast toast=Toast.makeText(this,"First On Restart",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,12,12);
        toast.show();
        super.onRestart();

    }
    @Override
    protected void onDestroy() {
        Toast toast=Toast.makeText(this,"First On Destroy",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,14,14);
        toast.show();
        super.onDestroy();
    }
}