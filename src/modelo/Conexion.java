package modelo;

import java.sql.*;
import javax.swing.JOptionPane;


public class Conexion {
    
    public Connection ConectarDB() { //metodo 
        String db = "SUPERALMACEN";
        String ip = "localhost";
        String puerto = "5432";
        Connection Conexion = null;
        String cadena = "jdbc:postgresql://" + ip + ":" + puerto + "/" + db;

        try {
            Class.forName("org.postgresql.Driver");
            Conexion = DriverManager.getConnection(cadena, "postgres", "4321952");     //Delgadillo lo cambias por tu contrasana
            //JOptionPane.showMessageDialog(null, "Se conecto");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al conectar" + e.toString());
        }

        return Conexion;
    }

    public static String url = "jdbc:postgresql://localhost:5432/SUPERALMACEN";
    public static String usuario = "postgres";
    public static String contrasenia = "jhen123";
    public static String driver = "org.postgresql.Driver";
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
