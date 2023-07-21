package com.sarita.jsondemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    String JSON_STRING = "{\"employee\":{\"name\":\"Sarita\",\"salary\":40000}}";
    String name,salary;
    TextView empname,empsalary;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        empname=findViewById(R.id.name);
        empsalary=findViewById(R.id.salary);
        try {
            JSONObject object=new JSONObject(JSON_STRING);
            JSONObject employee=object.getJSONObject("employee");
            name=employee.getString("name");
            salary=employee.getString("salary");
            empname.setText("Name: "+name);
            empsalary.setText("Salary: "+salary);
        }catch(JSONException jex)
        {

        }
    }
}