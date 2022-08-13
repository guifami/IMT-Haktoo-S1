/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jframe;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Guilherme Ruiz
 */
public class DBConnection {
    static Connection con = null;
    public static String ip = "";
    
    public static Connection getConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(ip, "", "");
        }catch (Exception e){
            e.printStackTrace();
        }
        return con;
    }
}
