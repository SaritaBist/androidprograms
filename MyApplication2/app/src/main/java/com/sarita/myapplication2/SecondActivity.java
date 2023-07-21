package com.sarita.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button b1=findViewById(R.id.mybutton2);
        b1.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i=new Intent(SecondActivity.this,MainActivity.class);
        this.startActivity(i);
    }
}