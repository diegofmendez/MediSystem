package controller;

import java.util.ArrayList;
import java.util.List;


public class Hoja implements SubGrupo{
    private String etiqueta;
    
    ArrayList<Entrada> entradas = new ArrayList<Entrada>();
    
    public Hoja() {
    }

    public Hoja(String etiqueta) {
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

    public ArrayList<Entrada> getEntradas() {
        return entradas;
    }

    public void setEntradas(ArrayList<Entrada> entradas) {
        this.entradas = entradas;
    }
    
    
}
