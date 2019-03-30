
import Sorteos.EnumSorteo;
import Sorteos.Loteria;
import Sorteos.Lotto;
import Estructuras.DoublyLinkedList;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.Locale;
import sun.util.resources.LocaleData;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dylan
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //RANDOM
        System.out.println("NUMERO RANDOM 0-99: "+(int) Math.floor(Math.random()*100));
        //FECHA
        GregorianCalendar cal = new GregorianCalendar(2019, 10, 25);
        System.out.println("FECHA: "+cal.getTime());
        
        
        Lotto lotto=new Lotto(2019, 11, 25);
        System.out.println(lotto.getCal().getTime());
        
        Loteria loteria=new Loteria(2019, 11, 25, 1);
        System.out.println(loteria.getEmisionSorteo().toString());
        
        

    }
}