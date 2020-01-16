package com.example.aclass;

import android.graphics.drawable.Drawable;

public class Board_Dictionary {
    String mSender;
    String mTitle;
    String mDetails;
    String mTime;

    String mAlp;


    int icon;

    public Board_Dictionary(String mAlp, String mSender, String mTitle, String mDetails, String mTime, int icon) {
        this.mAlp = mAlp;
        this.mSender = mSender;
        this.mTitle = mTitle;
        this.mDetails = mDetails;
        this.mTime = mTime;

        this.icon = icon;
    }


    public String getmSender(){
        return mSender;
    }
    public void setmSender(String mSender){
        this.mSender = mSender;
    }


    public String getAlp(){
        return mAlp;
    }
    public void setAlp(String mTitle){
        this.mAlp = mAlp;
    }



    public String getmTitle(){
        return mTitle;
    }
    public void setmTitle(String mTitle){
        this.mTitle = mTitle;
    }



    public String getmDetails(){
        return mDetails;
    }
    public void setmDetails(String mDetails){
        this.mDetails = mDetails;
    }



    public String getmTime(){
        return mTime;
    }
    public void setmTime(String mTime){
        this.mTime = mTime;
    }

    public int getIcon(){
        return icon;
    }
    public void setIcon(int icon){
        this.icon = icon;
    }


}