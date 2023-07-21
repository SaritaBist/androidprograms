package com.sarita.databasepraactice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class SecondActivity extends AppCompatActivity  implements View.OnClickListener {
    TextView viewid,viewname,viewroll,viewlevel;
    Button back;
    ArrayList<HashMap<String,String>> list = new ArrayList<HashMap<String,String>>();
    HashMap<String,String> item;
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        back = findViewById(R.id.back);
        back.setOnClickListener(this);

        MyDBHelper myDBHelper = new MyDBHelper(this);
        Cursor data = myDBHelper.viewStudent();
        lv = findViewById(R.id.list);
        data.moveToFirst();
        do
        {
            item = new HashMap<String,String>();
            item.put( "id", data.getString(0));
            item.put( "name", data.getString(1));
            item.put( "roll", data.getString(2));
            item.put( "level", data.getString(3));
            list.add( item );
            data.moveToNext();
        } while (!data.isLast()); {
            item = new HashMap<String, String>();
            item.put("id", data.getString(0));
            item.put("name", data.getString(1));
            item.put("roll", data.getString(2));
            item.put("level", data.getString(3));
            list.add(item);
            SimpleAdapter sa = new SimpleAdapter(this, list, R.layout.list_item,
                    new String[]{"id", "name", "roll", "level"},
                    new int[]{R.id.viewId, R.id.viewName, R.id.viewRoll, R.id.viewLevel});
            lv.setAdapter(sa);
        }
    }
    @Override
    public void onClick(View view) {
       Intent intent=new Intent(SecondActivity.this,MainActivity.class);
       startActivity(intent);
    }
}