/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gui_Base;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;

/**
 *
 * @author admin
 */

// btn thì dùng ActionListener (sử dụng tên luôn)
// jcb ItemListener thì dùng getStateChange tra ve != 0 nếu có (sử dụng sự kiện event)
//(vẫn dùng được ActionListener thì dùng isSelected() )



public class GUi6 {
    public static void main(String[] args) {
        String[] arr= {"Java","C++","Python","JS"};
        JComboBox comBox = new JComboBox(arr);
        comBox.setBounds(30,100,100,50);
        
        comBox.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                int pos = comBox.getSelectedIndex();
                if(pos == 0){
                    System.out.println("Java");
                }
                if(pos == 1){
                    System.out.println("C++");
                }
                if(pos == 2){
                    System.out.println("Python");
                }
                if(pos == 3){
                    System.out.println("JS");
                }
            }
            
        });
        
        JRadioButton btn1 = new JRadioButton("Java");
        btn1.setBounds(30,100,100,30);
        JRadioButton btn2 = new JRadioButton("C++");
        btn2.setBounds(30,150,100,30);
        
        btn1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(btn1.isSelected()){
                    System.out.println("Java");
                }
            }
            
        });
        btn2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(btn2.isSelected()){
                    System.out.println("C++");
                }
            }
            
        });
        
        JCheckBox checkBox1 = new JCheckBox("Java");
        checkBox1.setBounds(30,100,100,60);
        JCheckBox checkBox2 = new JCheckBox("C++");
        checkBox2.setBounds(30,150,100,60);
        
        JLabel lbl = new JLabel();
        lbl.setBounds(30,250,100,30);
//        checkBox1.addItemListener(new ItemListener(){
//            @Override
//            public void itemStateChanged(ItemEvent e) {
//                if(e.getStateChange() != 0){
//                    lbl.setText("Java");
//                }
//            }
//            
//        });
        
        checkBox1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(checkBox1.isSelected()){
                    lbl.setText("Java");
                }
            }
            
        });

        checkBox2.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() != 0){
                    lbl.setText("C++");
                }
            }
            
        });
        
        JFrame frame = new JFrame("JCheckBox Example");
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(frame);
        frame.add(comBox);
//        frame.add(btn1);
//        frame.add(btn2);
//        frame.add(checkBox1); frame.add(checkBox2);
//        frame.add(lbl);
        frame.setVisible(true);
    }
}
