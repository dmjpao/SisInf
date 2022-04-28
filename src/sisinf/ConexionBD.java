/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sisinf;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class ConexionBD {
    public static String url = "jdbc:mysql://localhost:3306/sis";
    public static String usuario = "root";
    public static String contrasenia = "";
    public static String driver = "com.mysql.jdbc.Driver";
   public static Connection conectar(){
        Connection conexion =null;
        try {
            Class.forName(driver);
            conexion = DriverManager.getConnection(url,usuario,contrasenia);
            System.out.println("Conexion establecida");
        }catch (ClassNotFoundException |SQLException e){
            System.out.println("Error: "+e);
        }
        return conexion;
    }
    
}
