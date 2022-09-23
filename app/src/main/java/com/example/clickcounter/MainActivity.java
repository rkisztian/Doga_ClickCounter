package com.example.clickcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int szamlalo = 0;
    private Button buttonPlusz;
    private TextView textView;
    private Button buttonMinusz;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();



        buttonPlusz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                szamlalo++;
                textView.setText(String.valueOf(szamlalo));
                if (szamlalo > 0){
                    textView.setTextColor(Color.GREEN);
                }else {
                    textView.setTextColor(Color.BLUE);
                }

            }
        });


        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                szamlalo = 0;
                textView.setText(String.valueOf(szamlalo));
                if (szamlalo == 0){
                    textView.setTextColor(Color.BLUE);
                }
            }
        });


        buttonMinusz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                szamlalo--;
                textView.setText(String.valueOf(szamlalo));
                if (szamlalo < 0){
                    textView.setTextColor(Color.RED);
                }else{
                    textView.setTextColor(Color.BLUE);
                }
            }
        });


    }





    private void init(){
        buttonPlusz = findViewById(R.id.buttonPlusz);
        textView = findViewById(R.id.textView);
        buttonMinusz = findViewById(R.id.buttonMinusz);
    }
}