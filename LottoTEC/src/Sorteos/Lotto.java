package Sorteos;


public class Lotto<X> extends AbstractSorteo {

    public Lotto(String nombreSorteo, int codigoSorteo, int anno, int mes, int dia) {
        super(nombreSorteo, codigoSorteo, anno, mes, dia);
        //se agrega a la lista los 7 numeros ganadores
        for(int i=0; i<7; i++){
            super.getNumeroGanador().insert((int) Math.floor(Math.random()*10));
        }
    }

    @Override
    public void emitirGanador() {
    }
    

    
}
