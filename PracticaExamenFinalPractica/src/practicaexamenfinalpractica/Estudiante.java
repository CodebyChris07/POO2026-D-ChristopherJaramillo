/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaexamenfinalpractica;
import java.util.ArrayList;
/**
 *
 * @author ASUS
 */
public class Estudiante {
    private String nombre;
    private String cedula;
    private ArrayList<Asignatura> materiasTomadas; // tener en cuenta lo de <>
    private double presupuesto;

    public Estudiante(String nombre, String cedula,double presupuesto) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.materiasTomadas = new ArrayList<>(); // tener en cuenta esto
        this.presupuesto = presupuesto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public ArrayList<Asignatura> getMateriasTomadas() {
        return materiasTomadas;
    }

    public void setMateriasTomadas(ArrayList<Asignatura> materiasTomadas) {
        this.materiasTomadas = materiasTomadas;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    
    
}
