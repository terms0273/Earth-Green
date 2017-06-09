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
public class ColorPressure extends ColorChange {
    private static final String UNIT = "hPa";
    
    public ColorPressure(int pressure) {
        if(pressure>=1000){
            super.color = "#ff0000";
        }
        else{
            super.color = "#00ff00";
        }
        super.elem = pressure + UNIT;
    }

}
