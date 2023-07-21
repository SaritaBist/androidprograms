package com.sarita.intentdemo;

import
        androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends AppCompatActivity implements View.OnClickListener {
     Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        back=findViewById(R.id.btnback);
        back.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent=new Intent(FirstActivity.this,MainActivity.class);
        startActivity(intent);
    }
}