package com.sample.racook;

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

public class FruitActivity extends AppCompatActivity {
    long f1 = 0;
    long f2 = 0;
    long f3 = 0;
    long f4 = 0;
    long f5 = 0;
    long f6 = 0;
    long f7 = 0;
    long f8 = 0;
    long f9 = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit);

        DatabaseReference reference = FirebaseDatabase.getInstance().getReference();
        for (int i = 0; i < 10; i++) {
            reference.child("user").child("user1").child("ref").child("fruit").child("f"+i).addValueEventListener(listener);
        }



        //DatabaseReference referenceS = FirebaseDatabase.getInstance().getReference();
        //for (int i = 1; i < 7; i++) {
        //    referenceY.child("user").child("user1").child("ref").child("sakana").child("s"+i).addValueEventListener(listenerS);
        //}

        final Button button1 = findViewById(R.id.button5);
//ボタンが押されたときの動作
        button1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(FruitActivity.this,mypage.class);
                startActivity(intent);
            }


        });

        final Button fpb = findViewById(R.id.fpb);


        fpb.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(FruitActivity.this, FruitActivity.class);
                startActivity(intent);
            }
        });

        final Button npb = findViewById(R.id.npb);


        npb.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(FruitActivity.this, OnikuActivity.class);
                startActivity(intent);
            }
        });

        final Button spb = findViewById(R.id.spb);


        spb.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(FruitActivity.this,OsakanaActivity.class);
                startActivity(intent);
            }
        });

        final Button ypb = findViewById(R.id.ypb);


        ypb.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(FruitActivity.this,YasaiActivity.class);
                startActivity(intent);
            }
        });

        //各材料をボタンで追加、削除した際にデータベースに反映する


        ImageButton ringo2 = findViewById(R.id.ringo2);
        ringo2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                //System.out.println(f1);
                f1 += 1;
                reference.child("user").child("user1").child("ref").child("fruit").child("f1").setValue(f1);
            }
        });

        ImageButton ringo1 = findViewById(R.id.ringo1);
        ringo1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                //System.out.println(f1);
                if(f1==0)
                {
                    f1 = 0;
                }
                else {
                    f1-=1;
                }
                reference.child("user").child("user1").child("ref").child("fruit").child("f1").setValue(f1);
            }
        });

        ImageButton banana2 = findViewById(R.id.banana2);
        banana2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                //System.out.println(f1);
                f2 += 1;
                reference.child("user").child("user1").child("ref").child("fruit").child("f2").setValue(f2);
            }
        });

        ImageButton banana1 = findViewById(R.id.banana1);
        banana1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                //System.out.println(f1);
                if(f2==0)
                {
                    f2 = 0;
                }
                else {
                    f2-=1;
                }
                reference.child("user").child("user1").child("ref").child("fruit").child("f2").setValue(f2);
            }
        });

        ImageButton budou2 = findViewById(R.id.budou2);
        budou2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                //System.out.println(f1);
                f3 += 1;
                reference.child("user").child("user1").child("ref").child("fruit").child("f3").setValue(f3);
            }
        });

        ImageButton budou1 = findViewById(R.id.budou1);
        budou1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                //System.out.println(f1);
                if(f3==0)
                {
                    f3 = 0;
                }
                else {
                    f3-=1;
                }
                reference.child("user").child("user1").child("ref").child("fruit").child("f3").setValue(f3);
            }
        });

        ImageButton remon2 = findViewById(R.id.remon2);
        remon2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                //System.out.println(f1);
                f4 += 1;
                reference.child("user").child("user1").child("ref").child("fruit").child("f4").setValue(f4);
            }
        });

        ImageButton remon1 = findViewById(R.id.remon1);
        remon1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                //System.out.println(f1);
                if(f4==0)
                {
                    f4 = 0;
                }
                else {
                    f4-=1;
                }
                reference.child("user").child("user1").child("ref").child("fruit").child("f4").setValue(f4);
            }
        });

        ImageButton ichigo2 = findViewById(R.id.ichigo2);
        ichigo2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                //System.out.println(f1);
                f5 += 1;
                reference.child("user").child("user1").child("ref").child("fruit").child("f5").setValue(f5);
            }
        });

        ImageButton ichigo1 = findViewById(R.id.ichigo1);
        ichigo1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                //System.out.println(f1);
                if(f5==0)
                {
                    f5 = 0;
                }
                else {
                    f5-=1;
                }
                reference.child("user").child("user1").child("ref").child("fruit").child("f5").setValue(f5);
            }
        });

        ImageButton pain2 = findViewById(R.id.pain2);
        pain2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                //System.out.println(f1);
                f6 += 1;
                reference.child("user").child("user1").child("ref").child("fruit").child("f6").setValue(f6);
            }
        });

        ImageButton pain1 = findViewById(R.id.pain1);
        pain1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                //System.out.println(f1);
                if(f6==0)
                {
                    f6 = 0;
                }
                else {
                    f6-=1;
                }
                reference.child("user").child("user1").child("ref").child("fruit").child("f6").setValue(f6);
            }
        });

        ImageButton kiui2 = findViewById(R.id.kiui2);
        kiui2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                //System.out.println(f1);
                f7 += 1;
                reference.child("user").child("user1").child("ref").child("fruit").child("f7").setValue(f7);
            }
        });

        ImageButton kiui1 = findViewById(R.id.kiui1);
        kiui1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                //System.out.println(f1);
                if(f7==0)
                {
                    f7 = 0;
                }
                else {
                    f7-=1;
                }
                reference.child("user").child("user1").child("ref").child("fruit").child("f7").setValue(f7);
            }
        });

        ImageButton suika2 = findViewById(R.id.suika2);
        suika2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                //System.out.println(f1);
                f8 += 1;
                reference.child("user").child("user1").child("ref").child("fruit").child("f8").setValue(f8);
            }
        });

        ImageButton suika1 = findViewById(R.id.suika1);
        suika1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                //System.out.println(f1);
                if(f8==0)
                {
                    f8 = 0;
                }
                else {
                    f8-=1;
                }
                reference.child("user").child("user1").child("ref").child("fruit").child("f8").setValue(f8);
            }
        });

        ImageButton gurefuru2 = findViewById(R.id.gurefuru2);
        gurefuru2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                //System.out.println(f1);
                f9 += 1;
                reference.child("user").child("user1").child("ref").child("fruit").child("f9").setValue(f9);
            }
        });

        ImageButton gurefuru1 = findViewById(R.id.gurefuru1);
        gurefuru1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                //System.out.println(f1);
                if(f9==0)
                {
                    f9 = 0;
                }
                else {
                    f9-=1;
                }
                reference.child("user").child("user1").child("ref").child("fruit").child("f9").setValue(f9);
            }
        });





    }




    ValueEventListener listener = new ValueEventListener() {
        //onDataChangeに受け取ったデータを代入
        public void onDataChange(DataSnapshot snapshot) {
            System.out.println("データを受信しました。"
                    + snapshot.getKey() + "=" + snapshot.getValue());
            Long value = (Long)snapshot.getValue();

            TextView ringo = findViewById(R.id.ringo);
            TextView banana = findViewById(R.id.banana);
            TextView budou = findViewById(R.id.budou);
            TextView remon = findViewById(R.id.remon);
            TextView ichigo = findViewById(R.id.ichigo);
            TextView pain = findViewById(R.id.pain);
            TextView kiui = findViewById(R.id.kiui);
            TextView suika = findViewById(R.id.suika);
            TextView gurefuru = findViewById(R.id.gurefuru);

            //データベースに変更が発生したとき、データを更新
            if(snapshot.getKey().equals("f1")){
                Long sum = value;
                f1 = sum;
                ringo.setText(Long.toString(value));

            }

            if(snapshot.getKey().equals("f2")){
                Long sum = value;
                f2 = sum;
                banana.setText(Long.toString(value));
            }

            if(snapshot.getKey().equals("f3")){
                Long sum = value;
                f3 = sum;
                budou.setText(Long.toString(value));
            }

            if(snapshot.getKey().equals("f4")){
                Long sum = value;
                f4 = sum;
                remon.setText(Long.toString(value));
            }

            if(snapshot.getKey().equals("f5")){
                Long sum = value;
                f5 = sum;
                ichigo.setText(Long.toString(value));
            }

            if(snapshot.getKey().equals("f6")){
                Long sum = value;
                f6 = sum;
                pain.setText(Long.toString(value));
            }

            if(snapshot.getKey().equals("f7")){
                Long sum = value;
                f7 = sum;
                kiui.setText(Long.toString(value));
            }

            if(snapshot.getKey().equals("f8")){
                Long sum = value;
                f8 = sum;
                suika.setText(Long.toString(value));
            }

            if(snapshot.getKey().equals("f9")){
                Long sum = value;
                f9 = sum;
                gurefuru.setText(Long.toString(value));
            }




        }

        public void onCancelled(DatabaseError error) {
            System.out.println("データ受信がキャンセルされました。" + error.toString());
        }
    };



    }
