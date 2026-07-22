/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecutarelectrodomesticos;

/**
 *
 * @author ASUS
 */
public class Electrodomesticos {

    protected String numSerie;
    protected String modelo;
    protected String color;
    protected double precio;

    public Electrodomesticos(String numSerie, String modelo, String color) {
        this.numSerie = numSerie;
        this.modelo = modelo;
        this.color = color;
        this.precio = 0.0;
    }

    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // metodos 
    public String costoConsumo(int tiempo) {
        double costoWatt = 0.3;
        double descuento = 5;
        if (tiempo > 0 && tiempo < 100) {

            precio = (tiempo * costoWatt) - descuento;
            String x = "El consumo es bajo, el precio es:" + precio;
            return x;

        } else {

            precio = (tiempo * costoWatt);
            String x = "El consumo es alto, el precio es:" + precio;
            return x;
        }
        

    }

    // comsumo energia
    public void consumoenergia() {
        System.out.println("Todos los electrodomesticos en Ecuador consuemn energia con voltaje de 100");

    }

    public void encender(){
        System.out.println("Todos los electrodomesticos encienden en menos de un segundo");
    
    }
}
