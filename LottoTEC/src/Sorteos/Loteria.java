/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorteos;

import Estructuras.DoublyLinkedList;

/**
 *
 * @author Dylan
 * @param <X>
 */
public class Loteria<X> extends Sorteo{
    private String nombreSorteo;
    private int codigoSorteo;
    
    public Loteria(int anno, int mes, int dia, int emision)
    {
        super(anno, mes, dia, new DoublyLinkedList());
        super.getEmisionSorteo().insert(emision);
    }

    public void setNombreSorteo(String nombreSorteo) {
        this.nombreSorteo = nombreSorteo;
    }

    public void setCodigoSorteo(int codigoSorteo) {
        this.codigoSorteo = codigoSorteo;
    }
    
    
    
    @Override
    public void emitirGanador(){
        //aqui se realiza el sorteo con random
    }


    
    
}
