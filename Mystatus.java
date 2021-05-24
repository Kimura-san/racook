package com.sample.racook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Mystatus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mystatus);

        DatabaseReference reference = FirebaseDatabase.getInstance().getReference();
        reference.child("user").child("user1").child("プロフィール").child("いつも作る量").addValueEventListener(listener);
        DatabaseReference reference1 = FirebaseDatabase.getInstance().getReference();
        reference1.child("user").child("user1").child("プロフィール").child("birthday").addValueEventListener(listener);
        DatabaseReference reference2 = FirebaseDatabase.getInstance().getReference();
        reference2.child("user").child("user1").child("プロフィール").child("sex").addValueEventListener(listener);
        DatabaseReference reference3 = FirebaseDatabase.getInstance().getReference();
        reference3.child("user").child("user1").child("プロフィール").child("アレルギー").child("材料").addValueEventListener(listener);
        DatabaseReference reference4 = FirebaseDatabase.getInstance().getReference();
        reference4.child("user").child("user1").child("プロフィール").child("favorite").addValueEventListener(listener);
        DatabaseReference reference5 = FirebaseDatabase.getInstance().getReference();
        reference5.child("user").child("user1").child("プロフィール").child("address").addValueEventListener(listener);
    }
    ValueEventListener listener = new ValueEventListener() {
        //onDataChangeに受け取ったデータを代入
        public void onDataChange(DataSnapshot snapshot) {
            System.out.println("データを受信しました。"
                    + snapshot.getKey() + "=" + snapshot.getValue());
            String value = (String) snapshot.getValue();

            if(snapshot.getKey().equals("いつも作る量")){
                TextView textView = (TextView) findViewById(R.id.textView24);
                textView.setText(value);
            }

            if(snapshot.getKey().equals("birthday")){
                TextView textView = (TextView) findViewById(R.id.textView25);
                textView.setText(value);
            }
            if(snapshot.getKey().equals("sex")){
                TextView textView = (TextView) findViewById(R.id.textView26);
                textView.setText(value);
            }

            if(snapshot.getKey().equals("材料")){
                TextView textView = (TextView) findViewById(R.id.textView30);
                textView.setText(value);
            }

            if(snapshot.getKey().equals("favorite")){
                TextView textView = (TextView) findViewById(R.id.textView29);
                textView.setText(value);
            }

            if(snapshot.getKey().equals("address")){
                TextView textView = (TextView) findViewById(R.id.textView27);
                textView.setText(value);
            }


        }

        public void onCancelled(DatabaseError error) {
            System.out.println("データ受信がキャンセルされました。" + error.toString());
        }
    };

}