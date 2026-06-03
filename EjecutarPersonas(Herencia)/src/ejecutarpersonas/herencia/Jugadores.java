/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecutarpersonas.herencia;

/**
 *
 * @author ASUS
 */
public class Jugadores extends Personas{
    private String posicion;
    private int numero;

    public Jugadores( String cedula, String nombres, String posicion, int numero) {
        super(cedula, nombres);
        this.posicion = posicion;
        this.numero = numero;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void jugar(){
        System.out.println("Los jugadores juegan futbol una vez por semana");
    
    }
    public void entrenar(){
        System.out.println("Los jugadores entrenan futbol 4 horas diarias");
    
    }
    
    
    
}
