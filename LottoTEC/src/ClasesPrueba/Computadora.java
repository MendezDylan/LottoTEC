/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesPrueba;

import java.util.GregorianCalendar;

/**
 *
 * @author Dylan
 */
public class Computadora extends Dispositivo {

    public Computadora(int anno, int mes, int dia) {
        super(anno, mes, dia);
    }

    @Override
    public String toString() {
        return "Computadora{" + '}';
    }


    
}
