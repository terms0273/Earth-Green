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

/**
 * 気圧の値の変化で色を変化させる処理
 */
public class ColorPressure extends ColorChange {
    private static final String UNIT = "hPa";
    
    public ColorPressure(int pressure) {
        setColorPressure(pressure);
        super.elem = pressure + UNIT;
    }
    
    public void setColorPressure(int pressure) {
        if(pressure >= 1016){
            super.color = "#ffbf7f";
        }
        //1013hPaは平均の気圧の高さ
        else if(pressure >= 1013){
            super.color = "#ffc184";
        }
        else if(pressure >= 1010){
            super.color = "#ffc489";
        }
        else if(pressure >= 1007){
            super.color = "#ffc68e";
        }
        else if(pressure >= 1004){
            super.color = "#ffc993";
        }
        else if(pressure >= 1001) {
            super.color = "#ffcc99";
        }
        else{
            super.color = "#ffedcc";
        }
    }

}
