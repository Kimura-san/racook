package com.sample.racook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

        import com.google.firebase.database.DataSnapshot;
        import com.google.firebase.database.DatabaseError;
        import com.google.firebase.database.DatabaseReference;
        import com.google.firebase.database.FirebaseDatabase;
        import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        final Button button1 = findViewById(R.id.button);
//ボタンが押されたときの動作
        button1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this,Main_mainActivity.class);
                startActivity(intent);
            }
        });

    }

    ValueEventListener listener = new ValueEventListener() {
        //onDataChangeに受け取ったデータを代入
        public void onDataChange(DataSnapshot snapshot) {
            System.out.println("データを受信しました。"
                    + snapshot.getKey() + "=" + snapshot.getValue());
            String value = (String) snapshot.getValue();
            TextView textView = findViewById(R.id.textViewMessage);
            textView.setText(value);
        }

        public void onCancelled(DatabaseError error) {
            System.out.println("データ受信がキャンセルされました。" + error.toString());
        }
    };
}