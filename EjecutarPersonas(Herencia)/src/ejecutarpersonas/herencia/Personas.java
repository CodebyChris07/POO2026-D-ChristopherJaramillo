/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecutarpersonas.herencia;

/**
 *
 * @author ASUS
 */
public class Personas {
    
    protected String cedula;
    protected String nombres;

    public Personas(String cedula, String nombres) {
        this.cedula = cedula;
        this.nombres = nombres;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    
    public void cobrarSueldo(){
        System.out.println("Cobran sueldo el ultimo dia de cada mes");
    
    }
    
    
}
