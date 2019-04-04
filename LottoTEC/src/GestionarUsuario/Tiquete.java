
package GestionarUsuario;

import Estructuras.DoublyLinkedList;

public class Tiquete {
    private String nombreEmisor;
    private Usuario usuario;
    private SorteosFuturos sorteo;
    private DoublyLinkedList numeroSorteo;

    public Tiquete(String nombreEmisor, Usuario usuario, SorteosFuturos sorteo, DoublyLinkedList numeroSorteo) {
        this.nombreEmisor = nombreEmisor;
        this.usuario = usuario;
        this.sorteo = sorteo;
        this.numeroSorteo = numeroSorteo;
    }

    public String getNombreEmisor() {
        return nombreEmisor;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public SorteosFuturos getSorteo() {
        return sorteo;
    }

    public DoublyLinkedList getNumeroSorteo() {
        return numeroSorteo;
    }

    public void setNombreEmisor(String nombreEmisor) {
        this.nombreEmisor = nombreEmisor;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setSorteo(SorteosFuturos sorteo) {
        this.sorteo = sorteo;
    }

    public void setNumeroSorteo(DoublyLinkedList numeroSorteo) {
        this.numeroSorteo = numeroSorteo;
    }
    
    
}
