package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private   Button b0;
    private   Button b1;
    private   Button b2;
    private   Button b3;
    private   Button b4;
    private   Button b5;
    private   Button b6;
    private   Button b7;
    private   Button b8;
    private   Button b9;
    private   Button bp;
    private  TextView res;

    private float n1;
    private float n2;
    private String operation;
    private double nR;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeComponents();

    }

    private void initializeComponents() {
        b1 = findViewById(R.id.btn0);
        b1 = findViewById(R.id.btn1);
        b2 = findViewById(R.id.btn2);
        b3 = findViewById(R.id.btn3);
        b4 = findViewById(R.id.btn4);
        b5 = findViewById(R.id.btn5);
        b6 = findViewById(R.id.btn6);
        b7 = findViewById(R.id.btn7);
        b8 = findViewById(R.id.btn8);
        b9 = findViewById(R.id.btn9);
        bp = findViewById(R.id.btnPoint);

        res = findViewById(R.id.resultTV);
        res.setText(" ");
    }

    //method to show the numbers on the text view
    @SuppressLint("NonConstantResourceId")
    public void setOnResult(View view){
          String aux = res.getText().toString();
        switch (view.getId()){
            case R.id.btn0:
                res.setText(aux.concat(b0.getText().toString()));
                break;
                case R.id.btn1:
                res.setText(aux.concat(b1.getText().toString()));
                break;
            case R.id.btn2:
                res.setText(aux.concat(b2.getText().toString()));
                break;
            case R.id.btn3:
                res.setText(aux.concat((b3.getText().toString())));
                break;
            case R.id.btn4:
                res.setText(aux.concat(b4.getText().toString()));
                break;
            case R.id.btn5:
                res.setText(aux.concat(b5.getText().toString()));
                break;
            case R.id.btn6:
                res.setText(aux.concat(b6.getText().toString()));
                break;
            case R.id.btn7:
                res.setText(aux.concat(b7.getText().toString()));
                break;
            case R.id.btn8:
                res.setText(aux.concat(b8.getText().toString()));
                break;
            case R.id.btn9:
                res.setText(aux.concat(b9.getText().toString()));
                break;
            case R.id.btnPoint:
                res.setText(aux.concat(bp.getText().toString()));
                break;

        }

    }

    //method to get the operation signal
    public void getOperation(View view){
        switch (view.getId()){
            case R.id.btnDel:
                res.setText(" ");
                n1=0;
                n2=0;
                operation=" ";
                break;
            case R.id.btnPlus:
                n1 = Float.parseFloat(res.getText().toString());
                operation = "+";
                res.setText(" ");
                break;
            case R.id.btnSub:
                n1 =Float.parseFloat(res.getText().toString());
                operation = "-";
                res.setText(" ");
                break;
            case R.id.btnMult:
                n1 = Float.parseFloat(res.getText().toString());
                operation = "*";
                res.setText(" ");
                break;
            case R.id.btnDiv:
                n1 = Float.parseFloat(res.getText().toString());
                operation = "/";
                res.setText(" ");
                break;
            case R.id.btnRaiz:
                n1 = Float.parseFloat(res.getText().toString());
                operation = "raiz";
                res.setText("" + Math.sqrt(n1));
                break;

            case R.id.btnExp:
                n1 = Float.parseFloat(res.getText().toString());
                operation = "exp";
                res.setText(" ");
                break;

            case R.id.btnLn:
                n1 = Float.parseFloat(res.getText().toString());
                operation = "ln";
                res.setText(" "+Math.log1p(n1));
                break;
            case R.id.btnPerc:
                n1 = Float.parseFloat(res.getText().toString());
                operation = "%";
                res.setText(""+n1/100);
                break;
            case R.id.btnMN:
                n1 = Float.parseFloat(res.getText().toString());
                operation = "+/-";
                res.setText(""+n1*(-1));
                break;
            case R.id.btnPlus2:
                n1 = Float.parseFloat(res.getText().toString());
                operation = "log";
                res.setText(" ");

        }
    }

    //method for equal
    public void calculate(View view){
       /* if(view.getId() == R.id.btnEqual){

        }*/

        if(operation.equals("+")){
            n2 = Float.parseFloat(res.getText().toString());
            nR = n1 + n2;
            res.setText("" + nR);
        } else  if(operation.equals("-")){
            n2 = Float.parseFloat(res.getText().toString());
            nR = n1 - n2;
            res.setText("" + nR);
        } else if(operation.equals("*")){
            n2 = Float.parseFloat(res.getText().toString());
            nR = n1 * n2;
            res.setText("" + nR);
        } else if(operation.equals("/")){
            n2 = Float.parseFloat(res.getText().toString());
            nR = n1 / n2;
            res.setText("" + nR);
        } else if(operation.equals("exp")){
            n2 = Float.parseFloat(res.getText().toString());
            nR = Math.pow(n1, n2);
            res.setText("" + nR);
        }else if(operation.equals("log")){
            n2 = Float.parseFloat(res.getText().toString());

            nR = Math.log(n1)/Math.log(n2);
            res.setText("" + nR);
        }
    }

    public void function(View view){
 
    }

}