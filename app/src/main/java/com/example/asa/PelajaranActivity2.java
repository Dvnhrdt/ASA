package com.example.asa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PelajaranActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pelajaran2);
    }

    public void LEVEL(View view) {
        Intent intent =new Intent(PelajaranActivity2.this,LevelActivity2.class);
        startActivity(intent);
    }

    public void kembali(View view) {
        Intent intent = new Intent(PelajaranActivity2.this,KelasActivity2.class);
        startActivity(intent);
    }

    public void kesoal(View view) {
        Intent intent = new Intent(PelajaranActivity2.this,LevelActivity2.class);
        startActivity(intent);
    }
}