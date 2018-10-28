/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.ConexionBD;
import vista.FRM_MantenimientoClientes;
import vista.FRM_ReporteClientes;

/**
 *
 * @author Jose Rodolfo
 */
public class Controlador_FRM_Clientes implements ActionListener{
    
    ConexionBD conexion;
    FRM_MantenimientoClientes frm_MantenimientoClientes;
    FRM_ReporteClientes frm_ReporteClientes;

    public Controlador_FRM_Clientes(ConexionBD conexion, FRM_MantenimientoClientes frm_MantenimientoClientes) {
        this.conexion = conexion;
        this.frm_MantenimientoClientes = frm_MantenimientoClientes;
    }//Fin de la clase
    
    public void actionPerformed(ActionEvent evento) {
        
        if(evento.getActionCommand().equals("Consultar")){
            if(conexion.consultarCliente(frm_MantenimientoClientes.obtenerCedula())){
                frm_MantenimientoClientes.mostrarInformacionCliente(conexion.getClienteTemporal());
                frm_MantenimientoClientes.habilitarModificarEliminar();
            }else
                frm_MantenimientoClientes.habilitarAgregar();
        }//Fin del metodo consultar
        
        if(evento.getActionCommand().equals("Agregar")){
            if(conexion.registrarCliente(frm_MantenimientoClientes.getCliente())){
                frm_MantenimientoClientes.limpiarVentana();
            }//Fin del if
            
        }//Fin del metodo agregar
        
        if(evento.getActionCommand().equals("Modificar")){
            if(conexion.modificarCliente(frm_MantenimientoClientes.getCliente()));
                frm_MantenimientoClientes.limpiarVentana();
        }//Fin del metodo modificar
        
        if(evento.getActionCommand().equals("Eliminar")){
            if(conexion.eliminarCliente(frm_MantenimientoClientes.obtenerCedula())) ;
                frm_MantenimientoClientes.limpiarVentana();
        }//Fin del metodo eliminar
        
        if(evento.getActionCommand().equals("Reporte")){
            frm_ReporteClientes = new FRM_ReporteClientes();
            frm_ReporteClientes.setVisible(true);
        }//Fin del metodo reporte
        
    }//Fin del método eventos
    
}//Fin de la clase
