/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo9.entidades;

/**
 *
 * @author josel
 */
public class Inscripcion {
    
    private int id=-1;
    private double nota;
    private Alumno alumno;
    private Materia materia;

    public Inscripcion(int nota, Alumno alumno, Materia materia) {
        this.id=-1;
        this.nota = nota;
        this.alumno = alumno;
        this.materia = materia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    
    public Inscripcion() {
        this.id=-1;
       
    }

    @Override
    public String toString() {
        return  id + "-" + nota + "-" + alumno + "-" + materia ;
    }

 

  
    
    
}
