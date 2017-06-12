/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto.colorChange;

import dto.colorChange.ColorCloudAll;
import dto.colorChange.ColorIcon;
import dto.colorChange.ColorWindSpeed;
import dto.colorChange.ColorTemp;
import dto.colorChange.ColorMain;
import dto.colorChange.ColorPressure;
import dto.colorChange.ColorChange;
import dto.colorChange.ColorDI;
import dto.colorChange.ColorHumidity;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import models.Weather;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * 過去の天気情報を1時間ごとに一覧表示する
 * @author r-takahashi
 */
public class WL {
    public WL(List<Weather> list){
        // 各変数名は、DB内の表示名に従う
        map = new LinkedHashMap<String, List<ColorChange>>();     
        List<ColorChange> icon = new ArrayList<ColorChange>();
        List<ColorChange> main = new ArrayList<ColorChange>();
        List<ColorChange> temp = new ArrayList<ColorChange>();
        List<ColorChange> windSpeed = new ArrayList<ColorChange>();
        List<ColorChange> cloudAll = new ArrayList<ColorChange>();
        List<ColorChange> pressure = new ArrayList<ColorChange>();
        List<ColorChange> humidity = new ArrayList<ColorChange>();                
        List<ColorChange> DI = new ArrayList<ColorChange>();
        
        for( Weather l : list){
            icon.add(new ColorIcon(l.icon));
            main.add(new ColorMain(l.main));
            temp.add(new ColorTemp(Math.round(l.temp)));
            windSpeed.add(new ColorWindSpeed(l.windSpeed));
            cloudAll.add(new ColorCloudAll(l.cloudAll));
            pressure.add(new ColorPressure(l.pressure));
            humidity.add(new ColorHumidity(l.humidity));
            DI.add(new ColorDI(l.temp, l.humidity));           
        }
                
        map.put("ICON", icon);
        map.put("WEATHER", main);
        map.put("TEMPERETURE", temp);
        map.put("AIR FROW", windSpeed);
        map.put("CLOUD COVER", cloudAll);
        map.put("PRESSURE", pressure);
        map.put("HUMIDITY", humidity);
        map.put("DI", DI);
    }
    public Map<String,List<ColorChange>> map ;     
}
