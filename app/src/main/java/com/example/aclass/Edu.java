package com.example.aclass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Edu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zzlayout);


    }

    public void onclick_pdf(View view) {
        Intent intent = new Intent(this, pdf.class);

        startActivity(intent);
    }
}
