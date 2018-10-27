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
public class Cliente {
    
    String cedula;
    String nombreCompleto;
    char genero;
    String fechaNacimiento;
    String direccion;
    String numeroTelefono[];
    String correoElectronico;

    public Cliente() {
        this.cedula = "";
        this.nombreCompleto = "";
        this.genero = ' ';
        this.fechaNacimiento = "";
        this.direccion = "";
        this.numeroTelefono = new String[2];
        this.correoElectronico = "";
    }

    public Cliente(String cedula, String nombreCompleto, char genero, String fechaNacimiento, String direccion, String[] numeroTelefono, String correoElectronico) {
        this.cedula = cedula;
        this.nombreCompleto = nombreCompleto;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.numeroTelefono = numeroTelefono;
        this.correoElectronico = correoElectronico;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String[] getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String[] numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    
}//Fin de la clase
