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
public class ColorWindSpeed extends ColorChange {
    public ColorWindSpeed(double windSpeed) {
        
        super.elem = windSpeed + "m/s";
    }
}
