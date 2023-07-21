package com.sarita.dialogueboxdemo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button closeButton;
    AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        closeButton=findViewById(R.id.btn1);
        closeButton.setOnClickListener(this);

        builder=new AlertDialog.Builder(this);
    }

    @Override
    public void onClick(View view) {
     builder.setMessage("DO you want to continue ?");
     builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
         @Override
         public void onClick(DialogInterface dialog, int id) {
             finish();

         }
     });
        builder.setNegativeButton("Cancel",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {

                        dialog.cancel();
                    }
                });
     AlertDialog alert=builder.create();
     alert.setTitle("alertDialogue");
     alert.show();
    }

}