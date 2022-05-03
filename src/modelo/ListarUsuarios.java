/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.Usuario;
import Modelo.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author olive
 */
public class ListarUsuarios {
    Conexion con = new Conexion();
    Connection cn = con.ConectarDB();
    
    public void MostrarTable(JTable tabla){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Cargo");
        String consultasql = new String();
        consultasql = "SELECT U.idUsuario, U.Nombre, R.Nombre FROM Usuario U, Rol R, Usuario_has_Rol H WHERE H.Usuario_idUsuario = U.idUsuario and R.idRol = H.Rol_idRol";
        Statement st;
        try{
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(consultasql);
            while(rs.next()){
                Object [] lista = {rs.getInt(1), rs.getString(2), rs.getString(3)};
                modelo.addRow(lista);
            }
            tabla.setModel(modelo);
        }catch(Exception e){
            System.out.println("ERROR AL LISTAR LOS DATOS" + e);
        }
    }
    
    public void MostrarTable2(JTable tabla){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Cargo");
        modelo.addColumn("Fecha de Incoporacion");
        modelo.addColumn("Salario");
        String consultasql = new String();
        consultasql = "SELECT U.idUsuario, U.Nombre, R.Nombre, H.FechaInicio, U.salario FROM Usuario U, Rol R, Usuario_has_Rol H WHERE H.Usuario_idUsuario = U.idUsuario and R.idRol = H.Rol_idRol";
        Statement st;
        try{
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(consultasql);
            while(rs.next()){
                Object [] lista = {rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getFloat(5)};
                modelo.addRow(lista);
            }
            tabla.setModel(modelo);
        }catch(Exception e){
            System.out.println("ERROR AL LISTAR LOS DATOS" + e);
        }
    }
}
