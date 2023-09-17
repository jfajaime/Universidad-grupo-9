package universidadgrupo9;

import java.sql.Connection;
import universidadgrupo9.accesoADatos.AlumnoData;
import universidadgrupo9.accesoADatos.Conexion;
import universidadgrupo9.accesoADatos.InscripcionData;
import universidadgrupo9.accesoADatos.MateriaData;
import universidadgrupo9.entidades.Inscripcion;

public class UniversidadGrupo9 {

    public static void main(String[] args) {
        Connection con = Conexion.getConexion();
        AlumnoData a=new AlumnoData();
        MateriaData m = new MateriaData();
        InscripcionData b = new InscripcionData();
        Inscripcion insc = new Inscripcion();
//        a.buscarAlumno(0);//crear alumnos
//        m.buscarMateria(1);
//        b.guardarInscripcion(insc);//ver
//        b.obtenerInscripciones();//ver
//        b.obtenerAlumnosXMateria(1);//terminar
//        b.obtenerMateriasCursadas(102);
        b.obtenerMateriasNOCursadas(102);
//        b.borrarInscripcionMateriaAlumno(0, 0);//terminar
//        b.actualizarNota(0, 0);//terminar
//        b.obtenerAlumnosXMateria(0);//terminar
        
        
    }
   
    
}
