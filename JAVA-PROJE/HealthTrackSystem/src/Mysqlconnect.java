/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asefunc
 */
import java.sql.*;
import javax.swing.*;
public class Mysqlconnect {
    
    Connection conn = null;   //drive manager class  // connect to database class
    
    public static Connection ConnectDb(){
        
        try{
                Class.forName("com.mysql.jdbc.Driver");
                
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/yavuzselimsefunc","root","");
                JOptionPane.showMessageDialog(null, "Connection Established");
                return conn;
        }catch (Exception e){
            
            JOptionPane.showMessageDialog(null, e);
            return null;
        
        }
    }
    
}
