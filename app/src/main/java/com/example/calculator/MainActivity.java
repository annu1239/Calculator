package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et1, et2;
    Button ba, bs, bm, bd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.editText3);
        et2 = findViewById(R.id.editText4);

        ba = findViewById(R.id.button);
        bs = findViewById(R.id.button2);
        bm = findViewById(R.id.button3);
        bd = findViewById(R.id.button4);



        ba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txt1 = et1.getText().toString();
                final int frst = Integer.parseInt(txt1);

                String txt2 = et2.getText().toString();
                final int scnd = Integer.parseInt(txt2);

                Toast.makeText(getApplicationContext(), "Addition" +(frst+scnd), Toast.LENGTH_SHORT).show();
            }
        });


        bs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txt1 = et1.getText().toString();
                final int frst = Integer.parseInt(txt1);

                String txt2 = et2.getText().toString();
                final int scnd = Integer.parseInt(txt2);

                Toast.makeText(getApplicationContext(), "Subtraction" +(frst-scnd), Toast.LENGTH_SHORT).show();
            }
        });


        bm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txt1 = et1.getText().toString();
                final int frst = Integer.parseInt(txt1);

                String txt2 = et2.getText().toString();
                final int scnd = Integer.parseInt(txt2);

                Toast.makeText(getApplicationContext(), "Multiplication" +(frst*scnd), Toast.LENGTH_SHORT).show();
            }
        });


        bd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txt1 = et1.getText().toString();
                final int frst = Integer.parseInt(txt1);

                String txt2 = et2.getText().toString();
                final int scnd = Integer.parseInt(txt2);

                Toast.makeText(getApplicationContext(), "Division" +(frst/scnd), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
