/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorteos;

import Estructuras.DoublyLinkedList;
import java.util.GregorianCalendar;

/**
 *
 * @author Dylan
 * @param <X>
 */
public abstract class AbstractSorteo<X> {
    private String nombreSorteo;
    private int codigoSorteo;
    private GregorianCalendar fechaSorteo;
    private DoublyLinkedList<X> numeroGanador;

    public AbstractSorteo(String nombreSorteo, int codigoSorteo, int anno, int mes, int dia) {
        this.nombreSorteo=nombreSorteo;
        this.codigoSorteo=codigoSorteo;
        GregorianCalendar tempDate=new GregorianCalendar(anno, mes-1, dia);
        this.fechaSorteo=tempDate;
        numeroGanador=new DoublyLinkedList<>();
    }

    public GregorianCalendar getFechaSorteo() {
        return fechaSorteo;
    }

    public DoublyLinkedList<X> getNumeroGanador() {
        return numeroGanador;
    }

    public String getNombreSorteo() {
        return nombreSorteo;
    }

    public int getCodigoSorteo() {
        return codigoSorteo;
    }

    public void setFechaSorteo(GregorianCalendar fechaSorteo) {
        this.fechaSorteo = fechaSorteo;
    }

    public void setNumeroGanador(DoublyLinkedList<X> numeroGanador) {
        this.numeroGanador = numeroGanador;
    }

    public void setNombreSorteo(String nombreSorteo) {
        this.nombreSorteo = nombreSorteo;
    }

    public void setCodigoSorteo(int codigoSorteo) {
        this.codigoSorteo = codigoSorteo;
    }
    

    public abstract void emitirGanador();

    @Override
    public String toString() {
        return "AbstractSorteo{" + "nombreSorteo=" + nombreSorteo + ", codigoSorteo=" + codigoSorteo + ", fechaSorteo=" + fechaSorteo.getTime() + ", numeroGanador=" + numeroGanador + '}';
    }


 

}
