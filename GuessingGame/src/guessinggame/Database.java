/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guessinggame;



/**
 *
 * @author SHADOWVY
 */
import java.sql.Connection;
import java.sql.DriverManager;

public class Database {
    
    
    public static Connection dbconnect() {
        try {
            Class.forName("org.sqlite.JDBC"); // load the SQLite driver
            Connection con = DriverManager.getConnection("jdbc:sqlite:database.db"); // connect to the database
        //    System.out.println("dljwhdl");
            return con;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}





    
    
    
    
