package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button buttonC, buttonPlusMinus, buttonPercent, buttonBolu, buttonPlus, buttonMinus, buttonEqual, buttonDot, buttonX;
    Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button0;
    TextView tvSan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonC = findViewById(R.id.btnAC);
        buttonPlusMinus = findViewById(R.id.btnPlusMinus);
        buttonX = findViewById(R.id.btnX);
        buttonPercent = findViewById(R.id.btnPercent);
        buttonBolu = findViewById(R.id.btnDiv);
        buttonMinus = findViewById(R.id.btnMinus);
        buttonPlus = findViewById(R.id.btnPlus);
        buttonDot = findViewById(R.id.btnTochka);
        buttonEqual = findViewById(R.id.btnEqual);

        button1 = findViewById(R.id.btn1);
        button2 = findViewById(R.id.btn2);
        button3 = findViewById(R.id.btn3);
        button4 = findViewById(R.id.btn4);
        button5 = findViewById(R.id.btn5);
        button6 = findViewById(R.id.btn6);
        button7 = findViewById(R.id.btn7);
        button8 = findViewById(R.id.btn8);
        button9 = findViewById(R.id.btn9);
        button0 = findViewById(R.id.btn0);

        tvSan = findViewById(R.id.tv_san);

        button1.setOnClickListener(v -> {buttonClick(1);});
        button2.setOnClickListener(v -> {buttonClick(2);});
        button3.setOnClickListener(v -> {buttonClick(3);});
        button4.setOnClickListener(v -> {buttonClick(4);});
        button5.setOnClickListener(v -> {buttonClick(5);});
        button6.setOnClickListener(v -> {buttonClick(6);});
        button7.setOnClickListener(v -> {buttonClick(7);});
        button8.setOnClickListener(v -> {buttonClick(8);});
        button9.setOnClickListener(v -> {buttonClick(9);});
        button0.setOnClickListener(v -> {buttonClick(0);});

        buttonC.setOnClickListener(v -> {buttonClick2('C');});
        buttonDot.setOnClickListener(v -> {buttonClick('.');});
        buttonPlus.setOnClickListener(v -> {buttonClick('+');});
        buttonMinus.setOnClickListener(v -> {buttonClick('-');});
        buttonX.setOnClickListener(v -> {buttonClick('X');});
        buttonEqual.setOnClickListener(v -> {buttonClick('=');});
        buttonBolu.setOnClickListener(v -> {buttonClick('/');});
        buttonPercent.setOnClickListener(v -> {buttonClick('%');});
        buttonPlusMinus.setOnClickListener(v -> {buttonClick3('$');});
    }


    public void buttonClick(int n){
        String prevNum = tvSan.getText().toString();
        String basylganSan = "";
        String result = "";
        switch (n) {
            case 1:
                basylganSan = "1";
                break;
            case 2:
                basylganSan = "2";
                break;
            case 3:
                basylganSan = "3";
                break;
            case 4:
                basylganSan = "4";
                break;
            case 5:
                basylganSan = "5";
                break;
            case 6:
                basylganSan = "6";
                break;
            case 7:
                basylganSan = "7";
                break;
            case 8:
                basylganSan = "8";
                break;
            case 9:
                basylganSan = "9";
                break;
            case 0:
                basylganSan = "0";
                break;

            case '.':
                basylganSan = ".";
                break;

            case '+':
                basylganSan = "+";
                break;

            case '-':
                basylganSan = "-";
                break;

            case 'X':
                basylganSan = "X";
                break;

            case '/':
                basylganSan = "/";
                break;

            case '%':
                basylganSan = "%";
                break;
            case 'C':
                result = "0";
                break;
        }
        if (!prevNum.equals("0") || (prevNum.equals("0") && basylganSan.equals("."))) result = prevNum + basylganSan;
        else result = basylganSan;

        tvSan.setText(result);
    }

    public void buttonClick2(int n){
        switch (n){
            case 'C':
                tvSan.setText("0");
                break;
        }
    }

        public void buttonClick3(int a) {
                switch (a){
                    case '$':
                    String sanText = tvSan.getText().toString();
                    int san = Integer.parseInt(sanText);
                    if(san > 0) tvSan.setText("-" + sanText);
                    else {
                        san = san * (-1);
                        tvSan.setText("" + san);
                    }
                    break;
                }
        };
}