/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Tables {

    public static void main(String args[]) {
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();

             //st.executeUpdate("create table appadmin(addAdmin_pk int AUTO_INCREMENT primary key,username varchar(200),password varchar(200),email varchar(200),mobile bigint(100),address varchar(200))");
           // st.executeUpdate("insert into appadmin(username,password,email,mobile,address)values('admin','admin','admin123@gmail.com','7573831132','Jetpur')");
          
           //st.executeUpdate("create table addmedicine(addMedicine_pk int primary key AUTO_INCREMENT ,medicinename varchar(200),companyname varchar(200),batchno varchar(200),quantity int(200),mrp FLOAT,expiredate DATE)");
           //st.executeUpdate("alter table addmedicine modify addMedicine_pk int AUTO_INCREMENT");
           
          // st.executeUpdate("create table sellmedicine(bill_pk int AUTO_INCREMENT primary key , billId varchar(200),billDate varchar(50),totalPaid bigint(200),generatedby varchar(100))");
          
           // JOptionPane.showMessageDialog(null, "Table created SuccessFully.");
           // st.executeUpdate("drop table addmedicine");
            //JOptionPane.showMessageDialog(null,"Drop table SuccessFully.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
