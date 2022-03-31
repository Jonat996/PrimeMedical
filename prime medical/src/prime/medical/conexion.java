/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prime.medical;

import java.sql.*;

/**
 *
 * @author esteb
 */
public class conexion {

    Connection con;

    public conexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/registro", "root", "");
        } catch (Exception e) {
            System.err.println("No se pudo conectar" + e);
        }
    }

    public Connection getConnection() {
        return con;
    }

}
