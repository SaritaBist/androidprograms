package com.sarita.demo1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText text;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String title=getString(R.string.apptitle);
        setTitle(title);


        text = (EditText)findViewById(R.id.MyText);
        EditText result=(EditText)findViewById(R.id.MyResultText);
        Button button0=findViewById(R.id.button_zero);
        Button button1 =findViewById(R.id.button1);
        Button button2=findViewById(R.id.button2);
        Button button3=findViewById(R.id.button3);
        Button button4=findViewById(R.id.button4);
        Button button5=findViewById(R.id.button5);
        Button button6=findViewById(R.id.button6);
        Button button7=findViewById(R.id.button7);
        Button button8=findViewById(R.id.button8);
        Button button9=findViewById(R.id.button9);
        Button Ac=findViewById(R.id.Ac_Button);
        Button cancel=findViewById(R.id.button_cancel);
        Button minus=findViewById(R.id.button_minus);
        Button add=findViewById(R.id.button_plus);
        Button multiply=findViewById(R.id.button_multiply);
        Button devide=findViewById(R.id.button_devide);
        Button modulo=findViewById(R.id.button_modulo);
        Button dot=findViewById((R.id.buttonDot));
        Button equals=findViewById(R.id.button_equal);







        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText(text.getText()+"0");

            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    text.setText(text.getText()+"1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    text.setText(text.getText()+"2");

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    text.setText(text.getText()+"3");

            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    text.setText(text.getText()+"4");

            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    text.setText(text.getText()+"5");

            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    text.setText(text.getText()+"6");

            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    text.setText(text.getText()+"7");

            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    text.setText(text.getText()+"8");

            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    text.setText(text.getText()+"9");

            }
        });
        Ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    text.setText("");
                    result.setText("");

            }
        });
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    String value=String.valueOf(text.getText());
                    int length=value.length();
                    String str=value.substring(0,length-1);
                    text.setText(str);

            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    text.setText(text.getText()+".");

            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    text.setText(text.getText()+"-");

            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    text.setText(text.getText()+"+");

            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    text.setText(text.getText()+"*");

            }
        });
        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                       String addtext=add.getText().toString();
                       String minustext=minus.getText().toString();
                       String multiplytext=multiply.getText().toString();
                       String alltext=text.getText().toString();


//                       if(alltext.equals("+")) {
                           int indexOfPlus = text.getText().toString().indexOf("+");
                           String n1 = text.getText().toString().substring(0, indexOfPlus);
                           String n2 = text.getText().toString().substring(indexOfPlus);
                           Double num1 = Double.parseDouble(n1);
                           Double num2 = Double.parseDouble(n2);
                           Double sum = num1 + num2;
                           result.setText(sum.toString());
//                       }

//                       if(minustext.compareTo()) {
//                               int indexOfMinus = text.getText().toString().indexOf("-");
//                               String n1 = text.getText().toString().substring(0, indexOfMinus);
//                               String n2 = text.getText().toString().substring(indexOfMinus);
//                               Double num1 = Double.parseDouble(n1);
//                               Double num2 = Double.parseDouble(n2);
//                               Double sub = num1-num2;
//                               text.setText(sub.toString());
//                           }
//                      else {
//                           int indexOfMultiply = text.getText().toString().indexOf("*");
//                           String n1 = text.getText().toString().substring(0, indexOfMultiply);
//                           String n2 = text.getText().toString().substring(indexOfMultiply);
//                           Double num1 = Double.parseDouble(n1);
//                           Double num2 = Double.parseDouble(n2);
//                           Double multiply = num1 * num2;
//                           text.setText(multiply.toString());
                       }








        });



    }
}