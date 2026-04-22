/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecutarhumano;

/**
 *
 * @author ASUS
 */
public class Humano {
    private String cedula;
    private String nombres;
    private int edad;
    private Corazon c;
    
    
    public String getCedula(){
    return cedula;
    }
    public void setCedula (String cedula){
    this.cedula = cedula;
    }       

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Corazon getC() {
        return c;
    }

    public void setC(Corazon c) {
        this.c = c;
    }
    
}
