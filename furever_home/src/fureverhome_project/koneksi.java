/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fureverhome_project;

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
    
    public Connection setConnection()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");  //link and database name   username  password
            con = DriverManager.getConnection("jdbc:mysql://localhost/furever_home", "root", "");
            st = con.createStatement();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Connection Failed " + e);
        }
        
        return con;
    }
}

/*
try {
        Class.forName("com.mysql.cj.jdbc.Driver");

        PreparedStatement ps = kon.con.prepareStatement("insert into tb_user(user_username, user_fullname, user_age, user_occupation, user_salary, user_petHistory, user_phoneNumber, user_password)"
                + "values(?, ?, ?, ?, ?, ?, ?, ?)");

        ps.setString(1, username);
        ps.setString(2, fullname);
        ps.setInt(3, age);
        ps.setString(4, occupation);
        ps.setString(5, salary);
        ps.setString(6, petHistory);
        ps.setString(7, phoneNumber);
        ps.setString(8, password);

        ps.executeUpdate();

        dispose();
        User_Login login = new User_Login();
        login.show();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Signup Error "+ex);
            }
*/