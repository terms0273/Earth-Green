/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import models.Weather;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * 天気情報を、listにする
 * @author r-takahashi
 */
public class WL {
    public WL(List<Weather> list){
        // Mapをつくる（htmlで表示するとき、位置を固定するMap）
        map = new LinkedHashMap<String, List<String>>();        
        List<String> icon = new ArrayList<String>();
        List<String> main = new ArrayList<String>();
        List<String> temp = new ArrayList<String>();
        List<String> windSpeed = new ArrayList<String>();
        List<String> cloudAll = new ArrayList<String>();
        List<String> pressure = new ArrayList<String>();
        List<String> humidity = new ArrayList<String>();       
        
        // リストから、値を取り出し、各変数に値をいれる
        for( Weather l : list){
            icon.add("http://openweathermap.org/img/w/"+ l.icon +".png");
            main.add(l.main);
            temp.add(Math.round(l.temp) + "℃");
            windSpeed.add(l.windSpeed + "m/s");
            cloudAll.add(l.cloudAll + "%");
            pressure.add(l.pressure + "hPa");
            humidity.add(l.humidity + "%");
        }
        
        // keyとvalueを関連付ける
        map.put("ICON", icon);
        map.put("WEATHER", main);
        map.put("TEMPERETURE", temp);
        map.put("AIR FROW", windSpeed);
        map.put("CLOUD COVER", cloudAll);
        map.put("PRESSURE", pressure);
        map.put("HUMIDITY", humidity);
    }
    // Mapを宣言する
    public Map<String,List<String>> map ;    
}
