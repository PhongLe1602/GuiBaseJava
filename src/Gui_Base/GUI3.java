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
 * @author BY Phongdz :)) 
 */

/* 
---JLabel  : nhãn
---JButton : lệch có thể click
---JTextField : hộp thoại nhâp text mà chỉ được trên 1 dòng, có thể xuống như mà tự enter v:
---JPassWordField : nhập passWord trở thành kí tự '.' trả về 1 chuỗi trả, muốn trở thành String thì new String(chuỗi);
---JTextArea : hộp thoại nhập một đoạn văn bản có thể tự xuống dòng và setWord
---JCheckBox : giống click trả về Item dùng addItem
---JComboBox : dùng addAction
---JRadioButton : cả 3 có thể dùng được addAc hoặc addItem
---JFrame : Khung chứa
*/
public class GUI3 {

    public static void main(String[] args) {
        JLabel lbl1 = new JLabel("Nhap a : ");// nhãn
        JLabel lbl2 = new JLabel("Nhap b : ");
        JLabel lbl3 = new JLabel("Result : ");
        JLabel lbl4 = new JLabel("CALCULATOR BY PHONGDZ <3");

        JTextField jtf1 = new JTextField();// hộp thoại nhập textfiled
        JTextField jtf2 = new JTextField();
        JTextField jtf3 = new JTextField();

        JButton btn1 = new JButton("+");// But lệnh các thứ (Click)
        JButton btn2 = new JButton("-");
        JButton btn3 = new JButton("*");
        JButton btn4 = new JButton(":");

        lbl1.setBounds(50, 100, 100, 50);//
        /*x,y,wigdt,height
        x : cách lề trái là x
        y : cách lề trên là y
        wigdt : rộng của cái Button
        Height : chiều cao của Button
         */
        lbl2.setBounds(50, 150, 100, 50);
        
        lbl3.setBounds(300,105,100,50);
        
        lbl4.setBounds(165,-55,300,200);
        // lbl3.setBounds(r);

        jtf1.setBounds(115, 105, 80, 40);
        jtf2.setBounds(115, 155, 80, 40);
        jtf3.setBounds(350,105,80,50);

//        jtf1.setText("Nhap gia tri ");
//        jtf2.setText("Nhap gia tri ");
        btn1.setBounds(115,245,60,30);
        btn2.setBounds(195,245,60,30);
        btn3.setBounds(275,245,60,30);
        btn4.setBounds(355,245,60,30);
        
        btn1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(jtf1.getText());
                int b = Integer.parseInt(jtf2.getText());
                jtf3.setText(a + b + "");
            } 
        });
        btn2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(jtf1.getText());
                int b = Integer.parseInt(jtf2.getText());
                jtf3.setText(a - b + "");
            } 
        });
        btn3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(jtf1.getText());
                int b = Integer.parseInt(jtf2.getText());
                jtf3.setText(a * b + "");
            } 
        });
        btn4.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(jtf1.getText());
                int b = Integer.parseInt(jtf2.getText());
                if(b == 0){
                    jtf3.setText("ERROR : Infinity"); 
                }else{
                    String x = String.format("%.2f", (double)a/b);
                    jtf3.setText(x+"");
                }
            } 
        });
        JFrame frame = new JFrame("Caculator Java");
        frame.setSize(500, 500);// rộng, cao
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(frame);
        frame.add(lbl1);
        frame.add(lbl2);
        frame.add(lbl3);
        frame.add(jtf1);
        frame.add(jtf2);
        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);
        frame.add(lbl4);
        frame.add(btn4);
        frame.add(jtf3);
        frame.setVisible(true);

    }
}
