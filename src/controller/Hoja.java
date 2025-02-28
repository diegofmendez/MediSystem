package controller;

import java.util.ArrayList;
import java.util.List;


public class Hoja{
    private String dia;
    
    ArrayList<Entrada> entradas = new ArrayList<Entrada>();
    
    public Hoja() {
    }
    public void appendEntrada(Entrada entrada){
        entradas.add(entrada);
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public ArrayList<Entrada> getEntradas() {
        return entradas;
    }

    public void setEntradas(ArrayList<Entrada> entradas) {
        this.entradas = entradas;
    }
    
    
}
