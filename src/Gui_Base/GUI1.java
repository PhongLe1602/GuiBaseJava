/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gui_Base;

import javax.swing.*;


/**
 *
 * @author admin
 */
public class GUI1 {
    public static void main(String[] args) {
        JButton btn = new JButton();
        btn.setText("Login");
        btn.setBounds(50, 50, 100, 50);
        JFrame frame = new JFrame();
        frame.setTitle("Welcome to Java Gui");
        frame.setSize(500,500);
        frame.add(btn);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(frame);
        frame.setVisible(true);
    }
}
