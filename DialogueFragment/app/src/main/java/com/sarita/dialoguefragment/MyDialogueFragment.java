package com.sarita.dialoguefragment;

import android.app.DialogFragment;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MyDialogueFragment extends DialogFragment implements View.OnClickListener {
  TextView result;
  EditText principle,time,rate;
  Button calculate;


    public MyDialogueFragment() {
        // Required empty public constructor
    }






    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_my_dialogue, container, false);
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        principle=getView().findViewById(R.id.et1);
        time=getView().findViewById(R.id.et2);
        rate=getView().findViewById(R.id.et3);
        calculate=getView().findViewById(R.id.btn1);
        result=getView().findViewById(R.id.result);

        calculate.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        int p,t,r;
        switch (view.getId())
        {
            case R.id.btn1:
            p=Integer.parseInt(principle.getText().toString());
            t=Integer.parseInt(time.getText().toString());
            r=Integer.parseInt(rate.getText().toString());
            double si=(p*t*r)/100;
            result.setText(String.valueOf(si));
        }
    }


}