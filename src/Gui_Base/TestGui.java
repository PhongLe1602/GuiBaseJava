/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gui_Base;

/**
 *
 * @author admin
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.BadLocationException;

public class TestGui {
    
    public static int tn(String[] a){
        int dem = 0;
        for(int i = 0; i < a.length; i++){
            String[]b = a[i].split("\\s+");
            for(int j = 0;j < b.length; j++){
                String k1 = b[j];
                StringBuilder k2 = new StringBuilder(b[j]);
                k2 = k2.reverse();
                if(k1.equals(new String(k2))){
                    dem++;
                }
            }  
        }
        return dem;
    }
    
    public static void main(String[] args) {
        JTextArea jta = new JTextArea();
        jta.setBounds(60,100,200,100);
        jta.setWrapStyleWord(true);
        jta.setLineWrap(true);
        
        JButton btn = new JButton("Count");
        btn.setBounds(60,230,100,40);
        
        JTextField jtf = new JTextField();
        jtf.setBounds(220,230,60,40);
        
        btn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                int n = jta.getLineCount();
                String[] arr = new String[n];
                String s = jta.getText();
                for(int i = 0; i < n; i++){
                    int st = -1, en = -1;
                    try {
                        st = jta.getLineStartOffset(i);
                    }catch (BadLocationException ex) {
                        Logger.getLogger(TestGui.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    try {
                        en = jta.getLineEndOffset(i);
                    } catch (BadLocationException ex) {
                        Logger.getLogger(TestGui.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    arr[i] = s.substring(st,en);
                }
                jtf.setText("" + tn(arr));
            }
        });
        
        JFrame frame = new JFrame("Example");
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setLocationRelativeTo(frame);
        frame.add(jta); frame.add(btn); frame.add(jtf);
        frame.setVisible(true);
        
    }
}
