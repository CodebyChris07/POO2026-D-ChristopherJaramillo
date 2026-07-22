/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploconexionclases.modelo;

/**
 *
 * @author ASUS
 */
public class carro {
    public String placa;
    public double precio;

    public carro(String placa, double precio) {
        this.placa = placa;
        this.precio = precio;
    }

    public carro() {
    }
    

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getPrecio() {
        return precio;
    }

    public void calcularPrecio(double costo ) {
        this.precio = costo * 1.15;
    }
    
    
}
