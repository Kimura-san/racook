package com.sample.racook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class mypage extends AppCompatActivity {
    String osusumeRecipe = "a";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mypage);

        final Button button1 = findViewById(R.id.button2);
//ボタンが押されたときの動作
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(mypage.this, Mystatus.class);
                startActivity(intent);
            }
        }    );

        final Button button2 = findViewById(R.id.button1);
//ボタンが押されたときの動作
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(mypage.this, FruitActivity.class);
                startActivity(intent);
            }
        }    );

        final Button button3 = findViewById(R.id.button3);
//ボタンが押されたときの動作
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(mypage.this, Questionnaire.class);
                startActivity(intent);
            }
        }    );

        final Button button4 = findViewById(R.id.button6);
//ボタンが押されたときの動作
        button4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(mypage.this,Main_mainActivity.class);
                startActivity(intent);
            }


        });

        DatabaseReference favorite = FirebaseDatabase.getInstance().getReference();
        favorite.child("user").child("user1").child("プロフィール").child("favorite").addValueEventListener(userListener);


        final Button recommend = findViewById(R.id.button9);
        //ボタンが押されたときの動作
        recommend.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(osusumeRecipe.equals("和食"))
                {
                    Intent intent = new Intent(mypage.this, Japanese.class);
                    startActivity(intent);
                }else if(osusumeRecipe.equals("中華"))
                {
                    Intent intent = new Intent(mypage.this, Chinese.class);
                    startActivity(intent);
                }else if(osusumeRecipe.equals("洋食"))
                {
                    Intent intent = new Intent(mypage.this, Western.class);
                    startActivity(intent);
                }else if(osusumeRecipe.equals("デザート"))
                {
                    Intent intent = new Intent(mypage.this, Dessert.class);
                    startActivity(intent);
                }
            }
        });

    }

    ValueEventListener userListener = new ValueEventListener()
    {

        //onDataChangeに受け取ったデータを代入
        public void onDataChange(DataSnapshot snapshot)
        {
            System.out.println("データを受信しました。"
                    + snapshot.getKey()+"="+snapshot.getValue());

            osusumeRecipe = (String)snapshot.getValue();
            System.out.println(osusumeRecipe);
        }

        public void onCancelled(DatabaseError error)
        {
            System.out.println("データ受信がキャンセルされました。" + error.toString());
        }
    };

}