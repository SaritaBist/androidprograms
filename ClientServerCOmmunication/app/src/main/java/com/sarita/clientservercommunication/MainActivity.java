package com.sarita.clientservercommunication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {
    EditText text;
    Button send;
    TextView result;
    String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.input);
        send = findViewById(R.id.send);
        result = findViewById(R.id.data);

        send.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {


        String message = text.getText().toString();
        new Thread(new ClientThread(message)).start();


    }

    class ClientThread implements Runnable {
        private String message;

        ClientThread(String message) {
            this.message = message;
        }

        @Override
        public void run() {
            try {
                Socket socket = new Socket("192.168.1.6", 4444);

                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                bufferedWriter.write(message);
                bufferedWriter.flush();
                bufferedWriter.close();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                data = bufferedReader.readLine();
                while (data != null) {
                    data = bufferedReader.readLine();
                }

                bufferedReader.close();
                socket.close();
            } catch (IOException iox) {
//                Toast.makeText(this,iox.getMessage(),Toast.LENGTH_LONG).show();
                iox.printStackTrace();
            }
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    text.setText("");
                    result.setText("Server message: " + data);
                }

            });
        }
    }
}