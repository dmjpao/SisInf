package Metodos_sql;
import controlador.Producto;
import controlador.Cliente;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import modelo.Conexion;

public class consulta {
    java.sql.Statement st;
    ResultSet rs;
    Conexion conec=new Conexion();
    Cliente var = new Cliente();
    Producto prod=new Producto();

    public void insertar(String id, String nombre, Integer telefono, String fecha) {
        java.sql.Date fec = java.sql.Date.valueOf(fecha);
        try {
            Connection conexion = conec.conectar();
            st = conexion.createStatement();
            String sql = "insert into cliente(idCliente, nombre, telefono, fechanacimiento) values('" + id + "','" + nombre + "','" + telefono + "','" + fec + "');";
            st.execute(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "El registro se guardo correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El registro no se guardo " + e, "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void consultar(String nombre) {
        try {
            Connection conexion = conec.conectar();
            st = conexion.createStatement();
            String sql = "select nombre, marca, precio, cantidad from producto, producto_detalle where nombre='" + nombre + "';";
            rs = st.executeQuery(sql);
            if (rs.next()) {
                prod.setNombre(rs.getString("nombre"));
                prod.setMarca(rs.getString("marca"));
                prod.setCantidad(rs.getInt("cantidad"));
                prod.setPrecio(rs.getFloat("precio"));
                
            } else {
               // prod.setNombre("");
                //prod.setTipoProducto("");
                //prod.setCantidad( );
               // prod.setPrecio();
               JOptionPane.showMessageDialog(null, "no se encontro registro", "sin registro", JOptionPane.INFORMATION_MESSAGE);
            }
            st.close();
            conexion.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error en programa " + e, "Erro de sistema", JOptionPane.ERROR_MESSAGE);
        }
    }
}