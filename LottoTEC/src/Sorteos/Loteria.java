package Sorteos;

public class Loteria<X> extends AbstractSorteo{

    
public Loteria(String nombreSorteo, int codigoSorteo, int anno, int mes, int dia){
        super(nombreSorteo, codigoSorteo, anno, mes, dia);
        //se agrega a la lista el numero ganador 
        super.getNumeroGanador().insert((int) Math.floor(Math.random()*100));
    }

    @Override
    public void emitirGanador(){
        //aqui se realiza el sorteo con random
    }
    
}
