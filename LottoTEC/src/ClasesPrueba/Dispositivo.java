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
public abstract class Dispositivo {
    private GregorianCalendar fecha;


    public Dispositivo(int anno, int mes, int dia ) {
        this.fecha.set(anno,mes,dia);
    }

    public GregorianCalendar getFecha() {
        return fecha;
    }

    public void setFecha(GregorianCalendar fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Dispositivo{" + "fecha=" + fecha + '}';
    }
    
    
    
}
