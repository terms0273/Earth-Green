/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dto;

/**
 *
 * @author a-yamamoto
 */
public class ColorWindSpeed extends ColorChange {
    public ColorWindSpeed(double windSpeed) {
        if(windSpeed>=25){
            super.color = "#ff0000";
        }
        else{
            super.color = "#00ff00";
        }
        super.elem = windSpeed + "m/s";
    }
}
