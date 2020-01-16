package com.example.aclass;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class Board_mailadapter extends BaseAdapter {
    private LayoutInflater inflater;
    private ArrayList<Board_Dictionary> data;
    private int layout;
    public Board_mailadapter(Context context, int layout, ArrayList<Board_Dictionary> data){
        this.inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.data=data;
        this.layout=layout;
    }
    @Override
    public int getCount(){return data.size();}
    @Override
    public String getItem(int position){return data.get(position).getmSender();}
    @Override
    public long getItemId(int position){return position;}
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        if(convertView==null){
            convertView=inflater.inflate(layout,parent,false);
        }
        Board_Dictionary listviewitem=data.get(position);
        TextView tvlname=(TextView)convertView.findViewById(R.id.tvIcon);
        tvlname.setText(listviewitem.getAlp());

        TextView tvemailname=(TextView)convertView.findViewById(R.id.tvEmailSender);
        tvemailname.setText(listviewitem.getmSender());

        TextView tvemailtitle=(TextView)convertView.findViewById(R.id.tvEmailTitle);
        tvemailtitle.setText(listviewitem.getmTitle());

        TextView tvemaildetails=(TextView)convertView.findViewById(R.id.tvEmailDetails);
        tvemaildetails.setText(listviewitem.getmDetails());

        TextView tvemailtime=(TextView)convertView.findViewById(R.id.tvEmailTime);
        tvemailtime.setText(listviewitem.getmTime());

        ImageView icon=(ImageView)convertView.findViewById(R.id.tvcolor);
        icon.setImageResource(listviewitem.getIcon());


        return convertView;
    }
}