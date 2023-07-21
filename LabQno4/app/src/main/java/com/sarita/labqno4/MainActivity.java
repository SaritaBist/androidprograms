package com.sarita.labqno4;

import  androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{

    EditText name,address;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.name);
        address=findViewById(R.id.address);
        submit=findViewById(R.id.submit);

        submit.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        Intent intent=new Intent(MainActivity.this,SecondActivity.class);
        intent.putExtra("Name",name.getText().toString());
        intent.putExtra("Address",address.getText().toString());
        startActivity(intent);
    }
}