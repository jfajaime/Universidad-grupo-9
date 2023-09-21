package universidadgrupo9.accesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import universidadgrupo9.entidades.Materia;

public class MateriaData {

    private static Connection con = null;

    public MateriaData() {

        con = Conexion.getConexion();
    }

    public void guardarMateria(Materia mat) {
 Icon icono=new ImageIcon(getClass().getResource("/universidadgrupo9/imagenes/materia.png"));
        String result=compareMat(mat.getNombre());
        System.out.println(result);
        System.out.println(mat.getNombre());
      
        if (result.equalsIgnoreCase(mat.getNombre())){

            JOptionPane.showMessageDialog(null, "La materia ya esta cargada");

        } else {
            
            String query = "INSERT INTO materia(nombre,año,estado) VALUES (?,?,?) ";

            try {

                PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
                ps.setString(1, mat.getNombre());
                ps.setInt(2, mat.getAnio());
                ps.setBoolean(3, mat.isEstado());
                ps.executeUpdate();
                ResultSet rs = ps.getGeneratedKeys();
                
                if (rs.next()) {
                    mat.setId(rs.getInt(1));
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo recuperar el Id");
                }
                
                ps.close();
                rs.close();
              JOptionPane.showMessageDialog(null, "Materia añadida con exito.", "Mensaje",JOptionPane.PLAIN_MESSAGE, icono);

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error de conexion -" + ex.getMessage());
            }
            
        }
    }

    public Materia buscarMateria(int id) {

        Materia m = null;
        String sql = "SELECT * FROM materia WHERE idMateria = ?";

        try {

            PreparedStatement ps = con.prepareStatement(sql);
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
            JOptionPane.showMessageDialog(null, "Error de conexion -" + ex.getMessage());

        }

        return m;

    }

    public void modificarMateria(Materia mat) {

        String query = "UPDATE materia SET nombre = ?, año = ?, estado = ? WHERE idMateria = ?";

        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, mat.getNombre());
            ps.setInt(2, mat.getAnio());
            ps.setBoolean(3, mat.isEstado());
            ps.setInt(4, mat.getId());
            int mod = ps.executeUpdate();
            if (mod == 1) {
                JOptionPane.showMessageDialog(null, "Actualizacion exitosa");

            } else {
                JOptionPane.showMessageDialog(null, "Error al actualizar ");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion -" + ex.getMessage());
        }

    }

    public void eliminarMateria(int id) {

        String query = "UPDATE materia SET estado = 0 WHERE idMateria = ?";

        try {

            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);

            int mod = ps.executeUpdate();

            if (mod == 1) {
                JOptionPane.showMessageDialog(null, "Borrado exitosa");

            } else {
                JOptionPane.showMessageDialog(null, "El codigo de la materia no existe");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion -" + ex.getMessage());
        }
    }

    public List<Materia> listarMaterias() {

        Materia m = null;
        List<Materia> materia = new ArrayList();
        String sql = "SELECT * FROM materia ";

        try {

            con = Conexion.getConexion();

            PreparedStatement ps = con.prepareStatement(sql);

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
            JOptionPane.showMessageDialog(null, "Error de conexion -" + ex.getMessage());
        }

        return materia;

    }

    private String compareMat(String nombre) {

        String sql = "SELECT nombre FROM materia where nombre=?";
        
        String igual = "";
        
        try {
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,nombre);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()) {

                igual=rs.getString("nombre");
                
            }
            ps.close();
            rs.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion -" + ex.getMessage());

        }

        return igual;

    }
}
