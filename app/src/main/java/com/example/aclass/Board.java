package com.example.aclass;


import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;


public class Board extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_board);
        ListView listView=(ListView)findViewById(R.id.listview);
        ArrayList<Board_Dictionary> data=new ArrayList<>();
        Board_Dictionary lion=new Board_Dictionary("A", "쓰리디마인 2주차 교재 질문", "홍길동", "2주차 모델링 수업 중 질문 드립니다....", "09:23" ,R.drawable.rounded_drawable);
        Board_Dictionary tiger=new Board_Dictionary("T", "20.01.13 공지사항", "운영자", "새로운 학기 시작으로 ....", "11:01",R.drawable.rounded_drawable1);
        Board_Dictionary dog=new Board_Dictionary("H", "선생님 질문입니다", "학생4", "너무 재미있습니다 화이팅!! 그리고...." , "14:47", R.drawable.rounded_drawable2);
        Board_Dictionary cat=new Board_Dictionary("K", "문의드립니다", "천성배", "교육과정이 어떻게 되는지...." , "18:55", R.drawable.rounded_drawable3);
        data.add(lion);
        data.add(tiger);
        data.add(dog);
        data.add(cat);
        Board_mailadapter adapter=new Board_mailadapter(this,R.layout.board_mail_item,data);
        listView.setAdapter(adapter);
    }
}