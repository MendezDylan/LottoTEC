package Sorteos;

import java.util.GregorianCalendar;

public class Loteria<X> extends AbstractSorteo{

    
public Loteria(String nombreSorteo, int codigoSorteo, GregorianCalendar fechaSorteo){
        super(nombreSorteo, codigoSorteo, fechaSorteo);
        //se agrega a la lista el numero ganador 
        super.getNumeroGanador().insert((int) Math.floor(Math.random()*100));
    }

    @Override
    public void emitirGanador(){
        //aqui se realiza el sorteo con random
    }
    
}
