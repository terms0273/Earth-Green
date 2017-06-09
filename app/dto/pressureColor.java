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
public class pressureColor extends JFrame {
    
    public static void main(String[] args) {
        pressureColor frame = new pressureColor();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(10, 10, 300, 200);
        frame.setTitle("タイトル");
        frame.setVisible(true);
    }
    
    pressureColor(){
    JLabel label1 = new JLabel("COLOR BLACK");
    label1.setOpaque(true);
    label1.setBackground(Color.BLACK);
    
    JPanel p = new JPanel();
    p.add(label1);
    
    getContentPane().add(p);
  }

}
