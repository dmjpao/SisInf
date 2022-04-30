/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *     Conexion conn = new Conexion(); 
       conn.ConectarDB();
 * @author Delgadillo
 */

public class Conexion {
    
    
     public Connection ConectarDB(){ //metodo 
                 String db = "SUPERALMACEN";//SUPERALMACEN
    String ip = "localhost";
    String puerto = "5432";
    Connection Conexion = null;


    String cadena = "jdbc:postgresql://"+ip+":"+puerto+"/"+db;
    
        try {
            Class.forName("org.postgresql.Driver");
            Conexion = DriverManager.getConnection(cadena,"postgres","Delgadillo");     //Delgadillo lo cambias por tu contrasana
          JOptionPane.showMessageDialog(null, "Se conecto");
        }catch (Exception e){
           JOptionPane.showMessageDialog(null, "Error al conectar"+e.toString());
       }
        return Conexion;
    }
    
}
