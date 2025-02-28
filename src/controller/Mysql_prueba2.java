package controller;

import java.sql.*;
import javax.swing.JOptionPane;

public class Mysql_prueba2 {

    private static Connection con;
    
    private static final String driver="com.mysql.jdbc.Driver";
    private static final String user="root";
    private static final String pass="";
    
    private static final String url="jdbc:mysql://localhost:3306/proyecto";

    public static void conectar() {
      
        con=null;
        try{
            Class.forName(driver);
            // Nos conectamos al gestor de bd
            con= DriverManager.getConnection(url, user, pass);
            // Si la conexion fue exitosa mostramos un mensaje de conexion exitosa
            if (con!=null){
                System.out.println("Conexion establecida");
            }
        }
        // Si la conexion NO fue exitosa mostramos un mensaje de error
        catch (ClassNotFoundException | SQLException e){
            System.out.println("Error de conexion" + e);
        }
        
        
        // Se procede a realizar las operaciones correspondientes para la insercción de datos
        
        //Inserccion insertar = new Inserccion();
        //insertar.guardar(con, Nombre, Cedula,Correo);
        
        //Inserccion insertar = new Inserccion();
        //insertar.guardar(con);
        
        //insertar.recuperarPorId(con, 1);
        
        /* 
    
        Debido a las posibles excepciones el código de ingreso se 
        debe poner en un TRY, de esta forma con el objeto 
        Connection, logramos establecer la conexión entre la 
        BD creada y NetBeans

    */    

    }
    public static void cerrarConexion() {
        try {
            if (con != null) {
                con.close();
                System.out.println("Conexión cerrada");
            }
        } catch (SQLException e) {
            System.out.println("Error al cerrar la conexión: " + e.getMessage());
        }
    }

    public static Connection getCon() {
        return con;
    }
    
    public static boolean probarConexion(){
        if (Mysql_prueba2.getCon() == null){
            JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos.","Error", JOptionPane.ERROR_MESSAGE);
        return false;
        }else{
            return true;
        }  
    }
    
    


}
    

