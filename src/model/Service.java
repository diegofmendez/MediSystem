package model;

import controller.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Service {
    
    public static void main(String[] args) {
        //new Login().setVisible(true);
        //new Spreadsheet().setVisible(true);
        
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Libro> libros = new ArrayList<Libro>();
        
        Libro libro1 = new Libro("libro1");
        Libro libro2 = new Libro("ultimo libro");
        libros.add(libro1);
        libros.add(libro2);
        
        Hoja hoja1 = new Hoja();
        Hoja hoja2 = new Hoja();
        libro1.getHojas().add(hoja1);
        libro1.getHojas().add(hoja2);
        
        Entrada entrada1 = new Entrada();
        Entrada entrada2 = new Entrada();
        Entrada entrada3 = new Entrada();
        
        hoja1.getEntradas().add(entrada1);
        hoja1.getEntradas().add(entrada2);
        hoja2.getEntradas().add(entrada3);
        
        System.out.println(hoja1.getEntradas().size());
        
        Libro libroSeleccionado = libros.get(libros.size()-1);
        
        boolean check = true;
        while (check) {
            System.out.println("Eliga una opción:");
            int var=tryInteger(scanner);
            switch (var) {
                case 1://Quiero elegir un libro
                    imprimirArrayList(libros);
                    System.out.println("Elija el libro que desea");
                    libroSeleccionado = elegirDeArrayList(libros, scanner);
                    break;
                case 2://Mostrar el libro
                    System.out.println(libroSeleccionado.getTitulo());
                    break;
                case 3: //Añadir libro
                    System.out.println("Nombrar libro");
                    String etiqueta = scanner.nextLine();
                    Libro libro = new Libro(etiqueta);
                    libros.add(libro);
                    break;
                case 4: //Borrar
                    imprimirArrayList(libros);
                    System.out.println("Borre uno de estos libros");
                    libros.remove(elegirDeArrayList(libros, scanner));
                    break;
                case 5://editar un libro
                    imprimirArrayList(libros);
                    System.out.println("Edite el nombre de alguno de estos libros");
                    
                default:
                    System.out.println("Salir");
                    check = false;
                    break;
            }
        }
    }    
    
    public void crearHoja(String dia, Libro libro){
        Hoja hoja = new Hoja(dia);
        libro.getHojas().add(hoja);
    }
    
    public static <T extends SubGrupo> void imprimirArrayList(ArrayList<T> arrayList){
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(i+1+". ");
            System.out.print(arrayList.get(i).getTitulo()+" ");
        }
    }
    
    public static int tryInteger(Scanner scanner){
        while (true){
            try{
                int numero = scanner.nextInt();
                scanner.nextLine();
                return numero;
            } catch (Exception e){
                System.out.println("Entrada no valida, ingrese un número");
                scanner.nextLine();
            }
        }    
    }
    
    public static <T extends SubGrupo> T elegirDeArrayList(ArrayList<T> arrayList, Scanner scanner){
        int eleccion = tryInteger(scanner);
        while(eleccion>arrayList.size()||eleccion<1){
            System.out.println("Valor no valido");
            eleccion = tryInteger(scanner);
        }
        return arrayList.get(eleccion-1);      
    }
    
}
