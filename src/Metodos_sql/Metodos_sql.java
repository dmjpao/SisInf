package Metodos_sql;
import modelo.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
/**
 *
 * @author doria
 */
public class Metodos_sql {
    public Conexion conexion = new Conexion();

    public PreparedStatement sentencia_preparada;
    public ResultSet resultado;
    public String sql;
    
    public int guardar(String nombre,String contrasena) throws SQLException{
        int resultado = 0;
        Connection con = null;
        String sentencia_guardar = ("INSERT INTO usuario (sexo_idsexo, nombre, contrasena, fechanacimiento,salario) VALUES(?,?,?,?,?)");
        try{
            con = conexion.ConectarDB();
            sentencia_preparada = con.prepareStatement(sentencia_guardar);
            sentencia_preparada.setInt(1,1);
            sentencia_preparada.setString(2,nombre);
            sentencia_preparada.setString(3,contrasena);
            sentencia_preparada.setObject(4, java.sql.Date.valueOf(java.time.LocalDate.now()));
            sentencia_preparada.setFloat(5, 2718.28f);
            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            con.close();
        } catch(Exception e){
            System.out.println(e);
        }
        return resultado;
    }
    public String buscarNombre(String nombre){
        String busqueda_nombre = null;
        Connection con = null;
        try{
            con = conexion.ConectarDB();
            String sentencia_buscar = ("SELECT nombre FROM usuario WHERE nombre='" +nombre+ "'");
            sentencia_preparada = con.prepareStatement(sentencia_buscar);
            resultado = sentencia_preparada.executeQuery();
            if(resultado.next()){
                String nom = resultado.getString("nombre");
                busqueda_nombre = nom;
            } 
            con.close();
        }catch(Exception e){
            System.out.println(e);
        }
        return busqueda_nombre;
    }   
    public String buscarUsuarioRegistrado(String nombre,String contrasena){
        String busqueda_usuario = null;
        Connection con = null;
        try{
            con = conexion.ConectarDB();
            String sentencia_buscar_usuario = ("SELECT nombre,contrasena FROM usuario WHERE nombre = '"+nombre+"' AND contrasena = '"+contrasena+"'");
            sentencia_preparada = con.prepareStatement(sentencia_buscar_usuario);
            resultado = sentencia_preparada.executeQuery();
            if(resultado.next()){
                busqueda_usuario = "Usuario encontrado";
            } else {
                busqueda_usuario = "Usuario no encontrado";
            }
        } catch(Exception e){
            System.out.println(e);
            System.out.println(busqueda_usuario);
        }
        return busqueda_usuario;
    }

}
