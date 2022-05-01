package controlador;

import modelo.variables;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class consulta {
    java.sql.Statement st;
    ResultSet rs;
    conectar conec=new conectar();
    variables var = new variables();

    public void insertar(String id, String nombre, String telefono, String fecha) {
        try {
            Connection conexion = conec.conectar();
            st = conexion.createStatement();
            String sql = "insert into cliente(id, nombre,telefono,fecha) values('" + id + "','" + nombre + "','" + telefono + "','" + fecha + "');";
            st.execute(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "El registro se guardo correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El registro no se guardo " + e, "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }

