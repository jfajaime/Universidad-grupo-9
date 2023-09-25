package universidadgrupo9.vistas;

import javax.swing.table.DefaultTableModel;
import universidadgrupo9.accesoADatos.MateriaData;
import universidadgrupo9.entidades.Materia;

public class ListadoDeMaterias extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    public ListadoDeMaterias() {
        initComponents();
        armarCabecera();
        listarMaterias();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTListaMaterias = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTBuscarPorNombre = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0)));
        setMinimumSize(new java.awt.Dimension(800, 350));
        setPreferredSize(new java.awt.Dimension(800, 350));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Listado de Materias");

        jTListaMaterias.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTListaMaterias.setModel(new javax.swing.table.DefaultTableModel(
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
        jTListaMaterias.setRowHeight(20);
        jScrollPane1.setViewportView(jTListaMaterias);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel2.setText("Busqueda por nombre");

        jTBuscarPorNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTBuscarPorNombreKeyReleased(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton1.setText("Salir");
        jButton1.setMaximumSize(new java.awt.Dimension(169, 30));
        jButton1.setMinimumSize(new java.awt.Dimension(169, 30));
        jButton1.setPreferredSize(new java.awt.Dimension(169, 30));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 798, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(jTBuscarPorNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTBuscarPorNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTBuscarPorNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTBuscarPorNombreKeyReleased
        borrarFilas();
        MateriaData md = new MateriaData();

        for (Materia mat : md.listarMaterias()) {

            if (mat.getNombre().toLowerCase().startsWith(jTBuscarPorNombre.getText().toLowerCase())) {

                modelo.addRow(new Object[]{
                    mat.getId(),
                    mat.getNombre(),
                    mat.getAnio(),
                    mat.isEstado()
                });
            }
        }
    }//GEN-LAST:event_jTBuscarPorNombreKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTBuscarPorNombre;
    private javax.swing.JTable jTListaMaterias;
    // End of variables declaration//GEN-END:variables

    private void listarMaterias() {
        MateriaData md = new MateriaData();
        for (Materia m : md.listarMaterias()) {
            modelo.addRow(new Object[]{
                m.getId(),
                m.getNombre(),
                m.getAnio(),
                m.isEstado()
            });
        }
    }

    private void armarCabecera() {
        modelo.addColumn("Id Materia");
        modelo.addColumn("Nombre");
        modelo.addColumn("Año");
        modelo.addColumn("Estado");
        jTListaMaterias.setModel(modelo);
    }

    private void borrarFilas() {
        int filas = jTListaMaterias.getRowCount() - 1;
        for (int f = filas; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }
}
