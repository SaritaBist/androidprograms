package com.sarita.intentdemo;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{

    Button btn1,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

       if(view.getId()==R.id.btn1)
       {
            Intent i=new Intent(MainActivity.this,FirstActivity.class);
            startActivity(i);
       }
       else {
           Intent intent=new Intent(MainActivity.this,SecondActivity.class);
           startActivity(intent);
       }
    }
}