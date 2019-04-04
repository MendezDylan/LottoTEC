
package Sorteos;


public class Bingo extends AbstractSorteo{

    public Bingo(String nombreSorteo, int codigoSorteo, int anno, int mes, int dia) {
        super(nombreSorteo, codigoSorteo, anno, mes, dia);
        //se guarda en la lista los 9 numeros ganadores
        for(int i=0; i<9; i++){
            super.getNumeroGanador().insert((int) Math.floor(Math.random()*10));
        }
    }

    @Override
    public void emitirGanador() {
    }
    
}
