/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.poo;
//documentacion
/**
 *
 * @author Zaid
 * Clase que contiene los metodos que hace una persona
 */
public class Persona {
    private String nombre,direccion;
    private int edad;
    
    /**
     * Constructor vacio de persona
     */
    public Persona() {
    }
    
    /**
     * Constructor lleno de persona
     * @param nombre Indica el nombre de la persona en String
     * @param direccion La direccion de la persona en String
     * @param edad La edad de la persona representada en primitivo entero (int)
     */
    public Persona(String nombre, String direccion, int edad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.edad = edad;
    }
    
    /**
     * Metodo getNombre
     * @return regresa el nombre de la persona
     */
    
    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    //HACER 5 ATRIBUTOS Y 5 METODOS
    
    //Metodos objetivo
    /**
     * Metodo que sirve para que la persona hable
     * @param mensaje lo que la persona esta diciendo
     */
    public void hablar(String mensaje){
        System.out.println(mensaje);
    }
     
    
    /**
     * Metodo sobre escrito que muestra los valores de los atributos
     * @return estamos regresando una concatenacion de los valores de los atributos
     */
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", direccion=" + direccion + ", edad=" + edad + '}';
    }
   
    
    
    
}
