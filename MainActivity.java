package com.sample.cash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    long f1 = 0;
    long f2 = 0;
    long f3 = 0;
    long f4 = 0;
    long f5 = 0;
    long f6 = 0;
    long f7 = 0;
    long f8 = 0;
    long f9 = 0;
    long y1 = 0;
    long y2 = 0;
    long y3 = 0;
    long y4 = 0;
    long y5 = 0;
    long y6 = 0;
    long n1 = 0;
    long n2 = 0;
    long n3 = 0;
    long n4 = 0;
    long n5= 0;
    long n6 = 0;
    long s1 = 0;
    long s2 = 0;
    long s3 = 0;
    long s4 = 0;
    long s5= 0;
    long s6 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        DatabaseReference reference = FirebaseDatabase.getInstance().getReference();
        for (int i = 0; i < 10; i++) {
            reference.child("user").child("user1").child("ref").child("fruit").child("f"+i).addValueEventListener(listener);
        }

        DatabaseReference referenceY = FirebaseDatabase.getInstance().getReference();
        for (int i = 1; i < 7; i++) {
            referenceY.child("user").child("user1").child("ref").child("yasai").child("y"+i).addValueEventListener(listenerY);
        }

        DatabaseReference referenceN = FirebaseDatabase.getInstance().getReference();
        for (int i = 1; i < 7; i++) {
            referenceN.child("user").child("user1").child("ref").child("niku").child("n"+i).addValueEventListener(listenerN);
        }

        DatabaseReference referenceS = FirebaseDatabase.getInstance().getReference();
        for (int i = 1; i < 7; i++) {
            referenceY.child("user").child("user1").child("ref").child("sakana").child("s"+i).addValueEventListener(listenerS);
        }


        Button apple = findViewById(R.id.appleBuy);
        apple.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                //System.out.println(f1);
                f1 += 1;
                reference.child("user").child("user1").child("ref").child("fruit").child("f1").setValue(f1);
            }
        });

        Button banana = findViewById(R.id.bananaBuy);
        banana.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                //System.out.println(f1);
                f2 += 1;
                reference.child("user").child("user1").child("ref").child("fruit").child("f2").setValue(f2);
            }
        });

        Button retasu = findViewById(R.id.retasuBuy);
        retasu.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                //System.out.println(f1);
                y1 += 1;
                reference.child("user").child("user1").child("ref").child("yasai").child("y1").setValue(y1);
            }
        });


        Button ninjin = findViewById(R.id.ninjinBuy);
        ninjin.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                //System.out.println(f1);
                y2 += 1;
                reference.child("user").child("user1").child("ref").child("yasai").child("y2").setValue(y2);
            }
        });

        Button torimomo = findViewById(R.id.torimomoBuy);
        torimomo.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                //System.out.println(f1);
                n5 += 1;
                reference.child("user").child("user1").child("ref").child("niku").child("n5").setValue(n5);
            }
        });

        Button sake = findViewById(R.id.sakeBuy);
        sake.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                //System.out.println(f1);
                s1 += 1;
                reference.child("user").child("user1").child("ref").child("sakana").child("s1").setValue(s1);
            }
        });

    }




    ValueEventListener listener = new ValueEventListener() {
        //onDataChangeに受け取ったデータを代入
        public void onDataChange(DataSnapshot snapshot) {
            System.out.println("データを受信しました。"
                    + snapshot.getKey() + "=" + snapshot.getValue());
            Long value = (Long)snapshot.getValue();

            TextView textF1 = findViewById(R.id.textF1);

            DatabaseReference target = FirebaseDatabase.getInstance().getReference();

            if(snapshot.getKey().equals("f1")){
                Long sum = value;
                f1 = sum;
                //textF1.setText();
                //所定のキーに演算結果を格納
                //target.child("user").child("user1").child("ref").child("fruit").child("f1").setValue(sum);
            }

            if(snapshot.getKey().equals("f2")){
                Long sum = value;
                f2 = sum;
            }

            if(snapshot.getKey().equals("f3")){
                Long sum = value;
                f3 = sum;
            }

            if(snapshot.getKey().equals("f4")){
                Long sum = value;
                f4 = sum;
            }

            if(snapshot.getKey().equals("f5")){
                Long sum = value;
                f5 = sum;
            }

            if(snapshot.getKey().equals("f6")){
                Long sum = value;
                f6 = sum;
            }

            if(snapshot.getKey().equals("f7")){
                Long sum = value;
                f7 = sum;
            }

            if(snapshot.getKey().equals("f8")){
                Long sum = value;
                f8 = sum;
            }

            if(snapshot.getKey().equals("f9")){
                Long sum = value;
                f9 = sum;
            }




        }

        public void onCancelled(DatabaseError error) {
            System.out.println("データ受信がキャンセルされました。" + error.toString());
        }
    };



    //野菜
    ValueEventListener listenerY = new ValueEventListener() {
        //onDataChangeに受け取ったデータを代入
        public void onDataChange(DataSnapshot snapshot) {
            System.out.println("データを受信しました。"
                    + snapshot.getKey() + "=" + snapshot.getValue());
            Long value = (Long)snapshot.getValue();

            TextView textF1 = findViewById(R.id.textF1);

            DatabaseReference target = FirebaseDatabase.getInstance().getReference();

            if(snapshot.getKey().equals("y1")){
                Long sum = value;
                y1 = sum;
                //textF1.setText();
                //所定のキーに演算結果を格納
                //target.child("user").child("user1").child("ref").child("fruit").child("f1").setValue(sum);
            }

            if(snapshot.getKey().equals("y2")){
                Long sum = value;
                y2 = sum;
            }

            if(snapshot.getKey().equals("y3")){
                Long sum = value;
                y3 = sum;
            }

            if(snapshot.getKey().equals("y4")){
                Long sum = value;
                y4 = sum;
            }

            if(snapshot.getKey().equals("f5")){
                Long sum = value;
                y5 = sum;
            }

            if(snapshot.getKey().equals("f6")){
                Long sum = value;
                y6 = sum;
            }

        }

        public void onCancelled(DatabaseError error) {
            System.out.println("データ受信がキャンセルされました。" + error.toString());
        }
    };



    //肉
    ValueEventListener listenerN = new ValueEventListener() {
        //onDataChangeに受け取ったデータを代入
        public void onDataChange(DataSnapshot snapshot) {
            System.out.println("データを受信しました。"
                    + snapshot.getKey() + "=" + snapshot.getValue());
            Long value = (Long)snapshot.getValue();

            TextView textF1 = findViewById(R.id.textF1);

            DatabaseReference target = FirebaseDatabase.getInstance().getReference();

            if(snapshot.getKey().equals("n1")){
                Long sum = value;
                n1 = sum;
                //textF1.setText();
                //所定のキーに演算結果を格納
                //target.child("user").child("user1").child("ref").child("fruit").child("f1").setValue(sum);
            }

            if(snapshot.getKey().equals("n2")){
                Long sum = value;
                n2 = sum;
            }

            if(snapshot.getKey().equals("n3")){
                Long sum = value;
                n3 = sum;
            }

            if(snapshot.getKey().equals("n4")){
                Long sum = value;
                n4 = sum;
            }

            if(snapshot.getKey().equals("n5")){
                Long sum = value;
                n5 = sum;
            }

            if(snapshot.getKey().equals("n6")){
                Long sum = value;
                n6 = sum;
            }

        }

        public void onCancelled(DatabaseError error) {
            System.out.println("データ受信がキャンセルされました。" + error.toString());
        }
    };



    //魚
    ValueEventListener listenerS = new ValueEventListener() {
        //onDataChangeに受け取ったデータを代入
        public void onDataChange(DataSnapshot snapshot) {
            System.out.println("データを受信しました。"
                    + snapshot.getKey() + "=" + snapshot.getValue());
            Long value = (Long)snapshot.getValue();

            TextView textF1 = findViewById(R.id.textF1);

            DatabaseReference target = FirebaseDatabase.getInstance().getReference();

            if(snapshot.getKey().equals("s1")){
                Long sum = value;
                s1 = sum;
                //textF1.setText();
                //所定のキーに演算結果を格納
                //target.child("user").child("user1").child("ref").child("fruit").child("f1").setValue(sum);
            }

            if(snapshot.getKey().equals("s2")){
                Long sum = value;
                s2 = sum;
            }

            if(snapshot.getKey().equals("s3")){
                Long sum = value;
                s3 = sum;
            }

            if(snapshot.getKey().equals("s4")){
                Long sum = value;
                s4 = sum;
            }

            if(snapshot.getKey().equals("s5")){
                Long sum = value;
                s5 = sum;
            }

            if(snapshot.getKey().equals("s6")){
                Long sum = value;
                s6 = sum;
            }

        }

        public void onCancelled(DatabaseError error) {
            System.out.println("データ受信がキャンセルされました。" + error.toString());
        }
    };

}