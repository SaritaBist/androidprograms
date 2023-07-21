package com.sarita.passingdatathroughintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button submit;
    EditText name,address;
    RadioButton male,female;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name=findViewById(R.id.name);
        address=findViewById(R.id.address);
        submit=findViewById(R.id.submit);
        male=findViewById(R.id.male);
        female=findViewById(R.id.female);

        submit.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        Intent i=new Intent(MainActivity.this,SecondActivity.class);
        i.putExtra("Name",name.getText().toString());
        i.putExtra("Address",address.getText().toString());
        i.putExtra("male",male.getText().toString());
        i.putExtra("female",female.getText().toString());
        startActivity(i);
    }
}