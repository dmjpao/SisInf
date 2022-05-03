package sisinf;

import Modelo.Conexion;
import Vista.InterfazDetalleDeStock;
import Vista.InterfazRegistrarNuevoProducto;

public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Conexion con = new Conexion();
        //con.ConectarDB();
        /*InterfazRegistrarNuevoProducto ventana=new InterfazRegistrarNuevoProducto();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);*/
        InterfazDetalleDeStock ventana2=new InterfazDetalleDeStock();
        ventana2.setVisible(true);
        ventana2.setLocationRelativeTo(null);
        
    }
    
}
