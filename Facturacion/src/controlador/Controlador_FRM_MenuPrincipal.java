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
import vista.FRM_MantenimientoUsuarios;
import vista.FRM_MenuPrincipal;

/**
 *
 * @author Roberto
 */
public class Controlador_FRM_MenuPrincipal implements ActionListener{
    
    FRM_MenuPrincipal frm_MenuPrincipal;
    FRM_MantenimientoUsuarios frm_MantenimientoUsuarios;
    ConexionBD conexion;
    FRM_MantenimientoClientes frm_MantenimientoClientes;
    
    public Controlador_FRM_MenuPrincipal(FRM_MenuPrincipal frm_MenuPrincipal){
        conexion=new ConexionBD();
        this.frm_MenuPrincipal=frm_MenuPrincipal;
        frm_MantenimientoUsuarios= new FRM_MantenimientoUsuarios();
        //conexion.realizarConexion();
    }
    public void actionPerformed(ActionEvent evento)
    {
        if(evento.getActionCommand().equals("Salir"))
        {
            System.exit(0);
        }
        if(evento.getActionCommand().equals("Login/CambiarUsuario"))
        {
            System.out.println("Login/CambiarUsuario");
        }
        if(evento.getActionCommand().equals("MantenimientoProductos"))
        {
            System.out.println("MantenimientoProductos");
        }
        if(evento.getActionCommand().equals("MantenimientoClientes")){
           frm_MantenimientoClientes = new FRM_MantenimientoClientes();
           this.frm_MantenimientoClientes.setVisible(true);
        }
        if(evento.getActionCommand().equals("MantenimientoProveedores"))
        {
            System.out.println("MantenimientoProveedores");
        }
        if(evento.getActionCommand().equals("MantenimientoUsuarios"))
        {
            frm_MantenimientoUsuarios.setVisible(true);
        }
        if(evento.getActionCommand().equals("Facturación"))
        {
            System.out.println("Facturación");
        }
        if(evento.getActionCommand().equals("Abrir Caja"))
        {
            System.out.println("Abrir Caja");
        }
        if(evento.getActionCommand().equals("Cerrar Caja"))
        {
            System.out.println("Cerrar Caja");
        }
        if(evento.getActionCommand().equals("ReporteProductos"))
        {
            System.out.println("ReporteProductos");
        }
        if(evento.getActionCommand().equals("ReporteClientes"))
        {
            System.out.println("ReporteClientes");
        }
        if(evento.getActionCommand().equals("ReporteProveedores"))
        {
            System.out.println("ReporteProveedores");
        }
        if(evento.getActionCommand().equals("ReporteVentasPorFecha"))
        {
            System.out.println("ReporteVentasPorFecha");
        }
        if(evento.getActionCommand().equals("Conexion"))
        {
            System.out.println("Conexion");
        }
        if(evento.getActionCommand().equals("Respaldar"))
        {
            System.out.println("Respaldar");
        }
        if(evento.getActionCommand().equals("Restaurar"))
        {
            System.out.println("Restaurar");
        }
        if(evento.getActionCommand().equals("Acerca de"))
        {
            System.out.println("Acerca de");
        }
        if(evento.getActionCommand().equals("Reporte de Errores"))
        {
            System.out.println("Reporte de Errores");
        }
    }
    
}
