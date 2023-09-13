/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo9.vistas;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import universidadgrupo9.accesoADatos.MateriaData;
import universidadgrupo9.entidades.Materia;

/**
 *
 * @author josel
 */
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

        jLabel1.setText("Listado de Materias");

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
        jScrollPane1.setViewportView(jTListaMaterias);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTListaMaterias;
    // End of variables declaration//GEN-END:variables

    
 private void listarMaterias(){
     
   MateriaData md=new MateriaData();
   
   for(Materia m:md.listarMaterias())
       
   modelo.addRow(new Object[]{
                   m.getId(),
                   m.getNombre(),
                   m.getAnio(),
                   m.isEstado()
   
           }); 
 
}
    
  private void armarCabecera() {

        modelo.addColumn("Id Materia");
        modelo.addColumn("Nombre");
        modelo.addColumn("Año");
        modelo.addColumn("Estado");
        jTListaMaterias.setModel(modelo);
    }
}
