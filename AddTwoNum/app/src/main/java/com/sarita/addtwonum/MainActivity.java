package com.sarita.addtwonum;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText num1,num2,result;
    Button equal;



      @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1=findViewById(R.id.num1);
        num2=findViewById(R.id.num2);
        result=findViewById(R.id.result);
        equal=findViewById(R.id.equals);

        equal.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        try {
            int number1= Integer.parseInt(num1.getText().toString());
            int number2= Integer.parseInt(num2.getText().toString());
            int c=number1+number2;
            result.setText(String.valueOf(c));
        }catch(NumberFormatException nex)
        {
            Toast toast= Toast.makeText(this,"Please input digits only",Toast.LENGTH_LONG);
            toast.show();
            toast.setGravity(Gravity.CENTER,100,100);
        }
    }

}