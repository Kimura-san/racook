package com.sample.racook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main_mainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_main);

        final Button button1 = findViewById(R.id.button2);
//ボタンが押されたときの動作
        button1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(Main_mainActivity.this,Japanese.class);
                startActivity(intent);
            }


        });

        final Button button2 = findViewById(R.id.clearButton);
//ボタンが押されたときの動作
        button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(Main_mainActivity.this,mypage.class);
                startActivity(intent);
            }


        });

        final Button button3 = findViewById(R.id.fpb);
//ボタンが押されたときの動作
        button3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(Main_mainActivity.this,Coupon.class);
                startActivity(intent);
            }


        });

        final Button button4 = findViewById(R.id.npb2);
//ボタンが押されたときの動作
        button4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(Main_mainActivity.this,Mystatus_change.class);
                startActivity(intent);
            }


        });

    }
}