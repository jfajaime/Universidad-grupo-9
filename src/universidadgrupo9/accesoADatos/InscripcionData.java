package universidadgrupo9.accesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import universidadgrupo9.entidades.Alumno;
import universidadgrupo9.entidades.Inscripcion;
import universidadgrupo9.entidades.Materia;

public class InscripcionData {

    private Connection con = null;
    // private MateriaData matData;
    private AlumnoData aluData;

    public InscripcionData() {
        con = Conexion.getConexion();
    }

    public void guardarInscripcion(Inscripcion insc) {
        String sql = "INSERT INTO inscripcion (nota, idAlumno, idMateria) VALUES (?, ?, ?) ";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setDouble(1, insc.getNota());
            ps.setInt(2, insc.getAlumno().getId());
            ps.setInt(3, insc.getMateria().getId());

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                insc.setId(rs.getInt(1));//ver
                JOptionPane.showMessageDialog(null, "Alumno inscripto con exito.");
            }
            ps.close();
            rs.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Inscripcion fallida\n" + ex.getMessage());
        }
    }

    public List<Inscripcion> obtenerInscripciones() {

        Inscripcion inscripcion = null;
        List<Inscripcion> inscripciones = new ArrayList<>();
        String sql = "SELECT * FROM inscripcion";

        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                //Creo instanacias de alumno y materia
                Alumno alumno = new Alumno();
                Materia materia = new Materia();
                //equiparo los ids con los objetos creados
                alumno.setId(rs.getInt("idAlumno"));
                materia.setId(rs.getInt("idMateria"));
                //vuelco todo al objeto inscripcion
                inscripcion.setId(rs.getInt("idInscripcion"));
                inscripcion.setNota(rs.getDouble("nota"));
                inscripcion.setAlumno(alumno);
                inscripcion.setMateria(materia);
                //vuelco todo al ArrayList
                inscripciones.add(inscripcion);
            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Alumno " + ex.getMessage());
        }
        return inscripciones;
    }

    public List<Inscripcion> obtenerInscripcionesPorAlumno(int id) {

        List<Inscripcion> inscripciones = new ArrayList<>();
        String sql = "SELECT * FROM inscripcion WHERE idAlumno = ?";

        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Inscripcion inscripcion = new Inscripcion();

                inscripcion.setId(rs.getInt("idInscripcion"));
                inscripcion.setNota(rs.getDouble("nota"));
                // obtengo el id de la materia
                int idMateria = rs.getInt("idMateria");
                //Creo una instancia
                Materia materia = new Materia();
                //Busco la materia por el id
                materia.setId(idMateria);
                //cargo la materia a la variable inscripcion
                inscripcion.setMateria(materia);
                //vuelco todo al ArrayList inscripciones
                inscripciones.add(inscripcion);
            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripcion: " + ex.getMessage());
        }
        return inscripciones;
    }

    public List<Materia> obtenerMateriasCursadas(int id) {
        List<Materia> materiasCursadas = new ArrayList<>();
        String sql = "SELECT a.apellido, a.nombre, a.dni, m.* "
                + "FROM alumno a "
                + "INNER JOIN inscripcion i ON a.idAlumno = i.idAlumno "
                + "INNER JOIN materia m ON i.idMateria = m.idMateria "
                + "WHERE a.idAlumno = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                //instancio un objeto materia
                Materia materia = new Materia();
                //igualo el objeto al id
                materia.setId(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));

                materiasCursadas.add(materia);
            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia: " + ex.getMessage());
        }
        return materiasCursadas;
    }

    public List<Materia> obtenerMateriasNOCursadas(int id) {//pasar idMateria en el parametro
        //ver a que se refiere con materia no cursada, sera aquella que ningun alumno cursa?
        return null;
    }

    public void borrarInscripcionMateriaAlumno(int idAlumno, int idMateria) {
        String sql = "DELETE FROM inscripcion WHERE idAlumno = ? AND idMateria = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
            int filasBorradas = ps.executeUpdate();

            if (filasBorradas > 0) {
                JOptionPane.showMessageDialog(null, "Inscripción eliminada con éxito.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró la inscripción a borrar.");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al borrar la inscripción: " + ex.getMessage());
        }
    }

    public void actualizarNota(int idAlumno, double nota) {
        String sql = "UPDATE inscripcion SET nota = ? WHERE idAlumno = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, nota);
            ps.setInt(2, idAlumno);
            int filasActualizadas = ps.executeUpdate();

            if (filasActualizadas > 0) {
                JOptionPane.showMessageDialog(null, "Nota actualizada con éxito.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron inscripciones para actualizar la nota.");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar la nota: " + ex.getMessage());
        }
    }

    public List<Alumno> obtenerAlumnosXMateria(int idMateria) {
        List<Alumno> alumnosXMateria = new ArrayList<>();
        String sql = "SELECT a.* "
                + "FROM alumno a "
                + "INNER JOIN inscripcion i "
                + "ON a.idAlumno = i.idAlumno "
                + "WHERE i.idMateria = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMateria);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Alumno alumno = new Alumno();

                alumno.setId(rs.getInt("idAlumno"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setDni(rs.getInt("dni"));

                alumnosXMateria.add(alumno);
            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno: " + ex.getMessage());
        }
        return alumnosXMateria;
    }

}
