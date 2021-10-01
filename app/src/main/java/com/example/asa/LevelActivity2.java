package com.example.asa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LevelActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level2);
    }

    public void soal(View view) {
        Intent intent = new Intent(LevelActivity2.this ,MtkActivity2.class);

        startActivity(intent);
    }


}