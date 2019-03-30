
package GestionarUsuario;

import Estructuras.DoublyLinkedList;

public class Tiquete {
    private String nombreEmisor;
    private String nombreCliente;
    private String tipoSorteo;
    private DoublyLinkedList numeroSorteo;
    private int precio;

    public Tiquete(String nombreEmisor, String nombreCliente, String tipoSorteo, DoublyLinkedList numeroSorteo, int precio) {
        this.nombreEmisor = nombreEmisor;
        this.nombreCliente = nombreCliente;
        this.tipoSorteo = tipoSorteo;
        this.numeroSorteo = numeroSorteo;
        this.precio = precio;
    }

    public String getNombreEmisor() {
        return nombreEmisor;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getTipoSorteo() {
        return tipoSorteo;
    }

    public DoublyLinkedList getNumeroSorteo() {
        return numeroSorteo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setNombreEmisor(String nombreEmisor) {
        this.nombreEmisor = nombreEmisor;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setTipoSorteo(String tipoSorteo) {
        this.tipoSorteo = tipoSorteo;
    }

    public void setNumeroSorteo(DoublyLinkedList numeroSorteo) {
        this.numeroSorteo = numeroSorteo;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
    
    
}



