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
 *
 * @author r-takahashi
 */
public class WL {
    public WL(List<Weather> list){
        map = new LinkedHashMap<String, List<String>>();        
        List<String> icon = new ArrayList<String>();
        List<String> main = new ArrayList<String>();
        List<String> temp = new ArrayList<String>();
        List<String> windSpeed = new ArrayList<String>();
        List<String> cloudAll = new ArrayList<String>();
        List<String> pressure = new ArrayList<String>();
        List<String> humidity = new ArrayList<String>();
        List<String> sunrise = new ArrayList<String>();
        List<String> sunset = new ArrayList<String>();
        List<String> lat = new ArrayList<String>();
        List<String> lon = new ArrayList<String>();        
        
            for( Weather l : list){
                icon.add("http://openweathermap.org/img/w/"+ l.icon +".png");
                main.add(l.main);
                temp.add(Math.round(l.temp) + "℃");
                windSpeed.add(l.windSpeed + "m/s");
                cloudAll.add(l.cloudAll + "%");
                pressure.add(l.pressure + "hPa");
                humidity.add(l.humidity + "%");
            }
            map.put("ICON", icon);
            map.put("WEATHER", main);
            map.put("TEMPERETURE", temp);
            map.put("AIR FROW", windSpeed);
            map.put("CLOUD COVER", cloudAll);
            map.put("PRESSURE", pressure);
            map.put("HUMIDITY", humidity);
    }

    
/**    public String icon;
    public String main;
    public double temp;
    public double temp1;    
    public double windSpeed;
    public int cloudAll;
    public int pressure;
    public int humidity;
    public Date sunrise;
    public Date sunset;
    public double lat;    
    public double lon;
    
    public WL(){}
    public WL(Weather list){
        icon = list.icon;
        main = list.main;
        temp = list.temp;
        
        
        // 小数点第2位を四捨五入する処理
        
        temp1 = temp*10;
        temp = Math.round(temp1);
        temp1 = temp/10;        
        temp1  = ((Math.round(temp*10))/10);

        windSpeed = list.windSpeed;
        cloudAll = list.cloudAll;
        pressure = list.pressure;
        humidity = list.humidity;
        sunrise = list.sunrise;
        sunset = list.sunset;
        lat = list.lat;
        lon = list.lon;
    }
**/
    public Map<String,List<String>> map ;
    
    
}
