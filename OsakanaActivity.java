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

public class OsakanaActivity extends AppCompatActivity {
    long s1 = 0;
    long s2 = 0;
    long s3 = 0;
    long s4 = 0;
    long s5 = 0;
    long s6 = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sakana);

        DatabaseReference reference = FirebaseDatabase.getInstance().getReference();
        for (int i = 0; i < 10; i++) {
            reference.child("user").child("user1").child("ref").child("sakana").child("s"+i).addValueEventListener(listener);
        }








        ImageButton skb2 =findViewById(R.id.skb2);
        ImageButton skb1 =findViewById(R.id.skb1);

        ImageButton tb2 =findViewById(R.id.tb2);
        ImageButton tb1 =findViewById(R.id.tb1);

        ImageButton sm2 =findViewById(R.id.smb2);
        ImageButton sm1 =findViewById(R.id.smb1);

        ImageButton mg2 =findViewById(R.id.mgb2);
        ImageButton mg1 =findViewById(R.id.mgb1);

        ImageButton sbb2 =findViewById(R.id.sbb2);
        ImageButton sbb1 =findViewById(R.id.sbb1);

        ImageButton snmb2 =findViewById(R.id.snmb2);
        ImageButton snmb1 =findViewById(R.id.snmb1);

        final Button button1 = findViewById(R.id.button5);
//ボタンが押されたときの動作
        button1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(OsakanaActivity.this,mypage.class);
                startActivity(intent);
            }


        });


        skb2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                //System.out.println(f1);
                s1 += 1;
                reference.child("user").child("user1").child("ref").child("sakana").child("s1").setValue(s1);
            }
        });


        skb1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                //System.out.println(f1);
                if(s1==0)
                {
                    s1 = 0;
                }
                else {
                    s1-=1;
                }
                reference.child("user").child("user1").child("ref").child("sakana").child("s1").setValue(s1);
            }
        });

        tb2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                //System.out.println(f1);
                s2 += 1;
                reference.child("user").child("user1").child("ref").child("sakana").child("s2").setValue(s2);
            }
        });


        tb1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                //System.out.println(f1);
                if(s2==0)
                {
                    s2 = 0;
                }
                else {
                    s2-=1;
                }
                reference.child("user").child("user1").child("ref").child("sakana").child("s2").setValue(s2);
            }
        });

        sm2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                //System.out.println(f1);
                s3 += 1;
                reference.child("user").child("user1").child("ref").child("sakana").child("s3").setValue(s3);
            }
        });


        sm1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                //System.out.println(f1);
                if(s3==0)
                {
                    s3 = 0;
                }
                else {
                    s3-=1;
                }
                reference.child("user").child("user1").child("ref").child("sakana").child("s3").setValue(s3);
            }
        });

        mg2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                //System.out.println(f1);
                s4 += 1;
                reference.child("user").child("user1").child("ref").child("sakana").child("s4").setValue(s4);
            }
        });


        mg1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                //System.out.println(f1);
                if(s4==0)
                {
                    s4 = 0;
                }
                else {
                    s4-=1;
                }
                reference.child("user").child("user1").child("ref").child("sakana").child("s4").setValue(s4);
            }
        });

        sbb2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                //System.out.println(f1);
                s5 += 1;
                reference.child("user").child("user1").child("ref").child("sakana").child("s5").setValue(s5);
            }
        });


        sbb1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                //System.out.println(f1);
                if(s5==0)
                {
                    s5 = 0;
                }
                else {
                    s5-=1;
                }
                reference.child("user").child("user1").child("ref").child("sakana").child("s5").setValue(s5);
            }
        });

        snmb2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                //System.out.println(f1);
                s6 += 1;
                reference.child("user").child("user1").child("ref").child("sakana").child("s6").setValue(s6);
            }
        });


        snmb1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                //System.out.println(f1);
                if(s6==0)
                {
                    s6 = 0;
                }
                else {
                    s6-=1;
                }
                reference.child("user").child("user1").child("ref").child("sakana").child("s6").setValue(s6);
            }
        });


        final Button fpb = findViewById(R.id.fpb);


        fpb.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(OsakanaActivity.this, FruitActivity.class);
                startActivity(intent);
            }
        });

        final Button npb = findViewById(R.id.npb);


        npb.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(OsakanaActivity.this, OnikuActivity.class);
                startActivity(intent);
            }
        });

        final Button spb = findViewById(R.id.spb);


        spb.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(OsakanaActivity.this,OsakanaActivity.class);
                startActivity(intent);
            }
        });

        final Button ypb = findViewById(R.id.ypb);


        ypb.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(OsakanaActivity.this,YasaiActivity.class);
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

            TextView sake=findViewById(R.id.sake);
            TextView madai=findViewById(R.id.madai);
            TextView salmon=findViewById(R.id.salmon);
            TextView maguro=findViewById(R.id.maguro);
            TextView saba=findViewById(R.id.saba);
            TextView sanma=findViewById(R.id.sanma);



            //データベースに変更が発生したとき、データを更新
            if(snapshot.getKey().equals("s1")){
                Long sum = value;
                s1 = sum;
                sake.setText(Long.toString(value));

            }

            if(snapshot.getKey().equals("s2")){
                Long sum = value;
                s2 = sum;
                madai.setText(Long.toString(value));
            }

            if(snapshot.getKey().equals("s3")){
                Long sum = value;
                s3 = sum;
                salmon.setText(Long.toString(value));
            }

            if(snapshot.getKey().equals("s4")){
                Long sum = value;
                s4 = sum;
                maguro.setText(Long.toString(value));
            }

            if(snapshot.getKey().equals("s5")){
                Long sum = value;
                s5 = sum;
                saba.setText(Long.toString(value));
            }

            if(snapshot.getKey().equals("s6")){
                Long sum = value;
                s6 = sum;
                sanma.setText(Long.toString(value));
            }





        }

        public void onCancelled(DatabaseError error) {
            System.out.println("データ受信がキャンセルされました。" + error.toString());
        }
    };
}