/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package departemen;

/**
 *
 * @author reggie
 */

import java.sql.*;
import javax.swing.JOptionPane;

public class koneksi {
    Connection con;
    Statement st;
    
    public Connection setConnection()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");  //link and database name   username  password
            con = DriverManager.getConnection("jdbc:mysql://localhost/departemen", "root", "");
            st = con.createStatement();
        } 
        
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Connection Failed " + e);
        }
        
        return con;
    }
}
