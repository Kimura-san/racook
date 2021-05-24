package com.sample.supermarket;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Questionnaire_view extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questionnaire_view);

        DatabaseReference reference = FirebaseDatabase.getInstance().getReference();
        reference.child("アンケート").addValueEventListener(listener);

    }
    ValueEventListener listener = new ValueEventListener() {
        public  void onDataChange(DataSnapshot dataSnapshot) {

            System.out.println("データを受信しました。"
                    + dataSnapshot.getKey() + "=" + dataSnapshot.getValue());

            String anketo = "";



                for (DataSnapshot data : dataSnapshot.getChildren())
                {
                    Log.d("",data.getValue().toString());
                String value = (String) data.getValue();

                    Log.d("",data.getKey().toString());
                    String key = (String) data.getKey();

                anketo = anketo + key+"\r\n" + value +"\r\n"+"\r\n";

                }

            TextView textView = (TextView) findViewById(R.id.textView2);
            textView.setText(anketo);

        }

        @Override
        public void onCancelled(DatabaseError error) {
            // データの取得に失敗
        }
    };
}