/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo9.vistas;

import javax.swing.JOptionPane;
import universidadgrupo9.accesoADatos.MateriaData;
import universidadgrupo9.entidades.Materia;

/**
 *
 * @author jfaja
 */
public class MateriaVista extends javax.swing.JInternalFrame {

    public MateriaVista() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTFCodigo = new javax.swing.JTextField();
        jTFNombre = new javax.swing.JTextField();
        jRadioBEstado = new javax.swing.JRadioButton();
        jBBuscar = new javax.swing.JButton();
        jBLimpiar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jTFAnioMateria = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Gestion de Materia");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Materia");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Codigo");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Año");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Estado");

        jRadioBEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioBEstadoActionPerformed(evt);
            }
        });

        jBBuscar.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jBBuscar.setText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jBLimpiar.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jBLimpiar.setText("Limpiar");
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });

        jBEliminar.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jBEliminar.setText("Eliminar");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jBGuardar.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBSalir.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioBEstado))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(18, 18, 18))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(24, 24, 24)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(49, 49, 49)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTFCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                            .addComponent(jTFNombre))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jBBuscar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTFAnioMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jBLimpiar)
                                .addGap(18, 18, 18)
                                .addComponent(jBEliminar)
                                .addGap(18, 18, 18)
                                .addComponent(jBGuardar)
                                .addGap(18, 18, 18)
                                .addComponent(jBSalir)))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTFAnioMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jRadioBEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBLimpiar)
                    .addComponent(jBEliminar)
                    .addComponent(jBGuardar)
                    .addComponent(jBSalir))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed

        try {
            int id = Integer.parseInt(jTFCodigo.getText());
            MateriaData md = new MateriaData();
            Materia mb = md.buscarMateria(id);

            if (mb == null) {
                JOptionPane.showMessageDialog(this, "No hay materia con ese codigo");

            } else {
                jTFCodigo.setText(String.valueOf(mb.getId()));
                jTFNombre.setText(mb.getNombre());
                jTFAnioMateria.setText(String.valueOf(mb.getAnio()));
                jRadioBEstado.setSelected(mb.isEstado()); // Establecer el radio button como seleccionado
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Error en el numero de codigo -" + ex.getMessage());
        }


    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed

        jTFCodigo.setText("");
        jTFNombre.setText("");
        jTFAnioMateria.setText("");
        jRadioBEstado.setSelected(false);

    }//GEN-LAST:event_jBLimpiarActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed

        try {
            int id = Integer.parseInt(jTFCodigo.getText());
            MateriaData md = new MateriaData();
            md.eliminarMateria(id);

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Error en el numero de codigo -" + ex.getMessage());
        }
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed

        try {
            if (jTFCodigo.getText().isEmpty()) {

                if (jTFNombre.getText().isEmpty() || jTFAnioMateria.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Hay campos vacios");

                } else {

                    Materia mat = new Materia(jTFNombre.getText(), Integer.parseInt(jTFAnioMateria.getText()), true);
                    MateriaData md = new MateriaData();
                    md.guardarMateria(mat);
                    jTFCodigo.setText("");
                    jTFNombre.setText("");
                    jTFAnioMateria.setText("");
                    jRadioBEstado.setSelected(false);

                }

            } else {

                if (jTFNombre.getText().isEmpty() || jTFAnioMateria.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Hay campos vacios");

                } else {
                    Materia mat = new Materia(Integer.parseInt(jTFCodigo.getText()), jTFNombre.getText(), Integer.parseInt(jTFAnioMateria.getText()), jRadioBEstado.isSelected());
                    MateriaData md = new MateriaData();
                    md.modificarMateria(mat);
                    jTFCodigo.setText("");
                    jTFNombre.setText("");
                    jTFAnioMateria.setText("");
                    jRadioBEstado.setSelected(false);

                }

            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Error en el campo numerico");
        }
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jRadioBEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioBEstadoActionPerformed
        jRadioBEstado.setSelected(true);
    }//GEN-LAST:event_jRadioBEstadoActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed

        this.dispose();
    }//GEN-LAST:event_jBSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRadioBEstado;
    private javax.swing.JTextField jTFAnioMateria;
    private javax.swing.JTextField jTFCodigo;
    private javax.swing.JTextField jTFNombre;
    // End of variables declaration//GEN-END:variables
}
