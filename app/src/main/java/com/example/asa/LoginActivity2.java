package com.example.asa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
    }

    public void pindah(View view) {
        Intent intent =new Intent(LoginActivity2.this,KelasActivity2.class);
        startActivity(intent);
    }

    public void daftar(View view) {
        Intent intent = new Intent(LoginActivity2.this,RegisterActivity2.class);
        startActivity(intent);
    }
}