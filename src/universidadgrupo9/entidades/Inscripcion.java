package universidadgrupo9.entidades;

public class Inscripcion {
    
    private int id;
    private double nota;
    private Alumno alumno;
    private Materia materia;

    public Inscripcion(double nota, Alumno alumno, Materia materia) {
        this.id = -1;
        this.nota = nota;
        this.alumno = alumno;
        this.materia = materia;
    }
    
    public Inscripcion(int id, double nota, Alumno alumno, Materia materia) {
        this.id = -1;
        this.nota = nota;
        this.alumno = alumno;
        this.materia = materia;
    }

    public Inscripcion() {
        this.id = -1;
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

    @Override
    public String toString() {
        return  id + " " + nota + " " + alumno + " " + materia ;
    }
}
