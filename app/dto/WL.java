/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import models.Weather;

/**
 *
 * @author r-takahashi
 */

public class WL {
    public String iconchan;
    public WL(){}
    public WL(Weather list){
        iconchan = list.icon;
    }
}
