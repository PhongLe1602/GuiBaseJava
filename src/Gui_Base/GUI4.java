/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gui_Base;

/**
 *
 * @author By Phong5G :)) 
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.*;

public class GUI4 {
    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Account>list = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            list.add(new Account(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        
        JLabel lbl1 = new JLabel("Password");
        JLabel lbl2 = new JLabel("Username");
        JLabel lbl3 = new JLabel();
        JLabel lbl4 = new JLabel();
        lbl1.setBounds(70,100,100,30);
        lbl2.setBounds(70,60,100,30);
        lbl4.setBounds(335,20,150,30);
        
        JTextField jtf1 = new JTextField();
        jtf1.setBounds(170,60,150,30);
        
        JPasswordField password1 = new JPasswordField();
        password1.setBounds(170,100,150,30);
        
        JButton btnLogin = new JButton("LogIn");
        btnLogin.setBounds(196,190,100,30);
        
        btnLogin.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = jtf1.getText();
                String pass = new String(password1.getPassword());
                if(username.equals("") || pass.equals("")){
                    lbl3.setBounds(185,135,250,30);
                    lbl3.setText("Vui long dang nhap!");
                    lbl4.setText("");
                }else{
                    boolean ok = false;
                    int pos = 0;
                    String k="";
                    for(int i = 0; i < n; i++){
                        if(list.get(i).checkLogin(username, pass)){
                            pos = i;
                            k = list.get(i).getHoTen();
                            ok = true; break;
                        }
                    }
                    if(ok){
                        lbl3.setBounds(165,135,250,30);
                        lbl3.setText("Ban da dang nhap thanh cong!");
                        lbl4.setText("Xin chao " + k);
                    }else{
                        lbl3.setBounds(116,135,250,30);
                        lbl3.setText("Tai khoan hoac mat khau khong chinh xac!");
                        lbl4.setText("");
                    }
                }
            }
            
        });
        
        JFrame frame = new JFrame("JPasswordField Exmple");
        frame.setSize(500,400);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(frame);
        frame.add(lbl1);
        frame.add(lbl2);
        frame.add(lbl3);
        frame.add(lbl4);
        frame.add(jtf1);
        frame.add(password1);
        frame.add(btnLogin);
        frame.setVisible(true);
    }
}
