package com.sample.racook;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class YasaiActivity extends AppCompatActivity {
    long y1 = 0;
    long y2 = 0;
    long y3 = 0;
    long y4 = 0;
    long y5 = 0;
    long y6 = 0;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yasai);

        DatabaseReference reference = FirebaseDatabase.getInstance().getReference();
        for (int i = 0; i < 10; i++) {
            reference.child("user").child("user1").child("ref").child("yasai").child("y"+i).addValueEventListener(listener);
        }

        ImageButton rt2 =findViewById(R.id.rt2);
        ImageButton rt1 =findViewById(R.id.rt1);

        ImageButton nj2 =findViewById(R.id.nj2);
        ImageButton nj1 =findViewById(R.id.nj1);

        ImageButton my2 =findViewById(R.id.my2);
        ImageButton my1 =findViewById(R.id.my1);

        ImageButton jg2 =findViewById(R.id.jg2);
        ImageButton jg1 =findViewById(R.id.jg1);

        ImageButton bk2 =findViewById(R.id.bk2);
        ImageButton bk1 =findViewById(R.id.bk1);

        ImageButton ns2 =findViewById(R.id.ns2);
        ImageButton ns1 =findViewById(R.id.ns1);


        rt2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                //System.out.println(f1);
                y1 += 1;
                reference.child("user").child("user1").child("ref").child("yasai").child("y1").setValue(y1);
            }
        });


        rt1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                //System.out.println(f1);
                if(y1==0)
                {
                    y1 = 0;
                }
                else {
                    y1-=1;
                }
                reference.child("user").child("user1").child("ref").child("yasai").child("y1").setValue(y1);
            }
        });


        nj2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                //System.out.println(f1);
                y2 += 1;
                reference.child("user").child("user1").child("ref").child("yasai").child("y2").setValue(y2);
            }
        });


        nj1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                //System.out.println(f1);
                if(y2==0)
                {
                    y2 = 0;
                }
                else {
                    y2-=1;
                }
                reference.child("user").child("user1").child("ref").child("yasai").child("y2").setValue(y2);
            }
        });


        my2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                //System.out.println(f1);
                y3 += 1;
                reference.child("user").child("user1").child("ref").child("yasai").child("y3").setValue(y3);
            }
        });


        my1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                //System.out.println(f1);
                if(y3==0)
                {
                    y3 = 0;
                }
                else {
                    y3-=1;
                }
                reference.child("user").child("user1").child("ref").child("yasai").child("y3").setValue(y3);
            }
        });


        jg2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                //System.out.println(f1);
                y4 += 1;
                reference.child("user").child("user1").child("ref").child("yasai").child("y4").setValue(y4);
            }
        });


        jg1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                //System.out.println(f1);
                if(y4==0)
                {
                    y4 = 0;
                }
                else {
                    y4-=1;
                }
                reference.child("user").child("user1").child("ref").child("yasai").child("y4").setValue(y4);
            }
        });


        bk2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                //System.out.println(f1);
                y5 += 1;
                reference.child("user").child("user1").child("ref").child("yasai").child("y5").setValue(y5);
            }
        });


        bk1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                //System.out.println(f1);
                if(y5==0)
                {
                    y5 = 0;
                }
                else {
                    y5-=1;
                }
                reference.child("user").child("user1").child("ref").child("yasai").child("y5").setValue(y5);
            }
        });

        ns2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                //System.out.println(f1);
                y6 += 1;
                reference.child("user").child("user1").child("ref").child("yasai").child("y6").setValue(y6);
            }
        });


        ns1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                //System.out.println(f1);
                if(y6==0)
                {
                    y6 = 0;
                }
                else {
                    y6-=1;
                }
                reference.child("user").child("user1").child("ref").child("yasai").child("y6").setValue(y6);
            }
        });






        final Button button1 = findViewById(R.id.button5);
//ボタンが押されたときの動作
        button1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(YasaiActivity.this,mypage.class);
                startActivity(intent);
            }


        });





        final Button fpb = findViewById(R.id.fpb);


        fpb.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(YasaiActivity.this, FruitActivity.class);
                startActivity(intent);
            }
        });

        final Button npb = findViewById(R.id.npb);


        npb.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(YasaiActivity.this, OnikuActivity.class);
                startActivity(intent);
            }
        });

        final Button spb = findViewById(R.id.spb);


        spb.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(YasaiActivity.this,OsakanaActivity.class);
                startActivity(intent);
            }
        });

        final Button ypb = findViewById(R.id.ypb);


        ypb.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(YasaiActivity.this,YasaiActivity.class);
                startActivity(intent);
            }
        });

    }
    ValueEventListener listener = new ValueEventListener() {
        //onDataChangeに受け取ったデータを代入
        public void onDataChange(DataSnapshot snapshot) {
            System.out.println("データを受信しました。"
                    + snapshot.getKey() + "=" + snapshot.getValue());
            Long value = (Long)snapshot.getValue();

            TextView retasu = findViewById(R.id.retasu);
            TextView ninjin = findViewById(R.id.ninjin);
            TextView moyashi = findViewById(R.id.moyashi);
            TextView jagaimo = findViewById(R.id.jagaimo);
            TextView burokko = findViewById(R.id.burokko);
            TextView nasu = findViewById(R.id.nasu);

            //データベースに変更が発生したとき、データを更新
            if(snapshot.getKey().equals("y1")){
                Long sum = value;
                y1 = sum;
                retasu.setText(Long.toString(value));

            }

            if(snapshot.getKey().equals("y2")){
                Long sum = value;
                y2 = sum;
                ninjin.setText(Long.toString(value));
            }

            if(snapshot.getKey().equals("y3")){
                Long sum = value;
                y3 = sum;
                moyashi.setText(Long.toString(value));
            }

            if(snapshot.getKey().equals("y4")){
                Long sum = value;
                y4 = sum;
                jagaimo.setText(Long.toString(value));
            }

            if(snapshot.getKey().equals("y5")){
                Long sum = value;
                y5 = sum;
                burokko.setText(Long.toString(value));
            }

            if(snapshot.getKey().equals("y6")){
                Long sum = value;
                y6 = sum;
                nasu.setText(Long.toString(value));
            }





        }

        public void onCancelled(DatabaseError error) {
            System.out.println("データ受信がキャンセルされました。" + error.toString());
        }
    };

}