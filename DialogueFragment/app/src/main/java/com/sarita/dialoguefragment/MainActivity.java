package com.sarita.dialoguefragment;



import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button closeButton = findViewById(R.id.calculatebtn);
        closeButton.setOnClickListener(this);
    }

    @Override
  public void onClick(View view) {
        MyDialogueFragment myDialog = new MyDialogueFragment();
        FragmentManager fm =getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        myDialog.show(fm,"fragment_my_dialogue");
        ft.commit();
   }
}