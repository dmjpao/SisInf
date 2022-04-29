/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexcion;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Delgadillo
 */

public class Conexcion {
    
    
     public Connection conectarDB(){ //metodo 
                 String db = "SUPERALMACEN";
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
