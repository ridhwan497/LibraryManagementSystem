/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

/**
 *
 * @author ridhub
 */

//IMPORT SECTION
import java.sql.*;
import javax.swing.JOptionPane;

public class ConnectionProvider {
    public static Connection getConnection() {
        try {
           //Class.forName("com.mysql.cj.jdbc.Driver");
           Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management","root", null);
           return cn;
        }
        catch(SQLException e) {
            System.out.println("Connection failed.");
            e.printStackTrace();
            return null;
        }
    }
}
