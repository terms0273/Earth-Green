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
            super.color = "#f29900";
        }
        //1013hPaは平均の気圧の高さ
        else if(pressure >= 1013){
            super.color = "#f2a200";
        }
        else if(pressure >= 1010){
            super.color = "#f2aa00";
        }
        else if(pressure >= 1007){
            super.color = "#f2b200";
        }
        else if(pressure >= 1004){
            super.color = "#f2ba00";
        }
        else if(pressure >= 1001) {
            super.color = "#f2c200";
        }
        else if(pressure >= 998) {
            super.color = "#f2c679";
        }
        else if(pressure >= 997) {
            super.color = "#f2cf91";
        }
        else if(pressure >= 996) {
            super.color = "#f2d8aa";
        }
        else{
            super.color = "#f2e0c2";
        }
    }

}
