package com.example.asa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MtkActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mtk2);
    }

    public void benar(View view) {
        Intent intent = new Intent(MtkActivity2.this, BenarActivity2.class);
        startActivity(intent);
    }

    public void salah(View view) {
        Intent intent = new Intent(MtkActivity2.this,SalahActivity2.class);
        startActivity(intent);
    }
}