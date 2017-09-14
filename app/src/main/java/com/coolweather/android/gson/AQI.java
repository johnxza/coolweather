package com.coolweather.android.gson;

/**
 * Created by john1 on 2017/9/14.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
