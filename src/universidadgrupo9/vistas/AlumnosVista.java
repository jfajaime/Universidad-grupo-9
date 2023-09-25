package universidadgrupo9.vistas;

import java.awt.HeadlessException;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JOptionPane;
import universidadgrupo9.accesoADatos.AlumnoData;
import universidadgrupo9.entidades.Alumno;

public class AlumnosVista extends javax.swing.JInternalFrame {

    public AlumnosVista() {
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
        jLabel6 = new javax.swing.JLabel();
        jTFDni = new javax.swing.JTextField();
        jTFApellido = new javax.swing.JTextField();
        jTFNombre = new javax.swing.JTextField();
        jBBuscarAlumnoXDNI = new javax.swing.JButton();
        jRadioBEstado = new javax.swing.JRadioButton();
        jBNuevo = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jBBuscarxApellido = new javax.swing.JButton();
        jBBuscarXNombre = new javax.swing.JButton();
        jTFidalumno = new javax.swing.JTextField();
        jBBuscarXid = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0)));
        setTitle("Gestion de Alumnos");
        setMinimumSize(new java.awt.Dimension(800, 350));
        setPreferredSize(new java.awt.Dimension(800, 350));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Alumno");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Documento:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Apellido");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Nombre");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Estado");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Fecha de Nacimiento");

        jBBuscarAlumnoXDNI.setText("Buscar");
        jBBuscarAlumnoXDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarAlumnoXDNIActionPerformed(evt);
            }
        });

        jBNuevo.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jBNuevo.setText("Limpiar");
        jBNuevo.setMaximumSize(new java.awt.Dimension(150, 30));
        jBNuevo.setMinimumSize(new java.awt.Dimension(150, 30));
        jBNuevo.setName(""); // NOI18N
        jBNuevo.setPreferredSize(new java.awt.Dimension(150, 30));
        jBNuevo.setSelected(true);
        jBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoActionPerformed(evt);
            }
        });

        jBEliminar.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jBEliminar.setText("Eliminar");
        jBEliminar.setMaximumSize(new java.awt.Dimension(150, 30));
        jBEliminar.setMinimumSize(new java.awt.Dimension(150, 30));
        jBEliminar.setName(""); // NOI18N
        jBEliminar.setPreferredSize(new java.awt.Dimension(150, 30));
        jBEliminar.setSelected(true);
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jBGuardar.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jBGuardar.setText("Guardar");
        jBGuardar.setMaximumSize(new java.awt.Dimension(150, 30));
        jBGuardar.setMinimumSize(new java.awt.Dimension(150, 30));
        jBGuardar.setName(""); // NOI18N
        jBGuardar.setPreferredSize(new java.awt.Dimension(150, 30));
        jBGuardar.setSelected(true);
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBSalir.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jBSalir.setText("Salir");
        jBSalir.setMaximumSize(new java.awt.Dimension(150, 30));
        jBSalir.setMinimumSize(new java.awt.Dimension(150, 30));
        jBSalir.setName(""); // NOI18N
        jBSalir.setPreferredSize(new java.awt.Dimension(150, 30));
        jBSalir.setSelected(true);
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jBBuscarxApellido.setText("Buscar");
        jBBuscarxApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarxApellidoActionPerformed(evt);
            }
        });

        jBBuscarXNombre.setText("Buscar");
        jBBuscarXNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarXNombreActionPerformed(evt);
            }
        });

        jBBuscarXid.setText("Buscar");
        jBBuscarXid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarXidActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Legajo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioBEstado)))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFNombre)
                            .addComponent(jTFDni)
                            .addComponent(jTFApellido)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jTFidalumno, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBBuscarAlumnoXDNI)
                            .addComponent(jBBuscarxApellido, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBBuscarXNombre)
                            .addComponent(jBBuscarXid)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jBNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(186, 186, 186)
                                .addComponent(jBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTFDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBBuscarAlumnoXDNI)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTFApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBBuscarxApellido)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBBuscarXNombre)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTFidalumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBBuscarXid)
                        .addComponent(jLabel7))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel6)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioBEstado)
                            .addComponent(jLabel5))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBBuscarAlumnoXDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarAlumnoXDNIActionPerformed

        try {
            int dni = Integer.parseInt(jTFDni.getText());
            AlumnoData alumnoData = new AlumnoData();
            Alumno alumno = alumnoData.buscaAlumnoPorDni(dni);

            if (alumno != null) {
                jTFDni.setText(Integer.toString(alumno.getDni()));
                jTFidalumno.setText(Integer.toString(alumno.getId()));
                jTFApellido.setText(alumno.getApellido());
                jTFNombre.setText(alumno.getNombre());
                jRadioBEstado.setSelected(alumno.isEstado());
                java.util.Date fechaNacimiento = java.sql.Date.valueOf(alumno.getFechaN());
                jDateChooser1.setDate(fechaNacimiento);
            } else {
                limpiar();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error: Ingresa un número válido en el campo DNI  " + e.getMessage());
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(this, "Error: Ocurrió un problema al buscar al alumno" + e.getMessage());
        }
    }//GEN-LAST:event_jBBuscarAlumnoXDNIActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        try {
            if (jTFidalumno.getText().isEmpty()) {

                if (jTFDni.getText().isEmpty() || jTFApellido.getText().isEmpty() || jTFNombre.getText().isEmpty() || jDateChooser1.getDate() == null) {
                    JOptionPane.showMessageDialog(this, "Error: Uno o más campos están vacíos");

                } else {

                    int dni = Integer.parseInt(jTFDni.getText());
                    String apellido = jTFApellido.getText();
                    String nombre = jTFNombre.getText();
                    java.util.Date fechaNacimientoUtil = (java.util.Date) jDateChooser1.getDate();
                    LocalDate fechaNacimiento = fechaNacimientoUtil.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                    boolean estado = true;

                    Alumno nuevoAlumno = new Alumno(dni, apellido, nombre, fechaNacimiento, estado);
                    AlumnoData alumnoData = new AlumnoData();
                    alumnoData.guardarAlumno(nuevoAlumno);
                    limpiar();

                }
            } else {

                if (jTFDni.getText().isEmpty() || jTFApellido.getText().isEmpty() || jTFNombre.getText().isEmpty() || jDateChooser1.getDate() == null) {
                    JOptionPane.showMessageDialog(this, "Error: Uno o más campos están vacíos");

                } else {
                    int id = Integer.parseInt(jTFidalumno.getText());
                    int dni = Integer.parseInt(jTFDni.getText());
                    String apellido = jTFApellido.getText();
                    String nombre = jTFNombre.getText();
                    java.util.Date fechaNacimientoUtil = (java.util.Date) jDateChooser1.getDate();
                    LocalDate fechaNacimiento = fechaNacimientoUtil.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                    boolean estado = jRadioBEstado.isSelected();

                    Alumno nuevoAlumno = new Alumno(id, dni, apellido, nombre, fechaNacimiento, estado);
                    AlumnoData alumnoData = new AlumnoData();
                    alumnoData.modificarAlumno(nuevoAlumno);

                    limpiar();
                }
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Hay algún error en los campos numéricos -" + ex.getMessage());
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(this, "Error: Ocurrió un problema al buscar al alumno" + e.getMessage());

        }
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed

        try {

            int dni = Integer.parseInt(jTFDni.getText());

            if (!jTFDni.getText().matches("\\d+")) {
                throw new Exception("El campo DNI debe ser un número entero");
            }

            AlumnoData alumnoData = new AlumnoData();
            alumnoData.eliminarAlumno(dni);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El campo DNI está vacío" + e);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error imprevisto!!!" + e.getMessage());
        }
        limpiar();
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jBBuscarXNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarXNombreActionPerformed

        String nombre = jTFNombre.getText();
        AlumnoData alumnoData = new AlumnoData();
        Alumno alumno = alumnoData.buscarAlumno(nombre);

        if (alumno != null) {
            jTFDni.setText(Integer.toString(alumno.getDni()));
            jTFidalumno.setText(Integer.toString(alumno.getId()));
            jTFApellido.setText(alumno.getApellido());
//            jTFNombre.setText(alumno.getNombre()); para que lo voy a pedir si lo estoy escribiendo pa buscar
            jRadioBEstado.setSelected(alumno.isEstado());

            // Convierte la fecha de nacimiento a un objeto java.util.Date
            java.util.Date fechaNacimiento = java.sql.Date.valueOf(alumno.getFechaN());
            jDateChooser1.setDate(fechaNacimiento);

        } else {                // Si no se encontró al alumno
            JOptionPane.showMessageDialog(this, "Alumno no encontrado");
            limpiar();
        }

    }//GEN-LAST:event_jBBuscarXNombreActionPerformed

    private void jBBuscarxApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarxApellidoActionPerformed
        // Obtén el nombre ingresado en el campo de texto
        String apellido = jTFApellido.getText();

        // Crea una instancia de AlumnoData 
        AlumnoData alumnoData = new AlumnoData();

        // Llama al método buscarAlumnoPorNombre de AlumnoData para obtener los datos del alumno
        Alumno alumno = alumnoData.buscarApellido(apellido);

        if (alumno != null) {

            // Si se encontró al alumno, muestra sus datos en los campos del formulario             
            jTFDni.setText(Integer.toString(alumno.getDni()));
            jTFidalumno.setText(Integer.toString(alumno.getId()));
//            jTFApellido.setText(alumno.getApellido());
            jTFNombre.setText(alumno.getNombre());
            jRadioBEstado.setSelected(alumno.isEstado());
            // Convierte la fecha de nacimiento a un objeto java.util.Date
            java.util.Date fechaNacimiento = java.sql.Date.valueOf(alumno.getFechaN());
            jDateChooser1.setDate(fechaNacimiento);

        } else {                // Si no se encontró al alumno
            JOptionPane.showMessageDialog(this, "Alumno no encontrado");
            limpiar();
        }

    }//GEN-LAST:event_jBBuscarxApellidoActionPerformed

    private void jBBuscarXidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarXidActionPerformed
        try {
            int id = Integer.parseInt(jTFidalumno.getText());

            // Crea una instancia de AlumnoData 
            AlumnoData alumnoData = new AlumnoData();

            // Llama al método buscarAlumnoPorDNI de AlumnoData para obtener los datos del alumno
            Alumno alumno = alumnoData.buscarXidAlumno(id);

            if (alumno != null) {
                // Si se encontró al alumno, muestra sus datos en los campos del formulario
//                jTFidalumno.setText(Integer.toString(alumno.getId())); en serio para que lo pedi???????
                jTFDni.setText(Integer.toString(alumno.getDni()));
                jTFApellido.setText(alumno.getApellido());
                jTFNombre.setText(alumno.getNombre());
                jRadioBEstado.setSelected(alumno.isEstado());
                // Convierte la fecha de nacimiento a un objeto java.util.Date
                java.util.Date fechaNacimiento = java.sql.Date.valueOf(alumno.getFechaN());
                jDateChooser1.setDate(fechaNacimiento);

            } else {                // Si no se encontró al alumno
                JOptionPane.showMessageDialog(this, "Alumno no encontrado");
               limpiar();
            }
        } catch (NumberFormatException e) {//si no hay numeros
            JOptionPane.showMessageDialog(this, "Error: Ingresa un número válido en el campo DNI  " + e.getMessage());
        } catch (HeadlessException e) {//captura lo que sea que este mal
            JOptionPane.showMessageDialog(this, "Error: Ocurrió un problema al buscar al alumno" + e.getMessage());
        }

    }//GEN-LAST:event_jBBuscarXidActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed
       limpiar();
    }//GEN-LAST:event_jBNuevoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscarAlumnoXDNI;
    private javax.swing.JButton jBBuscarXNombre;
    private javax.swing.JButton jBBuscarXid;
    private javax.swing.JButton jBBuscarxApellido;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JButton jBSalir;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jRadioBEstado;
    private javax.swing.JTextField jTFApellido;
    private javax.swing.JTextField jTFDni;
    private javax.swing.JTextField jTFNombre;
    private javax.swing.JTextField jTFidalumno;
    // End of variables declaration//GEN-END:variables
    public void limpiar(){
         jTFDni.setText("");
        jTFidalumno.setText("");
        jTFApellido.setText("");
        jTFNombre.setText("");
        jRadioBEstado.setSelected(false);
        jDateChooser1.setDate(null);
    }
}
