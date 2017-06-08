/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.math.BigDecimal;
import java.util.Date;
import models.Weather;

/**
 *
 * @author r-takahashi
 */

public class WL {
    public String icon;
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
        
        /**
         * 小数点第2位を四捨五入する処理
         */
        temp1 = temp*10;
        temp = Math.round(temp1);
        temp1 = temp/10;        
//        temp1  = ((Math.round(temp*10))/10);

        windSpeed = list.windSpeed;
        cloudAll = list.cloudAll;
        pressure = list.pressure;
        humidity = list.humidity;
        sunrise = list.sunrise;
        sunset = list.sunset;
        lat = list.lat;
        lon = list.lon;
    }
    
}
