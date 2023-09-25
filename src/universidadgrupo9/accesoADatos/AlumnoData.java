package universidadgrupo9.accesoADatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import universidadgrupo9.entidades.Alumno;

public class AlumnoData {

    private Connection con = null;

    public AlumnoData() {

        con = Conexion.getConexion();
    }

    public void guardarAlumno(Alumno alumno) {

        String sql = "insert into alumno (dni, apellido, nombre, fechaNac, estado) values (?, ?, ?, ?, ?)";
        Icon icono = new ImageIcon(getClass().getResource("/universidadgrupo9/imagenes/alumno.png"));
        try {

            if (alumno != null) {

                PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                ps.setInt(1, alumno.getDni());
                ps.setString(2, alumno.getApellido());
                ps.setString(3, alumno.getNombre());
                ps.setDate(4, Date.valueOf(alumno.getFechaN()));
                ps.setBoolean(5, alumno.isEstado());
                ps.executeUpdate();
                ResultSet rs = ps.getGeneratedKeys();
                if (rs.next()) {
                    alumno.setId(rs.getInt(1));
                } else {
                   JOptionPane.showMessageDialog(null, "No se pudo recuperar el Id");
                }
                ps.close();
                rs.close();
            }

            JOptionPane.showMessageDialog(null, "Alumno añadido con exito.", "Mensaje", JOptionPane.PLAIN_MESSAGE, icono);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno " + ex.getMessage());
        }

    }

    public Alumno buscarAlumno(String nombre) {
        Alumno alumno = null;
        String sql = "SELECT * FROM alumno WHERE nombre = ? ";
        PreparedStatement ps = null;
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, nombre);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                alumno = new Alumno();
                alumno.setNombre(nombre);
                alumno.setId(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setFechaN(rs.getDate("fechanac").toLocalDate());
                alumno.setEstado(rs.getBoolean("estado"));

            } else {
                JOptionPane.showMessageDialog(null, "No existe el Alumno");
                ps.close();
                rs.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno " + ex.getMessage());
        }

        return alumno;
    }

    public Alumno buscaAlumnoPorDni(int dni) {

        Alumno alumno = null;
        String sql = "select * from alumno where dni = ? ";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                alumno = new Alumno();
                alumno.setId(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaN(rs.getDate("fechaNac").toLocalDate());
                alumno.setEstado(rs.getBoolean("estado"));

            } else {
                JOptionPane.showMessageDialog(null, "No existe el alumno");
            }
            ps.close();
            rs.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno " + ex.getMessage());
        }

        return alumno;

    }

    public List<Alumno> listarAlumnos() {

        List<Alumno> alumnos = new ArrayList<>();

        try {
            String sql = "select * from alumno where estado = 1 ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Alumno alumno = new Alumno();

                alumno.setId(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaN(rs.getDate("fechanac").toLocalDate());
                alumno.setEstado(rs.getBoolean("estado"));
                alumnos.add(alumno);

            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Alumno " + ex.getMessage());
        }

        return alumnos;

    }

    public void modificarAlumno(Alumno alumno) {
        Icon icono = new ImageIcon(getClass().getResource("/universidadgrupo9/imagenes/alumno.png"));
        
        String sql = "UPDATE alumno SET dni = ? , apellido = ?, nombre = ?, estado = ? WHERE idAlumno = ?";
        
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            System.out.println(sql);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setBoolean(4,alumno.isEstado()) ;
            ps.setInt(5, alumno.getId());
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Alumno modificao con exito.", "Mensaje", JOptionPane.PLAIN_MESSAGE, icono);

            } else {
                JOptionPane.showMessageDialog(null, "El alumno no existe");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno " + ex.getMessage());
        }
    }

    public void eliminarAlumno(int dni) {
        Icon icono = new ImageIcon(getClass().getResource("/universidadgrupo9/imagenes/alumno.png"));

        try {
            String sql = "UPDATE alumno SET estado = 0 WHERE dni = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            int fila = ps.executeUpdate();

            if (fila == 1) {
                JOptionPane.showMessageDialog(null, " Se eliminó el alumno.", "Mensaje", JOptionPane.PLAIN_MESSAGE, icono);

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Alumno");
        }

    }

    public Alumno buscarApellido(String apellido) {
        
        Alumno alumno = null;
        String sql = "SELECT * FROM alumno WHERE apellido = ? ";
        PreparedStatement ps = null;
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, apellido);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                alumno = new Alumno();
                alumno.setApellido(apellido);
                alumno.setId(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaN(rs.getDate("fechanac").toLocalDate());
                alumno.setEstado(rs.getBoolean("estado"));

            } else {
                JOptionPane.showMessageDialog(null, "No existe el Alumno");
                ps.close();
                rs.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno " + ex.getMessage());
        }

        return alumno;
    }

    public Alumno buscarXidAlumno(int id) {
        Alumno alumno = null;

        String sql = " SELECT * FROM alumno WHERE idAlumno = ? ";

        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                alumno = new Alumno();
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaN(rs.getDate("fechaNac").toLocalDate());
                alumno.setEstado(rs.getBoolean("estado"));

            } else {
                JOptionPane.showMessageDialog(null, "No existe el alumno");
            }
            ps.close();
            rs.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno " + ex.getMessage());
        }

        return alumno;

    }

}
