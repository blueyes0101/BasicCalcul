package com.mozdag.vietertester111;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText num1;
    EditText num2;
    TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        res = findViewById(R.id.resul);


    }

    public void sum(View view){

        if(num1.getText().toString().matches("") || num2.getText().toString().matches("")){
            res.setText("Enter Number");
        }else {
            int number1 = Integer.parseInt(num1.getText().toString());
            int number2 = Integer.parseInt(num2.getText().toString());
            int result = number1 + number2;
            res.setText("Result :" + result);
        }

    }

    public void min(View view){
        if(num1.getText().toString().matches("") || num2.getText().toString().matches("")){
            res.setText("Enter Number");
        }else {
            int number1 = Integer.parseInt(num1.getText().toString());
            int number2 = Integer.parseInt(num2.getText().toString());
            int result = number1 - number2;
            res.setText("Result :" + result);
        }
    }

    public void multi(View view){
        if(num1.getText().toString().matches("") || num2.getText().toString().matches("")){
            res.setText("Enter Number");
        }else {
            int number1 = Integer.parseInt(num1.getText().toString());
            int number2 = Integer.parseInt(num2.getText().toString());
            int result = number1 * number2;
            res.setText("Result :" + result);
        }
    }

    public void div(View view){
        if(num1.getText().toString().matches("") || num2.getText().toString().matches("")){
            res.setText("Enter Number");
        }else {
            int number1 = Integer.parseInt(num1.getText().toString());
            int number2 = Integer.parseInt(num2.getText().toString());
            int result = number1 / number2;
            res.setText("Result :" + result);
        }
    }
}