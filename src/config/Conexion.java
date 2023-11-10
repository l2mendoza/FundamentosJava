/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Gamal
 */
public class Conexion {
    Connection con;
    public Conexion() { 
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/registro","root","");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("error: "+e);
        }
    }
    public Connection getConnection  () {
        return con;
    }
}
