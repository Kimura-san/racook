package com.sample.racook;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.sample.racook.MainActivity;

public class Japanese extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_japanese);

        final Button button11 = findViewById(R.id.category1);
        //ボタンが押されたときの動作
        button11.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(Japanese.this, Japanese.class);
                startActivity(intent);
            }
        });

        final Button button12 = findViewById(R.id.category2);
        //ボタンが押されたときの動作
        button12.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(Japanese.this, Western.class);
                startActivity(intent);
            }
        });

        final Button button13 = findViewById(R.id.category3);
        //ボタンが押されたときの動作
        button13.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(Japanese.this, Chinese.class);
                startActivity(intent);
            }
        });

        final Button button14 = findViewById(R.id.category4);
        //ボタンが押されたときの動作
        button14.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(Japanese.this, Dessert.class);
                startActivity(intent);
            }
        });

        //変数宣言

        //int iconId = getResources().getIdentifier("food", "drawable", getPackageName());

        final Button button1 = findViewById(R.id.toMain1);
        //ボタンが押されたときの動作
        button1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(Japanese.this, Main_mainActivity.class);
                startActivity(intent);
            }
        });


        final ImageButton recipe1 = findViewById(R.id.recipe1);
        recipe1.setImageResource(R.drawable.food_sigureni);
        //ボタンが押されたときの動作
        recipe1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(Japanese.this,test.class);
                int viewData = 1; //レシピ画面において表示する画像の番号
                intent.putExtra("POSITION", viewData);
                intent.putExtra("FOOD_IMAGE", R.drawable.food_sigureni);
                startActivity(intent);
            }
        });


        final ImageButton recipe2 = findViewById(R.id.recipe2);
        recipe2.setImageResource(R.drawable.food_nikuzyaga);
        //ボタンが押されたときの動作
        recipe2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(Japanese.this,recipe2.class);
                int viewData = 2; //レシピ画面において表示する画像の番号
                intent.putExtra("POSITION", viewData);
                intent.putExtra("FOOD_IMAGE", R.drawable.food_nikuzyaga);
                startActivity(intent);
            }
        });



        final ImageButton recipe3 = findViewById(R.id.recipe3);
        recipe3.setImageResource(R.drawable.food_agedasidofu);
        //ボタンが押されたときの動作
        recipe3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(Japanese.this,recipe3.class);
                int viewData = 3; //レシピ画面において表示する画像の番号
                intent.putExtra("POSITION", viewData);
                intent.putExtra("FOOD_IMAGE", R.drawable.food_agedasidofu);
                startActivity(intent);
            }
        });


        final ImageButton recipe4 = findViewById(R.id.recipe4);
        recipe4.setImageResource(R.drawable.food_yubadon);
        //ボタンが押されたときの動作
        recipe4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(Japanese.this,recipe_yubadon.class);
                int viewData = 4; //レシピ画面において表示する画像の番号
                intent.putExtra("POSITION", viewData);
                intent.putExtra("FOOD_IMAGE", R.drawable.food_yubadon);
                startActivity(intent);
            }
        });


        final ImageButton recipe5 = findViewById(R.id.recipe5);
        recipe5.setImageResource(R.drawable.food_karaage);
        //ボタンが押されたときの動作
        recipe5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(Japanese.this,recipe_karaage.class);
                int viewData = 5; //レシピ画面において表示する画像の番号
                intent.putExtra("POSITION", viewData);
                intent.putExtra("FOOD_IMAGE", R.drawable.food_karaage);
                startActivity(intent);
            }
        });


        final ImageButton recipe6 = findViewById(R.id.recipe6);
        recipe6.setImageResource(R.drawable.food_sabanomisoni);
        //ボタンが押されたときの動作
        recipe6.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(Japanese.this,Recipe_sabanomisoni.class);
                int viewData = 6; //レシピ画面において表示する画像の番号
                intent.putExtra("POSITION", viewData);
                intent.putExtra("FOOD_IMAGE", R.drawable.food_sabanomisoni);
                startActivity(intent);
            }
        });
    }
}