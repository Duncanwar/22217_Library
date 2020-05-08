/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentationView;

import java.sql.*;
public class DatabaseConnection {
 public  static Connection conn;
 public  static Statement st;
   public static String url="jdbc:mysql://localhost:3306/Library";
  public static  String username= "root";
  public static  String password="";
    public static Connection getConnection(){
         try {
             Class.forName("com.mysql.jdbc.Driver");
                conn= DriverManager.getConnection(url, username, password) ;
           
               }catch(Exception e){
            e.printStackTrace();
        }
        return conn;
    }
    
  
}
