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
        }catch (ClassNotFoundException | SQLException e){
            System.out.println("Error de conexion" + e);
        }
        
    }
    public static void cerrarConexion() {
        try {
            if (con != null) {
                con.close();
                System.out.println("Conexión cerrada");
            }
        }catch (SQLException e) {
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