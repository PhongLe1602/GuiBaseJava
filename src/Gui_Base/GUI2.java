/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gui_Base;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author admin
 */
public class GUI2 {
    public static void main(String[] args) {
        JTextField jtf = new JTextField();
        jtf.setText("JAVA GUI");
        jtf.setBounds(100,100,100,30);
        JLabel lbl = new JLabel("Nhap So");
        lbl.setBounds(50,100,50,30);
   
        JButton btn = new JButton("Click");
        
        btn.setBounds(100,150,100,30);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jtf.setText("Ban Vua nhan vao button!");
            }
        });
  
        
        JFrame frame = new JFrame("JTextField Example");
        frame.setSize(300,300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(frame);
        
        frame.add(lbl);
        frame.add(jtf);
        frame.add(btn);
        frame.setVisible(true);
    }
}
