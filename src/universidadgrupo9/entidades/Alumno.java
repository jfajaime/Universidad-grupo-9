/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo9.entidades;

import java.time.LocalDate;

/**
 *
 * @author josel
 */
public class Alumno {
    
    private int id=-1;
    private int dni;
    private String apellido;
    private String nombre;
    private LocalDate fechaN;
    private boolean estado;
    
    
    public Alumno(int id, int dni, String apellido, String nombre, LocalDate fechaN, boolean estado){
    
        this.id=id;
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaN = fechaN;
        this.estado = estado;
    };

    public Alumno(int dni, String apellido, String nombre, LocalDate fechaN, boolean estado) {
        this.id=-1;
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaN = fechaN;
        this.estado = estado;
    }
     public Alumno() {
        this.id=-1;
       
    }

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
        return  id + "-" + dni + "-" + apellido + "-" + nombre + "-" + fechaN + "-" + estado ;
    }
    
    
}