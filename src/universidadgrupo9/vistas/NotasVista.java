package universidadgrupo9.vistas;

import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import universidadgrupo9.accesoADatos.AlumnoData;
import universidadgrupo9.accesoADatos.InscripcionData;
import universidadgrupo9.accesoADatos.MateriaData;
import universidadgrupo9.entidades.Alumno;
import universidadgrupo9.entidades.Inscripcion;
import universidadgrupo9.entidades.Materia;

public class NotasVista extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel();
    AlumnoData alumnosData = new AlumnoData();
    MateriaData mat = new MateriaData();
    InscripcionData inscripcionData = new InscripcionData();
    Inscripcion inscripcion = new Inscripcion();
    Materia materia = new Materia();

    public NotasVista() {
        initComponents();
        cabecera();
        cargarComboBox();
        cargarDatosATabla();
    }

    private void cargarComboBox() {
        DefaultComboBoxModel<Alumno> modeloCB = new DefaultComboBoxModel<>();
        ArrayList<Alumno> alumnos = (ArrayList<Alumno>) alumnosData.listarAlumnos(); // Supongamos que obtienes la lista de alumnos de alguna fuente

        for (Alumno alumno : alumnos) {
            modeloCB.addElement(alumno); // Agrega el objeto Alumno al modelo
        }

        jCNotas.setModel(modeloCB); // Asigna el modelo al JComboBox

        // Configura un renderer personalizado para mostrar la representación personalizada en el JComboBox
        jCNotas.setRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                if (value instanceof Alumno) {
                    Alumno alumno = (Alumno) value;
                    String nombreCompleto = alumno.getDni() + " - " + alumno.getApellido() + ", " + alumno.getNombre();
                    value = nombreCompleto;
                }
                return super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jCNotas = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTNotas = new javax.swing.JTable();
        jBguardar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setTitle("Gestion de Notas");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Carga de Notas");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel2.setText("Seleccione un Alumno");

        jCNotas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCNotasItemStateChanged(evt);
            }
        });
        jCNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCNotasActionPerformed(evt);
            }
        });

        jTNotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTNotas);

        jBguardar.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jBguardar.setText("Guardar");
        jBguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBguardarActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jBguardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jCNotas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(jLabel1)
                .addContainerGap(155, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jCNotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBguardar)
                    .addComponent(jButton2))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCNotasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCNotasItemStateChanged

    }//GEN-LAST:event_jCNotasItemStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jCNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCNotasActionPerformed
        cargarDatosATabla();
    }//GEN-LAST:event_jCNotasActionPerformed

    private void jBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarActionPerformed
        if (jTNotas.getSelectedRow() != -1) {
            Alumno alumno = (Alumno) jCNotas.getSelectedItem();
            int filaS = jTNotas.getSelectedRow();
            int idA = alumno.getId();
            int idM = materia.getId();
            double notaM = Double.parseDouble(this.jTNotas.getValueAt(filaS, 2).toString());
            if (notaM >= 0 && notaM < 10.1) {
                inscripcionData.actualizarNota(idA, idM, notaM);
            } else {
                JOptionPane.showMessageDialog(this, "Nota fuera de rango\n"
                        + "su parametro debe se de 0 a 10");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No ha seleccionado registro");
        }
        cargarDatosATabla();
    }//GEN-LAST:event_jBguardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBguardar;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<Alumno> jCNotas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTNotas;
    // End of variables declaration//GEN-END:variables
    private void cabecera() {
        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre");
        modelo.addColumn("Nota");
        jTNotas.setModel(modelo);
    }

    private void cargarDatosATabla() {
        Alumno alumno = (Alumno) jCNotas.getSelectedItem();
        int id = alumno.getId();
        List<Inscripcion> inscripciones = inscripcionData.obtenerInscripcionesPorAlumno(id);
        modelo.setRowCount(0);
        for (Inscripcion insc : inscripciones) {
            materia = mat.buscarMateria(insc.getMateria().getId());
            modelo.addRow(new Object[]{insc.getId(), materia.getNombre(), insc.getNota()});
        }
    }
}
