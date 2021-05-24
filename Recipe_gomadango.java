package com.sample.racook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Recipe_gomadango extends AppCompatActivity {

    long count = 0;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        DatabaseReference reference = FirebaseDatabase.getInstance().getReference();
        for (int i = 1; i < 11; i++) {
            reference.child("レシピ").child("ごま団子").child("材料" + i).addValueEventListener(listener);
        }

        DatabaseReference reference1 = FirebaseDatabase.getInstance().getReference();

        reference.child("レシピ").child("ごま団子").child("name").addValueEventListener(listener);

        DatabaseReference reference2 = FirebaseDatabase.getInstance().getReference();
        for (int i = 1; i < 10; i++) {
            reference.child("レシピ").child("ごま団子").child("作り方" + i).addValueEventListener(listener);

            DatabaseReference menu = FirebaseDatabase.getInstance().getReference();
            Button cooked = findViewById(R.id.cooked); //ボタンID
            menu.child("レシピ").child("ごま団子").child("used").addValueEventListener(menulistener);
            cooked.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v)
                {
                    count += 1;
                    menu.child("レシピ").child("ごま団子").child("used").setValue(count);

                    Intent intent = new Intent(Recipe_gomadango.this,Popup_questionnaire.class);
                    startActivity(intent);
                }
            });
        }

        //クリックされたレシピに対応する画像を表示
        Intent intent = getIntent();
        int viewData = intent.getIntExtra("POSITION", 0);
        int foodImage = intent.getIntExtra("FOOD_IMAGE", 0);

        if (viewData == 1) {
            ImageView cuisine = findViewById(R.id.imageView);
            cuisine.setImageResource(foodImage);
        } else if (viewData == 2) {
            ImageView cuisine = findViewById(R.id.imageView);
            cuisine.setImageResource(foodImage);
        } else if (viewData == 3) {
            ImageView cuisine = findViewById(R.id.imageView);
            cuisine.setImageResource(foodImage);
        } else if (viewData == 4) {
            ImageView cuisine = findViewById(R.id.imageView);
            cuisine.setImageResource(foodImage);
        } else if (viewData == 5) {
            ImageView cuisine = findViewById(R.id.imageView);
            cuisine.setImageResource(foodImage);
        } else if (viewData == 6) {
            ImageView cuisine = findViewById(R.id.imageView);
            cuisine.setImageResource(foodImage);

        }
    }
    ValueEventListener listener = new ValueEventListener() {
        //onDataChangeに受け取ったデータを代入
        public void onDataChange(DataSnapshot snapshot) {
            System.out.println("データを受信しました。"
                    + snapshot.getKey() + "=" + snapshot.getValue());
            String value = (String) snapshot.getValue();

            if(snapshot.getKey().equals("材料1")){
                TextView textView = (TextView) findViewById(R.id.textView2);
                textView.setText(value);
            }

            if(snapshot.getKey().equals("材料2")){
                TextView textView = (TextView) findViewById(R.id.textView3);
                textView.setText(value);
            }

            if(snapshot.getKey().equals("材料3")){
                TextView textView = (TextView) findViewById(R.id.textView4);
                textView.setText(value);
            }

            if(snapshot.getKey().equals("材料4")){
                TextView textView = (TextView) findViewById(R.id.textView5);
                textView.setText(value);
            }

            if(snapshot.getKey().equals("材料5")){
                TextView textView = (TextView) findViewById(R.id.textView6);
                textView.setText(value);
            }

            if(snapshot.getKey().equals("材料6")){
                TextView textView = (TextView) findViewById(R.id.textView7);
                textView.setText(value);
            }

            if(snapshot.getKey().equals("材料7")){
                TextView textView = (TextView) findViewById(R.id.textView8);
                textView.setText(value);
            }

            if(snapshot.getKey().equals("材料8")){
                TextView textView = (TextView) findViewById(R.id.textView9);
                textView.setText(value);
            }

            if(snapshot.getKey().equals("材料9")){
                TextView textView = (TextView) findViewById(R.id.textView10);
                textView.setText(value);
            }

            if(snapshot.getKey().equals("材料10")){
                TextView textView = (TextView) findViewById(R.id.textView11);
                textView.setText(value);
            }

            if(snapshot.getKey().equals("name")){
                TextView textView = (TextView) findViewById(R.id.textView0);
                textView.setText(value);
            }

            if(snapshot.getKey().equals("作り方1")){
                TextView textView = (TextView) findViewById(R.id.textView12);
                textView.setText(value);
            }

            if(snapshot.getKey().equals("作り方2")){
                TextView textView = (TextView) findViewById(R.id.textView13);
                textView.setText(value);
            }

            if(snapshot.getKey().equals("作り方3")){
                TextView textView = (TextView) findViewById(R.id.textView14);
                textView.setText(value);
            }

            if(snapshot.getKey().equals("作り方4")){
                TextView textView = (TextView) findViewById(R.id.textView15);
                textView.setText(value);
            }

            if(snapshot.getKey().equals("作り方5")){
                TextView textView = (TextView) findViewById(R.id.textView16);
                textView.setText(value);
            }


        }

        public void onCancelled(DatabaseError error) {
            System.out.println("データ受信がキャンセルされました。" + error.toString());
        }
    };

    ValueEventListener menulistener = new ValueEventListener()
    {
        public void onDataChange(DataSnapshot snapshot)
        {
            System.out.println("データを受信しました。"
                    + snapshot.getKey() + "=" + snapshot.getValue());
            Long value = (Long)snapshot.getValue();

            count = value;
        }

        public void onCancelled(DatabaseError error) {
            System.out.println("データ受信がキャンセルされました。" + error.toString());
        }
    };
}