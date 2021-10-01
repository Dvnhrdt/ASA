package com.example.asa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class KelasActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kelas2);
    }

    public void kelas(View view) {
        Intent intent = new Intent(KelasActivity2.this,PelajaranActivity2.class);
        startActivity(intent);
    }

    public void soalbi(View view) {
        Intent intent = new Intent(KelasActivity2.this,PelajaranActivity2.class);
        startActivity(intent);
    }
}