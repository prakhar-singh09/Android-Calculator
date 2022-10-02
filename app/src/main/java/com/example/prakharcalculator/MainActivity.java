package com.example.prakharcalculator;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etfirstValue, etsecondValue;
    TextView finalanswer;
    Button add, subtract, multiply, divide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etfirstValue = findViewById(R.id.etfirstValue);
        etsecondValue = findViewById(R.id.etsecondValue);

        finalanswer = findViewById(R.id.finalAnswer);

        add = findViewById(R.id.btnAdd);
        subtract = findViewById(R.id.btnSub);
        multiply = findViewById(R.id.btnmultiply);
        divide = findViewById(R.id.btndivide);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstValue, secondValue, ans;
                firstValue = Integer.parseInt(etfirstValue.getText().toString());
                secondValue = Integer.parseInt(etsecondValue.getText().toString());
                ans = firstValue + secondValue;
                finalanswer.setText("Ans is = " + ans);
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstvalue, secondvalue, ans;
                firstvalue = Integer.parseInt(etfirstValue.getText().toString());
                secondvalue = Integer.parseInt(etsecondValue.getText().toString());
                ans = firstvalue - secondvalue;
                finalanswer.setText("Ans is = " + ans);
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstvalue, secondvalue, ans;
                firstvalue = Integer.parseInt(etfirstValue.getText().toString());
                secondvalue = Integer.parseInt(etsecondValue.getText().toString());
                ans = firstvalue * secondvalue;
                finalanswer.setText("Ans is = " + ans);
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float firstvalue, secondvalue, ans;
                firstvalue = Integer.parseInt(etfirstValue.getText().toString());
                secondvalue = Integer.parseInt(etsecondValue.getText().toString());
                ans = firstvalue / secondvalue;
                finalanswer.setText("Ans is = " + ans);
            }
        });
    }
}

