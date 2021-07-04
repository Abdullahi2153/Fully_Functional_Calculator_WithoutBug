package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    TextView textViewResult;

    private Button one, two, three, four, five, six, seven, eight, nine, zero, equal, plus, minus, multiply, divide, clear;

    private Integer firstInput = 0, secondInput = 0;
    private boolean isAdd, isSub, isMult, isDiv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    firstInput = Integer.valueOf(textViewResult.getText().toString());
                    isAdd = true;
                    textViewResult.setText(null);
                }catch (Exception e){

                }

            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    firstInput = Integer.valueOf(textViewResult.getText().toString());
                    isSub = true;
                    textViewResult.setText(null);
                }catch (Exception e){

                }


            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    firstInput = Integer.valueOf(textViewResult.getText().toString());
                    isMult = true;
                    textViewResult.setText(null);
                }catch (Exception e){

                }

            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    firstInput = Integer.valueOf(textViewResult.getText().toString());
                    isDiv = true;
                    textViewResult.setText(null);
                }catch (Exception e){

                }

            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstInput = 0;
                secondInput = 0;
                textViewResult.setText(null);
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    if (textViewResult.getText().toString() != null){
                        secondInput = Integer.valueOf(textViewResult.getText().toString());
                    }
                }catch (Exception e){

                }


                if (isAdd){
                    textViewResult.setText(firstInput+secondInput+"");
                    isAdd = false;
                }

                if (isSub){
                    textViewResult.setText(firstInput-secondInput+"");
                    isSub = false;
                }

                if (isMult){
                    textViewResult.setText(firstInput*secondInput+"");
                    isMult = false;
                }

                if (isDiv){
                    if (secondInput == 0){
                        Toast.makeText(MainActivity.this, "Cannot be divide by zero", Toast.LENGTH_SHORT).show();
                    }
                    double result  = (double) firstInput / secondInput;
                    textViewResult.setText(String.format("%.1f", result));
                    isDiv = false;
                }
            }
        });


    }

    public void numberOperation(View view){
        Button button = (Button) view;
        textViewResult.setText(textViewResult.getText().toString()+button.getText().toString());
    }

    private void initViews() {
        textViewResult = findViewById(R.id.textViewResult);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        zero = findViewById(R.id.zero);
        equal = findViewById(R.id.equal);
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        multiply = findViewById(R.id.multiply);
        divide = findViewById(R.id.div);
        clear = findViewById(R.id.clear);
    }
}