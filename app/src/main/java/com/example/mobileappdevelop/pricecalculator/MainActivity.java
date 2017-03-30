package com.example.mobileappdevelop.pricecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText ppriceet;
    private EditText vatet;
    private EditText discountet;
    private EditText showEt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       ppriceet= (EditText) findViewById(R.id.taka);
       vatet= (EditText) findViewById(R.id.vat);
       discountet= (EditText) findViewById(R.id.discount);
        showEt= (EditText) findViewById(R.id.show);



    }

    public void calculate(View view) {

        double price =Double.parseDouble(String.valueOf(ppriceet.getText()));
        double vat =Double.parseDouble(String.valueOf(vatet.getText()));
        double discount =Double.parseDouble(String.valueOf(discountet.getText()));

      TotalPrice totalprice=new TotalPrice(price,vat,discount);
        double total=totalprice.total(price,vat,discount);
        String show_result=String.valueOf(total);
        showEt.setText(show_result);



    }


    }


