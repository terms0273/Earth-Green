/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author r-takahashi
 */
public class ColorDT extends ColorChange{
    public ColorDT(int temp, int humidity){            
        // 計算する 不快指数
        super.elem = 0.81 * temp + 0.01 * humidity  * (0.99 * temp - 14.3) + 46.3 + "";
    }
}
