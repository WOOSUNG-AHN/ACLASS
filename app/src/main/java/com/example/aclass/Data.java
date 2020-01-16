package com.example.aclass;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;


import java.util.ArrayList;


public class Data extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        ListView listView=(ListView)findViewById(R.id.listview);
        ArrayList<Data_Dictionary> data=new ArrayList<>();

        Data_Dictionary lion=new Data_Dictionary(R.drawable.island, "무인도에서 살아남기", "지금 첫번째 탭, 첫번째 프래그먼트에서 작업하는 것이므로 첫번째 프래그먼트의 xml파일을 열어서 리사이클러뷰를 추가해 준다. 여기에 데이터들이 출력 될것이다. 이제 다시 첫번째 프래그먼트 java파일을 보자.\n" +
                "[출처] 안드로이드 스튜디오 : Fragment와 ViewPager를 이용한 안드로이드 탭(Tab) 메뉴 구현(2) - RecyclerView|작성자 코스모스");
        Data_Dictionary tiger=new Data_Dictionary(R.drawable.character, "나만의 캐릭터 만들기", "Fragment_one.java파일의 전체 코드이다. ArrayList에 준비한 데이터를 담아서 Recyclerview 어답터를 설정하고 연결한다. 결과를 확인해 보자.\n" +
                "[출처] 안드로이드 스튜디오 : Fragment와 ViewPager를 이용한 안드로이드 탭(Tab) 메뉴 구현(2) - RecyclerView|작성자 코스모스");
        Data_Dictionary dog=new Data_Dictionary(R.drawable.zoo, "동물원에는 어떤 동물이 있을까?", "먼저 아이템의 레이아웃 즉 각 데이터를 화면에 어떻게 보일지 xml파일을 만들어 준다. 프로필 사진과 그 아래 이름과 요약설명 그리고 이미지 버튼을 만들어서 클릭시 구글검색을 하도록 하자.\n" +
                "[출처] 안드로이드 스튜디오 : Fragment와 ViewPager를 이용한 안드로이드 탭(Tab) 메뉴 구현(2) - RecyclerView|작성자 코스모스");
        Data_Dictionary cat=new Data_Dictionary(R.drawable.present, "친구에게 줄 선물 만들기", "이제 items에는 3개의 item 데이터 객체가 들어가 있다. 나중에 이 데이터는 DB에서 가져오든 수동으로 입력해 주는 방식으로 변경 하도록 하자. 이 코드는 첫번째 fragment 에 넣어 주면 된다. \n" +
                "이제 RecyclerView Adapter를 만들어 줄 차례이다.[출처] 안드로이드 스튜디오 : Fragment와 ViewPager를 이용한 안드로이드 탭(Tab) 메뉴 구현(2) - RecyclerView|작성자 코스모스");
        data.add(lion);
        data.add(tiger);
        data.add(dog);
        data.add(cat);
        Data_mailadapter adapter=new Data_mailadapter(this,R.layout.data_mail_item,data);
        listView.setAdapter(adapter);
    }
}