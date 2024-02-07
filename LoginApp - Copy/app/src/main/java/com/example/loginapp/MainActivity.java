package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private EditText userName;
    private EditText passWord;
    private Button checker;

    private TextView answer;

    private mySquare theSquare = new mySquare();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userName = (EditText) findViewById(R.id.UsernameText);
        passWord = (EditText) findViewById(R.id.PasswordText);
        checker = (Button) findViewById(R.id.button);
        answer = (TextView) findViewById(R.id.textView);

        checker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                float length = Float.valueOf(userName.getText().toString());
                float width = Float.valueOf(passWord.getText().toString());

                theSquare.setLength(length);
                theSquare.setWidth(width);

                answer.setText("Area of rectangle is " + theSquare.getArea());

            }
        });
    }
}

