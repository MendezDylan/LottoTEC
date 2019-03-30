/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorteos;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Dylan
 */
public class Lotto {
    private GregorianCalendar cal;

    public Lotto(int anno, int mes, int dia) {
        GregorianCalendar calTemp=new GregorianCalendar(anno+1900, mes-1, dia);
        this.cal=calTemp;
    }

    public GregorianCalendar getCal() {
        return cal;
    }
    
    

    
    
    
    
    
    
    
}
