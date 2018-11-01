/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.ConexionBD;
import vista.FRM_MantenimientoProveedores;

/**
 *
 * @author Geovanny
 */
public class Controlador_FRM_MantenimientoProveedores implements ActionListener {
ConexionBD conexion;
FRM_MantenimientoProveedores frm_MantenimientoProveedores;
    public Controlador_FRM_MantenimientoProveedores(ConexionBD conexion,FRM_MantenimientoProveedores frm_MantenimientoProveedores ) 
    {
        this.conexion=conexion;
        this.frm_MantenimientoProveedores= frm_MantenimientoProveedores;
    }//constructor
    
    public void actionPerformed(ActionEvent ev)
    {
        
        if(ev.getActionCommand().equals("Consultar"))
        {
            System.out.println("Consultar");
            if(conexion.consultarProveedor(frm_MantenimientoProveedores.obtenerCedula())){
                frm_MantenimientoProveedores.mostrarInformacion(conexion.getProveedorTemporal());
                frm_MantenimientoProveedores.habilitarModificarEliminar();
            }else
            {
                frm_MantenimientoProveedores.habilitarAgregar();
            }
           
        }//evento buscar
        
        if(ev.getActionCommand().equals("Agregar"))
        {
            System.out.println("Agregar");
            conexion.registrarProveedor(frm_MantenimientoProveedores.getProveedor());
            frm_MantenimientoProveedores.limpiarVentana();
            
        }//evento agregar
        
        if(ev.getActionCommand().equals("Modificar"))
        {
            System.out.println("Modificar");
            conexion.modificarProveedor(frm_MantenimientoProveedores.getProveedor());
            frm_MantenimientoProveedores.limpiarVentana();
            
        }//evento modificar
        
        if(ev.getActionCommand().equals("Eliminar"))
        {
            System.out.println("Eliminar");
            conexion.eliminarProveedor(frm_MantenimientoProveedores.obtenerCedula());
            frm_MantenimientoProveedores.limpiarVentana();
            
        }//evento eliminar
        
    }
    
}
