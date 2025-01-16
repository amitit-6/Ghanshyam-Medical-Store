/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class ConnectionProvider {
    public static Connection getCon(){        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacy","root","");
            return con;
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
           // JOptionPane.showMessageDialog(null,"Please Connect Database");
            return null;
        }
    }
}
