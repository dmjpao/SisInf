package controlador;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class consulta {
    java.sql.Statement st;
    ResultSet rs;
    conectar conec=new conectar();
    Cliente var = new Cliente();
    Producto prod=new Producto();

    public void insertar(String id, String nombre, Integer telefono, String fecha) {
        java.sql.Date fec = java.sql.Date.valueOf(fecha);
        try {
            Connection conexion = conec.conectar();
            st = conexion.createStatement();
            String sql = "insert into cliente(idCliente, nombre, teléfono, fecha_nacimiento) values('" + id + "','" + nombre + "','" + telefono + "','" + fec + "');";
            st.execute(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "El registro se guardo correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El registro no se guardo " + e, "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }
