package com.sarita.exampractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{

    EditText firstNo,secNo;
    TextView result;
    Button add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNo=findViewById(R.id.fno);
        secNo=findViewById(R.id.sno);
        result=findViewById(R.id.result);
        add=findViewById(R.id.add);

        add.setOnClickListener(this);

    }
    public void onClick(View view)
    {
        int a=Integer.parseInt(firstNo.getText().toString());
        int b=Integer.parseInt(secNo.getText().toString());
        result.setText(String.valueOf(a+b));
         Toast.makeText(this,"Added sucessfully",Toast.LENGTH_LONG).show();
    }

}