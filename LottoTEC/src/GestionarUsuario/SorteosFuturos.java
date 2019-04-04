
package GestionarUsuario;

import java.util.GregorianCalendar;

public class SorteosFuturos {
    private String tipoSorteo;
    private GregorianCalendar fechaSorteo;
    private int precio;

    public SorteosFuturos(String tipoSorteo, GregorianCalendar fechaSorteo, int precio) {
        this.tipoSorteo = tipoSorteo;
        this.fechaSorteo = fechaSorteo;
        this.precio = precio;
    }

    public String getTipoSorteo() {
        return tipoSorteo;
    }

    public GregorianCalendar getFechaSorteo() {
        return fechaSorteo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setTipoSorteo(String tipoSorteo) {
        this.tipoSorteo = tipoSorteo;
    }

    public void setFechaSorteo(GregorianCalendar fechaSorteo) {
        this.fechaSorteo = fechaSorteo;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
}
