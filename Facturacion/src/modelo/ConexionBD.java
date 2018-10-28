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
    
    //Aquí empieza módulo de Clientes sobre la base de datos (Rodo)
    
    public boolean consultarCliente(String cedula){
        boolean encontrado = false;       
        
        return encontrado;
    }//Fin del metodo consultarCliente
    
    public boolean registrarCliente(Cliente cliente){
        boolean ejecuto = false;
        
        return ejecuto;
    }//Fin del  medodo agregarCliente
    
    public boolean modificarCliente(Cliente cliente){
        boolean ejecuto = false;
        
        return ejecuto;
    }//Fin del metodo modificarCliente
    
    public boolean eliminarCliente(String cedula){
        boolean ejecuto = false;
        
        return ejecuto;
    }//Fin del metodo
    
    public Cliente getClienteTemporal(){
        return clienteTemporal;
    }//Fin del metodo getClienteTemporal 
    
    //Aquí termina el módulo de clientes
    
}//Fin de la clase