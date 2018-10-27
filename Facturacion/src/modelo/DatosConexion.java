/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Jose Rodolfo
 */
public class DatosConexion {
    
    private String puerto;
    private String usuario;
    private String contrasenia;
    private String direcionIP;
    private String nombreBD;
    
    public DatosConexion(){
        this.puerto = "";
        this.usuario = "";
        this.contrasenia = "";
        this.direcionIP = "";
        this.nombreBD = "";
    }

    public DatosConexion(String puerto, String usuario, String contrasenia, String direcionIP, String nombreBD){
        this.puerto = puerto;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.direcionIP = direcionIP;
        this.nombreBD = nombreBD;
    }//Fin del constructor

    public String getPuerto() {
        return puerto;
    }

    public void setPuerto(String puerto) {
        this.puerto = puerto;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getDirecionIP() {
        return direcionIP;
    }

    public void setDirecionIP(String direcionIP) {
        this.direcionIP = direcionIP;
    }

    public String getNombreBD() {
        return nombreBD;
    }

    public void setNombreBD(String nombreBD) {
        this.nombreBD = nombreBD;
    }
    
}//Fin de la clase
