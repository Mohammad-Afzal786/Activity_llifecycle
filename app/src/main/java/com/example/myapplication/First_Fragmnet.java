package com.example.myapplication;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class First_Fragmnet extends Fragment {
Button button;
TextView textView;
View view;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =inflater.inflate(R.layout.fragment_first__fragmnet, container, false);
        button=view.findViewById(R.id.button3);
        textView=view.findViewById(R.id.textView2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SecondFragment fragment=new SecondFragment();
                FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frame_layout,fragment).addToBackStack("name").commit();


            }
        });
        Toast toast=Toast.makeText(getActivity(),"first frgment On Create",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.TOP,2,2);
        toast.show();

        return view;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Toast toast=Toast.makeText(getActivity(),"first frgment OnAttach",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.TOP,2,2);
        toast.show();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast toast=Toast.makeText(getActivity(),"first frgment On Create",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.TOP,2,2);
        toast.show();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Toast toast=Toast.makeText(getActivity(),"first frgment OnActivityCreated",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.TOP,2,2);
        toast.show();
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}