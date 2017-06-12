/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dto;

/**
 * 天気(晴れなどの表記方法部分)の行を色分け可能とするもの。
 * 今回は色分けは行っていない。
 * @author a-yamamoto
 */
public class ColorMain extends ColorChange {
    public ColorMain(String main){
        super.elem = main;
    }
}
