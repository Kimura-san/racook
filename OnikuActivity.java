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

public class OnikuActivity extends AppCompatActivity {
    long n1 = 0;
    long n2 = 0;
    long n3 = 0;
    long n4 = 0;
    long n5 = 0;
    long n6 = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oniku);

        DatabaseReference reference = FirebaseDatabase.getInstance().getReference();
        for (int i = 0; i < 10; i++) {
            reference.child("user").child("user1").child("ref").child("niku").child("n"+i).addValueEventListener(listener);
        }

        ImageButton bbb2 =findViewById(R.id.bbb2);
        bbb2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                //System.out.println(f1);
                n1 += 1;
                reference.child("user").child("user1").child("ref").child("niku").child("n1").setValue(n1);
            }
        });

        ImageButton bbb1 = findViewById(R.id.bbb1);
        bbb1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                //System.out.println(f1);
                if(n1==0)
                {
                    n1 = 0;
                }
                else {
                    n1-=1;
                }
                reference.child("user").child("user1").child("ref").child("niku").child("n1").setValue(n1);
            }
        });

        ImageButton brb2 =findViewById(R.id.brb2);
        brb2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                //System.out.println(f1);
                n2 += 1;
                reference.child("user").child("user1").child("ref").child("niku").child("n2").setValue(n2);
            }
        });

        ImageButton brb1 = findViewById(R.id.brb1);
        brb1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                //System.out.println(f1);
                if(n2==0)
                {
                    n2 = 0;
                }
                else {
                    n2-=1;
                }
                reference.child("user").child("user1").child("ref").child("niku").child("n2").setValue(n2);
            }
        });

        ImageButton ghb2 =findViewById(R.id.ghb2);
        ghb2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                //System.out.println(f1);
                n3 += 1;
                reference.child("user").child("user1").child("ref").child("niku").child("n3").setValue(n3);
            }
        });

        ImageButton ghb1 = findViewById(R.id.ghb1);
        ghb1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                //System.out.println(f1);
                if(n3==0)
                {
                    n3 = 0;
                }
                else {
                    n3-=1;
                }
                reference.child("user").child("user1").child("ref").child("niku").child("n3").setValue(n3);
            }
        });

        ImageButton gbb2 =findViewById(R.id.gbb2);
        gbb2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                //System.out.println(f1);
                n4 += 1;
                reference.child("user").child("user1").child("ref").child("niku").child("n4").setValue(n4);
            }
        });

        ImageButton gbb1 = findViewById(R.id.gbb1);
        gbb1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                //System.out.println(f1);
                if(n4==0)
                {
                    n4 = 0;
                }
                else {
                    n4-=1;
                }
                reference.child("user").child("user1").child("ref").child("niku").child("n4").setValue(n4);
            }
        });

        ImageButton tmb2 =findViewById(R.id.tmb2);
        tmb2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                //System.out.println(f1);
                n5 += 1;
                reference.child("user").child("user1").child("ref").child("niku").child("n5").setValue(n5);
            }
        });

        ImageButton tmb1 = findViewById(R.id.tmb1);
        tmb1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                //System.out.println(f1);
                if(n5==0)
                {
                    n5 = 0;
                }
                else {
                    n5-=1;
                }
                reference.child("user").child("user1").child("ref").child("niku").child("n5").setValue(n5);
            }
        });

        ImageButton tmub2 =findViewById(R.id.tmub2);
        tmub2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                //System.out.println(f1);
                n6 += 1;
                reference.child("user").child("user1").child("ref").child("niku").child("n6").setValue(n6);
            }
        });

        ImageButton tmub1 = findViewById(R.id.tmub1);
        tmub1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                //System.out.println(f1);
                if(n6==0)
                {
                    n6 = 0;
                }
                else {
                    n6-=1;
                }
                reference.child("user").child("user1").child("ref").child("niku").child("n6").setValue(n6);
            }
        });



        final Button button1 = findViewById(R.id.button5);
//ボタンが押されたときの動作
        button1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(OnikuActivity.this,mypage.class);
                startActivity(intent);
            }


        });





        final Button fpb = findViewById(R.id.fpb);


        fpb.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(OnikuActivity.this, FruitActivity.class);
                startActivity(intent);
            }
        });

        final Button npb = findViewById(R.id.npb);


        npb.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(OnikuActivity.this,OnikuActivity.class);
                startActivity(intent);
            }
        });

        final Button spb = findViewById(R.id.spb);


        spb.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(OnikuActivity.this,OsakanaActivity.class);
                startActivity(intent);
            }
        });

        final Button ypb = findViewById(R.id.ypb);


        ypb.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(OnikuActivity.this,YasaiActivity.class);
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

            TextView butabara = findViewById(R.id.butabara);
            TextView butaro = findViewById(R.id.butaro);
            TextView gyuhiki = findViewById(R.id.gyuhiki);
            TextView gyubara = findViewById(R.id.gyubara);
            TextView torimomo = findViewById(R.id.torimomo);
            TextView torimune = findViewById(R.id.torimune);

            //データベースに変更が発生したとき、データを更新
            if(snapshot.getKey().equals("n1")){
                Long sum = value;
                n1 = sum;
                butabara.setText(Long.toString(value));

            }

            if(snapshot.getKey().equals("n2")){
                Long sum = value;
                n2 = sum;
                butaro.setText(Long.toString(value));
            }

            if(snapshot.getKey().equals("n3")){
                Long sum = value;
                n3 = sum;
                gyuhiki.setText(Long.toString(value));
            }

            if(snapshot.getKey().equals("n4")){
                Long sum = value;
                n4 = sum;
                gyubara.setText(Long.toString(value));
            }

            if(snapshot.getKey().equals("n5")){
                Long sum = value;
                n5 = sum;
                torimomo.setText(Long.toString(value));
            }

            if(snapshot.getKey().equals("n6")){
                Long sum = value;
                n6 = sum;
                torimune.setText(Long.toString(value));
            }





        }

        public void onCancelled(DatabaseError error) {
            System.out.println("データ受信がキャンセルされました。" + error.toString());
        }
    };

}