package com.sarita.multipleitemlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
ListView list;
    String[] maintitle={"Title1","title2"};
    String[] subtitle={"sub title1","sub tile2"};
    Integer[] imgid={R.drawable.img,R.drawable.img};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyAdapter adapter=new MyAdapter(this,maintitle,subtitle,imgid);
        list=(ListView)findViewById(R.id.listview);
        list.setAdapter(adapter);

    }
}