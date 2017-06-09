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
public class ColorIcon extends ColorChange {
    
    public ColorIcon(String icon){
        super.elem = "http://openweathermap.org/img/w/"+ icon +".png";
    }
}
