/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorteos;

/**
 *
 * @author Dylan
 */
public enum EnumSorteo {
    LOTERIA(0, "Loteria"), LOTTO(1,"Lotto"), BINGO(2,"Bingo"), TIEMPOS(3,"Tiempos");
    private int codigoSorteo;
    private String descripcionSorteo;

    public int getCodigoSorteo() {
        return codigoSorteo;
    }

    public String getDescripcionSorteo() {
        return descripcionSorteo;
    }

    public void setCodigoSorteo(int codigoSorteo) {
        this.codigoSorteo = codigoSorteo;
    }

    public void setDescripcionSorteo(String descripcionSorteo) {
        this.descripcionSorteo = descripcionSorteo;
    }

    private EnumSorteo(int codigoSorteo, String descripcionSorteo) {
        this.codigoSorteo = codigoSorteo;
        this.descripcionSorteo = descripcionSorteo;
    }
    
    
    
    
}
