package sisinf;
import Modelo.Conexion;
import Vista.InterfazRegistrarUsuario;
import Vista.InterfazRegistrarNuevoProducto;
import java.sql.*;
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*InterfazRegistrarNuevoProducto ventana=new InterfazRegistrarNuevoProducto();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);*/
        InterfazRegistrarUsuario registro = new InterfazRegistrarUsuario();
        registro.setVisible(true);
        registro.setLocationRelativeTo(null);
    }
    
}
