/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicejava;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author bappy
 */
public class sqlConnect {
    
    Connection sql = null;
    
    public static Connection ConnectSql(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection sql = DriverManager.getConnection("jdbc:sqlite:javaPractice.sqlite");
            System.out.println("Connection Established");
            return sql;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
}
