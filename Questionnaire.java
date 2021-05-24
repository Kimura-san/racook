package com.sample.racook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Questionnaire extends AppCompatActivity {

    private EditText edit_Text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questionnaire);

        edit_Text = findViewById(R.id.edit_text);

        Button button = findViewById(R.id.button4);

        button.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

//                private String getToday() {
                    Date date = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日HH時mm分ss秒に記入", Locale.getDefault());
                    String now = sdf.format(date);
//                }
                String text = edit_Text.getText().toString();
                DatabaseReference reference = FirebaseDatabase.getInstance().getReference();
                reference.child("アンケート").child(now).setValue(text);
//　ボタンを押すとアンケート結果をFirebaseに記入しマイページに戻る

                Intent intent = new Intent(Questionnaire.this,mypage.class);
                startActivity(intent);

            }
        });



    }

}