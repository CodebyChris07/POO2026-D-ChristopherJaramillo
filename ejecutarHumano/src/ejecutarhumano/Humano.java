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
    private Ropa r;
    private Pulmon p;
    
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

    public Ropa getR() {
        return r;
    }

    public void setR(Ropa r) {
        this.r = r;
    }

    public Pulmon getP() {
        return p;
    }

    public void setP(Pulmon p) {
        this.p = p;
    }

   
    
}
