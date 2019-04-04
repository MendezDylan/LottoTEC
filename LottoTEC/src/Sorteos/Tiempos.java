
package Sorteos;


public class Tiempos extends AbstractSorteo {

    public Tiempos(String nombreSorteo, int codigoSorteo, int anno, int mes, int dia) {
        super(nombreSorteo, codigoSorteo, anno, mes, dia);
        //se agrega a la lista el numero principal y la jugada
        super.getNumeroGanador().insert((int) Math.floor(Math.random()*100));
        super.getNumeroGanador().insert((int) Math.floor(Math.random()*100));
    }

    @Override
    public void emitirGanador() {
    }
    
    
    
}
