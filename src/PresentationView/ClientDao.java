/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentationView;

import java.sql.*;

/**
 *
 * @author duncan
 */
public class ClientDao extends DatabaseConnection{
    Connection conni;
    Statement sti;
     public void createClient(String regNo, String firstName){
         try{
          conni= DatabaseConnection.getConnection();
        sti = conni.createStatement();
                boolean result = st.execute("insert into Client values('"+regNo+"','"+firstName+"')");
                System.out.println(result ? "Inserted" : "Failed");
                conni.close();
   }
         catch(Exception e){
             e.printStackTrace();
         }
     }
}
