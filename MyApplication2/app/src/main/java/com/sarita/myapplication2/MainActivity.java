package com.sarita.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1=findViewById(R.id.mybutton1);
        b1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
         Intent i=new Intent(MainActivity.this,SecondActivity.class);
         this.startActivity(i);
    }
}