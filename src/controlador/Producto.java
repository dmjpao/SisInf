package controlador;

/**
 *
 * @author PC
 */
public class Producto {
    public int codigo;
    public String descripcion;
    public String marca;
    public String modelo;
    public String proveedor;
    public float precio;
    public int cantidad;

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String nombre;
    public String especificaciones;
    
        public Producto (){
        
        }
}
