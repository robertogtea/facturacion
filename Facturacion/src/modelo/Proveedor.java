/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Geovanny
 */
public class Proveedor {
    
    
    private String cedula;
    private String nombreEmpresa;
    private String telefono;
    private String correo;
    private String nombreProveedor;

    public Proveedor(String cedula, String nombreEmpresa, String telefono, String correo, String nombreProveedor) {
        this.cedula = cedula;
        this.nombreEmpresa = nombreEmpresa;
        this.telefono = telefono;
        this.correo = correo;
        this.nombreProveedor = nombreProveedor;
    }
    
     public Proveedor() {
        this.cedula = "";
        this.nombreEmpresa = "";
        this.telefono = "";
        this.correo = "";
        this.nombreProveedor = "";
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }
     
     
    
    
}
