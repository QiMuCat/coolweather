package com.coolweather.android.db;

import org.litepal.crud.LitePalSupport;

public class County extends LitePalSupport {
    /*
    * id            记录县的ID
    * countyName    记录县的名字
    * weatherId     记录县所对应天气的ID
    * cityId        记录当前县所属的市的ID值
    * */
    private int id;
    private String countyName;
    private String weatherId;
    private int cityId;


}
