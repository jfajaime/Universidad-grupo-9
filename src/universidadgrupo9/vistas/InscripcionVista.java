package universidadgrupo9.vistas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import universidadgrupo9.accesoADatos.AlumnoData;
import universidadgrupo9.entidades.Alumno;
import universidadgrupo9.entidades.Materia;
import universidadgrupo9.accesoADatos.InscripcionData;

public class InscripcionVista extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel();
    InscripcionData inscripcionData = new InscripcionData();
    AlumnoData alumnosData = new AlumnoData();
    Alumno alumnoX = new Alumno();

    public InscripcionVista() {
        initComponents();
        cabecera();
        cargarComboBox();
        cargarDatos(recibirDatosJCAlumnos());
        jRMateriasInscriptas.setSelected(true);
    }

    private void cargarComboBox() {
        jCAlumnos.removeAllItems();
        ArrayList<Alumno> alumnos = (ArrayList<Alumno>) alumnosData.listarAlumnos();//Funciono casteandolo a ArrayList
        for (Alumno alumno : alumnos) {
            jCAlumnos.addItem(alumno.toString());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jRMateriasNOInscriptas = new javax.swing.JRadioButton();
        jRMateriasInscriptas = new javax.swing.JRadioButton();
        jCAlumnos = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTInscripcion = new javax.swing.JTable();
        jBInscribir = new javax.swing.JButton();
        jBBorrarInsripcion = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        setClosable(true);
        setTitle("Gestion de Inscripcion");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Formulario de Inscripcion");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel2.setText("Seleccioine un Alumno");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Listado de Materias");

        buttonGroup1.add(jRMateriasNOInscriptas);
        jRMateriasNOInscriptas.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jRMateriasNOInscriptas.setText("Materias No Inscriptas");
        jRMateriasNOInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRMateriasNOInscriptasActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRMateriasInscriptas);
        jRMateriasInscriptas.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jRMateriasInscriptas.setText("Materias Inscriptas");
        jRMateriasInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRMateriasInscriptasActionPerformed(evt);
            }
        });

        jCAlumnos.setMaximumRowCount(5);
        jCAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCAlumnosActionPerformed(evt);
            }
        });

        jTInscripcion.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTInscripcion);

        jBInscribir.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jBInscribir.setText("Inscribir");
        jBInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInscribirActionPerformed(evt);
            }
        });

        jBBorrarInsripcion.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jBBorrarInsripcion.setText("Borrar Inscripcion");
        jBBorrarInsripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBorrarInsripcionActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 21, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRMateriasInscriptas)
                                .addGap(196, 196, 196)
                                .addComponent(jRMateriasNOInscriptas))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jBBorrarInsripcion)
                                    .addGap(156, 156, 156)
                                    .addComponent(jBSalir))
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(31, 31, 31)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(29, 29, 29)
                                            .addComponent(jLabel3))
                                        .addComponent(jCAlumnos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(42, 42, 42))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBInscribir)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(200, 200, 200)
                                .addComponent(jLabel1)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jCAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRMateriasInscriptas)
                    .addComponent(jRMateriasNOInscriptas))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBInscribir)
                    .addComponent(jBBorrarInsripcion)
                    .addComponent(jBSalir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCAlumnosActionPerformed
        cargarDatos(recibirDatosJCAlumnos());
    }//GEN-LAST:event_jCAlumnosActionPerformed

    private void jRMateriasNOInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRMateriasNOInscriptasActionPerformed
        jRMateriasNOInscriptas.setSelected(true);
        cargarDatos(recibirDatosJCAlumnos());
    }//GEN-LAST:event_jRMateriasNOInscriptasActionPerformed

    private void jRMateriasInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRMateriasInscriptasActionPerformed
        jRMateriasInscriptas.setSelected(true);
        cargarDatos(recibirDatosJCAlumnos());
    }//GEN-LAST:event_jRMateriasInscriptasActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInscribirActionPerformed
        int filaS = jTInscripcion.getSelectedRow();
        if (filaS != -1) {
            //terminar de completar
        }
    }//GEN-LAST:event_jBInscribirActionPerformed

    private void jBBorrarInsripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBorrarInsripcionActionPerformed
        int filaS = jTInscripcion.getSelectedRow();
        if (filaS != -1) {
            modelo.removeRow(filaS);
            //inscripcionData.borrarInscripcionMateriaAlumno(recibirDatosJCAlumnos(), jTInscripcion.get);
        }
    }//GEN-LAST:event_jBBorrarInsripcionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBBorrarInsripcion;
    private javax.swing.JButton jBInscribir;
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<String> jCAlumnos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton jRMateriasInscriptas;
    private javax.swing.JRadioButton jRMateriasNOInscriptas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTInscripcion;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
    private void cabecera() {
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Año");
        jTInscripcion.setModel(modelo);
    }
    
    private int recibirDatosJCAlumnos(){
        int dni = 0;
        //Representación completa del alumno seleccionado
        String alumnoSeleccionado = jCAlumnos.getSelectedItem().toString();

        // Separa la cadena por espacios
        String[] partes = alumnoSeleccionado.split(" ");

        // La primera parte debe ser el DNI (suponiendo que la estructura es "DNI Apellido Nombre")
        String recuperarDni = partes[0];
       
        // Convierte el DNI en un valor numérico si es necesario
        dni = Integer.parseInt(recuperarDni); // Esto es opcional si necesitas el DNI como número

        // Ahora tienes el DNI en la variable 'dni' (o 'dniNumero' si lo convertiste a número)
        int id = alumnosData.buscaAlumnoPorDni(dni).getId();
        System.out.println(id);
        System.out.println(dni);
        return id;
    }

    private void cargarDatos(int id) {
        modelo.setRowCount(0);

        if (jRMateriasInscriptas.isSelected()) {
            List<Materia> materiasCursadas = inscripcionData.obtenerMateriasCursadas(id);
            for (Materia materia : materiasCursadas) {
                modelo.addRow(new Object[]{materia.getId(), materia.getNombre(), materia.getAnio()});
                System.out.println("ID " + materia.getId() + "\nnombre " + materia.getNombre() + "\naño " + materia.getAnio());
            }
        } else if (jRMateriasNOInscriptas.isSelected()) {
            List<Materia> materiasNoCursadas = inscripcionData.obtenerMateriasNOCursadas(id);
            for (Materia materia : materiasNoCursadas) {
                modelo.addRow(new Object[]{materia.getId(), materia.getNombre(), materia.getAnio()});
                System.out.println("ID " + materia.getId() + "\nnombre " + materia.getNombre() + "\naño " + materia.getAnio());
            }
        }
    }
}
