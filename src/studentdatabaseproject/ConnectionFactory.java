/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdatabaseproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConnectionFactory {
    public static Connection con;
    
 public static Connection getConnection() throws ClassNotFoundException, SQLException
 { if(null == con)
     {
     Class.forName("com.mysql.cj.jdbc.Driver");
         con = DriverManager.getConnection( 
                 "jdbc:mysql://localhost:3306/records", "root", 
                 "12345");
     return con;
     } return con;
 }
}
