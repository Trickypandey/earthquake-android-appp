package com.example.earthquakereport;

public class Earthquake {
    private double mMagnitude;
    private String mLocation;
    private long mTimeInMilliseconds;
    private String mUrl;

    public Earthquake(double Magnitude, String Location, long TimeInMilliseconds, String Url){
        mMagnitude = Magnitude;
        mLocation = Location;
        mTimeInMilliseconds = TimeInMilliseconds;
        mUrl = Url;
    }

    public double getMagnitude() {

        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public String getUrl() {
        return mUrl;
    }
}
