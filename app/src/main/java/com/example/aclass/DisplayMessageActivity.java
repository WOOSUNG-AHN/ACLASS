package com.example.aclass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Main Home");

        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        TextView textView = findViewById(R.id.textView);
        textView.setText(message);
    }
    public void sendMe(View view) {
        Intent intent = new Intent(this, Home.class);

        startActivity(intent);
    }

    public void onClick_board(View view) {
        Intent intent = new Intent(this, Board.class);

        startActivity(intent);
    }

    public void onClick_edu(View view) {
        Intent intent = new Intent(this, Edu.class);

        startActivity(intent);
    }

    public void onClick_data(View view) {
        Intent intent = new Intent(this, Data.class);

        startActivity(intent);
    }

    public void onClick_cloud(View view) {
        Intent intent = new Intent(this, Cloud.class);

        startActivity(intent);
    }

    public void onClick_cad(View view) {
        Intent intent = new Intent(this, Cad.class);

        startActivity(intent);
    }

    public void onClick_mypage(View view) {
        Intent intent = new Intent(this, Mypage.class);

        startActivity(intent);
    }
}