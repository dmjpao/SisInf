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
    
    public void MostrarTableVentas(JTable tabla){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Nombre de Producto");
        modelo.addColumn("Marca del Producto");
        modelo.addColumn("Precio del Producto");
        modelo.addColumn("Monto de la Venta");
        modelo.addColumn("Fecha");
        modelo.addColumn("Nombre");
        String consultasql = new String();
        consultasql = "SELECT PR.nombre, D.Marca, D.Precio, V.Monto,V.Fecha, CL.nombre FROM Producto PR, Producto_Detalle D, Venta V, Cliente CL WHERE PR.Producto_Detalle_idProducto_Detalle = D.idProducto_Detalle and V.Cliente_idCliente = CL.idCliente and V.Producto_idProducto = PR.idProducto and V.Producto_Detalle_idProducto_Detalle = PR.Producto_Detalle_idProducto_Detalle";
        Statement st;
        try{
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(consultasql);
            while(rs.next()){
                Object [] lista = {rs.getString(1), rs.getString(2), rs.getFloat(3), rs.getFloat(4),rs.getString(5), rs.getString(6)};
                modelo.addRow(lista);
            }
            tabla.setModel(modelo);
        }catch(Exception e){
            System.out.println("ERROR AL LISTAR LOS DATOS" + e);
        }
    }
}
