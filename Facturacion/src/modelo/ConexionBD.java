package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexionBD {
    
    Connection con = null;
    Cliente clienteTemporal;
    
    public ConexionBD(){
    }
    
    public boolean realizarConexion(DatosConexion datosConexion){
        boolean encontrado = false;
        try {
            String url = "jdbc:mysql://"+datosConexion.getDirecionIP()+":"+datosConexion.getPuerto()+"/"+datosConexion.getNombreBD()+"";
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection(url, datosConexion.getUsuario(), datosConexion.getContrasenia());
            System.out.println("Conexión Realizada");
            encontrado = true;
        } catch (Exception e) {
            System.err.println("Cannot connect to database server");
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
        return encontrado;
    }//Fin del metodo
    
    public boolean consultarCliente(String cedula){
        boolean encontrado = false;
        
        
        return encontrado;
    }//Fin del metodo consultarCliente
    
    public boolean agregarCliente(){
        boolean agregado = false;
        
        return agregado;
    }//Fin del  medodo agregarCliente
    
    public Cliente getClienteTemporal(){
        return clienteTemporal;
    }//Fin del metodo getClienteTemporal 
    
}//Fin de la clase