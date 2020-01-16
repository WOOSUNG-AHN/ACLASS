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


public class Data_mailadapter extends BaseAdapter {
    private LayoutInflater inflater;
    private ArrayList<Data_Dictionary> data;
    private int layout;
    public Data_mailadapter(Context context, int layout, ArrayList<Data_Dictionary> data){
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
        Data_Dictionary listviewitem=data.get(position);



        TextView tvemailname=(TextView)convertView.findViewById(R.id.tv_name);
        tvemailname.setText(listviewitem.getmSender());


        TextView tvemailtitle=(TextView)convertView.findViewById(R.id.tv_summary);
        tvemailtitle.setText(listviewitem.getmTitle());


        ImageView icon=(ImageView)convertView.findViewById(R.id.imageView);
        icon.setImageResource(listviewitem.getIcon());


        return convertView;
    }
}