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

}
