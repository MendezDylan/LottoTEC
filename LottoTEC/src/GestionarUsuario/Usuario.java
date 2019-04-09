
package GestionarUsuario;

import Estructuras.PriorityQueue;
import java.util.GregorianCalendar;


public class Usuario<X> {
    private String nombre;
    private int cedula;
    private GregorianCalendar fechaNacimiento;
    private String direccion;
    private String telefono;
    private String correo;
    private PriorityQueue<X> pedidosTiquetes;

    public Usuario(String nombre, int cedula, GregorianCalendar fechaNacimiento, String direccion, String telefono, String correo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.pedidosTiquetes=new PriorityQueue<>();
    }
    
    



    public String getNombre() {
        return nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public GregorianCalendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public PriorityQueue<X> getPedidosTiquetes() {
        return pedidosTiquetes;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setFechaNacimiento(GregorianCalendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }


    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setPedidosTiquetes(PriorityQueue<X> pedidosTiquetes) {
        this.pedidosTiquetes = pedidosTiquetes;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", cedula=" + cedula + ", fechaNacimiento=" + fechaNacimiento.getTime() + ", direccion=" + direccion + ", telefono=" + telefono + ", correo=" + correo + ", pedidosTiquetes=" + '}';
    }

    
    
    


    
    
    
}

