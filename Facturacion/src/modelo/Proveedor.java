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
    private String direecion;
    private String productos;

    public Proveedor(String cedula, String nombreEmpresa, String direecion, String productos) {
        this.cedula = cedula;
        this.nombreEmpresa = nombreEmpresa;
        this.direecion = direecion;
        this.productos = productos;
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

    public String getDireecion() {
        return direecion;
    }

    public void setDireecion(String direecion) {
        this.direecion = direecion;
    }

    public String getProductos() {
        return productos;
    }

    public void setProductos(String productos) {
        this.productos = productos;
    }

    
     
     
    
    
}
