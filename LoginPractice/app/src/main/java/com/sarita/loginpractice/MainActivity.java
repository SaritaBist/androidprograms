package com.sarita.loginpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText name,password;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         name=findViewById(R.id.name);
         password=findViewById(R.id.pass);
         submit=findViewById(R.id.submit);

         submit.setOnClickListener(this);
    }

    public void onClick(View view)
    {
        String uname="sarita";
        String pass="saru";
        String n=name.getText().toString();
        String p=password.getText().toString();

        if(n.equals(uname) &&  p.equals(pass))
        {
            Intent i=new Intent(MainActivity.this,SecondActivity.class);
            startActivity(i);
            Toast.makeText(this,"login successfully",Toast.LENGTH_LONG).show();
        }

    }
}