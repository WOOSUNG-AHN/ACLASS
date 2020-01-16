package com.example.aclass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Edu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edu);
    }

    public void onclick_pdf(View view) {
        Intent intent = new Intent(this, pdf.class);

        startActivity(intent);
    }
}
