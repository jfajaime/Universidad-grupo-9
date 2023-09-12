package universidadgrupo9;

import java.sql.Connection;
import universidadgrupo9.accesoADatos.AlumnoData;
import universidadgrupo9.accesoADatos.Conexion;

public class UniversidadGrupo9 {

    public static void main(String[] args) {
        Connection con = Conexion.getConexion();
        AlumnoData a=new AlumnoData();
        a.buscarAlumno(0);//crear alumnos
        
//        InscripcionData b = new InscripcionData();
//        Inscripcion insc = new Inscripcion();
//        b.guardarInscripcion(insc);//ver
//        b.obtenerInscripciones();//ver
//        b.obtenerAlumnosXMateria(1);//terminar
//        b.obtenerMateriasCursadas(0);//terminar
//        b.obtenerMateriasNOCursadas(0);//terminar
//        b.borrarInscripcionMateriaAlumno(0, 0);//terminar
//        b.actualizarNota(0, 0);//terminar
//        b.obtenerAlumnosXMateria(0);//terminar
        
        
    }
   
    
}
