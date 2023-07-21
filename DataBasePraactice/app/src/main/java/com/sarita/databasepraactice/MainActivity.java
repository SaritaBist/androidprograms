package com.sarita.databasepraactice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
EditText name,roll,level;
Button Add,view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.name);
        roll=findViewById(R.id.roll);
        level=findViewById(R.id.level);
        view=findViewById(R.id.view);
        view.setOnClickListener(this);
        Add=findViewById(R.id.add);
        Add.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.add)
        {
            String sname=name.getText().toString();
            String sroll=roll.getText().toString();
            String slevel=level.getText().toString();
            MyDBHelper db=new MyDBHelper(this);
            db.AddNewStudent(sname,sroll,slevel);
            Toast.makeText(this,"Record Added successfully",Toast.LENGTH_LONG).show();

        }
        else {

                Intent i=new Intent(MainActivity.this,SecondActivity.class);
                startActivity(i);
        }


    }
}