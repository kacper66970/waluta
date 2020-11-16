package com.example.waluta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final float EURO = (float) 4.49;
    public static final float FRANK = (float) 4.17;
    public static final float DOLAR = (float) 4.80;
    public static final float FUNT = (float) 5.01;



    TextView toPay;
    EditText moneyToExchange;
    Button PLN_EUR, EUR_PLN, PLN_CHF, CHF_PLN, PLN_GBP, GBP_PLN, PLN_USD, USD_PLN;

    float num, result_money;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toPay = findViewById(R.id.toPay);
        moneyToExchange = findViewById(R.id.moneyToExchange);

        PLN_EUR = findViewById(R.id.PLN_EUR);
        EUR_PLN = findViewById(R.id.EUR_PLN);
        PLN_CHF = findViewById(R.id.PLN_CHF);
        CHF_PLN = findViewById(R.id.CHF_PLN);
        PLN_GBP = findViewById(R.id.PLN_GBP);
        GBP_PLN = findViewById(R.id.GBP_PLN);
        PLN_USD = findViewById(R.id.PLN_USD);
        USD_PLN = findViewById(R.id.USD_PLN);

        PLN_EUR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               counterPLN(EURO);
            }
        });

        PLN_USD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               counterPLN(DOLAR);
            }
        });

        PLN_GBP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counterPLN(FUNT);
            }
        });

        PLN_CHF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               counterPLN(FRANK);
            }
        });

        CHF_PLN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter(FRANK);
            }
        });

        USD_PLN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter(DOLAR);
            }
        });
        EUR_PLN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter(EURO);
            }
        });

        GBP_PLN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter(FUNT);
            }
        });

    }

    private void counter(float currency){
        num = Float.parseFloat(moneyToExchange.getText().toString());
        if(num == 0){
            toPay.setText("Bład!!! Sprobuj jeszcze raz");
        }else {
            result_money = num * currency;

            toPay.setText(String.format("%.2f%n",result_money));
        }
    }

    private void counterPLN(float currency){
        num = Float.parseFloat(moneyToExchange.getText().toString());
        if(num == 0){
            toPay.setText("Bład!!! Sprobuj jeszcze raz");
        }else {
            result_money = num / currency;

            toPay.setText(String.format("%.2f%n",result_money));
        }
    }

}