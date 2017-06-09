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
 * 天気情報を、listにするクラス
 * @author r-takahashi
 */
public class WL {
    public WL(List<Weather> list){
        // Mapをつくる（htmlで表示するとき、位置を固定するMap）
        map = new LinkedHashMap<String, List<String>>();     
        List<ColorChange> icon = new ArrayList<ColorChange>();
        List<ColorChange> main = new ArrayList<ColorChange>();
        List<ColorChange> temp = new ArrayList<ColorChange>();
        List<ColorChange> windSpeed = new ArrayList<ColorChange>();
        List<ColorChange> cloudAll = new ArrayList<ColorChange>();
        List<ColorChange> pressure = new ArrayList<ColorChange>();
        List<ColorChange> humidity = new ArrayList<ColorChange>();  
        List<ColorChange> DI = new ArrayList<ColorChange>();        
        
        // リストから、値を取り出し、各変数に値をいれる
        for( Weather l : list){
            icon.add(new ColorIcon(l.icon));
            main.add(new ColorMain(l.main));
            temp.add(new ColorTemp(Math.round(l.temp)));
            windSpeed.add(new ColorWindSpeed(l.windSpeed + "m/s"));
            cloudAll.add(new ColorCloudAll(l.cloudAll + "%"));
            pressure.add(new ColorPressure(l.pressure));
            humidity.add(new ColorHumidity(l.humidity + "%"));
            
            // 型を変換する
            int temp2 = Integer.parseInt(temp);
            int humidity2 = Integer.parseInt(humidity);
            
            // 計算する
            DI = 0.81 * temp2 + 0.01 + 
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
