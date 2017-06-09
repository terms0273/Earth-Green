/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dto;

import javax.swing.*;
import java.awt.Color;

/**
 *
 * @author a-yamamoto
 */
public class pressureColor {
    public pressureColor(List<Weather> lists) {
        
        map = new HashMap<int, List<int>>();
        List<int> pressure = new ArrayList<int>();
        
        for( Weather color : lists){
            pressure.add(color.pressure);
        }
        
        map.put("PRESSURE",pressure);
    }
    
    public Map<int,List<int>> map;
    
}
