package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by john1 on 2017/9/14.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
