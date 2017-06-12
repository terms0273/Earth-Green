/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dto.colorChange;

/**
 *
 * @author a-yamamoto
 */
/**
 * 夏日、真夏日、猛暑日の基準になる気温ごとに色分け
 */
public class ColorTemp extends ColorChange {
    public ColorTemp(double temp) {
        setColorTemp(temp);
        super.elem = temp + "℃";
    }
    public void setColorTemp(double temp) {
        //猛暑日
        if(temp >= 35){
            super.color = "#eb3c15";
        }
        //真夏日
        else if(temp >= 30){
            super.color = "#eb5331";
        }
        //夏日
        else if(temp >= 25){
            super.color = "#ff5a36";
        }
        //氷点下
        else if(temp <= 0){
            super.color = "#0046b8";
        }
        else{
            super.color = "#ffffff";
        }
    }
    
}
