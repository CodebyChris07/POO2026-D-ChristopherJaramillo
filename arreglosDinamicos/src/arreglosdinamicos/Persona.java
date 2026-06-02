/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglosdinamicos;

/**
 *
 * @author ASUS
 */
public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void mostrarDatos(){
        System.out.println("Nombre:" + nombre + "\nEdad: " + edad + "\n");
        
    
    }
    public void cambiarDatos(String nuevoNombre, int nuevaEdad){
    nombre = nuevoNombre;
    edad = nuevaEdad;
    
            
    
    }
    
    
}
