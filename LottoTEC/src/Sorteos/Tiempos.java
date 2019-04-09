
package Sorteos;

import java.util.GregorianCalendar;


public class Tiempos extends AbstractSorteo {

    public Tiempos(String nombreSorteo, int codigoSorteo,GregorianCalendar fechaSorteo) {
        super(nombreSorteo, codigoSorteo, fechaSorteo);
        //se agrega a la lista el numero principal y la jugada
        super.getNumeroGanador().insert((int) Math.floor(Math.random()*100));
        super.getNumeroGanador().insert((int) Math.floor(Math.random()*100));
    }

    @Override
    public void emitirGanador() {
    }
    
    
    
}
