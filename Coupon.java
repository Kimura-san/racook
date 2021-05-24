package com.sample.racook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Coupon extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coupon);

        //データを受信
        //　ユーザーの好みを取得
        DatabaseReference favorite = FirebaseDatabase.getInstance().getReference();
        favorite.child("user").child("user1").child("プロフィール").child("favorite").addValueEventListener(userListener);



        final ImageButton barcode = findViewById(R.id.barcode);
        barcode.setImageResource(R.drawable.sample_barcode);
        //ボタンが押されたときの動作
        barcode.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(Coupon.this,Main_mainActivity.class);
                int use = 1; //レシピ画面において表示する画像の番号
                intent.putExtra("USE", use);
                //intent.putExtra("FOOD_IMAGE", R.drawable.food_nabe);
                startActivity(intent);
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

            String konomi = (String)snapshot.getValue();

            //ユーザーの好みに該当するジャンルのクーポンを探す
            DatabaseReference reference = FirebaseDatabase.getInstance().getReference();
            reference.child("coupon").child(konomi).child("a").addValueEventListener(listener);
        }

        public void onCancelled(DatabaseError error)
        {
            System.out.println("データ受信がキャンセルされました。" + error.toString());
        }
    };


    ValueEventListener listener = new ValueEventListener()
    {

        //onDataChangeに受け取ったデータを代入
        public void onDataChange(DataSnapshot snapshot)
        {
            System.out.println("データを受信しました。"
                    + snapshot.getKey()+"="+snapshot.getValue());

            String discTarget = (String)snapshot.getValue();
            TextView discountRatio = findViewById(R.id.discountTarget);
            discountRatio.setText(discTarget);
        }

        public void onCancelled(DatabaseError error)
        {
            System.out.println("データ受信がキャンセルされました。" + error.toString());
        }
    };


}