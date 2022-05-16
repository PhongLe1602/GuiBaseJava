/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gui_Base;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.text.BadLocationException;

/**
 *
 * @author admin
 */
public class GUI5 {
    public static int dd(String[] a){
        TreeSet<String> treeset = new TreeSet<>();
        for(int i = 0; i < a.length; i++){
            String[] b = a[i].split("\\s+");
            for(String x : b) treeset.add(x);
        }
        return treeset.size();
    }
    
    public static void main(String[] args) {
        JTextArea jta = new JTextArea();// viet duoc 1 chuoi
        jta.setBounds(80,30,200,200);
        jta.setLineWrap(true);// tu dong xuong dong
        jta.setWrapStyleWord(true); // set word đúng từ.
        
        JButton btn = new JButton("Count");
        btn.setBounds(70,300,100,30);
        JTextField jtf = new JTextField();
        jtf.setBounds(190,300,100,30);
        
        btn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                int n = jta.getLineCount();
                String s = jta.getText();
                String[]arr = new String[n];
                for(int i = 0; i < n; i++){
                    int st = -1,en = -1;
                    try {
                        st = jta.getLineStartOffset(i);
                    } catch (BadLocationException ex) {
                        Logger.getLogger(GUI5.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    try {
                        en = jta.getLineEndOffset(i);
                    } catch (BadLocationException ex) {
                        Logger.getLogger(GUI5.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    arr[i] = s.substring(st,en);
                }
                jtf.setText("" + dd(arr));
            }
        });
        
        JFrame frame = new JFrame("JTextArea Example");
        frame.setSize(400,500);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(frame);
        frame.add(jta);
        frame.add(btn); frame.add(jtf);
        frame.setVisible(true);
    }
}
