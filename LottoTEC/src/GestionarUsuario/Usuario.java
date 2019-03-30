
package GestionarUsuario;

import Estructuras.DoublyLinkedList;
import Estructuras.DoublyLinkedNode;


public class Usuario<X> {
    private String nombre;
    private String cedula;
    private String fechaNacimiento;
    private String direccion;
    private String telefono;
    private String correo;
    private DoublyLinkedList<X> pedidosTiquetes;

    public Usuario(String nombre, String cedula, String fechaNacimiento, String direccion, String telefono, String correo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.pedidosTiquetes=new DoublyLinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public String getFechaNacimiento() {
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

    public DoublyLinkedList<X> getPedidosTiquetes() {
        return pedidosTiquetes;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
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

    public void setPedidosTiquetes(DoublyLinkedList<X> pedidosTiquetes) {
        this.pedidosTiquetes = pedidosTiquetes;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", cedula=" + cedula + ", fechaNacimiento=" + fechaNacimiento + ", direccion=" + direccion + ", telefono=" + telefono + ", correo=" + correo + ", pedidosTiquetes=" + pedidosTiquetes + '}';
    }
    
    
    
}

