package modelo;

public class Cliente {
    private static String idCliente;
    private static String nombre;
    private static String telefono;
    private static String fecha;

    public String getCliente() {
        return idCliente;
    }

    public void setIdempleado(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

}
