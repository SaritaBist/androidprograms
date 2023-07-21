package com.sarita.labqno5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button fragA,fragB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragA=findViewById(R.id.fragA);
        fragB=findViewById(R.id.fragB);

        fragA.setOnClickListener(this);
        fragB.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
   if(view.getId()==R.id.fragA)
     {
       loadFragment(new AFragment());
     }
   else
     {
       loadFragment(new BFragment());
      }

    }


    public void loadFragment(Fragment fragment)
    {
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.frame,fragment);
        ft.commit();

    }
}