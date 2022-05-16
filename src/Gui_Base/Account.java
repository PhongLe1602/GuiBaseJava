/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gui_Base;

/**
 *
 * @author admin
 */
public class Account {
    private String hoTen;
    private String username;
    private String password;
    private String position;

    public Account(String hoTen, String username, String password, String position) {
        this.hoTen = hoTen;
        this.username = username;
        this.password = password;
        this.position = position;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getPosition() {
        return position;
    }
    
    public boolean checkLogin(String username, String password){
        if(this.username.equals(username) && this.password.equals(password)) return true;
        return false;
    }
    
}
