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

public class Western extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_western);

        final Button button11 = findViewById(R.id.category1);
        //ボタンが押されたときの動作
        button11.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(Western.this, Japanese.class);
                startActivity(intent);
            }
        });

        final Button button12 = findViewById(R.id.category2);
        //ボタンが押されたときの動作
        button12.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(Western.this, Western.class);
                startActivity(intent);
            }
        });

        final Button button13 = findViewById(R.id.category3);
        //ボタンが押されたときの動作
        button13.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(Western.this, Chinese.class);
                startActivity(intent);
            }
        });

        final Button button14 = findViewById(R.id.category4);
        //ボタンが押されたときの動作
        button14.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(Western.this, Dessert.class);
                startActivity(intent);
            }
        });

        //変数宣言

        //int iconId = getResources().getIdentifier("food", "drawable", getPackageName());

        final Button button1 = findViewById(R.id.toMain1);
        //ボタンが押されたときの動作
        button1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(Western.this, Main_mainActivity.class);
                startActivity(intent);
            }
        });


        final ImageButton recipe1 = findViewById(R.id.recipe1);
        recipe1.setImageResource(R.drawable.food_omrice);
        //ボタンが押されたときの動作
        recipe1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(Western.this,Recipe_omrice.class);
                int viewData = 1; //レシピ画面において表示する画像の番号
                intent.putExtra("POSITION", viewData);
                intent.putExtra("FOOD_IMAGE", R.drawable.food_omrice);
                startActivity(intent);
            }
        });


        final ImageButton recipe2 = findViewById(R.id.recipe2);
        recipe2.setImageResource(R.drawable.food_curry);
        //ボタンが押されたときの動作
        recipe2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(Western.this,Recipe_curry.class);
                int viewData = 2; //レシピ画面において表示する画像の番号
                intent.putExtra("POSITION", viewData);
                intent.putExtra("FOOD_IMAGE", R.drawable.food_curry);
                startActivity(intent);
            }
        });



        final ImageButton recipe3 = findViewById(R.id.recipe3);
        recipe3.setImageResource(R.drawable.food_hamburg);
        //ボタンが押されたときの動作
        recipe3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(Western.this,Recipe_hamburg.class);
                int viewData = 3; //レシピ画面において表示する画像の番号
                intent.putExtra("POSITION", viewData);
                intent.putExtra("FOOD_IMAGE", R.drawable.food_hamburg);
                startActivity(intent);
            }
        });


        final ImageButton recipe4 = findViewById(R.id.recipe4);
        recipe4.setImageResource(R.drawable.food_korokke);
        //ボタンが押されたときの動作
        recipe4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(Western.this,Recipe_korokke.class);
                int viewData = 4; //レシピ画面において表示する画像の番号
                intent.putExtra("POSITION", viewData);
                intent.putExtra("FOOD_IMAGE", R.drawable.food_korokke);
                startActivity(intent);
            }
        });


        final ImageButton recipe5 = findViewById(R.id.recipe5);
        recipe5.setImageResource(R.drawable.food_pizzatoast);
        //ボタンが押されたときの動作
        recipe5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(Western.this,Recipe_pizzatoast.class);
                int viewData = 5; //レシピ画面において表示する画像の番号
                intent.putExtra("POSITION", viewData);
                intent.putExtra("FOOD_IMAGE", R.drawable.food_pizzatoast);
                startActivity(intent);
            }
        });


        final ImageButton recipe6 = findViewById(R.id.recipe6);
        recipe6.setImageResource(R.drawable.food_sabapotetosarada);
        //ボタンが押されたときの動作
        recipe6.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(Western.this,Recipe_sabapotetosarada.class);
                int viewData = 6; //レシピ画面において表示する画像の番号
                intent.putExtra("POSITION", viewData);
                intent.putExtra("FOOD_IMAGE", R.drawable.food_sabapotetosarada);
                startActivity(intent);
            }
        });
    }
}