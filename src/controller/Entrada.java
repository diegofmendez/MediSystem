package controller;

public class Entrada implements SubGrupo{
    
    private int id;
    private String nombre;
    private int edad;
    private String fecha;

    public Entrada() {
    }

    public Entrada(int id, String nombre, int edad, String fecha) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.fecha = fecha;
    }
    
    @Override
    public String getTitulo() {
        return nombre;
    }
    @Override
    public void setTitulo(String titulo) {
        this.nombre = titulo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
    
}
