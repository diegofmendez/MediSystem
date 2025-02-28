/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;
import view.*;
import controller.*;
import java.util.Scanner;
public class Service {
    public static void main(String[] args) {
        //new Login().setVisible(true);
        //new Spreadsheet().setVisible(true);
        
        Scanner s = new Scanner(System.in);

        Libro libro = new Libro();
        Hoja hoja = new Hoja();
        Entrada entrada = new Entrada(0, 0, 0, "fechaingreso", "Diego", 20, "fallecimiento", false, "T", "Fungi", "dormido hasta la venida del señor");
        hoja.appendEntrada(entrada);
    
    }
}
