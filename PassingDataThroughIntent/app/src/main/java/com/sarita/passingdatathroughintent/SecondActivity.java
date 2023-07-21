package com.sarita.passingdatathroughintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener{
 TextView name,address,gender;
 Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        name=findViewById(R.id.tv1);
        address=findViewById(R.id.tv2);
        gender=findViewById(R.id.gender);
        back=findViewById(R.id.back);
        Intent i=getIntent();
        String n=i.getStringExtra("Name");
        String add=i.getStringExtra("Address");
        String m=i.getStringExtra("male");
        String f=i.getStringExtra("female");
        name.setText(n);
        address.setText(add);

          if(m.equalsIgnoreCase("male") && f==null)
          {
              gender.setText(m);
          }
          else
          {
              gender.setText(f);
          }
          back.setOnClickListener(this);
    }
    public void onClick(View view)
    {
      Intent i=new Intent(SecondActivity.this,MainActivity.class);
      startActivity(i);

    }
}