package sisinf;
import modelo.*;
import vista.*;

public class main {

    
     
    public static void main(String[] args) {
        InterfazRegistrarNuevoProducto nuevoProducto = new InterfazRegistrarNuevoProducto();
        //framePrincipal frame = new framePrincipal();
        frameLogin frameLogin = new frameLogin();
        java.awt.EventQueue.invokeLater(new Runnable() {
            Conexion con = new Conexion(); 
            
            public void run() {
                //con.ConectarDB();
                //frame.setVisible(true);
                frameLogin.setVisible(true);
                //frame.setVisible(true);
                //frame.setLocationRelativeTo(null);
                //nuevoProducto.setVisible(true);
                //nuevoProducto.setResizable(false);
            }
        });
    }
    
}
