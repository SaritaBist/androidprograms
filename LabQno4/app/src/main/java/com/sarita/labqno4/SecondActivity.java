package com.sarita.labqno4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {
  TextView name,address;
  Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        name=findViewById(R.id.name);
        address=findViewById(R.id.address);
        back=findViewById(R.id.back);

        Intent i=getIntent();

        String n=i.getStringExtra("Name");
        String add=i.getStringExtra("Address");

        name.setText(n);
        address.setText(add);

        back.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent intent=new Intent(SecondActivity.this,MainActivity.class);
        startActivity(intent);
    }
}