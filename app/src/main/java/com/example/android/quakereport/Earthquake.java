package com.example.android.quakereport;

/**
 * Created by Veronica on 12/7/2017.
 */

public class Earthquake {



    private String mLocation;
    private int mMag;
    private String mDate;

    public Earthquake(String location, int mag, String date) {
        mLocation = location;
        mDate = date;
        mMag = mag;
    }

    public String getmLocation() {
        return mLocation;
    }

    public int getmMag() {
        return mMag;
    }

    public String getmDate() {
        return mDate;
    }


}
