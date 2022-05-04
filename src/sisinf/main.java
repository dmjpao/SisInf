package sisinf;
import Modelo.Conexion;
import Vista.InterfazListarVentas;
import Vista.InterfazPlanillaSueldo;
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
        
        
        /*InterfazRegistrarUsuario registro = new InterfazRegistrarUsuario();
        registro.setVisible(true);
        registro.setLocationRelativeTo(null);*/
        
        InterfazListarVentas listar= new InterfazListarVentas();
        listar.setVisible(true);
        listar.setLocationRelativeTo(null);
        /*InterfazPlanillaSueldo planilla = new InterfazPlanillaSueldo();
        planilla.setVisible(true);
        planilla.setLocationRelativeTo(null);*/
    }
    
}
