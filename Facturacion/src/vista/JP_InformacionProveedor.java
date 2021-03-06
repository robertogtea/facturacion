/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import modelo.Proveedor;

/**
 *
 * @author Geovanny
 */
public class JP_InformacionProveedor extends javax.swing.JPanel {

    /**
     * Creates new form JP_InformacionProveedor
     */
    public JP_InformacionProveedor() {
        initComponents();
    } 
    
    public String obtenerCedula()
    {
        return jt_Cedula.getText();
    }
    
    public void limpiarVentana()
    {
        jt_Cedula.setText("");
        jt_NombreEmpresa.setText("");
        jta_Direccion.setText("");
        
        
        jt_Cedula.setEnabled(true);
        jt_NombreEmpresa.setEnabled(false);
        jta_Direccion.setEnabled(false);
       
        
    }
    
    public void mostrarInformacion(Proveedor proveedor)
    {
        jt_Cedula.setText(proveedor.getCedula());
        jt_NombreEmpresa.setText(proveedor.getNombreEmpresa());
        jta_Direccion.setText(proveedor.getDireecion());
    } 
    
    public void habilitarAgregar()
    {
        jt_Cedula.setEnabled(false);
        jt_NombreEmpresa.setEnabled(true);
        jta_Direccion.setEnabled(true);
    }
    
    public Proveedor getProveedor()
    {
        Proveedor proveedor= new Proveedor(jt_Cedula.getText(), jt_NombreEmpresa.getText(),jta_Direccion.getText());
        return proveedor;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jl_Cedula = new javax.swing.JLabel();
        jl_Nombre = new javax.swing.JLabel();
        jt_Cedula = new javax.swing.JTextField();
        jt_NombreEmpresa = new javax.swing.JTextField();
        jl_DireccionP = new javax.swing.JLabel();
        jl_Telefono = new javax.swing.JLabel();
        jt_Telefono = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jta_Direccion = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbl_Telefono = new javax.swing.JTable();
        jl_Correo = new javax.swing.JLabel();
        jt_Correo = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtbl_Correo = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        jl_Cedula.setText("Cedula:");

        jl_Nombre.setText("Nombre de la Empresa:");

        jt_NombreEmpresa.setEnabled(false);

        jl_DireccionP.setText("Dirección:");

        jl_Telefono.setText("Teléfono:");

        jt_Telefono.setEnabled(false);
        jt_Telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_TelefonoActionPerformed(evt);
            }
        });

        jta_Direccion.setColumns(20);
        jta_Direccion.setRows(5);
        jta_Direccion.setEnabled(false);
        jScrollPane2.setViewportView(jta_Direccion);

        jButton1.setText("Agregar");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Eliminar");
        jButton2.setEnabled(false);

        jtbl_Telefono.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtbl_Telefono.setEnabled(false);
        jScrollPane1.setViewportView(jtbl_Telefono);

        jl_Correo.setText("Correo:");

        jt_Correo.setEnabled(false);

        jtbl_Correo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtbl_Correo.setEnabled(false);
        jScrollPane3.setViewportView(jtbl_Correo);

        jButton3.setText("Agregar ");
        jButton3.setEnabled(false);

        jButton4.setText("Eliminar");
        jButton4.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_Nombre)
                    .addComponent(jl_Cedula)
                    .addComponent(jl_Telefono)
                    .addComponent(jl_Correo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jt_NombreEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(jt_Cedula)
                    .addComponent(jt_Telefono)
                    .addComponent(jt_Correo, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jl_DireccionP)
                                .addGap(24, 24, 24))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(27, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jt_Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_Cedula)
                            .addComponent(jl_DireccionP))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jt_NombreEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_Nombre))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_Telefono)
                            .addComponent(jt_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Correo)
                    .addComponent(jt_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jt_TelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_TelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_TelefonoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel jl_Cedula;
    private javax.swing.JLabel jl_Correo;
    private javax.swing.JLabel jl_DireccionP;
    private javax.swing.JLabel jl_Nombre;
    private javax.swing.JLabel jl_Telefono;
    private javax.swing.JTextField jt_Cedula;
    private javax.swing.JTextField jt_Correo;
    private javax.swing.JTextField jt_NombreEmpresa;
    private javax.swing.JTextField jt_Telefono;
    private javax.swing.JTextArea jta_Direccion;
    private javax.swing.JTable jtbl_Correo;
    private javax.swing.JTable jtbl_Telefono;
    // End of variables declaration//GEN-END:variables
}
