package controller;

public class Entrada {
    //private int cama;
    //private int reg;
    private int id;
    private String fechaIngreso;
    private String nombre;
    private int edad;
    private String diagnostico;
    //private boolean t;
    //private String hisOpAd;
    //private String cultivos;
    //private String pendientes;
/*
    public Entrada(int cama, int reg, int id, String fechaIngreso, String nombre, int edad, String diagnostico, boolean t, String hisOpAd, String cultivos, String pendientes) {
        this.cama = cama;
        this.reg = reg;
        this.id = id;
        this.fechaIngreso = fechaIngreso;
        this.nombre = nombre;
        this.edad = edad;
        this.diagnostico = diagnostico;
        this.t = t;
        this.hisOpAd = hisOpAd;
        this.cultivos = cultivos;
        this.pendientes = pendientes;
    }
*/
    
    
    
    public Entrada() {
    }

    public int getCama() {
        return cama;
    }

    public void setCama(int cama) {
        this.cama = cama;
    }

    public int getReg() {
        return reg;
    }

    public void setReg(int reg) {
        this.reg = reg;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
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

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public boolean isT() {
        return t;
    }

    public void setT(boolean t) {
        this.t = t;
    }

    public String getHisOpAd() {
        return hisOpAd;
    }

    public void setHisOpAd(String hisOpAd) {
        this.hisOpAd = hisOpAd;
    }

    public String getCultivos() {
        return cultivos;
    }

    public void setCultivos(String cultivos) {
        this.cultivos = cultivos;
    }

    public String getPendientes() {
        return pendientes;
    }

    public void setPendientes(String pendientes) {
        this.pendientes = pendientes;
    }
    
    
    
}
