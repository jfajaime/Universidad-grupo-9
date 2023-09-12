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
public class Materia {
    
    private int id=-1;
    private String nombre;
    private int anio;
    private boolean estado;

    public Materia(String nombre, int anio, boolean estado) {
         this.id=-1;
        this.nombre = nombre;
        this.anio = anio;
        this.estado = estado;
    }
    
     public Materia(int id,String nombre, int anio, boolean estado) {
        this.id=id;
        this.nombre = nombre;
        this.anio = anio;
        this.estado = estado;
    }

 
      public Materia() {
         this.id=-1;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
       @Override
    public String toString() {
        return id+"-"+nombre+"-"+ anio+ "-" + estado ;
    }
}
