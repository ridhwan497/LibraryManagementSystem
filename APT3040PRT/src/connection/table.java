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

public class table {
    
    public static void main(String[] arg) {
        
       Connection cn = null;
       Statement st = null;
       
       try {
           cn = ConnectionProvider.getConnection();
           st = cn.createStatement();
           //st.executeUpdate("create table libuser(libuser_pk int AUTO_INCREMENT primary key, name varchar(100), libid varchar(100), email varchar(100), gender varchar(100), mobilenumber varchar(100), password varchar(100))");
           
           //st.executeUpdate("insert into libuser (name, libid, email, gender, mobilenumber, password) values ('Ridhwan','666016', 'ridwan123@testmail.com', 'Female', '0716664374', '12345') ");
           
           JOptionPane.showMessageDialog(null, "Table Created Successfully.");
       }
       catch(Exception e) {
           JOptionPane.showMessageDialog(null, e);
           
       }
       
       finally {
           try {
               cn.close();
               st.close();
           }
           catch(Exception e) {
               
           }
       }
        
    }
    
}
