package domain;

import java.io.Serializable;

public class Persona implements Serializable{
    //1ra caracteristica de un JavaBean es que sus 
    //atributos sean privados
    private String nombre;
    private String apellido;
    
    //2da caracteristica es que debe tener un constructor vacio de tipo public 
    public Persona(){
        
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    //3ra caracteristica es tener para cada atributo de la clase
    //un metodo get y set 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    //las siguientes lineas no son requeridas pero son opcionales

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + '}';
    }
    
    
    
    
}
