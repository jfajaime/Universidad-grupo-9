/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo9.accesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import universidadgrupo9.entidades.Materia;

/**
 *
 * @author josel
 */
public class MateriaData {
      private static Connection conex = null;

    public MateriaData() {
        
        conex=Conexion.getConexion();
    }

   

    public void guardarMateria(Materia mat) {

        String query = "INSERT INTO materia(nombre,año,estado) VALUES (?,?,?) ";

        try {

            PreparedStatement ps = conex.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, mat.getNombre());
            ps.setInt(2, mat.getAnio());
            ps.setBoolean(3, mat.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                mat.setId(rs.getInt(1));
            } else {
                System.out.println("No se pudo recuperar el Id");
            }
            ps.close();
            rs.close();
            System.out.println("Cargado");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion \n" + ex.getMessage());

        }
    }

    public Materia buscarMateria(int id) {

        Materia m = null;
        String sql = "SELECT * FROM materia WHERE idMateria=?";

        try {
            conex = Conexion.getConexion();
            PreparedStatement ps = conex.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                m = new Materia();
                m.setId(rs.getInt("idMateria"));
                m.setNombre(rs.getString("nombre"));
                m.setAnio(rs.getInt("año"));
                m.setEstado(rs.getBoolean("estado"));

            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Error de conexion \n" + ex.getMessage());
            Logger.getLogger(MateriaData.class.getName()).log(Level.SEVERE, null, ex);
        }

        return m;

    }

    public void modificarMateria(Materia mat) {

               String query = "UPDATE materia SET nombre = ?, año = ?, estado = ? WHERE idMateria = ?";

        try {

            PreparedStatement ps = conex.prepareStatement(query);

            ps.setString(1, mat.getNombre());
            ps.setInt(2, mat.getAnio());
            ps.setBoolean(3, mat.isEstado());
            ps.setInt(4,mat.getId());
            int mod = ps.executeUpdate();
            if (mod == 1) {
                JOptionPane.showMessageDialog(null, "Actualizacion exitosa");

            } else {
                JOptionPane.showMessageDialog(null, "Error al actualizar ");
            }
            ps.close();

        } catch (SQLException ex) {
            Logger.getLogger(MateriaData.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void eliminarMateria(int id) {

     
        String query = "UPDATE materia SET estado = 0 WHERE idMateria = ?";

        try {

            PreparedStatement ps = conex.prepareStatement(query);
           ps.setInt(1, id);
           
            int mod = ps.executeUpdate();
            
            if (mod == 1) {
                JOptionPane.showMessageDialog(null, "Borrado exitosa");

            } else {
                JOptionPane.showMessageDialog(null, "Error al borrar la materia");
            }
            ps.close();

        } catch (SQLException ex) {
            Logger.getLogger(MateriaData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Materia> listarMaterias() {

        Materia m = null;
        List<Materia> materia = new ArrayList();
        String sql = "SELECT * FROM materia ";

        try {
            conex = Conexion.getConexion();
            PreparedStatement ps = conex.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                m = new Materia();
                m.setId(rs.getInt("idMateria"));
                m.setNombre(rs.getString("nombre"));
                m.setAnio(rs.getInt("año"));
                m.setEstado(rs.getBoolean("estado"));
                materia.add(m);
            }
            ps.close();
            rs.close();

        } catch (SQLException ex) {
            Logger.getLogger(MateriaData.class.getName()).log(Level.SEVERE, null, ex);
        }

        return materia;

    }
}
