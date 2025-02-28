package controller;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dfmen
 */
public class Libro implements SubGrupo{
    private String etiqueta;

    ArrayList<Hoja> hojas = new ArrayList<Hoja>();
    
    public Libro() {
    }    

    public Libro(String etiqueta) {
        this.etiqueta = etiqueta;
    }
    
    @Override
    public String getTitulo() {
        return etiqueta;
    }
    
    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public ArrayList<Hoja> getHojas() {
        return hojas;
    }

    public void setHojas(ArrayList<Hoja> hojas) {
        this.hojas = hojas;
    }
    
    
}
