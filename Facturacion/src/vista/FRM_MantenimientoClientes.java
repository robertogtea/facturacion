/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Controlador_FRM_Clientes;
import modelo.Cliente;
import modelo.ConexionBD;

/**
 *
 * @author Jose Rodolfo
 */
public class FRM_MantenimientoClientes extends javax.swing.JFrame {

    /**
     * Creates new form FRM_MantenimientoClientes
     */
    Controlador_FRM_Clientes controlador;
    
    public FRM_MantenimientoClientes(ConexionBD conexion) {
        //setUndecorated(true);     Para quitar bordes de ventana en netbeans
        initComponents();
        setLocationRelativeTo(null);
        controlador = new Controlador_FRM_Clientes(conexion, this);
        jP_Botones1.agregarEventosClientes(controlador);
        jP_InformacionClientes1.agregarEventosClientes(controlador);
    }//Fin del constructor
    
    public void limpiarVentana(){
        //jP_InformacionClientes1.limpiarVentana();
        //jP_Botones1.estadoInicial();
    }//Fin del metodo limpiarVentana
    
    public String obtenerCedula(){
        return jP_InformacionClientes1.obtenerCedula();
    }//Fin del metodo obtenerCedula
    
    public void mostrarInformacionCliente(Cliente cliente){
        jP_InformacionClientes1.mostrarInformacionCliente(cliente);
    }//Fin del metodo
    
    public void habilitarModificarEliminar(){
        jP_Botones1.habilitarModificarEliminar();
    }//Fin del metodo
    
    public void habilitarAgregar(){
        jP_InformacionClientes1.habilitarAgregar();
        jP_Botones1.habilitarAgregar();
    }//Fin del metodo 
    
    public Cliente getCliente(){
        //return jP_InformacionClientes1.getCliente();
        return new Cliente();
    }//Fin del metodo getCliente    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jP_InformacionClientes1 = new vista.JP_InformacionClientes();
        jP_Botones1 = new vista.JP_Botones();

        setTitle("Registro Clientes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jP_InformacionClientes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jP_Botones1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jP_InformacionClientes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jP_Botones1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private vista.JP_Botones jP_Botones1;
    private vista.JP_InformacionClientes jP_InformacionClientes1;
    // End of variables declaration//GEN-END:variables
}//Fin de la clase
