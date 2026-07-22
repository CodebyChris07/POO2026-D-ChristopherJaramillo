/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaexamenfinalpractica;

/**
 *
 * @author ASUS
 */
public class Asignatura {
    private String codigoMateria;
    private String nombre;
    private int creditos;

    public Asignatura(String codigoMateria, String nombre, int creditos) {
        this.codigoMateria = codigoMateria;
        this.nombre = nombre;
        this.creditos = creditos;
    }

    public String getCodigoMateria() {
        return codigoMateria;
    }

    public void setCodigoMateria(String codigoMateria) {
        this.codigoMateria = codigoMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
    
    
}
