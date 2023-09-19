package universidadgrupo9.entidades;

import java.time.LocalDate;

/**
 *
 * @author josel
 */
public class Alumno {
    
    protected int id=-1;
    protected int dni;
    protected String apellido;
    protected String nombre;
    protected LocalDate fechaN;
    protected boolean estado;
    
    
    public Alumno(int id, int dni, String apellido, String nombre, LocalDate fechaN, boolean estado){
    
        this.id=id;
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaN = fechaN;
        this.estado = estado;
    };

    public Alumno(int dni, String apellido, String nombre, LocalDate fechaN, boolean estado) {
        
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaN = fechaN;
        this.estado = estado;
    }
     public Alumno() {}

    
    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaN() {
        return fechaN;
    }

    public void setFechaN(LocalDate fechaN) {
        this.fechaN = fechaN;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Alumno{" + "id= " + id + ", dni= " + dni + ", apellido= " + apellido + ", nombre= " + nombre + ", fechaN= " + fechaN + ", estado= " + estado + '}';
    }
    
    
}
