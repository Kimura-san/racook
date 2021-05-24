package com.sample.racook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Mystatus_change extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mystatus_change);

        Button button = findViewById(R.id.button7);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                DatabaseReference reference = FirebaseDatabase.getInstance().getReference();
                reference.child("user").child("user1").child("プロフィール").child("favorite").setValue("和食");
//　ボタンを押すとアンケート結果をFirebaseに記入しマイページに戻る
                Intent intent = new Intent(Mystatus_change.this,Main_mainActivity.class);
                startActivity(intent);

            }

        });

        Button button2 = findViewById(R.id.button1);

        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                DatabaseReference reference = FirebaseDatabase.getInstance().getReference();
                reference.child("user").child("user1").child("プロフィール").child("favorite").setValue("洋食");
//　ボタンを押すとアンケート結果をFirebaseに記入しマイページに戻る
                Intent intent = new Intent(Mystatus_change.this,Main_mainActivity.class);
                startActivity(intent);
            }

        });

        Button button3 = findViewById(R.id.button2);

        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                DatabaseReference reference = FirebaseDatabase.getInstance().getReference();
                reference.child("user").child("user1").child("プロフィール").child("favorite").setValue("中華");
//　ボタンを押すとアンケート結果をFirebaseに記入しマイページに戻る
                Intent intent = new Intent(Mystatus_change.this,Main_mainActivity.class);
                startActivity(intent);
            }

        });

        Button button4 = findViewById(R.id.button3);

        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                DatabaseReference reference = FirebaseDatabase.getInstance().getReference();
                reference.child("user").child("user1").child("プロフィール").child("favorite").setValue("デザート");
//　ボタンを押すとアンケート結果をFirebaseに記入しマイページに戻る
                Intent intent = new Intent(Mystatus_change.this,Main_mainActivity.class);
                startActivity(intent);
            }

        });
    }




}