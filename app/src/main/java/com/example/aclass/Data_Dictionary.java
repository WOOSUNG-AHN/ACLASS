package com.example.aclass;

public class Data_Dictionary {

    int icon;
    String mSender;
    String mTitle;


    public Data_Dictionary(int icon, String mSender, String mTitle) {
        this.icon = icon;
        this.mSender = mSender;
        this.mTitle = mTitle;
    }



    public int getIcon(){
        return icon;
    }
    public void setIcon(int icon){
        this.icon = icon;
    }


    public String getmSender(){
        return mSender;
    }
    public void setmSender(String mSender){
        this.mSender = mSender;
    }


    public String getmTitle(){
        return mTitle;
    }
    public void setmTitle(String mTitle){
        this.mTitle = mTitle;
    }



}