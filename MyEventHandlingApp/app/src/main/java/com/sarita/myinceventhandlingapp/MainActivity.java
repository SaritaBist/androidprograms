package com.sarita.myinceventhandlingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Date;

public class MainActivity extends AppCompatActivity{
      TextView tv;

//    Button btn1;
//    Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv=findViewById(R.id.textview);
//         btn1=findViewById(R.id.btn1);
//        btn2=findViewById(R.id.btn1);
//
//
//        btn1.setOnClickListener(this);
//        btn2.setOnClickListener(this);
//    }
//
//    @Override
//    public void onClick(View view) {
//        int count=0;
//        switch(view.getId())
//        {
//
//            case R.id.btn1:
//                ++count;
//                tv.setText(String.valueOf(count));
//            case R.id.btn2:
//                tv.setText(String.valueOf(count--));
//
//        }

   }
    public void myClick(View view)
    {
       Date d=new Date();
       tv.setText(d.toString());
    }
}
