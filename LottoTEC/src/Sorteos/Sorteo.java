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
public abstract class Sorteo<X> {
    private GregorianCalendar date;
    private DoublyLinkedList<X> emisionSorteo;

    public Sorteo(int anno, int mes, int dia, DoublyLinkedList<X> emisionSorteo) {
        GregorianCalendar tempDate=new GregorianCalendar(anno, mes-1, dia);
        this.date=tempDate;
        this.emisionSorteo = emisionSorteo;
    }

    public GregorianCalendar getDate() {
        return date;
    }

    public DoublyLinkedList<X> getEmisionSorteo() {
        return emisionSorteo;
    }

    public void setDate(GregorianCalendar date) {
        this.date = date;
    }

    public void setEmisionSorteo(DoublyLinkedList<X> emisionSorteo) {
        this.emisionSorteo = emisionSorteo;
    }
    
    
    
    
    public abstract void emitirGanador();
}
