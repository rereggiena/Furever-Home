/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package department;

/**
 *
 * @author reggie
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class koneksi {
    Connection con;
    Statement st;
    ResultSet rs;
    
    public Connection setConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/departemen", "root", "");
            st = con.createStatement();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi gagal "+e);
        }
        
        return con;
    }
}
