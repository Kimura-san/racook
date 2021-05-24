package com.sample.racook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Popup_questionnaire extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup_questionnaire);

        final Button button1 = findViewById(R.id.button5);
//ボタンが押されたときの動作
        button1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(Popup_questionnaire.this,Main_mainActivity.class);
                startActivity(intent);
            }


        });

        final Button button2 = findViewById(R.id.button6);
//ボタンが押されたときの動作
        button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(Popup_questionnaire.this,Main_mainActivity.class);
                startActivity(intent);
            }


        });

        final Button button3 = findViewById(R.id.button7);
//ボタンが押されたときの動作
        button3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(Popup_questionnaire.this,Main_mainActivity.class);
                startActivity(intent);
            }


        });

        final Button button4 = findViewById(R.id.button8);
//ボタンが押されたときの動作
        button4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(Popup_questionnaire.this,Main_mainActivity.class);
                startActivity(intent);
            }


        });
    }


}