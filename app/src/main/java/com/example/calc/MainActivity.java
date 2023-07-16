package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView1,textView2;
    Button button0,button1,button2,button3,button4,button5,button6,button7,button8,button9;
    Button btnadd,btnsub,btnmul,btndiv,btnclr,btnequal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1 = findViewById(R.id.txt1);
        textView2 = findViewById(R.id.txt2);
        button0 = findViewById(R.id.zero);
        button1 = findViewById(R.id.one);
        button2= findViewById(R.id.two);
        button3 = findViewById(R.id.three);
        button4 = findViewById(R.id.four);
        button5 = findViewById(R.id.five);
        button6 = findViewById(R.id.six);
        button7 = findViewById(R.id.seven);
        button8 = findViewById(R.id.eight);
        button9 = findViewById(R.id.nine);
        btnadd = findViewById(R.id.plus);
        btnsub = findViewById(R.id.minus);
        btnmul = findViewById(R.id.multi);
        btndiv = findViewById(R.id.division);
        btnequal = findViewById(R.id.equalto);
        btnclr = findViewById(R.id.clear);




    }
}