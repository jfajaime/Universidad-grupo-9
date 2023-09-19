package universidadgrupo9.entidades;

import java.time.LocalDate;

public class AlumnoHijo extends Alumno{

    public AlumnoHijo(int id, int dni, String apellido, String nombre, LocalDate fechaN, boolean estado) {
        super(id, dni, apellido, nombre, fechaN, estado);
    }
    
    @Override
    public String toString() {
        return dni + " " + apellido + " " + nombre;
    }
    
}
